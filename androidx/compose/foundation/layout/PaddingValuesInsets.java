package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {
    @NotNull
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(@NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.paddingValues = paddingValues;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesInsets)) {
            return false;
        }
        return Intrinsics.m17075f(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo106208roundToPx0680j_4(this.paddingValues.mo106299calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo106208roundToPx0680j_4(this.paddingValues.mo106300calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo106208roundToPx0680j_4(this.paddingValues.mo106301calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo106208roundToPx0680j_4(this.paddingValues.mo106302calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @NotNull
    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float mo106300calculateLeftPaddingu2uoSUM = this.paddingValues.mo106300calculateLeftPaddingu2uoSUM(layoutDirection);
        float mo106302calculateTopPaddingD9Ej5fM = this.paddingValues.mo106302calculateTopPaddingD9Ej5fM();
        float mo106301calculateRightPaddingu2uoSUM = this.paddingValues.mo106301calculateRightPaddingu2uoSUM(layoutDirection);
        float mo106299calculateBottomPaddingD9Ej5fM = this.paddingValues.mo106299calculateBottomPaddingD9Ej5fM();
        return "PaddingValues(" + ((Object) C1059Dp.m109745toStringimpl(mo106300calculateLeftPaddingu2uoSUM)) + ", " + ((Object) C1059Dp.m109745toStringimpl(mo106302calculateTopPaddingD9Ej5fM)) + ", " + ((Object) C1059Dp.m109745toStringimpl(mo106301calculateRightPaddingu2uoSUM)) + ", " + ((Object) C1059Dp.m109745toStringimpl(mo106299calculateBottomPaddingD9Ej5fM)) + ')';
    }
}
