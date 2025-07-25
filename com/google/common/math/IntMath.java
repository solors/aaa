package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class IntMath {
    @VisibleForTesting

    /* renamed from: a */
    static final byte[] f41339a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    @VisibleForTesting

    /* renamed from: b */
    static final int[] f41340b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    @VisibleForTesting

    /* renamed from: c */
    static final int[] f41341c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d */
    private static final int[] f41342d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    @VisibleForTesting

    /* renamed from: e */
    static int[] f41343e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.math.IntMath$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C170361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f41344a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f41344a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41344a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41344a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41344a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41344a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41344a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41344a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41344a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private IntMath() {
    }

    @VisibleForTesting
    /* renamed from: a */
    static int m68182a(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* renamed from: b */
    private static int m68181b(int i) {
        byte b = f41339a[Integer.numberOfLeadingZeros(i)];
        return b - m68182a(i, f41340b[b]);
    }

    public static int binomial(int i, int i2) {
        boolean z;
        MathPreconditions.m68161e("n", i);
        MathPreconditions.m68161e("k", i2);
        int i3 = 0;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = f41343e;
        if (i2 < iArr.length && i <= iArr[i2]) {
            if (i2 == 0) {
                return 1;
            }
            if (i2 != 1) {
                long j = 1;
                while (i3 < i2) {
                    i3++;
                    j = (j * (i - i3)) / i3;
                }
                return (int) j;
            }
            return i;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    private static int m68180c(int i) {
        return (int) Math.sqrt(i);
    }

    @Beta
    public static int ceilingPowerOfTwo(int i) {
        MathPreconditions.m68158h("x", i);
        if (i <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i - 1));
        }
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("ceilingPowerOfTwo(");
        sb2.append(i);
        sb2.append(") not representable as an int");
        throw new ArithmeticException(sb2.toString());
    }

    public static int checkedAdd(int i, int i2) {
        boolean z;
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        MathPreconditions.m68164b(z, "checkedAdd", i, i2);
        return i3;
    }

    public static int checkedMultiply(int i, int i2) {
        boolean z;
        long j = i * i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        MathPreconditions.m68164b(z, "checkedMultiply", i, i2);
        return i3;
    }

    public static int checkedPow(int i, int i2) {
        boolean z;
        boolean z2;
        MathPreconditions.m68161e("exponent", i2);
        boolean z3 = false;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i3 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) != 0) {
                                    i3 = checkedMultiply(i3, i);
                                }
                                i2 >>= 1;
                                if (i2 > 0) {
                                    if (-46340 <= i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i <= 46340) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    MathPreconditions.m68164b(z & z2, "checkedPow", i, i2);
                                    i *= i;
                                }
                            } else {
                                return checkedMultiply(i3, i);
                            }
                        }
                        return i3;
                    }
                    if (i2 < 31) {
                        z3 = true;
                    }
                    MathPreconditions.m68164b(z3, "checkedPow", i, i2);
                    return 1 << i2;
                } else if (i2 != 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else if ((i2 & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        }
        if (i2 < 32) {
            z3 = true;
        }
        MathPreconditions.m68164b(z3, "checkedPow", i, i2);
        if ((i2 & 1) == 0) {
            return 1 << i2;
        }
        return (-1) << i2;
    }

    public static int checkedSubtract(int i, int i2) {
        boolean z;
        long j = i - i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        MathPreconditions.m68164b(z, "checkedSubtract", i, i2);
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r6 & r7) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r1 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r5 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r5 < 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int divide(int r5, int r6, java.math.RoundingMode r7) {
        /*
            com.google.common.base.Preconditions.checkNotNull(r7)
            if (r6 == 0) goto L5c
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = com.google.common.math.IntMath.C170361.f41344a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L57;
                case 3: goto L4d;
                case 4: goto L58;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L58
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = r2
            goto L3c
        L3b:
            r6 = r4
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = r2
            goto L43
        L42:
            r7 = r4
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L57
            goto L58
        L47:
            if (r1 <= 0) goto L57
            goto L58
        L4a:
            if (r5 <= 0) goto L57
            goto L58
        L4d:
            if (r5 >= 0) goto L57
            goto L58
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = r4
        L54:
            com.google.common.math.MathPreconditions.m68155k(r2)
        L57:
            r2 = r4
        L58:
            if (r2 == 0) goto L5b
            int r0 = r0 + r5
        L5b:
            return r0
        L5c:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.IntMath.divide(int, int, java.math.RoundingMode):int");
    }

    public static int factorial(int i) {
        MathPreconditions.m68161e("n", i);
        int[] iArr = f41342d;
        if (i < iArr.length) {
            return iArr[i];
        }
        return Integer.MAX_VALUE;
    }

    @Beta
    public static int floorPowerOfTwo(int i) {
        MathPreconditions.m68158h("x", i);
        return Integer.highestOneBit(i);
    }

    public static int gcd(int i, int i2) {
        MathPreconditions.m68161e("a", i);
        MathPreconditions.m68161e("b", i2);
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        int i3 = i >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i2);
        int i4 = i2 >> numberOfTrailingZeros2;
        while (i3 != i4) {
            int i5 = i3 - i4;
            int i6 = (i5 >> 31) & i5;
            int i7 = (i5 - i6) - i6;
            i4 += i6;
            i3 = i7 >> Integer.numberOfTrailingZeros(i7);
        }
        return i3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(int i) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & (i - 1)) == 0) {
            z2 = true;
        }
        return z & z2;
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(int i) {
        return LongMath.isPrime(i);
    }

    @GwtIncompatible
    public static int log10(int i, RoundingMode roundingMode) {
        boolean z;
        int m68182a;
        MathPreconditions.m68158h("x", i);
        int m68181b = m68181b(i);
        int i2 = f41340b[m68181b];
        switch (C170361.f41344a[roundingMode.ordinal()]) {
            case 1:
                if (i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                MathPreconditions.m68155k(z);
                return m68181b;
            case 2:
            case 3:
                return m68181b;
            case 4:
            case 5:
                m68182a = m68182a(i2, i);
                return m68181b + m68182a;
            case 6:
            case 7:
            case 8:
                m68182a = m68182a(f41341c[m68181b], i);
                return m68181b + m68182a;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int log2(int i, RoundingMode roundingMode) {
        MathPreconditions.m68158h("x", i);
        switch (C170361.f41344a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.m68155k(isPowerOfTwo(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + m68182a((-1257966797) >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int mean(int i, int i2) {
        return (i & i2) + ((i ^ i2) >> 1);
    }

    public static int mod(int i, int i2) {
        if (i2 > 0) {
            int i3 = i % i2;
            if (i3 < 0) {
                return i3 + i2;
            }
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Modulus ");
        sb2.append(i2);
        sb2.append(" must be > 0");
        throw new ArithmeticException(sb2.toString());
    }

    @GwtIncompatible
    public static int pow(int i, int i2) {
        int i3;
        MathPreconditions.m68161e("exponent", i2);
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i4 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) == 0) {
                                    i3 = 1;
                                } else {
                                    i3 = i;
                                }
                                i4 *= i3;
                                i *= i;
                                i2 >>= 1;
                            } else {
                                return i * i4;
                            }
                        }
                        return i4;
                    } else if (i2 >= 32) {
                        return 0;
                    } else {
                        return 1 << i2;
                    }
                } else if (i2 != 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else if ((i2 & 1) == 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (i2 >= 32) {
            return 0;
        } else {
            if ((i2 & 1) == 0) {
                return 1 << i2;
            }
            return -(1 << i2);
        }
    }

    @Beta
    public static int saturatedAdd(int i, int i2) {
        return Ints.saturatedCast(i + i2);
    }

    @Beta
    public static int saturatedMultiply(int i, int i2) {
        return Ints.saturatedCast(i * i2);
    }

    @Beta
    public static int saturatedPow(int i, int i2) {
        boolean z;
        boolean z2;
        MathPreconditions.m68161e("exponent", i2);
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i3 = ((i >>> 31) & i2 & 1) + Integer.MAX_VALUE;
                        int i4 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) != 0) {
                                    i4 = saturatedMultiply(i4, i);
                                }
                                i2 >>= 1;
                                if (i2 > 0) {
                                    if (-46340 > i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i > 46340) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z | z2) {
                                        return i3;
                                    }
                                    i *= i;
                                }
                            } else {
                                return saturatedMultiply(i4, i);
                            }
                        }
                        return i4;
                    } else if (i2 >= 31) {
                        return Integer.MAX_VALUE;
                    } else {
                        return 1 << i2;
                    }
                } else if (i2 == 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else if ((i2 & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        } else if (i2 >= 32) {
            return (i2 & 1) + Integer.MAX_VALUE;
        } else {
            if ((i2 & 1) == 0) {
                return 1 << i2;
            }
            return (-1) << i2;
        }
    }

    @Beta
    public static int saturatedSubtract(int i, int i2) {
        return Ints.saturatedCast(i - i2);
    }

    @GwtIncompatible
    public static int sqrt(int i, RoundingMode roundingMode) {
        boolean z;
        int m68182a;
        MathPreconditions.m68161e("x", i);
        int m68180c = m68180c(i);
        switch (C170361.f41344a[roundingMode.ordinal()]) {
            case 1:
                if (m68180c * m68180c == i) {
                    z = true;
                } else {
                    z = false;
                }
                MathPreconditions.m68155k(z);
                return m68180c;
            case 2:
            case 3:
                return m68180c;
            case 4:
            case 5:
                m68182a = m68182a(m68180c * m68180c, i);
                return m68180c + m68182a;
            case 6:
            case 7:
            case 8:
                m68182a = m68182a((m68180c * m68180c) + m68180c, i);
                return m68180c + m68182a;
            default:
                throw new AssertionError();
        }
    }
}
