package androidx.compose.p015ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Density.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.DensityImpl */
/* loaded from: classes.dex */
final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f, float f2) {
        this.density = f;
        this.fontScale = f2;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = densityImpl.getDensity();
        }
        if ((i & 2) != 0) {
            f2 = densityImpl.getFontScale();
        }
        return densityImpl.copy(f, f2);
    }

    public final float component1() {
        return getDensity();
    }

    public final float component2() {
        return getFontScale();
    }

    @NotNull
    public final DensityImpl copy(float f, float f2) {
        return new DensityImpl(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        if (Intrinsics.m17075f(Float.valueOf(getDensity()), Float.valueOf(densityImpl.getDensity())) && Intrinsics.m17075f(Float.valueOf(getFontScale()), Float.valueOf(densityImpl.getFontScale()))) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (Float.hashCode(getDensity()) * 31) + Float.hashCode(getFontScale());
    }

    @NotNull
    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + getFontScale() + ')';
    }
}
