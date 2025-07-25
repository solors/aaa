package androidx.compose.material.ripple;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RippleAnimation.kt */
@Metadata
/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = C1059Dp.m109734constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA  reason: not valid java name */
    public static final float m107155getRippleEndRadiuscSwnlzA(@NotNull Density getRippleEndRadius, boolean z, long j) {
        Intrinsics.checkNotNullParameter(getRippleEndRadius, "$this$getRippleEndRadius");
        float m107289getDistanceimpl = Offset.m107289getDistanceimpl(OffsetKt.Offset(Size.m107360getWidthimpl(j), Size.m107357getHeightimpl(j))) / 2.0f;
        if (z) {
            return m107289getDistanceimpl + getRippleEndRadius.mo106214toPx0680j_4(BoundedRippleExtraRadius);
        }
        return m107289getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk  reason: not valid java name */
    public static final float m107156getRippleStartRadiusuvyYCjk(long j) {
        return Math.max(Size.m107360getWidthimpl(j), Size.m107357getHeightimpl(j)) * 0.3f;
    }
}
