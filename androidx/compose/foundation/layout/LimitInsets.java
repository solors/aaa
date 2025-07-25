package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsets.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {
    @NotNull
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        if (Intrinsics.m17075f(this.insets, limitInsets.insets) && WindowInsetsSides.m106386equalsimpl0(this.sides, limitInsets.sides)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m106387hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m106398getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    @NotNull
    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        int m106395getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m106395getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m106394getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m106395getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m106395getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m106387hasAnybkgdKaI$foundation_layout_release(this.sides, m106395getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        int m106397getAllowRightInRtlJoeWqyM$foundation_layout_release;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            m106397getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m106396getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m106397getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m106397getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m106387hasAnybkgdKaI$foundation_layout_release(this.sides, m106397getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM  reason: not valid java name */
    public final int m106304getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        if (WindowInsetsSides.m106387hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m106404getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m106388hashCodeimpl(this.sides);
    }

    @NotNull
    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m106390toStringimpl(this.sides)) + ')';
    }

    private LimitInsets(WindowInsets windowInsets, int i) {
        this.insets = windowInsets;
        this.sides = i;
    }
}
