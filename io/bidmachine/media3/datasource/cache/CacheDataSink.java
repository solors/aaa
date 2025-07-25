package io.bidmachine.media3.datasource.cache;

import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSink;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.cache.Cache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@UnstableApi
/* loaded from: classes9.dex */
public final class CacheDataSink implements DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static final String TAG = "CacheDataSink";
    private final int bufferSize;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private final Cache cache;
    @Nullable
    private DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;
    @Nullable
    private File file;
    private final long fragmentSize;
    @Nullable
    private OutputStream outputStream;
    private long outputStreamBytesWritten;

    /* loaded from: classes9.dex */
    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    /* loaded from: classes9.dex */
    public static final class Factory implements DataSink.Factory {
        private Cache cache;
        private long fragmentSize = 5242880;
        private int bufferSize = 20480;

        @Override // io.bidmachine.media3.datasource.DataSink.Factory
        public DataSink createDataSink() {
            return new CacheDataSink((Cache) Assertions.checkNotNull(this.cache), this.fragmentSize, this.bufferSize);
        }

        @CanIgnoreReturnValue
        public Factory setBufferSize(int i) {
            this.bufferSize = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setCache(Cache cache) {
            this.cache = cache;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setFragmentSize(long j) {
            this.fragmentSize = j;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j) {
        this(cache, j, 20480);
    }

    private void closeCurrentOutputStream() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            this.file = null;
            this.cache.commitFile((File) Util.castNonNull(this.file), this.outputStreamBytesWritten);
        } catch (Throwable th) {
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            this.file = null;
            ((File) Util.castNonNull(this.file)).delete();
            throw th;
        }
    }

    private void openNextOutputStream(DataSpec dataSpec) throws IOException {
        long j = dataSpec.length;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.dataSpecBytesWritten, this.dataSpecFragmentSize);
        }
        this.file = this.cache.startFile((String) Util.castNonNull(dataSpec.key), dataSpec.position + this.dataSpecBytesWritten, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.file);
        if (this.bufferSize > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
            if (reusableBufferedOutputStream == null) {
                this.bufferedOutputStream = new ReusableBufferedOutputStream(fileOutputStream, this.bufferSize);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.outputStream = this.bufferedOutputStream;
        } else {
            this.outputStream = fileOutputStream;
        }
        this.outputStreamBytesWritten = 0L;
    }

    @Override // io.bidmachine.media3.datasource.DataSink
    public void close() throws CacheDataSinkException {
        if (this.dataSpec == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // io.bidmachine.media3.datasource.DataSink
    public void open(DataSpec dataSpec) throws CacheDataSinkException {
        long j;
        Assertions.checkNotNull(dataSpec.key);
        if (dataSpec.length == -1 && dataSpec.isFlagSet(2)) {
            this.dataSpec = null;
            return;
        }
        this.dataSpec = dataSpec;
        if (dataSpec.isFlagSet(4)) {
            j = this.fragmentSize;
        } else {
            j = Long.MAX_VALUE;
        }
        this.dataSpecFragmentSize = j;
        this.dataSpecBytesWritten = 0L;
        try {
            openNextOutputStream(dataSpec);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // io.bidmachine.media3.datasource.DataSink
    public void write(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.outputStreamBytesWritten == this.dataSpecFragmentSize) {
                    closeCurrentOutputStream();
                    openNextOutputStream(dataSpec);
                }
                int min = (int) Math.min(i2 - i3, this.dataSpecFragmentSize - this.outputStreamBytesWritten);
                ((OutputStream) Util.castNonNull(this.outputStream)).write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.outputStreamBytesWritten += j;
                this.dataSpecBytesWritten += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }

    public CacheDataSink(Cache cache, long j, int i) {
        Assertions.checkState(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i2 != 0 && j < 2097152) {
            Log.m19945w(TAG, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.cache = (Cache) Assertions.checkNotNull(cache);
        this.fragmentSize = i2 == 0 ? Long.MAX_VALUE : j;
        this.bufferSize = i;
    }
}
