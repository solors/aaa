package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public final class BarcodeMatrix {

    /* renamed from: a */
    private final BarcodeRow[] f44652a;

    /* renamed from: b */
    private int f44653b;

    /* renamed from: c */
    private final int f44654c;

    /* renamed from: d */
    private final int f44655d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BarcodeMatrix(int i, int i2) {
        BarcodeRow[] barcodeRowArr = new BarcodeRow[i];
        this.f44652a = barcodeRowArr;
        int length = barcodeRowArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f44652a[i3] = new BarcodeRow(((i2 + 4) * 17) + 1);
        }
        this.f44655d = i2 * 17;
        this.f44654c = i;
        this.f44653b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public BarcodeRow m65602a() {
        return this.f44652a[this.f44653b];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m65601b() {
        this.f44653b++;
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.f44654c * i2, this.f44655d * i);
        int i3 = this.f44654c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f44652a[i4 / i2].m65599b(i);
        }
        return bArr;
    }
}
