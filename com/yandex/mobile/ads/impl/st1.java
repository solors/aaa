package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes8.dex */
public interface st1 {

    /* renamed from: com.yandex.mobile.ads.impl.st1$a */
    /* loaded from: classes8.dex */
    public static class C31397a implements st1 {

        /* renamed from: a */
        private final Random f85382a;

        /* renamed from: b */
        private final int[] f85383b;

        /* renamed from: c */
        private final int[] f85384c;

        public C31397a() {
            this(new Random());
        }

        /* renamed from: a */
        private static int[] m29538a(Random random) {
            return new int[0];
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: b */
        public final C31397a mo29536b(int i) {
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                iArr[i3] = this.f85382a.nextInt(this.f85383b.length + 1);
                int i4 = i3 + 1;
                int nextInt = this.f85382a.nextInt(i4);
                iArr2[i3] = iArr2[nextInt];
                iArr2[nextInt] = i3;
                i3 = i4;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f85383b.length + i];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr4 = this.f85383b;
                if (i2 < iArr4.length + i) {
                    if (i5 < i && i6 == iArr[i5]) {
                        iArr3[i2] = iArr2[i5];
                        i5++;
                    } else {
                        int i7 = i6 + 1;
                        int i8 = iArr4[i6];
                        iArr3[i2] = i8;
                        if (i8 >= 0) {
                            iArr3[i2] = i8 + i;
                        }
                        i6 = i7;
                    }
                    i2++;
                } else {
                    return new C31397a(iArr3, new Random(this.f85382a.nextLong()));
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: c */
        public final C31397a mo29534c(int i) {
            int[] iArr = new int[this.f85383b.length - i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f85383b;
                if (i2 < iArr2.length) {
                    int i4 = iArr2[i2];
                    if (i4 < 0 || i4 >= i) {
                        int i5 = i2 - i3;
                        if (i4 >= 0) {
                            i4 -= i;
                        }
                        iArr[i5] = i4;
                    } else {
                        i3++;
                    }
                    i2++;
                } else {
                    return new C31397a(iArr, new Random(this.f85382a.nextLong()));
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: d */
        public final int mo29532d(int i) {
            int i2 = this.f85384c[i] - 1;
            if (i2 >= 0) {
                return this.f85383b[i2];
            }
            return -1;
        }

        private C31397a(Random random) {
            this(m29538a(random), random);
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: a */
        public final int mo29540a() {
            int[] iArr = this.f85383b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        private C31397a(int[] iArr, Random random) {
            this.f85383b = iArr;
            this.f85382a = random;
            this.f85384c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f85384c[iArr[i]] = i;
            }
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: a */
        public final int mo29539a(int i) {
            int i2 = this.f85384c[i] + 1;
            int[] iArr = this.f85383b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: d */
        public final C31397a mo29533d() {
            return new C31397a(new int[0], new Random(this.f85382a.nextLong()));
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: c */
        public final int mo29535c() {
            int[] iArr = this.f85383b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.st1
        /* renamed from: b */
        public final int mo29537b() {
            return this.f85383b.length;
        }
    }

    /* renamed from: a */
    int mo29540a();

    /* renamed from: a */
    int mo29539a(int i);

    /* renamed from: b */
    int mo29537b();

    /* renamed from: b */
    C31397a mo29536b(int i);

    /* renamed from: c */
    int mo29535c();

    /* renamed from: c */
    C31397a mo29534c(int i);

    /* renamed from: d */
    int mo29532d(int i);

    /* renamed from: d */
    C31397a mo29533d();
}
