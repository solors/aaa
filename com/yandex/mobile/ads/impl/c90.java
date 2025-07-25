package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class c90 {

    /* renamed from: com.yandex.mobile.ads.impl.c90$a */
    /* loaded from: classes8.dex */
    public static final class C30078a {

        /* renamed from: a */
        public final long[] f77550a;

        /* renamed from: b */
        public final int[] f77551b;

        /* renamed from: c */
        public final int f77552c;

        /* renamed from: d */
        public final long[] f77553d;

        /* renamed from: e */
        public final int[] f77554e;

        /* renamed from: f */
        public final long f77555f;

        private C30078a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f77550a = jArr;
            this.f77551b = iArr;
            this.f77552c = i;
            this.f77553d = jArr2;
            this.f77554e = iArr2;
            this.f77555f = j;
        }
    }

    /* renamed from: a */
    public static C30078a m35337a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = y32.f88010a;
            i3 += ((i4 + i2) - 1) / i2;
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            long j2 = jArr[i9];
            while (i10 > 0) {
                int min = Math.min(i2, i10);
                jArr2[i7] = j2;
                int i11 = i * min;
                iArr2[i7] = i11;
                i8 = Math.max(i8, i11);
                jArr3[i7] = i6 * j;
                iArr3[i7] = 1;
                j2 += iArr2[i7];
                i6 += min;
                i10 -= min;
                i7++;
                jArr2 = jArr2;
            }
        }
        return new C30078a(jArr2, iArr2, i8, jArr3, iArr3, j * i6);
    }
}
