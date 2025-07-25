package com.fyber.inneractive.sdk.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.protobuf.a */
/* loaded from: classes4.dex */
public final class C15282a extends FilterInputStream {

    /* renamed from: a */
    public int f30233a;

    public C15282a(InputStream inputStream, int i) {
        super(inputStream);
        this.f30233a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f30233a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f30233a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f30233a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(Math.min(j, this.f30233a));
        if (skip >= 0) {
            this.f30233a = (int) (this.f30233a - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f30233a;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.f30233a -= read;
        }
        return read;
    }
}
