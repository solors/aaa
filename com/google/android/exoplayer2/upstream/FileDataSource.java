package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
public final class FileDataSource extends BaseDataSource {
    @Nullable

    /* renamed from: e */
    private RandomAccessFile f35844e;
    @Nullable

    /* renamed from: f */
    private Uri f35845f;

    /* renamed from: g */
    private long f35846g;

    /* renamed from: h */
    private boolean f35847h;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    /* loaded from: classes4.dex */
    public static final class Api21 {
        private Api21() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        /* renamed from: b */
        public static boolean m72768b(@Nullable Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Factory implements DataSource.Factory {
        @Nullable

        /* renamed from: a */
        private TransferListener f35848a;

        @CanIgnoreReturnValue
        public Factory setListener(@Nullable TransferListener transferListener) {
            this.f35848a = transferListener;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.f35848a;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }
    }

    /* loaded from: classes4.dex */
    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
            super(str, th, i);
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* renamed from: f */
    private static RandomAccessFile m72770f(Uri uri) throws FileDataSourceException {
        int i = 2006;
        try {
            return new RandomAccessFile((String) Assertions.checkNotNull(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e, (Util.SDK_INT < 21 || !Api21.m72768b(e.getCause())) ? 2005 : 2005);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, 2006);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException(e3, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws FileDataSourceException {
        this.f35845f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f35844e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.f35844e = null;
            if (this.f35847h) {
                this.f35847h = false;
                m72805c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35845f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.uri;
        this.f35845f = uri;
        m72804d(dataSpec);
        RandomAccessFile m72770f = m72770f(uri);
        this.f35844e = m72770f;
        try {
            m72770f.seek(dataSpec.position);
            long j = dataSpec.length;
            if (j == -1) {
                j = this.f35844e.length() - dataSpec.position;
            }
            this.f35846g = j;
            if (j >= 0) {
                this.f35847h = true;
                m72803e(dataSpec);
                return this.f35846g;
            }
            throw new FileDataSourceException(null, null, 2008);
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f35846g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) Util.castNonNull(this.f35844e)).read(bArr, i, (int) Math.min(this.f35846g, i2));
            if (read > 0) {
                this.f35846g -= read;
                m72806b(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }
}
