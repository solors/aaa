package androidx.compose.material;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@Immutable
@Metadata
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class FractionalThreshold implements ThresholdConfig {
    private final float fraction;

    public FractionalThreshold(float f) {
        this.fraction = f;
    }

    private final float component1() {
        return this.fraction;
    }

    public static /* synthetic */ FractionalThreshold copy$default(FractionalThreshold fractionalThreshold, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fractionalThreshold.fraction;
        }
        return fractionalThreshold.copy(f);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@NotNull Density density, float f, float f2) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return MathHelpers.lerp(f, f2, this.fraction);
    }

    @NotNull
    public final FractionalThreshold copy(float f) {
        return new FractionalThreshold(f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FractionalThreshold) && Intrinsics.m17075f(Float.valueOf(this.fraction), Float.valueOf(((FractionalThreshold) obj).fraction))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.fraction);
    }

    @NotNull
    public String toString() {
        return "FractionalThreshold(fraction=" + this.fraction + ')';
    }
}
