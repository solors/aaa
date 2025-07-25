package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Dp.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.DpRect */
/* loaded from: classes.dex */
public final class DpRect {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* compiled from: Dp.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.DpRect$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DpRect(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* renamed from: copy-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ DpRect m109806copya9UjIt4$default(DpRect dpRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpRect.left;
        }
        if ((i & 2) != 0) {
            f2 = dpRect.top;
        }
        if ((i & 4) != 0) {
            f3 = dpRect.right;
        }
        if ((i & 8) != 0) {
            f4 = dpRect.bottom;
        }
        return dpRect.m109815copya9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public final float m109811component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public final float m109812component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM  reason: not valid java name */
    public final float m109813component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM  reason: not valid java name */
    public final float m109814component4D9Ej5fM() {
        return this.bottom;
    }

    @NotNull
    /* renamed from: copy-a9UjIt4  reason: not valid java name */
    public final DpRect m109815copya9UjIt4(float f, float f2, float f3, float f4) {
        return new DpRect(f, f2, f3, f4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        if (C1059Dp.m109739equalsimpl0(this.left, dpRect.left) && C1059Dp.m109739equalsimpl0(this.top, dpRect.top) && C1059Dp.m109739equalsimpl0(this.right, dpRect.right) && C1059Dp.m109739equalsimpl0(this.bottom, dpRect.bottom)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m109816getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m109817getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m109818getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m109819getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((C1059Dp.m109740hashCodeimpl(this.left) * 31) + C1059Dp.m109740hashCodeimpl(this.top)) * 31) + C1059Dp.m109740hashCodeimpl(this.right)) * 31) + C1059Dp.m109740hashCodeimpl(this.bottom);
    }

    @NotNull
    public String toString() {
        return "DpRect(left=" + ((Object) C1059Dp.m109745toStringimpl(this.left)) + ", top=" + ((Object) C1059Dp.m109745toStringimpl(this.top)) + ", right=" + ((Object) C1059Dp.m109745toStringimpl(this.right)) + ", bottom=" + ((Object) C1059Dp.m109745toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ DpRect(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private DpRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    private DpRect(long j, long j2) {
        this(DpOffset.m109795getXD9Ej5fM(j), DpOffset.m109797getYD9Ej5fM(j), C1059Dp.m109734constructorimpl(DpOffset.m109795getXD9Ej5fM(j) + DpSize.m109832getWidthD9Ej5fM(j2)), C1059Dp.m109734constructorimpl(DpOffset.m109797getYD9Ej5fM(j) + DpSize.m109830getHeightD9Ej5fM(j2)), null);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109807getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109808getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109809getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109810getTopD9Ej5fM$annotations() {
    }
}
