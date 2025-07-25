package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntSize.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.IntSizeKt */
/* loaded from: classes.dex */
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i, int i2) {
        return IntSize.m109889constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: getCenter-ozmzZPI  reason: not valid java name */
    public static final long m109900getCenterozmzZPI(long j) {
        return IntOffsetKt.IntOffset(IntSize.m109894getWidthimpl(j) / 2, IntSize.m109893getHeightimpl(j) / 2);
    }

    @Stable
    /* renamed from: times-O0kMr_c  reason: not valid java name */
    public static final long m109902timesO0kMr_c(int i, long j) {
        return IntSize.m109896timesYEO4UFw(j, i);
    }

    @Stable
    @NotNull
    /* renamed from: toIntRect-ozmzZPI  reason: not valid java name */
    public static final IntRect m109903toIntRectozmzZPI(long j) {
        return IntRectKt.m109884IntRectVbeCjmY(IntOffset.Companion.m109862getZeronOccac(), j);
    }

    @Stable
    /* renamed from: toSize-ozmzZPI  reason: not valid java name */
    public static final long m109904toSizeozmzZPI(long j) {
        return SizeKt.Size(IntSize.m109894getWidthimpl(j), IntSize.m109893getHeightimpl(j));
    }

    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations  reason: not valid java name */
    public static /* synthetic */ void m109901getCenterozmzZPI$annotations(long j) {
    }
}
