package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Padding.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo106299calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo106300calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.start;
        }
        return this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo106301calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.end;
        }
        return this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo106302calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        if (!C1059Dp.m109739equalsimpl0(this.start, paddingValuesImpl.start) || !C1059Dp.m109739equalsimpl0(this.top, paddingValuesImpl.top) || !C1059Dp.m109739equalsimpl0(this.end, paddingValuesImpl.end) || !C1059Dp.m109739equalsimpl0(this.bottom, paddingValuesImpl.bottom)) {
            return false;
        }
        return true;
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m106336getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM  reason: not valid java name */
    public final float m106337getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM  reason: not valid java name */
    public final float m106338getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m106339getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((C1059Dp.m109740hashCodeimpl(this.start) * 31) + C1059Dp.m109740hashCodeimpl(this.top)) * 31) + C1059Dp.m109740hashCodeimpl(this.end)) * 31) + C1059Dp.m109740hashCodeimpl(this.bottom);
    }

    @NotNull
    public String toString() {
        return "PaddingValues(start=" + ((Object) C1059Dp.m109745toStringimpl(this.start)) + ", top=" + ((Object) C1059Dp.m109745toStringimpl(this.top)) + ", end=" + ((Object) C1059Dp.m109745toStringimpl(this.end)) + ", bottom=" + ((Object) C1059Dp.m109745toStringimpl(this.bottom)) + ')';
    }

    private PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
    }

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1059Dp.m109734constructorimpl(0) : f, (i & 2) != 0 ? C1059Dp.m109734constructorimpl(0) : f2, (i & 4) != 0 ? C1059Dp.m109734constructorimpl(0) : f3, (i & 8) != 0 ? C1059Dp.m109734constructorimpl(0) : f4, null);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m106332getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m106333getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m106334getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m106335getTopD9Ej5fM$annotations() {
    }
}
