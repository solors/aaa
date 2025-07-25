package androidx.compose.foundation;

import androidx.compose.foundation.layout.Padding;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.ColorKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OverscrollConfiguration.kt */
@Stable
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    @NotNull
    private final PaddingValues drawPadding;
    private final long glowColor;

    public /* synthetic */ OverscrollConfiguration(long j, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, paddingValues);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(OverscrollConfiguration.class, cls)) {
            return false;
        }
        if (obj != null) {
            OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
            if (Color.m107528equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && Intrinsics.m17075f(this.drawPadding, overscrollConfiguration.drawPadding)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
    }

    @NotNull
    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: getGlowColor-0d7_KjU  reason: not valid java name */
    public final long m106141getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public int hashCode() {
        return (Color.m107534hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    @NotNull
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m107535toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    private OverscrollConfiguration(long j, PaddingValues paddingValues) {
        this.glowColor = j;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j, PaddingValues paddingValues, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorKt.Color(4284900966L) : j, (i & 2) != 0 ? Padding.m106314PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }
}
