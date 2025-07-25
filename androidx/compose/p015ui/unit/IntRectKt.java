package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntRect.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.IntRectKt */
/* loaded from: classes.dex */
public final class IntRectKt {
    @Stable
    @NotNull
    /* renamed from: IntRect-E1MhUcY  reason: not valid java name */
    public static final IntRect m109883IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(j), IntOffset.m109852getXimpl(j2), IntOffset.m109853getYimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-VbeCjmY  reason: not valid java name */
    public static final IntRect m109884IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(j), IntOffset.m109852getXimpl(j) + IntSize.m109894getWidthimpl(j2), IntOffset.m109853getYimpl(j) + IntSize.m109893getHeightimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-ar5cAso  reason: not valid java name */
    public static final IntRect m109885IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m109852getXimpl(j) - i, IntOffset.m109853getYimpl(j) - i, IntOffset.m109852getXimpl(j) + i, IntOffset.m109853getYimpl(j) + i);
    }

    @Stable
    @NotNull
    public static final IntRect lerp(@NotNull IntRect start, @NotNull IntRect stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new IntRect(MathHelpers.lerp(start.getLeft(), stop.getLeft(), f), MathHelpers.lerp(start.getTop(), stop.getTop(), f), MathHelpers.lerp(start.getRight(), stop.getRight(), f), MathHelpers.lerp(start.getBottom(), stop.getBottom(), f));
    }
}
