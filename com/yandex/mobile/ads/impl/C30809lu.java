package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.yandex.mobile.ads.impl.lu */
/* loaded from: classes8.dex */
public final class C30809lu extends InputStream {

    /* renamed from: b */
    private final InterfaceC30672ju f81937b;

    /* renamed from: c */
    private final C30976nu f81938c;

    /* renamed from: e */
    private boolean f81940e = false;

    /* renamed from: f */
    private boolean f81941f = false;

    /* renamed from: d */
    private final byte[] f81939d = new byte[1];

    public C30809lu(ux1 ux1Var, C30976nu c30976nu) {
        this.f81937b = ux1Var;
        this.f81938c = c30976nu;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f81941f) {
            this.f81937b.close();
            this.f81941f = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f81939d;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f81939d[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f81941f) {
            if (!this.f81940e) {
                this.f81937b.mo27541a(this.f81938c);
                this.f81940e = true;
            }
            int read = this.f81937b.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            return read;
        }
        throw new IllegalStateException();
    }
}
