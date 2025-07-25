package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.functions.Function1;

@Metadata
/* renamed from: androidx.compose.animation.core.SpringEstimationKt */
/* loaded from: classes.dex */
public final class SpringEstimation {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    private static final double estimateCriticallyDamped(Tuples<ComplexDouble, ComplexDouble> tuples, double d, double d2, double d3) {
        boolean z;
        boolean z2;
        double d4;
        double d5;
        SpringEstimationKt$estimateCriticallyDamped$fn$1 springEstimationKt$estimateCriticallyDamped$fn$1;
        SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 springEstimationKt$estimateCriticallyDamped$fnPrime$1;
        double d6;
        double real = tuples.m17630c().getReal();
        double d7 = real * d;
        double d8 = d2 - d7;
        double log = Math.log(Math.abs(d3 / d)) / real;
        double estimateCriticallyDamped$t2Iterate = estimateCriticallyDamped$t2Iterate(Math.log(Math.abs(d3 / d8)), real) / real;
        int i = 0;
        if (!Double.isInfinite(log) && !Double.isNaN(log)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            d4 = estimateCriticallyDamped$t2Iterate;
        } else {
            if (!Double.isInfinite(estimateCriticallyDamped$t2Iterate) && !Double.isNaN(estimateCriticallyDamped$t2Iterate)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                log = Math.max(log, estimateCriticallyDamped$t2Iterate);
            }
            d4 = log;
        }
        double d9 = (-(d7 + d8)) / (real * d8);
        if (!Double.isNaN(d9) && d9 > 0.0d) {
            if (d9 > 0.0d && (-estimateCriticallyDamped$xInflection(d, real, d9, d8)) < d3) {
                if (d8 < 0.0d && d > 0.0d) {
                    d4 = 0.0d;
                }
            } else {
                d4 = (-(2.0d / real)) - (d / d8);
                d5 = d3;
                springEstimationKt$estimateCriticallyDamped$fn$1 = new SpringEstimationKt$estimateCriticallyDamped$fn$1(d, d8, real, d5);
                springEstimationKt$estimateCriticallyDamped$fnPrime$1 = new SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(d8, real, d);
                d6 = Double.MAX_VALUE;
                while (d6 > 0.001d && i < 100) {
                    i++;
                    double doubleValue = d4 - (springEstimationKt$estimateCriticallyDamped$fn$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fn$1) Double.valueOf(d4)).doubleValue() / springEstimationKt$estimateCriticallyDamped$fnPrime$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fnPrime$1) Double.valueOf(d4)).doubleValue());
                    double abs = Math.abs(d4 - doubleValue);
                    d4 = doubleValue;
                    d6 = abs;
                }
                return d4;
            }
        }
        d5 = -d3;
        springEstimationKt$estimateCriticallyDamped$fn$1 = new SpringEstimationKt$estimateCriticallyDamped$fn$1(d, d8, real, d5);
        springEstimationKt$estimateCriticallyDamped$fnPrime$1 = new SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(d8, real, d);
        d6 = Double.MAX_VALUE;
        while (d6 > 0.001d) {
            i++;
            double doubleValue2 = d4 - (springEstimationKt$estimateCriticallyDamped$fn$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fn$1) Double.valueOf(d4)).doubleValue() / springEstimationKt$estimateCriticallyDamped$fnPrime$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fnPrime$1) Double.valueOf(d4)).doubleValue());
            double abs2 = Math.abs(d4 - doubleValue2);
            d4 = doubleValue2;
            d6 = abs2;
        }
        return d4;
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d, double d2) {
        double d3 = d;
        for (int i = 0; i < 6; i++) {
            d3 = d - Math.log(Math.abs(d3 / d2));
        }
        return d3;
    }

    private static final double estimateCriticallyDamped$xInflection(double d, double d2, double d3, double d4) {
        double d5 = d2 * d3;
        return (d * Math.exp(d5)) + (d4 * d3 * Math.exp(d5));
    }

    private static final long estimateDurationInternal(Tuples<ComplexDouble, ComplexDouble> tuples, double d, double d2, double d3, double d4) {
        boolean z;
        double estimateCriticallyDamped;
        int i = (d3 > 0.0d ? 1 : (d3 == 0.0d ? 0 : -1));
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (d2 != 0.0d) {
                z2 = false;
            }
            if (z2) {
                return 0L;
            }
        }
        if (i < 0) {
            d2 = -d2;
        }
        double d5 = d2;
        double abs = Math.abs(d3);
        if (d > 1.0d) {
            estimateCriticallyDamped = estimateOverDamped(tuples, abs, d5, d4);
        } else if (d < 1.0d) {
            estimateCriticallyDamped = estimateUnderDamped(tuples, abs, d5, d4);
        } else {
            estimateCriticallyDamped = estimateCriticallyDamped(tuples, abs, d5, d4);
        }
        return (long) (estimateCriticallyDamped * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double estimateOverDamped(kotlin.Tuples<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimation.estimateOverDamped(kotlin.Pair, double, double, double):double");
    }

    /* renamed from: estimateOverDamped$xInflection-0 */
    private static final double m106025estimateOverDamped$xInflection0(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final double estimateUnderDamped(Tuples<ComplexDouble, ComplexDouble> tuples, double d, double d2, double d3) {
        double real = tuples.m17630c().getReal();
        double imaginary = (d2 - (real * d)) / tuples.m17630c().getImaginary();
        return Math.log(d3 / Math.sqrt((d * d) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d) {
        boolean z;
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    private static final double iterateNewtonsMethod(double d, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d - (function1.invoke(Double.valueOf(d)).doubleValue() / function12.invoke(Double.valueOf(d)).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, 2.0d * d2 * Math.sqrt(d), d), d2, d3, d4, d5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(d3, d2, d), d2 / (Math.sqrt(d * d3) * 2.0d), d4, d5, d6);
    }
}
