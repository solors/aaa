package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PoolingByteArrayOutputStream.java */
/* renamed from: com.mbridge.msdk.tracker.network.toolbox.l */
/* loaded from: classes6.dex */
public final class C22929l extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C22918c f59840a;

    public C22929l(C22918c c22918c, int i) {
        this.f59840a = c22918c;
        ((ByteArrayOutputStream) this).buf = c22918c.m49449a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m49426a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] m49449a = this.f59840a.m49449a((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m49449a, 0, ((ByteArrayOutputStream) this).count);
        this.f59840a.m49448a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m49449a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59840a.m49448a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f59840a.m49448a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m49426a(i2);
        if (bArr != null) {
            super.write(bArr, i, i2);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        m49426a(1);
        super.write(i);
    }
}
