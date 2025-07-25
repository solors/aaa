package com.applovin.impl;

/* renamed from: com.applovin.impl.r8 */
/* loaded from: classes2.dex */
abstract class AbstractC5253r8 {

    /* renamed from: com.applovin.impl.r8$b */
    /* loaded from: classes2.dex */
    public static final class C5255b {

        /* renamed from: a */
        public final long[] f9404a;

        /* renamed from: b */
        public final int[] f9405b;

        /* renamed from: c */
        public final int f9406c;

        /* renamed from: d */
        public final long[] f9407d;

        /* renamed from: e */
        public final int[] f9408e;

        /* renamed from: f */
        public final long f9409f;

        private C5255b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f9404a = jArr;
            this.f9405b = iArr;
            this.f9406c = i;
            this.f9407d = jArr2;
            this.f9408e = iArr2;
            this.f9409f = j;
        }
    }

    /* renamed from: a */
    public static C5255b m95927a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += AbstractC5863xp.m93040a(i4, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            long j2 = jArr[i8];
            while (i9 > 0) {
                int min = Math.min(i2, i9);
                jArr2[i6] = j2;
                int i10 = i * min;
                iArr2[i6] = i10;
                i7 = Math.max(i7, i10);
                jArr3[i6] = i5 * j;
                iArr3[i6] = 1;
                j2 += iArr2[i6];
                i5 += min;
                i9 -= min;
                i6++;
            }
        }
        return new C5255b(jArr2, iArr2, i7, jArr3, iArr3, j * i5);
    }
}
