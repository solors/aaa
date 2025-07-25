package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextSelectionColors.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class TextSelectionColors {
    private final long backgroundColor;
    private final long handleColor;

    public /* synthetic */ TextSelectionColors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        if (Color.m107528equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m107528equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBackgroundColor-0d7_KjU  reason: not valid java name */
    public final long m106774getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU  reason: not valid java name */
    public final long m106775getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return (Color.m107534hashCodeimpl(this.handleColor) * 31) + Color.m107534hashCodeimpl(this.backgroundColor);
    }

    @NotNull
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m107535toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m107535toStringimpl(this.backgroundColor)) + ')';
    }

    private TextSelectionColors(long j, long j2) {
        this.handleColor = j;
        this.backgroundColor = j2;
    }
}
