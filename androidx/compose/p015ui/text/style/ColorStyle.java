package androidx.compose.p015ui.text.style;

import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextDrawStyle.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.ColorStyle */
/* loaded from: classes.dex */
public final class ColorStyle implements TextDrawStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: component1-0d7_KjU */
    private final long m109606component10d7_KjU() {
        return this.value;
    }

    /* renamed from: copy-8_81llA$default */
    public static /* synthetic */ ColorStyle m109607copy8_81llA$default(ColorStyle colorStyle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = colorStyle.value;
        }
        return colorStyle.m109608copy8_81llA(j);
    }

    @NotNull
    /* renamed from: copy-8_81llA */
    public final ColorStyle m109608copy8_81llA(long j) {
        return new ColorStyle(j, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ColorStyle) && Color.m107528equalsimpl0(this.value, ((ColorStyle) obj).value)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p015ui.text.style.TextDrawStyle
    @Nullable
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.p015ui.text.style.TextDrawStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo109605getColor0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m107534hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m107535toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j) {
        this.value = j;
        if (!(j != Color.Companion.m107563getUnspecified0d7_KjU())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }
}
