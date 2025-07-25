package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* compiled from: ComplexDouble.kt */
@Metadata
/* loaded from: classes.dex */
public final class ComplexDoubleKt {
    @NotNull
    public static final Tuples<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d, double d2, double d3) {
        double d4 = -d2;
        double d5 = (d2 * d2) - ((4.0d * d) * d3);
        ComplexDouble complexSqrt = complexSqrt(d5);
        complexSqrt._real += d4;
        double d6 = d * 2.0d;
        complexSqrt._real /= d6;
        complexSqrt._imaginary /= d6;
        ComplexDouble complexSqrt2 = complexSqrt(d5);
        double d7 = -1;
        complexSqrt2._real *= d7;
        complexSqrt2._imaginary *= d7;
        complexSqrt2._real += d4;
        complexSqrt2._real /= d6;
        complexSqrt2._imaginary /= d6;
        return C38513v.m14532a(complexSqrt, complexSqrt2);
    }

    @NotNull
    public static final ComplexDouble complexSqrt(double d) {
        if (d < 0.0d) {
            return new ComplexDouble(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new ComplexDouble(Math.sqrt(d), 0.0d);
    }

    @NotNull
    public static final ComplexDouble minus(double d, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d2 = -1;
        other._real *= d2;
        other._imaginary *= d2;
        other._real += d;
        return other;
    }

    @NotNull
    public static final ComplexDouble plus(double d, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real += d;
        return other;
    }

    @NotNull
    public static final ComplexDouble times(double d, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real *= d;
        other._imaginary *= d;
        return other;
    }
}
