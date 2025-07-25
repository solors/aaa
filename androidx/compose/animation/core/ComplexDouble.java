package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComplexDouble.kt */
@Metadata
/* loaded from: classes.dex */
public final class ComplexDouble {
    private double _imaginary;
    private double _real;

    public ComplexDouble(double d, double d2) {
        this._real = d;
        this._imaginary = d2;
    }

    private final double component1() {
        return this._real;
    }

    private final double component2() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = complexDouble._real;
        }
        if ((i & 2) != 0) {
            d2 = complexDouble._imaginary;
        }
        return complexDouble.copy(d, d2);
    }

    @NotNull
    public final ComplexDouble copy(double d, double d2) {
        return new ComplexDouble(d, d2);
    }

    @NotNull
    public final ComplexDouble div(double d) {
        this._real /= d;
        this._imaginary /= d;
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) obj;
        if (Intrinsics.m17075f(Double.valueOf(this._real), Double.valueOf(complexDouble._real)) && Intrinsics.m17075f(Double.valueOf(this._imaginary), Double.valueOf(complexDouble._imaginary))) {
            return true;
        }
        return false;
    }

    public final double getImaginary() {
        return this._imaginary;
    }

    public final double getReal() {
        return this._real;
    }

    public int hashCode() {
        return (Double.hashCode(this._real) * 31) + Double.hashCode(this._imaginary);
    }

    @NotNull
    public final ComplexDouble minus(double d) {
        this._real += -d;
        return this;
    }

    @NotNull
    public final ComplexDouble plus(double d) {
        this._real += d;
        return this;
    }

    @NotNull
    public final ComplexDouble times(double d) {
        this._real *= d;
        this._imaginary *= d;
        return this;
    }

    @NotNull
    public String toString() {
        return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
    }

    @NotNull
    public final ComplexDouble unaryMinus() {
        double d = -1;
        this._real *= d;
        this._imaginary *= d;
        return this;
    }

    @NotNull
    public final ComplexDouble minus(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d = -1;
        other._real *= d;
        other._imaginary *= d;
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }

    @NotNull
    public final ComplexDouble plus(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }

    @NotNull
    public final ComplexDouble times(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this._real = (getReal() * other.getReal()) - (getImaginary() * other.getImaginary());
        this._imaginary = (getReal() * other.getImaginary()) + (other.getReal() * getImaginary());
        return this;
    }
}
