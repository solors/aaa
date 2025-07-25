package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.android.volley.toolbox.n */
/* loaded from: classes2.dex */
public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {

    /* renamed from: b */
    private final ByteArrayPool f3548b;

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i) {
        this.f3548b = byteArrayPool;
        ((ByteArrayOutputStream) this).buf = byteArrayPool.m102269a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m102202a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] m102269a = this.f3548b.m102269a((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m102269a, 0, ((ByteArrayOutputStream) this).count);
        this.f3548b.m102268b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m102269a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3548b.m102268b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f3548b.m102268b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m102202a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m102202a(1);
        super.write(i);
    }
}
