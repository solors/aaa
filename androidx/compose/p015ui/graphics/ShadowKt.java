package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Shadow.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.ShadowKt */
/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    @NotNull
    public static final Shadow lerp(@NotNull Shadow start, @NotNull Shadow stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Shadow(ColorKt.m107579lerpjxsXWHM(start.m107811getColor0d7_KjU(), stop.m107811getColor0d7_KjU(), f), OffsetKt.m107314lerpWko1d7g(start.m107812getOffsetF1C5BW0(), stop.m107812getOffsetF1C5BW0(), f), MathHelpers.lerp(start.getBlurRadius(), stop.getBlurRadius(), f), null);
    }
}
