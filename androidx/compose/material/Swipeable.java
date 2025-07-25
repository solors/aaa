package androidx.compose.material;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata
@ExperimentalMaterialApi
/* renamed from: androidx.compose.material.FixedThreshold */
/* loaded from: classes.dex */
public final class Swipeable implements ThresholdConfig {
    private final float offset;

    public /* synthetic */ Swipeable(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    private final float m106964component1D9Ej5fM() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default  reason: not valid java name */
    public static /* synthetic */ Swipeable m106965copy0680j_4$default(Swipeable swipeable, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = swipeable.offset;
        }
        return swipeable.m106966copy0680j_4(f);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@NotNull Density density, float f, float f2) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return f + (density.mo106214toPx0680j_4(this.offset) * Math.signum(f2 - f));
    }

    @NotNull
    /* renamed from: copy-0680j_4  reason: not valid java name */
    public final Swipeable m106966copy0680j_4(float f) {
        return new Swipeable(f, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Swipeable) && C1059Dp.m109739equalsimpl0(this.offset, ((Swipeable) obj).offset)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1059Dp.m109740hashCodeimpl(this.offset);
    }

    @NotNull
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) C1059Dp.m109745toStringimpl(this.offset)) + ')';
    }

    private Swipeable(float f) {
        this.offset = f;
    }
}
