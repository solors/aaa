package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BorderStroke.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class BorderStroke {
    @NotNull
    private final Brush brush;
    private final float width;

    public /* synthetic */ BorderStroke(float f, Brush brush, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush);
    }

    /* renamed from: copy-D5KLDUw$default  reason: not valid java name */
    public static /* synthetic */ BorderStroke m106083copyD5KLDUw$default(BorderStroke borderStroke, float f, Brush brush, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderStroke.width;
        }
        if ((i & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m106084copyD5KLDUw(f, brush);
    }

    @NotNull
    /* renamed from: copy-D5KLDUw  reason: not valid java name */
    public final BorderStroke m106084copyD5KLDUw(float f, @NotNull Brush brush) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        return new BorderStroke(f, brush, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        if (C1059Dp.m109739equalsimpl0(this.width, borderStroke.width) && Intrinsics.m17075f(this.brush, borderStroke.brush)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m106085getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (C1059Dp.m109740hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    @NotNull
    public String toString() {
        return "BorderStroke(width=" + ((Object) C1059Dp.m109745toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f, Brush brush) {
        this.width = f;
        this.brush = brush;
    }
}
