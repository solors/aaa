package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
final class DoubleUtils {
    private DoubleUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static double m68189a(BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        boolean z = true;
        int bitLength = abs.bitLength() - 1;
        if (bitLength < 63) {
            return bigInteger.longValue();
        }
        if (bitLength > 1023) {
            return bigInteger.signum() * Double.POSITIVE_INFINITY;
        }
        int i = (bitLength - 52) - 1;
        long longValue = abs.shiftRight(i).longValue();
        long j = (longValue >> 1) & 4503599627370495L;
        if ((longValue & 1) == 0 || ((j & 1) == 0 && abs.getLowestSetBit() >= i)) {
            z = false;
        }
        if (z) {
            j++;
        }
        return Double.longBitsToDouble((((bitLength + 1023) << 52) + j) | (bigInteger.signum() & Long.MIN_VALUE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static double m68188b(double d) {
        Preconditions.checkArgument(!Double.isNaN(d));
        return Math.max(d, 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static long m68187c(double d) {
        Preconditions.checkArgument(m68186d(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m68186d(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m68185e(double d) {
        if (Math.getExponent(d) >= -1022) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static double m68184f(double d) {
        return -Math.nextUp(-d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static double m68183g(double d) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
    }
}
