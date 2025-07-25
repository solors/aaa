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
@Stable
@Metadata
/* loaded from: classes.dex */
public interface PaddingValues {

    /* compiled from: Padding.kt */
    @Immutable
    @Metadata
    /* loaded from: classes.dex */
    public static final class Absolute implements PaddingValues {
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
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
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public float mo106301calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public float mo106302calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            if (!C1059Dp.m109739equalsimpl0(this.left, absolute.left) || !C1059Dp.m109739equalsimpl0(this.top, absolute.top) || !C1059Dp.m109739equalsimpl0(this.right, absolute.right) || !C1059Dp.m109739equalsimpl0(this.bottom, absolute.bottom)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((C1059Dp.m109740hashCodeimpl(this.left) * 31) + C1059Dp.m109740hashCodeimpl(this.top)) * 31) + C1059Dp.m109740hashCodeimpl(this.right)) * 31) + C1059Dp.m109740hashCodeimpl(this.bottom);
        }

        @NotNull
        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) C1059Dp.m109745toStringimpl(this.left)) + ", top=" + ((Object) C1059Dp.m109745toStringimpl(this.top)) + ", right=" + ((Object) C1059Dp.m109745toStringimpl(this.right)) + ", bottom=" + ((Object) C1059Dp.m109745toStringimpl(this.bottom)) + ')';
        }

        private Absolute(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C1059Dp.m109734constructorimpl(0) : f, (i & 2) != 0 ? C1059Dp.m109734constructorimpl(0) : f2, (i & 4) != 0 ? C1059Dp.m109734constructorimpl(0) : f3, (i & 8) != 0 ? C1059Dp.m109734constructorimpl(0) : f4, null);
        }

        @Stable
        /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m106328getBottomD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getLeft-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m106329getLeftD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getRight-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m106330getRightD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
        private static /* synthetic */ void m106331getTopD9Ej5fM$annotations() {
        }
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo106299calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo106300calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo106301calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo106302calculateTopPaddingD9Ej5fM();
}
