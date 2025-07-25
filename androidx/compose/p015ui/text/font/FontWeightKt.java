package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.util.MathHelpers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontWeight.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontWeightKt */
/* loaded from: classes.dex */
public final class FontWeightKt {
    @NotNull
    public static final FontWeight lerp(@NotNull FontWeight start, @NotNull FontWeight stop, float f) {
        int m16908n;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        m16908n = _Ranges.m16908n(MathHelpers.lerp(start.getWeight(), stop.getWeight(), f), 1, 1000);
        return new FontWeight(m16908n);
    }
}
