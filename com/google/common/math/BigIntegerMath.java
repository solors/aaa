package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class BigIntegerMath {
    @VisibleForTesting

    /* renamed from: a */
    static final BigInteger f41331a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    private static final double f41332b = Math.log(10.0d);

    /* renamed from: c */
    private static final double f41333c = Math.log(2.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.math.BigIntegerMath$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C170341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f41334a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f41334a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41334a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41334a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41334a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41334a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41334a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41334a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41334a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static class BigIntegerToDoubleRounder extends ToDoubleRounder<BigInteger> {

        /* renamed from: a */
        static final BigIntegerToDoubleRounder f41335a = new BigIntegerToDoubleRounder();

        private BigIntegerToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: f */
        public BigInteger mo68120a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: g */
        public double mo68118c(BigInteger bigInteger) {
            return DoubleUtils.m68189a(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: h */
        public int mo68117d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: i */
        public BigInteger mo68116e(double d, RoundingMode roundingMode) {
            return DoubleMath.roundToBigInteger(d, roundingMode);
        }
    }

    private BigIntegerMath() {
    }

    @GwtIncompatible
    /* renamed from: a */
    static boolean m68200a(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static BigInteger m68199b(List<BigInteger> list) {
        return m68198c(list, 0, list.size());
    }

    public static BigInteger binomial(int i, int i2) {
        boolean z;
        int i3;
        MathPreconditions.m68161e("n", i);
        MathPreconditions.m68161e("k", i2);
        int i4 = 1;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = LongMath.f41357e;
        if (i2 < iArr.length && i <= iArr[i2]) {
            return BigInteger.valueOf(LongMath.binomial(i, i2));
        }
        BigInteger bigInteger = BigInteger.ONE;
        long j = i;
        int log2 = LongMath.log2(j, RoundingMode.CEILING);
        long j2 = 1;
        while (true) {
            int i5 = log2;
            while (i4 < i2) {
                i3 = i - i4;
                i4++;
                i5 += log2;
                if (i5 >= 63) {
                    break;
                }
                j *= i3;
                j2 *= i4;
            }
            return bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            bigInteger = bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            j = i3;
            j2 = i4;
        }
    }

    /* renamed from: c */
    static BigInteger m68198c(List<BigInteger> list, int i, int i2) {
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        int i4 = (i2 + i) >>> 1;
                        return m68198c(list, i, i4).multiply(m68198c(list, i4, i2));
                    }
                    return list.get(i).multiply(list.get(i + 1)).multiply(list.get(i + 2));
                }
                return list.get(i).multiply(list.get(i + 1));
            }
            return list.get(i);
        }
        return BigInteger.ONE;
    }

    @Beta
    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.CEILING));
    }

    @GwtIncompatible
    /* renamed from: d */
    private static BigInteger m68197d(BigInteger bigInteger) {
        return DoubleMath.roundToBigInteger(Math.sqrt(DoubleUtils.m68189a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @GwtIncompatible
    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    @GwtIncompatible
    /* renamed from: e */
    private static BigInteger m68196e(BigInteger bigInteger) {
        BigInteger shiftLeft;
        int log2 = log2(bigInteger, RoundingMode.FLOOR);
        if (log2 < 1023) {
            shiftLeft = m68197d(bigInteger);
        } else {
            int i = (log2 - 52) & (-2);
            shiftLeft = m68197d(bigInteger.shiftRight(i)).shiftLeft(i >> 1);
        }
        BigInteger shiftRight = shiftLeft.add(bigInteger.divide(shiftLeft)).shiftRight(1);
        if (shiftLeft.equals(shiftRight)) {
            return shiftLeft;
        }
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }

    public static BigInteger factorial(int i) {
        MathPreconditions.m68161e("n", i);
        long[] jArr = LongMath.f41356d;
        if (i < jArr.length) {
            return BigInteger.valueOf(jArr[i]);
        }
        ArrayList arrayList = new ArrayList(IntMath.divide(IntMath.log2(i, RoundingMode.CEILING) * i, 64, RoundingMode.CEILING));
        int length = jArr.length;
        long j = jArr[length - 1];
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j2 = j >> numberOfTrailingZeros;
        int log2 = LongMath.log2(j2, RoundingMode.FLOOR) + 1;
        long j3 = length;
        int log22 = LongMath.log2(j3, RoundingMode.FLOOR) + 1;
        int i2 = 1 << (log22 - 1);
        while (j3 <= i) {
            if ((j3 & i2) != 0) {
                i2 <<= 1;
                log22++;
            }
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> numberOfTrailingZeros2;
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((log22 - numberOfTrailingZeros2) + log2 >= 64) {
                arrayList.add(BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j4;
            log2 = LongMath.log2(j2, RoundingMode.FLOOR) + 1;
            j3++;
        }
        if (j2 > 1) {
            arrayList.add(BigInteger.valueOf(j2));
        }
        return m68199b(arrayList).shiftLeft(numberOfTrailingZeros);
    }

    @Beta
    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
        Preconditions.checkNotNull(bigInteger);
        if (bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
        int i;
        boolean z;
        MathPreconditions.m68156j("x", bigInteger);
        if (m68200a(bigInteger)) {
            return LongMath.log10(bigInteger.longValue(), roundingMode);
        }
        int log2 = (int) ((log2(bigInteger, RoundingMode.FLOOR) * f41333c) / f41332b);
        BigInteger pow = BigInteger.TEN.pow(log2);
        int compareTo = pow.compareTo(bigInteger);
        if (compareTo > 0) {
            do {
                log2--;
                pow = pow.divide(BigInteger.TEN);
                i = pow.compareTo(bigInteger);
            } while (i > 0);
        } else {
            BigInteger multiply = BigInteger.TEN.multiply(pow);
            int i2 = compareTo;
            int compareTo2 = multiply.compareTo(bigInteger);
            while (compareTo2 <= 0) {
                log2++;
                BigInteger multiply2 = BigInteger.TEN.multiply(multiply);
                int compareTo3 = multiply2.compareTo(bigInteger);
                BigInteger bigInteger2 = multiply;
                multiply = multiply2;
                pow = bigInteger2;
                i2 = compareTo2;
                compareTo2 = compareTo3;
            }
            i = i2;
        }
        switch (C170341.f41334a[roundingMode.ordinal()]) {
            case 1:
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                MathPreconditions.m68155k(z);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (!pow.equals(bigInteger)) {
                    return log2 + 1;
                }
                return log2;
            case 6:
            case 7:
            case 8:
                if (bigInteger.pow(2).compareTo(pow.pow(2).multiply(BigInteger.TEN)) > 0) {
                    return log2 + 1;
                }
                return log2;
            default:
                throw new AssertionError();
        }
        return log2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int log2(BigInteger bigInteger, RoundingMode roundingMode) {
        MathPreconditions.m68156j("x", (BigInteger) Preconditions.checkNotNull(bigInteger));
        int bitLength = bigInteger.bitLength() - 1;
        switch (C170341.f41334a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.m68155k(isPowerOfTwo(bigInteger));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (!isPowerOfTwo(bigInteger)) {
                    return bitLength + 1;
                }
                return bitLength;
            case 6:
            case 7:
            case 8:
                if (bitLength < 256) {
                    if (bigInteger.compareTo(f41331a.shiftRight(256 - bitLength)) <= 0) {
                        return bitLength;
                    }
                    return bitLength + 1;
                } else if (bigInteger.pow(2).bitLength() - 1 >= (bitLength * 2) + 1) {
                    return bitLength + 1;
                } else {
                    return bitLength;
                }
            default:
                throw new AssertionError();
        }
        return bitLength;
    }

    @GwtIncompatible
    public static double roundToDouble(BigInteger bigInteger, RoundingMode roundingMode) {
        return BigIntegerToDoubleRounder.f41335a.m68119b(bigInteger, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
        boolean z;
        MathPreconditions.m68159g("x", bigInteger);
        if (m68200a(bigInteger)) {
            return BigInteger.valueOf(LongMath.sqrt(bigInteger.longValue(), roundingMode));
        }
        BigInteger m68196e = m68196e(bigInteger);
        switch (C170341.f41334a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.m68155k(m68196e.pow(2).equals(bigInteger));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                int intValue = m68196e.intValue();
                if (intValue * intValue == bigInteger.intValue() && m68196e.pow(2).equals(bigInteger)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return m68196e.add(BigInteger.ONE);
                }
                return m68196e;
            case 6:
            case 7:
            case 8:
                if (m68196e.pow(2).add(m68196e).compareTo(bigInteger) < 0) {
                    return m68196e.add(BigInteger.ONE);
                }
                return m68196e;
            default:
                throw new AssertionError();
        }
        return m68196e;
    }
}
