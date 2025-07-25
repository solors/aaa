package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.j */
/* loaded from: classes4.dex */
public final class C15091j extends InputStream {

    /* renamed from: a */
    public final InterfaceC15089h f29700a;

    /* renamed from: b */
    public final C15092k f29701b;

    /* renamed from: f */
    public long f29705f;

    /* renamed from: d */
    public boolean f29703d = false;

    /* renamed from: e */
    public boolean f29704e = false;

    /* renamed from: c */
    public final byte[] f29702c = new byte[1];

    public C15091j(InterfaceC15089h interfaceC15089h, C15092k c15092k) {
        this.f29700a = interfaceC15089h;
        this.f29701b = c15092k;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f29704e) {
            this.f29700a.close();
            this.f29704e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f29702c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f29702c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f29704e) {
            if (!this.f29703d) {
                this.f29700a.mo77234a(this.f29701b);
                this.f29703d = true;
            }
            int read = this.f29700a.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f29705f += read;
            return read;
        }
        throw new IllegalStateException();
    }
}
