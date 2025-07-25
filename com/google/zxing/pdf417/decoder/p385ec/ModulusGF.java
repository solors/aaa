package com.google.zxing.pdf417.decoder.p385ec;

import com.google.zxing.pdf417.PDF417Common;

/* renamed from: com.google.zxing.pdf417.decoder.ec.ModulusGF */
/* loaded from: classes5.dex */
public final class ModulusGF {
    public static final ModulusGF PDF417_GF = new ModulusGF(PDF417Common.NUMBER_OF_CODEWORDS, 3);

    /* renamed from: a */
    private final int[] f44639a;

    /* renamed from: b */
    private final int[] f44640b;

    /* renamed from: c */
    private final ModulusPoly f44641c;

    /* renamed from: d */
    private final ModulusPoly f44642d;

    /* renamed from: e */
    private final int f44643e;

    private ModulusGF(int i, int i2) {
        this.f44643e = i;
        this.f44639a = new int[i];
        this.f44640b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f44639a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f44640b[this.f44639a[i5]] = i5;
        }
        this.f44641c = new ModulusPoly(this, new int[]{0});
        this.f44642d = new ModulusPoly(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m65628a(int i, int i2) {
        return (i + i2) % this.f44643e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ModulusPoly m65627b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f44641c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new ModulusPoly(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m65626c(int i) {
        return this.f44639a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ModulusPoly m65625d() {
        return this.f44642d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m65624e() {
        return this.f44643e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ModulusPoly m65623f() {
        return this.f44641c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m65622g(int i) {
        if (i != 0) {
            return this.f44639a[(this.f44643e - this.f44640b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m65621h(int i) {
        if (i != 0) {
            return this.f44640b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m65620i(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.f44639a;
            int[] iArr2 = this.f44640b;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.f44643e - 1)];
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m65619j(int i, int i2) {
        int i3 = this.f44643e;
        return ((i + i3) - i2) % i3;
    }
}
