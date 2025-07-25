package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class DataSourceInputStream extends InputStream {

    /* renamed from: b */
    private final DataSource f35758b;

    /* renamed from: c */
    private final DataSpec f35759c;

    /* renamed from: h */
    private long f35763h;

    /* renamed from: f */
    private boolean f35761f = false;

    /* renamed from: g */
    private boolean f35762g = false;

    /* renamed from: d */
    private final byte[] f35760d = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
        this.f35758b = dataSource;
        this.f35759c = dataSpec;
    }

    /* renamed from: a */
    private void m72800a() throws IOException {
        if (!this.f35761f) {
            this.f35758b.open(this.f35759c);
            this.f35761f = true;
        }
    }

    public long bytesRead() {
        return this.f35763h;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f35762g) {
            this.f35758b.close();
            this.f35762g = true;
        }
    }

    public void open() throws IOException {
        m72800a();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f35760d) == -1) {
            return -1;
        }
        return this.f35760d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Assertions.checkState(!this.f35762g);
        m72800a();
        int read = this.f35758b.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f35763h += read;
        return read;
    }
}
