package androidx.compose.p015ui.geometry;

import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Rect.kt */
@Metadata
/* renamed from: androidx.compose.ui.geometry.RectKt */
/* loaded from: classes.dex */
public final class RectKt {
    @Stable
    @NotNull
    /* renamed from: Rect-0a9Yr6o  reason: not valid java name */
    public static final Rect m107329Rect0a9Yr6o(long j, long j2) {
        return new Rect(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), Offset.m107291getXimpl(j2), Offset.m107292getYimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: Rect-3MmeM6k  reason: not valid java name */
    public static final Rect m107330Rect3MmeM6k(long j, float f) {
        return new Rect(Offset.m107291getXimpl(j) - f, Offset.m107292getYimpl(j) - f, Offset.m107291getXimpl(j) + f, Offset.m107292getYimpl(j) + f);
    }

    @Stable
    @NotNull
    /* renamed from: Rect-tz77jQw  reason: not valid java name */
    public static final Rect m107331Recttz77jQw(long j, long j2) {
        return new Rect(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), Offset.m107291getXimpl(j) + Size.m107360getWidthimpl(j2), Offset.m107292getYimpl(j) + Size.m107357getHeightimpl(j2));
    }

    @Stable
    @NotNull
    public static final Rect lerp(@NotNull Rect start, @NotNull Rect stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Rect(MathHelpers.lerp(start.getLeft(), stop.getLeft(), f), MathHelpers.lerp(start.getTop(), stop.getTop(), f), MathHelpers.lerp(start.getRight(), stop.getRight(), f), MathHelpers.lerp(start.getBottom(), stop.getBottom(), f));
    }
}
