package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class CacheDataSink implements DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;

    /* renamed from: a */
    private final Cache f35924a;

    /* renamed from: b */
    private final long f35925b;

    /* renamed from: c */
    private final int f35926c;
    @Nullable

    /* renamed from: d */
    private DataSpec f35927d;

    /* renamed from: e */
    private long f35928e;
    @Nullable

    /* renamed from: f */
    private File f35929f;
    @Nullable

    /* renamed from: g */
    private OutputStream f35930g;

    /* renamed from: h */
    private long f35931h;

    /* renamed from: i */
    private long f35932i;

    /* renamed from: j */
    private ReusableBufferedOutputStream f35933j;

    /* loaded from: classes4.dex */
    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Factory implements DataSink.Factory {

        /* renamed from: a */
        private Cache f35934a;

        /* renamed from: b */
        private long f35935b = 5242880;

        /* renamed from: c */
        private int f35936c = 20480;

        @Override // com.google.android.exoplayer2.upstream.DataSink.Factory
        public DataSink createDataSink() {
            return new CacheDataSink((Cache) Assertions.checkNotNull(this.f35934a), this.f35935b, this.f35936c);
        }

        @CanIgnoreReturnValue
        public Factory setBufferSize(int i) {
            this.f35936c = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setCache(Cache cache) {
            this.f35934a = cache;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setFragmentSize(long j) {
            this.f35935b = j;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j) {
        this(cache, j, 20480);
    }

    /* renamed from: a */
    private void m72748a() throws IOException {
        OutputStream outputStream = this.f35930g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Util.closeQuietly(this.f35930g);
            this.f35930g = null;
            this.f35929f = null;
            this.f35924a.commitFile((File) Util.castNonNull(this.f35929f), this.f35931h);
        } catch (Throwable th) {
            Util.closeQuietly(this.f35930g);
            this.f35930g = null;
            this.f35929f = null;
            ((File) Util.castNonNull(this.f35929f)).delete();
            throw th;
        }
    }

    /* renamed from: b */
    private void m72747b(DataSpec dataSpec) throws IOException {
        long j = dataSpec.length;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f35932i, this.f35928e);
        }
        this.f35929f = this.f35924a.startFile((String) Util.castNonNull(dataSpec.key), dataSpec.position + this.f35932i, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f35929f);
        if (this.f35926c > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.f35933j;
            if (reusableBufferedOutputStream == null) {
                this.f35933j = new ReusableBufferedOutputStream(fileOutputStream, this.f35926c);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.f35930g = this.f35933j;
        } else {
            this.f35930g = fileOutputStream;
        }
        this.f35931h = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws CacheDataSinkException {
        if (this.f35927d == null) {
            return;
        }
        try {
            m72748a();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws CacheDataSinkException {
        long j;
        Assertions.checkNotNull(dataSpec.key);
        if (dataSpec.length == -1 && dataSpec.isFlagSet(2)) {
            this.f35927d = null;
            return;
        }
        this.f35927d = dataSpec;
        if (dataSpec.isFlagSet(4)) {
            j = this.f35925b;
        } else {
            j = Long.MAX_VALUE;
        }
        this.f35928e = j;
        this.f35932i = 0L;
        try {
            m72747b(dataSpec);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        DataSpec dataSpec = this.f35927d;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f35931h == this.f35928e) {
                    m72748a();
                    m72747b(dataSpec);
                }
                int min = (int) Math.min(i2 - i3, this.f35928e - this.f35931h);
                ((OutputStream) Util.castNonNull(this.f35930g)).write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.f35931h += j;
                this.f35932i += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }

    public CacheDataSink(Cache cache, long j, int i) {
        Assertions.checkState(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i2 != 0 && j < com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) {
            Log.m72602w("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f35924a = (Cache) Assertions.checkNotNull(cache);
        this.f35925b = i2 == 0 ? Long.MAX_VALUE : j;
        this.f35926c = i;
    }
}
