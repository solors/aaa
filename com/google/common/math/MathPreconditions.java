package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes4.dex */
final class MathPreconditions {
    private MathPreconditions() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m68165a(boolean z, double d, RoundingMode roundingMode) {
        if (z) {
            return;
        }
        String valueOf = String.valueOf(roundingMode);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 83);
        sb2.append("rounded value is out of range for input ");
        sb2.append(d);
        sb2.append(" and rounding mode ");
        sb2.append(valueOf);
        throw new ArithmeticException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m68164b(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m68163c(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 54);
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(j);
        sb2.append(", ");
        sb2.append(j2);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static double m68162d(String str, double d) {
        if (d >= 0.0d) {
            return d;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(d);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m68161e(String str, int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static long m68160f(String str, long j) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static BigInteger m68159g(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + valueOf.length());
        sb2.append(str);
        sb2.append(" (");
        sb2.append(valueOf);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m68158h(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static long m68157i(String str, long j) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 35);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static BigInteger m68156j(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 15 + valueOf.length());
        sb2.append(str);
        sb2.append(" (");
        sb2.append(valueOf);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static void m68155k(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
