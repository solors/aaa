package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* loaded from: classes4.dex */
final class LengthCountingOutputStream extends OutputStream {

    /* renamed from: b */
    private long f43006b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m66845a() {
        return this.f43006b;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f43006b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f43006b += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f43006b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
