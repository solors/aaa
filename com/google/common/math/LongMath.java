package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class LongMath {
    @VisibleForTesting

    /* renamed from: a */
    static final byte[] f41353a = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    @VisibleForTesting
    @GwtIncompatible

    /* renamed from: b */
    static final long[] f41354b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    @VisibleForTesting
    @GwtIncompatible

    /* renamed from: c */
    static final long[] f41355c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: d */
    static final long[] f41356d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: e */
    static final int[] f41357e = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    @VisibleForTesting

    /* renamed from: f */
    static final int[] f41358f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: g */
    private static final long[][] f41359g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.math.LongMath$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C170381 {

        /* renamed from: a */
        static final /* synthetic */ int[] f41360a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f41360a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41360a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41360a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41360a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41360a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41360a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41360a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41360a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes4.dex */
    private enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            /* renamed from: c */
            long mo68169c(long j, long j2, long j3) {
                return (j * j2) % j3;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            /* renamed from: e */
            long mo68168e(long j, long j2) {
                return (j * j) % j2;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            /* renamed from: h */
            private long m68167h(long j, long j2, long j3) {
                int i = (j > (j3 - j2) ? 1 : (j == (j3 - j2) ? 0 : -1));
                long j4 = j + j2;
                if (i >= 0) {
                    return j4 - j3;
                }
                return j4;
            }

            /* renamed from: i */
            private long m68166i(long j, long j2) {
                int i = 32;
                do {
                    int min = Math.min(i, Long.numberOfLeadingZeros(j));
                    j = UnsignedLongs.remainder(j << min, j2);
                    i -= min;
                } while (i > 0);
                return j;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            /* renamed from: c */
            long mo68169c(long j, long j2, long j3) {
                long j4 = j >>> 32;
                long j5 = j2 >>> 32;
                long j6 = j & 4294967295L;
                long j7 = j2 & 4294967295L;
                long m68166i = m68166i(j4 * j5, j3) + (j4 * j7);
                if (m68166i < 0) {
                    m68166i = UnsignedLongs.remainder(m68166i, j3);
                }
                return m68167h(m68166i(m68166i + (j5 * j6), j3), UnsignedLongs.remainder(j6 * j7, j3), j3);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            /* renamed from: e */
            long mo68168e(long j, long j2) {
                long j3 = j >>> 32;
                long j4 = j & 4294967295L;
                long m68166i = m68166i(j3 * j3, j2);
                long j5 = j3 * j4 * 2;
                if (j5 < 0) {
                    j5 = UnsignedLongs.remainder(j5, j2);
                }
                return m68167h(m68166i(m68166i + j5, j2), UnsignedLongs.remainder(j4 * j4, j2), j2);
            }
        };

        /* renamed from: d */
        private long m68172d(long j, long j2, long j3) {
            long j4 = 1;
            while (j2 != 0) {
                if ((j2 & 1) != 0) {
                    j4 = mo68169c(j4, j, j3);
                }
                j = mo68168e(j, j3);
                j2 >>= 1;
            }
            return j4;
        }

        /* renamed from: f */
        static boolean m68171f(long j, long j2) {
            MillerRabinTester millerRabinTester;
            if (j2 <= 3037000499L) {
                millerRabinTester = SMALL;
            } else {
                millerRabinTester = LARGE;
            }
            return millerRabinTester.m68170g(j, j2);
        }

        /* renamed from: g */
        private boolean m68170g(long j, long j2) {
            long j3 = j2 - 1;
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> numberOfTrailingZeros;
            long j5 = j % j2;
            if (j5 == 0) {
                return true;
            }
            long m68172d = m68172d(j5, j4, j2);
            if (m68172d == 1) {
                return true;
            }
            int i = 0;
            while (m68172d != j3) {
                i++;
                if (i == numberOfTrailingZeros) {
                    return false;
                }
                m68172d = mo68168e(m68172d, j2);
            }
            return true;
        }

        /* renamed from: c */
        abstract long mo68169c(long j, long j2, long j3);

        /* renamed from: e */
        abstract long mo68168e(long j, long j2);

        /* synthetic */ MillerRabinTester(C170381 c170381) {
            this();
        }
    }

    private LongMath() {
    }

    /* renamed from: a */
    static boolean m68177a(long j) {
        if (((int) j) == j) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: b */
    static int m68176b(long j, long j2) {
        return (int) ((~(~(j - j2))) >>> 63);
    }

    public static long binomial(int i, int i2) {
        boolean z;
        MathPreconditions.m68161e("n", i);
        MathPreconditions.m68161e("k", i2);
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        long j = 1;
        if (i2 == 0) {
            return 1L;
        }
        if (i2 != 1) {
            long[] jArr = f41356d;
            if (i < jArr.length) {
                return jArr[i] / (jArr[i2] * jArr[i - i2]);
            }
            int[] iArr = f41357e;
            if (i2 < iArr.length && i <= iArr[i2]) {
                int[] iArr2 = f41358f;
                if (i2 < iArr2.length && i <= iArr2[i2]) {
                    int i3 = i - 1;
                    long j2 = i;
                    for (int i4 = 2; i4 <= i2; i4++) {
                        j2 = (j2 * i3) / i4;
                        i3--;
                    }
                    return j2;
                }
                long j3 = i;
                int log2 = log2(j3, RoundingMode.CEILING);
                int i5 = i - 1;
                int i6 = log2;
                int i7 = 2;
                long j4 = j3;
                long j5 = 1;
                while (i7 <= i2) {
                    i6 += log2;
                    if (i6 < 63) {
                        j4 *= i5;
                        j5 *= i7;
                    } else {
                        j = m68174d(j, j4, j5);
                        j4 = i5;
                        j5 = i7;
                        i6 = log2;
                    }
                    i7++;
                    i5--;
                }
                return m68174d(j, j4, j5);
            }
            return Long.MAX_VALUE;
        }
        return i;
    }

    @GwtIncompatible
    /* renamed from: c */
    static int m68175c(long j) {
        byte b = f41353a[Long.numberOfLeadingZeros(j)];
        return b - m68176b(j, f41354b[b]);
    }

    @Beta
    public static long ceilingPowerOfTwo(long j) {
        MathPreconditions.m68157i("x", j);
        if (j <= Longs.MAX_POWER_OF_TWO) {
            return 1 << (-Long.numberOfLeadingZeros(j - 1));
        }
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("ceilingPowerOfTwo(");
        sb2.append(j);
        sb2.append(") is not representable as a long");
        throw new ArithmeticException(sb2.toString());
    }

    @GwtIncompatible
    public static long checkedAdd(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = true;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        MathPreconditions.m68163c(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    public static long checkedMultiply(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            z = true;
        } else {
            z = false;
        }
        MathPreconditions.m68163c(z, "checkedMultiply", j, j2);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 != Long.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        MathPreconditions.m68163c(z2 | z3, "checkedMultiply", j, j2);
        long j3 = j * j2;
        if (i != 0 && j3 / j != j2) {
            z4 = false;
        } else {
            z4 = true;
        }
        MathPreconditions.m68163c(z4, "checkedMultiply", j, j2);
        return j3;
    }

    @GwtIncompatible
    public static long checkedPow(long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MathPreconditions.m68161e("exponent", i);
        if (j >= -2) {
            z = true;
        } else {
            z = false;
        }
        if (j <= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = 1;
        if (z & z2) {
            int i2 = (int) j;
            if (i2 != -2) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            return 1L;
                        }
                        if (i2 == 2) {
                            if (i < 63) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            MathPreconditions.m68163c(z5, "checkedPow", j, i);
                            return 1 << i;
                        }
                        throw new AssertionError();
                    } else if (i == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            }
            if (i < 64) {
                z4 = true;
            } else {
                z4 = false;
            }
            MathPreconditions.m68163c(z4, "checkedPow", j, i);
            if ((i & 1) == 0) {
                return 1 << i;
            }
            return (-1) << i;
        }
        long j3 = j;
        int i3 = i;
        while (i3 != 0) {
            if (i3 != 1) {
                if ((i3 & 1) != 0) {
                    j2 = checkedMultiply(j2, j3);
                }
                long j4 = j2;
                int i4 = i3 >> 1;
                if (i4 > 0) {
                    if (-3037000499L <= j3 && j3 <= 3037000499L) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    MathPreconditions.m68163c(z3, "checkedPow", j3, i4);
                    j3 *= j3;
                }
                i3 = i4;
                j2 = j4;
            } else {
                return checkedMultiply(j2, j3);
            }
        }
        return j2;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j, long j2) {
        boolean z;
        long j3 = j - j2;
        boolean z2 = true;
        if ((j ^ j2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        MathPreconditions.m68163c(z | z2, "checkedSubtract", j, j2);
        return j3;
    }

    /* renamed from: d */
    static long m68174d(long j, long j2, long j3) {
        if (j == 1) {
            return j2 / j3;
        }
        long gcd = gcd(j, j3);
        return (j / gcd) * (j2 / (j3 / gcd));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r9 > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r9 < 0) goto L24;
     */
    @com.google.common.annotations.GwtIncompatible
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long divide(long r9, long r11, java.math.RoundingMode r13) {
        /*
            com.google.common.base.Preconditions.checkNotNull(r13)
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            return r0
        L10:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r9 = (int) r9
            r10 = 1
            r9 = r9 | r10
            int[] r7 = com.google.common.math.LongMath.C170381.f41360a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L50;
                case 2: goto L57;
                case 3: goto L4d;
                case 4: goto L58;
                case 5: goto L4a;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L47
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 == r11) goto L58
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r11) goto L57
            r11 = 1
            long r11 = r11 & r0
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L57
            goto L58
        L47:
            if (r11 <= 0) goto L57
            goto L58
        L4a:
            if (r9 <= 0) goto L57
            goto L58
        L4d:
            if (r9 >= 0) goto L57
            goto L58
        L50:
            if (r6 != 0) goto L53
            goto L54
        L53:
            r10 = r8
        L54:
            com.google.common.math.MathPreconditions.m68155k(r10)
        L57:
            r10 = r8
        L58:
            if (r10 == 0) goto L5c
            long r9 = (long) r9
            long r0 = r0 + r9
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.LongMath.divide(long, long, java.math.RoundingMode):long");
    }

    @GwtIncompatible
    public static long factorial(int i) {
        MathPreconditions.m68161e("n", i);
        long[] jArr = f41356d;
        if (i < jArr.length) {
            return jArr[i];
        }
        return Long.MAX_VALUE;
    }

    @Beta
    public static long floorPowerOfTwo(long j) {
        MathPreconditions.m68157i("x", j);
        return 1 << (63 - Long.numberOfLeadingZeros(j));
    }

    public static long gcd(long j, long j2) {
        MathPreconditions.m68160f("a", j);
        MathPreconditions.m68160f("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j) {
        boolean z;
        boolean z2 = true;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j & (j - 1)) != 0) {
            z2 = false;
        }
        return z & z2;
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(long j) {
        long[][] jArr;
        if (j < 2) {
            MathPreconditions.m68160f("n", j);
            return false;
        } else if (j < 66) {
            if (((722865708377213483 >> (((int) j) - 2)) & 1) == 0) {
                return false;
            }
            return true;
        } else if (((1 << ((int) (j % 30))) & (-545925251)) != 0 || j % 7 == 0 || j % 11 == 0 || j % 13 == 0) {
            return false;
        } else {
            if (j < 289) {
                return true;
            }
            for (long[] jArr2 : f41359g) {
                if (j <= jArr2[0]) {
                    for (int i = 1; i < jArr2.length; i++) {
                        if (!MillerRabinTester.m68171f(jArr2[i], j)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static int log10(long j, RoundingMode roundingMode) {
        boolean z;
        int m68176b;
        MathPreconditions.m68157i("x", j);
        int m68175c = m68175c(j);
        long j2 = f41354b[m68175c];
        switch (C170381.f41360a[roundingMode.ordinal()]) {
            case 1:
                if (j == j2) {
                    z = true;
                } else {
                    z = false;
                }
                MathPreconditions.m68155k(z);
                return m68175c;
            case 2:
            case 3:
                return m68175c;
            case 4:
            case 5:
                m68176b = m68176b(j2, j);
                return m68175c + m68176b;
            case 6:
            case 7:
            case 8:
                m68176b = m68176b(f41355c[m68175c], j);
                return m68175c + m68176b;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int log2(long j, RoundingMode roundingMode) {
        MathPreconditions.m68157i("x", j);
        switch (C170381.f41360a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.m68155k(isPowerOfTwo(j));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
                return (63 - numberOfLeadingZeros) + m68176b((-5402926248376769404) >>> numberOfLeadingZeros, j);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j);
    }

    public static long mean(long j, long j2) {
        return (j & j2) + ((j ^ j2) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j, int i) {
        return (int) mod(j, i);
    }

    @GwtIncompatible
    public static long pow(long j, int i) {
        long j2;
        MathPreconditions.m68161e("exponent", i);
        if (-2 <= j && j <= 2) {
            int i2 = (int) j;
            if (i2 != -2) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            return 1L;
                        }
                        if (i2 == 2) {
                            if (i >= 64) {
                                return 0L;
                            }
                            return 1 << i;
                        }
                        throw new AssertionError();
                    } else if (i == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            } else if (i >= 64) {
                return 0L;
            } else {
                if ((i & 1) == 0) {
                    return 1 << i;
                }
                return -(1 << i);
            }
        }
        long j3 = 1;
        while (i != 0) {
            if (i != 1) {
                if ((i & 1) == 0) {
                    j2 = 1;
                } else {
                    j2 = j;
                }
                j3 *= j2;
                j *= j;
                i >>= 1;
            } else {
                return j3 * j;
            }
        }
        return j3;
    }

    @GwtIncompatible
    public static double roundToDouble(long j, RoundingMode roundingMode) {
        int compare;
        boolean z;
        double d;
        long j2;
        double d2 = j;
        long j3 = (long) d2;
        if (j3 == Long.MAX_VALUE) {
            compare = -1;
        } else {
            compare = Longs.compare(j, j3);
        }
        int[] iArr = C170381.f41360a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                if (compare == 0) {
                    z = true;
                } else {
                    z = false;
                }
                MathPreconditions.m68155k(z);
                return d2;
            case 2:
                if (j >= 0) {
                    if (compare < 0) {
                        return DoubleUtils.m68184f(d2);
                    }
                    return d2;
                } else if (compare > 0) {
                    return Math.nextUp(d2);
                } else {
                    return d2;
                }
            case 3:
                if (compare < 0) {
                    return DoubleUtils.m68184f(d2);
                }
                return d2;
            case 4:
                if (j >= 0) {
                    if (compare > 0) {
                        return Math.nextUp(d2);
                    }
                    return d2;
                } else if (compare < 0) {
                    return DoubleUtils.m68184f(d2);
                } else {
                    return d2;
                }
            case 5:
                if (compare > 0) {
                    return Math.nextUp(d2);
                }
                return d2;
            case 6:
            case 7:
            case 8:
                if (compare >= 0) {
                    d = Math.nextUp(d2);
                    j2 = (long) Math.ceil(d);
                } else {
                    double m68184f = DoubleUtils.m68184f(d2);
                    j3 = (long) Math.floor(m68184f);
                    d = d2;
                    d2 = m68184f;
                    j2 = j3;
                }
                long j4 = j - j3;
                long j5 = j2 - j;
                if (j2 == Long.MAX_VALUE) {
                    j5++;
                }
                int compare2 = Longs.compare(j4, j5);
                if (compare2 < 0) {
                    return d2;
                }
                if (compare2 > 0) {
                    return d;
                }
                int i = iArr[roundingMode.ordinal()];
                if (i != 6) {
                    if (i != 7) {
                        if (i == 8) {
                            if ((DoubleUtils.m68187c(d2) & 1) != 0) {
                                return d;
                            }
                            return d2;
                        }
                        throw new AssertionError("impossible");
                    } else if (j >= 0) {
                        return d;
                    } else {
                        return d2;
                    }
                } else if (j < 0) {
                    return d;
                } else {
                    return d2;
                }
            default:
                throw new AssertionError("impossible");
        }
    }

    @Beta
    public static long saturatedAdd(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = true;
        if ((j2 ^ j) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        if (z | z2) {
            return j3;
        }
        return ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @Beta
    public static long saturatedMultiply(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        boolean z3 = true;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 != Long.MIN_VALUE) {
            z3 = false;
        }
        if (z | (z3 & z2)) {
            return j3;
        }
        long j4 = j * j2;
        if (i != 0 && j4 / j != j2) {
            return j3;
        }
        return j4;
    }

    @Beta
    public static long saturatedPow(long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        MathPreconditions.m68161e("exponent", i);
        if (j >= -2) {
            z = true;
        } else {
            z = false;
        }
        if (j <= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = 1;
        if (z & z2) {
            int i2 = (int) j;
            if (i2 != -2) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            return 1L;
                        }
                        if (i2 == 2) {
                            if (i >= 63) {
                                return Long.MAX_VALUE;
                            }
                            return 1 << i;
                        }
                        throw new AssertionError();
                    } else if (i == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            } else if (i >= 64) {
                return (i & 1) + Long.MAX_VALUE;
            } else {
                if ((i & 1) == 0) {
                    return 1 << i;
                }
                return (-1) << i;
            }
        }
        long j3 = ((j >>> 63) & i & 1) + Long.MAX_VALUE;
        while (i != 0) {
            if (i != 1) {
                if ((i & 1) != 0) {
                    j2 = saturatedMultiply(j2, j);
                }
                i >>= 1;
                if (i > 0) {
                    if (-3037000499L > j) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (j > 3037000499L) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 | z4) {
                        return j3;
                    }
                    j *= j;
                }
            } else {
                return saturatedMultiply(j2, j);
            }
        }
        return j2;
    }

    @Beta
    public static long saturatedSubtract(long j, long j2) {
        boolean z;
        long j3 = j - j2;
        boolean z2 = true;
        if ((j2 ^ j) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        if (z | z2) {
            return j3;
        }
        return ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j, RoundingMode roundingMode) {
        long j2;
        MathPreconditions.m68160f("x", j);
        if (m68177a(j)) {
            return IntMath.sqrt((int) j, roundingMode);
        }
        long sqrt = (long) Math.sqrt(j);
        long j3 = sqrt * sqrt;
        boolean z = true;
        int i = 1;
        switch (C170381.f41360a[roundingMode.ordinal()]) {
            case 1:
                if (j3 != j) {
                    z = false;
                }
                MathPreconditions.m68155k(z);
                return sqrt;
            case 2:
            case 3:
                if (j < j3) {
                    return sqrt - 1;
                }
                return sqrt;
            case 4:
            case 5:
                if (j > j3) {
                    return sqrt + 1;
                }
                return sqrt;
            case 6:
            case 7:
            case 8:
                if (j >= j3) {
                    i = 0;
                }
                return (sqrt - i) + m68176b((j2 * j2) + j2, j);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j, long j2) {
        if (j2 > 0) {
            long j3 = j % j2;
            return j3 >= 0 ? j3 : j3 + j2;
        }
        throw new ArithmeticException("Modulus must be positive");
    }
}
