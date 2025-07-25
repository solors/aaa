package com.applovin.impl;

import java.io.InputStream;

/* renamed from: com.applovin.impl.j5 */
/* loaded from: classes2.dex */
public final class C4630j5 extends InputStream {

    /* renamed from: a */
    private final InterfaceC4509h5 f7049a;

    /* renamed from: b */
    private final C4698k5 f7050b;

    /* renamed from: f */
    private long f7054f;

    /* renamed from: d */
    private boolean f7052d = false;

    /* renamed from: e */
    private boolean f7053e = false;

    /* renamed from: c */
    private final byte[] f7051c = new byte[1];

    public C4630j5(InterfaceC4509h5 interfaceC4509h5, C4698k5 c4698k5) {
        this.f7049a = interfaceC4509h5;
        this.f7050b = c4698k5;
    }

    /* renamed from: a */
    private void m98315a() {
        if (!this.f7052d) {
            this.f7049a.mo94273a(this.f7050b);
            this.f7052d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f7053e) {
            this.f7049a.close();
            this.f7053e = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f7051c) == -1) {
            return -1;
        }
        return this.f7051c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        AbstractC4100b1.m100577b(!this.f7053e);
        m98315a();
        int mo94271a = this.f7049a.mo94271a(bArr, i, i2);
        if (mo94271a == -1) {
            return -1;
        }
        this.f7054f += mo94271a;
        return mo94271a;
    }
}
