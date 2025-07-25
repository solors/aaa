package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        if (C1059Dp.m109739equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && C1059Dp.m109739equalsimpl0(this.topDp, fixedDpInsets.topDp) && C1059Dp.m109739equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && C1059Dp.m109739equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo106208roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo106208roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo106208roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo106208roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((C1059Dp.m109740hashCodeimpl(this.leftDp) * 31) + C1059Dp.m109740hashCodeimpl(this.topDp)) * 31) + C1059Dp.m109740hashCodeimpl(this.rightDp)) * 31) + C1059Dp.m109740hashCodeimpl(this.bottomDp);
    }

    @NotNull
    public String toString() {
        return "Insets(left=" + ((Object) C1059Dp.m109745toStringimpl(this.leftDp)) + ", top=" + ((Object) C1059Dp.m109745toStringimpl(this.topDp)) + ", right=" + ((Object) C1059Dp.m109745toStringimpl(this.rightDp)) + ", bottom=" + ((Object) C1059Dp.m109745toStringimpl(this.bottomDp)) + ')';
    }

    private FixedDpInsets(float f, float f2, float f3, float f4) {
        this.leftDp = f;
        this.topDp = f2;
        this.rightDp = f3;
        this.bottomDp = f4;
    }
}
