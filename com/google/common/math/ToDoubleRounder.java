package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
abstract class ToDoubleRounder<X extends Number & Comparable<X>> {

    /* renamed from: com.google.common.math.ToDoubleRounder$1 */
    /* loaded from: classes4.dex */
    static /* synthetic */ class C170421 {

        /* renamed from: a */
        static final /* synthetic */ int[] f41383a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f41383a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41383a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41383a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41383a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41383a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41383a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41383a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41383a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    abstract X mo68120a(X x, X x2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final double m68119b(X x, RoundingMode roundingMode) {
        X x2;
        double d;
        boolean z;
        Preconditions.checkNotNull(x, "x");
        Preconditions.checkNotNull(roundingMode, "mode");
        double mo68118c = mo68118c(x);
        if (Double.isInfinite(mo68118c)) {
            switch (C170421.f41383a[roundingMode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return mo68117d(x) * Double.MAX_VALUE;
                case 5:
                    if (mo68118c != Double.POSITIVE_INFINITY) {
                        return Double.NEGATIVE_INFINITY;
                    }
                    return Double.MAX_VALUE;
                case 6:
                    if (mo68118c == Double.POSITIVE_INFINITY) {
                        return Double.POSITIVE_INFINITY;
                    }
                    return -1.7976931348623157E308d;
                case 7:
                    return mo68118c;
                case 8:
                    String valueOf = String.valueOf(x);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 44);
                    sb2.append(valueOf);
                    sb2.append(" cannot be represented precisely as a double");
                    throw new ArithmeticException(sb2.toString());
            }
        }
        X mo68116e = mo68116e(mo68118c, RoundingMode.UNNECESSARY);
        int compareTo = ((Comparable) x).compareTo(mo68116e);
        int[] iArr = C170421.f41383a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                if (mo68117d(x) >= 0) {
                    if (compareTo < 0) {
                        return DoubleUtils.m68184f(mo68118c);
                    }
                    return mo68118c;
                } else if (compareTo > 0) {
                    return Math.nextUp(mo68118c);
                } else {
                    return mo68118c;
                }
            case 2:
            case 3:
            case 4:
                if (compareTo >= 0) {
                    d = Math.nextUp(mo68118c);
                    if (d == Double.POSITIVE_INFINITY) {
                        return mo68118c;
                    }
                    x2 = mo68116e(d, RoundingMode.CEILING);
                } else {
                    double m68184f = DoubleUtils.m68184f(mo68118c);
                    if (m68184f == Double.NEGATIVE_INFINITY) {
                        return mo68118c;
                    }
                    X mo68116e2 = mo68116e(m68184f, RoundingMode.FLOOR);
                    x2 = mo68116e;
                    mo68116e = mo68116e2;
                    d = mo68118c;
                    mo68118c = m68184f;
                }
                int compareTo2 = ((Comparable) mo68120a(x, mo68116e)).compareTo(mo68120a(x2, x));
                if (compareTo2 < 0) {
                    return mo68118c;
                }
                if (compareTo2 > 0) {
                    return d;
                }
                int i = iArr[roundingMode.ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (mo68117d(x) >= 0) {
                                return d;
                            }
                            return mo68118c;
                        }
                        throw new AssertionError("impossible");
                    } else if (mo68117d(x) < 0) {
                        return d;
                    } else {
                        return mo68118c;
                    }
                } else if ((Double.doubleToRawLongBits(mo68118c) & 1) != 0) {
                    return d;
                } else {
                    return mo68118c;
                }
            case 5:
                if (compareTo < 0) {
                    return DoubleUtils.m68184f(mo68118c);
                }
                return mo68118c;
            case 6:
                if (compareTo > 0) {
                    return Math.nextUp(mo68118c);
                }
                return mo68118c;
            case 7:
                if (mo68117d(x) >= 0) {
                    if (compareTo > 0) {
                        return Math.nextUp(mo68118c);
                    }
                    return mo68118c;
                } else if (compareTo < 0) {
                    return DoubleUtils.m68184f(mo68118c);
                } else {
                    return mo68118c;
                }
            case 8:
                if (compareTo == 0) {
                    z = true;
                } else {
                    z = false;
                }
                MathPreconditions.m68155k(z);
                return mo68118c;
            default:
                throw new AssertionError("impossible");
        }
    }

    /* renamed from: c */
    abstract double mo68118c(X x);

    /* renamed from: d */
    abstract int mo68117d(X x);

    /* renamed from: e */
    abstract X mo68116e(double d, RoundingMode roundingMode);
}
