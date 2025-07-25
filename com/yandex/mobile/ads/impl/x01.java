package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class x01 {

    /* renamed from: a */
    public static final byte[] f87454a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f87455b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f87456c = new Object();

    /* renamed from: d */
    private static int[] f87457d = new int[10];

    /* renamed from: com.yandex.mobile.ads.impl.x01$a */
    /* loaded from: classes8.dex */
    public static final class C31782a {

        /* renamed from: a */
        public final int f87458a;

        /* renamed from: b */
        public final boolean f87459b;

        /* renamed from: c */
        public final int f87460c;

        /* renamed from: d */
        public final int f87461d;

        /* renamed from: e */
        public final int[] f87462e;

        /* renamed from: f */
        public final int f87463f;

        /* renamed from: g */
        public final float f87464g;

        public C31782a(int i, boolean z, int i2, int i3, int[] iArr, int i4, int i5, int i6, float f) {
            this.f87458a = i;
            this.f87459b = z;
            this.f87460c = i2;
            this.f87461d = i3;
            this.f87462e = iArr;
            this.f87463f = i4;
            this.f87464g = f;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x01$b */
    /* loaded from: classes8.dex */
    public static final class C31783b {

        /* renamed from: a */
        public final int f87465a;

        /* renamed from: b */
        public final boolean f87466b;

        public C31783b(int i, int i2, boolean z) {
            this.f87465a = i2;
            this.f87466b = z;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x01$c */
    /* loaded from: classes8.dex */
    public static final class C31784c {

        /* renamed from: a */
        public final int f87467a;

        /* renamed from: b */
        public final int f87468b;

        /* renamed from: c */
        public final int f87469c;

        /* renamed from: d */
        public final int f87470d;

        /* renamed from: e */
        public final int f87471e;

        /* renamed from: f */
        public final int f87472f;

        /* renamed from: g */
        public final float f87473g;

        /* renamed from: h */
        public final boolean f87474h;

        /* renamed from: i */
        public final boolean f87475i;

        /* renamed from: j */
        public final int f87476j;

        /* renamed from: k */
        public final int f87477k;

        /* renamed from: l */
        public final int f87478l;

        /* renamed from: m */
        public final boolean f87479m;

        public C31784c(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f87467a = i;
            this.f87468b = i2;
            this.f87469c = i3;
            this.f87470d = i4;
            this.f87471e = i5;
            this.f87472f = i6;
            this.f87473g = f;
            this.f87474h = z;
            this.f87475i = z2;
            this.f87476j = i7;
            this.f87477k = i8;
            this.f87478l = i9;
            this.f87479m = z3;
        }
    }

    /* renamed from: a */
    public static void m27711a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.x01.C31784c m27710b(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x01.m27710b(byte[], int, int):com.yandex.mobile.ads.impl.x01$c");
    }

    /* renamed from: a */
    public static int m27712a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            if (i3 == 0) {
                return i2;
            }
            if (zArr[0]) {
                m27711a(zArr);
                return i - 3;
            } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
                m27711a(zArr);
                return i - 2;
            } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
                m27711a(zArr);
                return i - 1;
            } else {
                int i4 = i2 - 1;
                int i5 = i + 2;
                while (i5 < i4) {
                    byte b = bArr[i5];
                    if ((b & 254) == 0) {
                        int i6 = i5 - 2;
                        if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                            m27711a(zArr);
                            return i6;
                        }
                        i5 -= 2;
                    }
                    i5 += 3;
                }
                zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
                zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
                zArr[2] = bArr[i4] == 0;
                return i2;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static C31782a m27713a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        boolean z;
        int[] iArr2;
        dc1 dc1Var = new dc1(bArr, i + 2, i2);
        int i7 = 4;
        dc1Var.m34964d(4);
        int m34968b = dc1Var.m34968b(3);
        dc1Var.m34962f();
        int m34968b2 = dc1Var.m34968b(2);
        boolean m34967c = dc1Var.m34967c();
        int m34968b3 = dc1Var.m34968b(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (dc1Var.m34967c()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr3 = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr3[i11] = dc1Var.m34968b(8);
        }
        int m34968b4 = dc1Var.m34968b(8);
        int i12 = 0;
        for (int i13 = 0; i13 < m34968b; i13++) {
            if (dc1Var.m34967c()) {
                i12 += 89;
            }
            if (dc1Var.m34967c()) {
                i12 += 8;
            }
        }
        dc1Var.m34964d(i12);
        if (m34968b > 0) {
            dc1Var.m34964d((8 - m34968b) * 2);
        }
        dc1Var.m34963e();
        int m34963e = dc1Var.m34963e();
        if (m34963e == 3) {
            dc1Var.m34962f();
        }
        int m34963e2 = dc1Var.m34963e();
        int m34963e3 = dc1Var.m34963e();
        if (dc1Var.m34967c()) {
            int m34963e4 = dc1Var.m34963e();
            int m34963e5 = dc1Var.m34963e();
            int m34963e6 = dc1Var.m34963e();
            int m34963e7 = dc1Var.m34963e();
            m34963e2 -= (m34963e4 + m34963e5) * ((m34963e == 1 || m34963e == 2) ? 2 : 1);
            m34963e3 -= (m34963e6 + m34963e7) * (m34963e == 1 ? 2 : 1);
        }
        int i14 = m34963e3;
        int i15 = m34963e2;
        dc1Var.m34963e();
        dc1Var.m34963e();
        int m34963e8 = dc1Var.m34963e();
        for (int i16 = dc1Var.m34967c() ? 0 : m34968b; i16 <= m34968b; i16++) {
            dc1Var.m34963e();
            dc1Var.m34963e();
            dc1Var.m34963e();
        }
        dc1Var.m34963e();
        dc1Var.m34963e();
        dc1Var.m34963e();
        dc1Var.m34963e();
        dc1Var.m34963e();
        dc1Var.m34963e();
        if (dc1Var.m34967c() && dc1Var.m34967c()) {
            int i17 = 0;
            while (i17 < i7) {
                int i18 = 0;
                while (i18 < i10) {
                    if (!dc1Var.m34967c()) {
                        dc1Var.m34963e();
                    } else {
                        int min = Math.min(64, 1 << ((i17 << 1) + 4));
                        if (i17 > 1) {
                            dc1Var.m34965d();
                        }
                        for (int i19 = 0; i19 < min; i19++) {
                            dc1Var.m34965d();
                        }
                    }
                    i18 += i17 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i17++;
                i7 = 4;
                i10 = 6;
            }
        }
        dc1Var.m34964d(2);
        if (dc1Var.m34967c()) {
            dc1Var.m34964d(8);
            dc1Var.m34963e();
            dc1Var.m34963e();
            dc1Var.m34962f();
        }
        int m34963e9 = dc1Var.m34963e();
        int[] iArr4 = new int[0];
        int[] iArr5 = new int[0];
        int i20 = -1;
        int i21 = 0;
        int i22 = -1;
        while (i21 < m34963e9) {
            if (i21 != 0 && dc1Var.m34967c()) {
                int i23 = i20 + i22;
                int m34963e10 = (1 - ((dc1Var.m34967c() ? 1 : 0) * 2)) * (dc1Var.m34963e() + 1);
                i3 = m34963e9;
                int i24 = i23 + 1;
                i6 = m34968b4;
                boolean[] zArr = new boolean[i24];
                iArr = iArr3;
                for (int i25 = 0; i25 <= i23; i25++) {
                    if (!dc1Var.m34967c()) {
                        zArr[i25] = dc1Var.m34967c();
                    } else {
                        zArr[i25] = true;
                    }
                }
                int[] iArr6 = new int[i24];
                int[] iArr7 = new int[i24];
                int i26 = 0;
                for (int i27 = i22 - 1; i27 >= 0; i27--) {
                    int i28 = iArr5[i27] + m34963e10;
                    if (i28 < 0 && zArr[i20 + i27]) {
                        iArr6[i26] = i28;
                        i26++;
                    }
                }
                if (m34963e10 < 0 && zArr[i23]) {
                    iArr6[i26] = m34963e10;
                    i26++;
                }
                i5 = i8;
                int i29 = i26;
                i4 = m34968b3;
                for (int i30 = 0; i30 < i20; i30++) {
                    int i31 = iArr4[i30] + m34963e10;
                    if (i31 < 0 && zArr[i30]) {
                        iArr6[i29] = i31;
                        i29++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr6, i29);
                int i32 = 0;
                for (int i33 = i20 - 1; i33 >= 0; i33--) {
                    int i34 = iArr4[i33] + m34963e10;
                    if (i34 > 0 && zArr[i33]) {
                        iArr7[i32] = i34;
                        i32++;
                    }
                }
                if (m34963e10 > 0 && zArr[i23]) {
                    iArr7[i32] = m34963e10;
                    i32++;
                }
                int i35 = i32;
                for (int i36 = 0; i36 < i22; i36++) {
                    int i37 = iArr5[i36] + m34963e10;
                    if (i37 > 0 && zArr[i20 + i36]) {
                        iArr7[i35] = i37;
                        i35++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr7, i35);
                i22 = i35;
                iArr4 = copyOf;
                i20 = i29;
                z = true;
            } else {
                i3 = m34963e9;
                i4 = m34968b3;
                i5 = i8;
                iArr = iArr3;
                i6 = m34968b4;
                int m34963e11 = dc1Var.m34963e();
                i22 = dc1Var.m34963e();
                iArr4 = new int[m34963e11];
                for (int i38 = 0; i38 < m34963e11; i38++) {
                    iArr4[i38] = dc1Var.m34963e() + 1;
                    dc1Var.m34962f();
                }
                z = true;
                int[] iArr8 = new int[i22];
                for (int i39 = 0; i39 < i22; i39++) {
                    iArr8[i39] = dc1Var.m34963e() + 1;
                    dc1Var.m34962f();
                }
                i20 = m34963e11;
                iArr2 = iArr8;
            }
            i21++;
            m34968b4 = i6;
            iArr3 = iArr;
            i8 = i5;
            m34968b3 = i4;
            iArr5 = iArr2;
            m34963e9 = i3;
        }
        int i40 = m34968b3;
        int i41 = i8;
        int[] iArr9 = iArr3;
        int i42 = m34968b4;
        if (dc1Var.m34967c()) {
            for (int i43 = 0; i43 < dc1Var.m34963e(); i43++) {
                dc1Var.m34964d(m34963e8 + 5);
            }
        }
        dc1Var.m34964d(2);
        float f = 1.0f;
        if (dc1Var.m34967c()) {
            if (dc1Var.m34967c()) {
                int m34968b5 = dc1Var.m34968b(8);
                if (m34968b5 == 255) {
                    int m34968b6 = dc1Var.m34968b(16);
                    int m34968b7 = dc1Var.m34968b(16);
                    if (m34968b6 != 0 && m34968b7 != 0) {
                        f = m34968b6 / m34968b7;
                    }
                } else {
                    float[] fArr = f87455b;
                    if (m34968b5 < 17) {
                        f = fArr[m34968b5];
                    } else {
                        zo0.m26074a("Unexpected aspect_ratio_idc value: ", m34968b5, "NalUnitUtil");
                    }
                }
            }
            if (dc1Var.m34967c()) {
                dc1Var.m34962f();
            }
            if (dc1Var.m34967c()) {
                dc1Var.m34964d(4);
                if (dc1Var.m34967c()) {
                    dc1Var.m34964d(24);
                }
            }
            if (dc1Var.m34967c()) {
                dc1Var.m34963e();
                dc1Var.m34963e();
            }
            dc1Var.m34962f();
            if (dc1Var.m34967c()) {
                i14 *= 2;
            }
        }
        return new C31782a(m34968b2, m34967c, i40, i41, iArr9, i42, i15, i14, f);
    }

    /* renamed from: a */
    public static int m27714a(int i, byte[] bArr) {
        int i2;
        synchronized (f87456c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f87457d;
                    if (iArr.length <= i4) {
                        f87457d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f87457d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f87457d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
