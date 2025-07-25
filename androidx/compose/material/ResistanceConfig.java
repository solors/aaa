package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class ResistanceConfig {
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    public ResistanceConfig(float f, float f2, float f3) {
        this.basis = f;
        this.factorAtMin = f2;
        this.factorAtMax = f3;
    }

    public final float computeResistance(float f) {
        float f2;
        boolean z;
        float m16909m;
        if (f < 0.0f) {
            f2 = this.factorAtMin;
        } else {
            f2 = this.factorAtMax;
        }
        if (f2 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        m16909m = _Ranges.m16909m(f / this.basis, -1.0f, 1.0f);
        return (this.basis / f2) * ((float) Math.sin((m16909m * 3.1415927f) / 2));
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        if (this.basis == resistanceConfig.basis) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.factorAtMin == resistanceConfig.factorAtMin) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.factorAtMax == resistanceConfig.factorAtMax) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return true;
        }
        return false;
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.basis) * 31) + Float.hashCode(this.factorAtMin)) * 31) + Float.hashCode(this.factorAtMax);
    }

    @NotNull
    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }

    public /* synthetic */ ResistanceConfig(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? 10.0f : f2, (i & 4) != 0 ? 10.0f : f3);
    }
}
