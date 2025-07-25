package com.google.zxing.pdf417.encoder;

/* loaded from: classes5.dex */
final class BarcodeRow {

    /* renamed from: a */
    private final byte[] f44656a;

    /* renamed from: b */
    private int f44657b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BarcodeRow(int i) {
        this.f44656a = new byte[i];
    }

    /* renamed from: c */
    private void m65598c(int i, boolean z) {
        this.f44656a[i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m65600a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f44657b;
            this.f44657b = i3 + 1;
            m65598c(i3, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] m65599b(int i) {
        int length = this.f44656a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f44656a[i2 / i];
        }
        return bArr;
    }
}
