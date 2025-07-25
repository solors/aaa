package com.applovin.impl;

/* renamed from: com.applovin.impl.ci */
/* loaded from: classes2.dex */
final class C4188ci {

    /* renamed from: a */
    public final C4189a f5278a;

    /* renamed from: b */
    public final C4189a f5279b;

    /* renamed from: c */
    public final int f5280c;

    /* renamed from: d */
    public final boolean f5281d;

    /* renamed from: com.applovin.impl.ci$a */
    /* loaded from: classes2.dex */
    public static final class C4189a {

        /* renamed from: a */
        private final C4190b[] f5282a;

        public C4189a(C4190b... c4190bArr) {
            this.f5282a = c4190bArr;
        }

        /* renamed from: a */
        public C4190b m100183a(int i) {
            return this.f5282a[i];
        }

        /* renamed from: a */
        public int m100184a() {
            return this.f5282a.length;
        }
    }

    /* renamed from: com.applovin.impl.ci$b */
    /* loaded from: classes2.dex */
    public static final class C4190b {

        /* renamed from: a */
        public final int f5283a;

        /* renamed from: b */
        public final int f5284b;

        /* renamed from: c */
        public final float[] f5285c;

        /* renamed from: d */
        public final float[] f5286d;

        public C4190b(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.f5283a = i;
            if (fArr.length * 2 == fArr2.length * 3) {
                z = true;
            } else {
                z = false;
            }
            AbstractC4100b1.m100580a(z);
            this.f5285c = fArr;
            this.f5286d = fArr2;
            this.f5284b = i2;
        }

        /* renamed from: a */
        public int m100182a() {
            return this.f5285c.length / 3;
        }
    }

    public C4188ci(C4189a c4189a, int i) {
        this(c4189a, c4189a, i);
    }

    /* renamed from: a */
    public static C4188ci m100186a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8;
        int i9 = i;
        int i10 = i2;
        AbstractC4100b1.m100580a(f > 0.0f);
        AbstractC4100b1.m100580a(i9 >= 1);
        AbstractC4100b1.m100580a(i10 >= 1);
        AbstractC4100b1.m100580a(f2 > 0.0f && f2 <= 180.0f);
        AbstractC4100b1.m100580a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i9;
        float f6 = radians2 / i10;
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[i12 * 3];
        float[] fArr3 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f7 = radians / 2.0f;
            float f8 = (i13 * f5) - f7;
            int i16 = i13 + 1;
            float f9 = (i16 * f5) - f7;
            int i17 = 0;
            while (i17 < i11) {
                float f10 = f8;
                int i18 = i16;
                int i19 = 0;
                int i20 = 2;
                while (i19 < i20) {
                    if (i19 == 0) {
                        f4 = f10;
                        i4 = i11;
                    } else {
                        i4 = i11;
                        f4 = f9;
                    }
                    float f11 = i17 * f6;
                    float f12 = f6;
                    int i21 = i17;
                    double d = f;
                    float f13 = f5;
                    double d2 = (f11 + 3.1415927f) - (radians2 / 2.0f);
                    int i22 = i19;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f14 = f9;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    float f15 = radians;
                    float f16 = radians2;
                    fArr2[i14 + 1] = (float) (d * Math.sin(d3));
                    int i23 = i14 + 3;
                    fArr2[i14 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr4[i15] = f11 / f16;
                    int i24 = i15 + 2;
                    fArr4[i15 + 1] = ((i13 + i22) * f13) / f15;
                    if (i21 == 0 && i22 == 0) {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                    } else {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                        if (i6 != i5 || i7 != 1) {
                            fArr = fArr4;
                            i8 = 2;
                            i15 = i24;
                            i14 = i23;
                            int i25 = i7 + 1;
                            fArr3 = fArr;
                            i20 = i8;
                            radians = f15;
                            i11 = i4;
                            f6 = f12;
                            f5 = f13;
                            f9 = f14;
                            i19 = i25;
                            i10 = i5;
                            i17 = i6;
                            radians2 = f16;
                        }
                    }
                    System.arraycopy(fArr2, i14, fArr2, i23, 3);
                    i14 += 6;
                    fArr = fArr4;
                    i8 = 2;
                    System.arraycopy(fArr, i15, fArr, i24, 2);
                    i15 += 4;
                    int i252 = i7 + 1;
                    fArr3 = fArr;
                    i20 = i8;
                    radians = f15;
                    i11 = i4;
                    f6 = f12;
                    f5 = f13;
                    f9 = f14;
                    i19 = i252;
                    i10 = i5;
                    i17 = i6;
                    radians2 = f16;
                }
                float f17 = radians2;
                int i26 = i17;
                int i27 = i10;
                int i28 = i26 + 1;
                f8 = f10;
                i16 = i18;
                f6 = f6;
                radians2 = f17;
                f9 = f9;
                i10 = i27;
                i17 = i28;
            }
            i9 = i;
            i13 = i16;
        }
        return new C4188ci(new C4189a(new C4190b(0, fArr2, fArr3, 1)), i3);
    }

    public C4188ci(C4189a c4189a, C4189a c4189a2, int i) {
        this.f5278a = c4189a;
        this.f5279b = c4189a2;
        this.f5280c = i;
        this.f5281d = c4189a == c4189a2;
    }

    /* renamed from: a */
    public static C4188ci m100185a(int i) {
        return m100186a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }
}
