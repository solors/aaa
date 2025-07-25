package com.yandex.mobile.ads.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class jf1 extends ByteArrayOutputStream {

    /* renamed from: b */
    private final C31050ol f80895b;

    public jf1(C31050ol c31050ol, int i) {
        this.f80895b = c31050ol;
        ((ByteArrayOutputStream) this).buf = c31050ol.m30965a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f80895b.m30964a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f80895b.m30964a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        int i2 = ((ByteArrayOutputStream) this).count + 1;
        if (i2 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] m30965a = this.f80895b.m30965a(i2 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m30965a, 0, ((ByteArrayOutputStream) this).count);
            this.f80895b.m30964a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = m30965a;
        }
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        int i3 = ((ByteArrayOutputStream) this).count + i2;
        if (i3 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] m30965a = this.f80895b.m30965a(i3 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m30965a, 0, ((ByteArrayOutputStream) this).count);
            this.f80895b.m30964a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = m30965a;
        }
        super.write(bArr, i, i2);
    }
}
