package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class DoubleMath {

    /* renamed from: a */
    private static final double f41336a = Math.log(2.0d);
    @VisibleForTesting

    /* renamed from: b */
    static final double[] f41337b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.math.DoubleMath$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C170351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f41338a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f41338a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41338a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41338a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41338a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41338a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41338a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41338a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41338a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    /* renamed from: a */
    private static double m68191a(double d) {
        Preconditions.checkArgument(DoubleUtils.m68186d(d));
        return d;
    }

    @GwtIncompatible
    /* renamed from: b */
    static double m68190b(double d, RoundingMode roundingMode) {
        int i;
        if (DoubleUtils.m68186d(d)) {
            switch (C170351.f41338a[roundingMode.ordinal()]) {
                case 1:
                    MathPreconditions.m68155k(isMathematicalInteger(d));
                    return d;
                case 2:
                    if (d < 0.0d && !isMathematicalInteger(d)) {
                        return ((long) d) - 1;
                    }
                    return d;
                case 3:
                    if (d > 0.0d && !isMathematicalInteger(d)) {
                        return ((long) d) + 1;
                    }
                    return d;
                case 4:
                    return d;
                case 5:
                    if (isMathematicalInteger(d)) {
                        return d;
                    }
                    long j = (long) d;
                    if (d > 0.0d) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    return j + i;
                case 6:
                    return Math.rint(d);
                case 7:
                    double rint = Math.rint(d);
                    if (Math.abs(d - rint) == 0.5d) {
                        return d + Math.copySign(0.5d, d);
                    }
                    return rint;
                case 8:
                    double rint2 = Math.rint(d);
                    if (Math.abs(d - rint2) == 0.5d) {
                        return d;
                    }
                    return rint2;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static double factorial(int i) {
        MathPreconditions.m68161e("n", i);
        if (i > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        for (int i2 = (i & (-16)) + 1; i2 <= i; i2++) {
            d *= i2;
        }
        return d * f41337b[i >> 4];
    }

    public static int fuzzyCompare(double d, double d2, double d3) {
        if (fuzzyEquals(d, d2, d3)) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        return Booleans.compare(Double.isNaN(d), Double.isNaN(d2));
    }

    public static boolean fuzzyEquals(double d, double d2, double d3) {
        MathPreconditions.m68162d("tolerance", d3);
        if (Math.copySign(d - d2, 1.0d) > d3 && d != d2 && (!Double.isNaN(d) || !Double.isNaN(d2))) {
            return false;
        }
        return true;
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d) {
        if (DoubleUtils.m68186d(d) && (d == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.m68187c(d)) <= Math.getExponent(d))) {
            return true;
        }
        return false;
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d) {
        if (d <= 0.0d || !DoubleUtils.m68186d(d)) {
            return false;
        }
        long m68187c = DoubleUtils.m68187c(d);
        if ((m68187c & (m68187c - 1)) != 0) {
            return false;
        }
        return true;
    }

    public static double log2(double d) {
        return Math.log(d) / f41336a;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double m68191a = m68191a(dArr[0]);
        long j = 1;
        for (int i = 1; i < dArr.length; i++) {
            m68191a(dArr[i]);
            j++;
            m68191a += (dArr[i] - m68191a) / j;
        }
        return m68191a;
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d, RoundingMode roundingMode) {
        boolean z;
        double m68190b = m68190b(d, roundingMode);
        boolean z2 = true;
        if ((-9.223372036854776E18d) - m68190b < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (m68190b >= 9.223372036854776E18d) {
            z2 = false;
        }
        if (z & z2) {
            return BigInteger.valueOf((long) m68190b);
        }
        BigInteger shiftLeft = BigInteger.valueOf(DoubleUtils.m68187c(m68190b)).shiftLeft(Math.getExponent(m68190b) - 52);
        if (m68190b < 0.0d) {
            return shiftLeft.negate();
        }
        return shiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d, RoundingMode roundingMode) {
        boolean z;
        double m68190b = m68190b(d, roundingMode);
        boolean z2 = true;
        if (m68190b > -2.147483649E9d) {
            z = true;
        } else {
            z = false;
        }
        if (m68190b >= 2.147483648E9d) {
            z2 = false;
        }
        MathPreconditions.m68165a(z & z2, d, roundingMode);
        return (int) m68190b;
    }

    @GwtIncompatible
    public static long roundToLong(double d, RoundingMode roundingMode) {
        boolean z;
        double m68190b = m68190b(d, roundingMode);
        boolean z2 = true;
        if ((-9.223372036854776E18d) - m68190b < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (m68190b >= 9.223372036854776E18d) {
            z2 = false;
        }
        MathPreconditions.m68165a(z & z2, d, roundingMode);
        return (long) m68190b;
    }

    @GwtIncompatible
    public static int log2(double d, RoundingMode roundingMode) {
        boolean isPowerOfTwo;
        Preconditions.checkArgument(d > 0.0d && DoubleUtils.m68186d(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (!DoubleUtils.m68185e(d)) {
            return log2(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C170351.f41338a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.m68155k(isPowerOfTwo(d));
                break;
            case 2:
                break;
            case 3:
                r1 = !isPowerOfTwo(d);
                break;
            case 4:
                r1 = exponent < 0;
                isPowerOfTwo = isPowerOfTwo(d);
                r1 &= !isPowerOfTwo;
                break;
            case 5:
                r1 = exponent >= 0;
                isPowerOfTwo = isPowerOfTwo(d);
                r1 &= !isPowerOfTwo;
                break;
            case 6:
            case 7:
            case 8:
                double m68183g = DoubleUtils.m68183g(d);
                if (m68183g * m68183g > 2.0d) {
                    r1 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        return r1 ? exponent + 1 : exponent;
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : iArr) {
            j += i;
        }
        return j / iArr.length;
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d = jArr[0];
        long j = 1;
        for (int i = 1; i < jArr.length; i++) {
            j++;
            d += (jArr[i] - d) / j;
        }
        return d;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double m68191a = m68191a(it.next().doubleValue());
        long j = 1;
        while (it.hasNext()) {
            j++;
            m68191a += (m68191a(it.next().doubleValue()) - m68191a) / j;
        }
        return m68191a;
    }
}
