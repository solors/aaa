package com.google.zxing.common.reedsolomon;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes5.dex */
public final class GenericGF {
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF AZTEC_PARAM;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;
    public static final GenericGF QR_CODE_FIELD_256;

    /* renamed from: a */
    private final int[] f44388a;

    /* renamed from: b */
    private final int[] f44389b;

    /* renamed from: c */
    private final GenericGFPoly f44390c;

    /* renamed from: d */
    private final GenericGFPoly f44391d;

    /* renamed from: e */
    private final int f44392e;

    /* renamed from: f */
    private final int f44393f;

    /* renamed from: g */
    private final int f44394g;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 1024, 1);

    static {
        GenericGF genericGF = new GenericGF(67, 64, 1);
        AZTEC_DATA_6 = genericGF;
        AZTEC_PARAM = new GenericGF(19, 16, 1);
        QR_CODE_FIELD_256 = new GenericGF(285, 256, 0);
        GenericGF genericGF2 = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericGF2;
        AZTEC_DATA_8 = genericGF2;
        MAXICODE_FIELD_64 = genericGF;
    }

    public GenericGF(int i, int i2, int i3) {
        this.f44393f = i;
        this.f44392e = i2;
        this.f44394g = i3;
        this.f44388a = new int[i2];
        this.f44389b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f44388a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f44389b[this.f44388a[i6]] = i6;
        }
        this.f44390c = new GenericGFPoly(this, new int[]{0});
        this.f44391d = new GenericGFPoly(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m66011a(int i, int i2) {
        return i ^ i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public GenericGFPoly m66010b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f44390c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new GenericGFPoly(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m66009c(int i) {
        return this.f44388a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public GenericGFPoly m66008d() {
        return this.f44391d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public GenericGFPoly m66007e() {
        return this.f44390c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m66006f(int i) {
        if (i != 0) {
            return this.f44388a[(this.f44392e - this.f44389b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m66005g(int i) {
        if (i != 0) {
            return this.f44389b[i];
        }
        throw new IllegalArgumentException();
    }

    public int getGeneratorBase() {
        return this.f44394g;
    }

    public int getSize() {
        return this.f44392e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m66004h(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.f44388a;
            int[] iArr2 = this.f44389b;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.f44392e - 1)];
        }
        return 0;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f44393f) + ',' + this.f44392e + ')';
    }
}
