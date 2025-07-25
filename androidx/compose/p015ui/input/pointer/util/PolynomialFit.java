package androidx.compose.p015ui.input.pointer.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VelocityTracker.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.util.PolynomialFit */
/* loaded from: classes.dex */
public final class PolynomialFit {
    @NotNull
    private final List<Float> coefficients;
    private final float confidence;

    public PolynomialFit(@NotNull List<Float> coefficients, float f) {
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        this.coefficients = coefficients;
        this.confidence = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolynomialFit copy$default(PolynomialFit polynomialFit, List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            list = polynomialFit.coefficients;
        }
        if ((i & 2) != 0) {
            f = polynomialFit.confidence;
        }
        return polynomialFit.copy(list, f);
    }

    @NotNull
    public final List<Float> component1() {
        return this.coefficients;
    }

    public final float component2() {
        return this.confidence;
    }

    @NotNull
    public final PolynomialFit copy(@NotNull List<Float> coefficients, float f) {
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        return new PolynomialFit(coefficients, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolynomialFit)) {
            return false;
        }
        PolynomialFit polynomialFit = (PolynomialFit) obj;
        if (Intrinsics.m17075f(this.coefficients, polynomialFit.coefficients) && Intrinsics.m17075f(Float.valueOf(this.confidence), Float.valueOf(polynomialFit.confidence))) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<Float> getCoefficients() {
        return this.coefficients;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public int hashCode() {
        return (this.coefficients.hashCode() * 31) + Float.hashCode(this.confidence);
    }

    @NotNull
    public String toString() {
        return "PolynomialFit(coefficients=" + this.coefficients + ", confidence=" + this.confidence + ')';
    }
}
