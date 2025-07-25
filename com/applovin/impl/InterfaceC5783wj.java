package com.applovin.impl;

import java.util.Arrays;
import java.util.Random;

/* renamed from: com.applovin.impl.wj */
/* loaded from: classes2.dex */
public interface InterfaceC5783wj {

    /* renamed from: com.applovin.impl.wj$a */
    /* loaded from: classes2.dex */
    public static class C5784a implements InterfaceC5783wj {

        /* renamed from: a */
        private final Random f11750a;

        /* renamed from: b */
        private final int[] f11751b;

        /* renamed from: c */
        private final int[] f11752c;

        public C5784a(int i) {
            this(i, new Random());
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: a */
        public InterfaceC5783wj mo93505a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f11751b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f11751b;
                if (i4 < iArr2.length) {
                    int i6 = iArr2[i4];
                    if (i6 < i || i6 >= i2) {
                        int i7 = i4 - i5;
                        if (i6 >= i) {
                            i6 -= i3;
                        }
                        iArr[i7] = i6;
                    } else {
                        i5++;
                    }
                    i4++;
                } else {
                    return new C5784a(iArr, new Random(this.f11750a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: b */
        public InterfaceC5783wj mo93501b(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f11750a.nextInt(this.f11751b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f11750a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f11751b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f11751b;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = i7 + 1;
                        int i9 = iArr4[i7];
                        iArr3[i3] = i9;
                        if (i9 >= i) {
                            iArr3[i3] = i9 + i2;
                        }
                        i7 = i8;
                    }
                    i3++;
                } else {
                    return new C5784a(iArr3, new Random(this.f11750a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: c */
        public int mo93500c() {
            int[] iArr = this.f11751b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: d */
        public InterfaceC5783wj mo93499d() {
            return new C5784a(0, new Random(this.f11750a.nextLong()));
        }

        private C5784a(int i, Random random) {
            this(m93504a(i, random), random);
        }

        private C5784a(int[] iArr, Random random) {
            this.f11751b = iArr;
            this.f11750a = random;
            this.f11752c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f11752c[iArr[i]] = i;
            }
        }

        /* renamed from: a */
        private static int[] m93504a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: a */
        public int mo93507a() {
            return this.f11751b.length;
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: a */
        public int mo93506a(int i) {
            int i2 = this.f11752c[i] + 1;
            int[] iArr = this.f11751b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: b */
        public int mo93503b() {
            int[] iArr = this.f11751b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.applovin.impl.InterfaceC5783wj
        /* renamed from: b */
        public int mo93502b(int i) {
            int i2 = this.f11752c[i] - 1;
            if (i2 >= 0) {
                return this.f11751b[i2];
            }
            return -1;
        }
    }

    /* renamed from: a */
    int mo93507a();

    /* renamed from: a */
    int mo93506a(int i);

    /* renamed from: a */
    InterfaceC5783wj mo93505a(int i, int i2);

    /* renamed from: b */
    int mo93503b();

    /* renamed from: b */
    int mo93502b(int i);

    /* renamed from: b */
    InterfaceC5783wj mo93501b(int i, int i2);

    /* renamed from: c */
    int mo93500c();

    /* renamed from: d */
    InterfaceC5783wj mo93499d();
}
