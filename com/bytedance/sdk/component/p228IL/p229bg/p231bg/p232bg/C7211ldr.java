package com.bytedance.sdk.component.p228IL.p229bg.p231bg.p232bg;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.IL.bg.bg.bg.ldr */
/* loaded from: classes3.dex */
public class C7211ldr extends InputStream {

    /* renamed from: IL */
    HttpURLConnection f15546IL;

    /* renamed from: bg */
    InputStream f15547bg;

    public C7211ldr(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.f15547bg = inputStream;
        this.f15546IL = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            inputStream.close();
            this.f15547bg = null;
        }
        HttpURLConnection httpURLConnection = this.f15546IL;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f15546IL = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f15547bg;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }
}
