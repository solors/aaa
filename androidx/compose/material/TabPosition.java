package androidx.compose.material;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabRow.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class TabPosition {
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        if (C1059Dp.m109739equalsimpl0(this.left, tabPosition.left) && C1059Dp.m109739equalsimpl0(this.width, tabPosition.width)) {
            return true;
        }
        return false;
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m107096getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m107097getRightD9Ej5fM() {
        return C1059Dp.m109734constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m107098getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (C1059Dp.m109740hashCodeimpl(this.left) * 31) + C1059Dp.m109740hashCodeimpl(this.width);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) C1059Dp.m109745toStringimpl(this.left)) + ", right=" + ((Object) C1059Dp.m109745toStringimpl(m107097getRightD9Ej5fM())) + ", width=" + ((Object) C1059Dp.m109745toStringimpl(this.width)) + ')';
    }

    private TabPosition(float f, float f2) {
        this.left = f;
        this.width = f2;
    }
}
