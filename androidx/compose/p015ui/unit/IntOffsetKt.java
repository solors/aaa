package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import be.MathJVM;
import kotlin.Metadata;

/* compiled from: IntOffset.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.IntOffsetKt */
/* loaded from: classes.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m109846constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo  reason: not valid java name */
    public static final long m109863lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset(MathHelpers.lerp(IntOffset.m109852getXimpl(j), IntOffset.m109852getXimpl(j2), f), MathHelpers.lerp(IntOffset.m109853getYimpl(j), IntOffset.m109853getYimpl(j2), f));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc  reason: not valid java name */
    public static final long m109864minusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m107291getXimpl(j) - IntOffset.m109852getXimpl(j2), Offset.m107292getYimpl(j) - IntOffset.m109853getYimpl(j2));
    }

    @Stable
    /* renamed from: minus-oCl6YwE  reason: not valid java name */
    public static final long m109865minusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m109852getXimpl(j) - Offset.m107291getXimpl(j2), IntOffset.m109853getYimpl(j) - Offset.m107292getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc  reason: not valid java name */
    public static final long m109866plusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m107291getXimpl(j) + IntOffset.m109852getXimpl(j2), Offset.m107292getYimpl(j) + IntOffset.m109853getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-oCl6YwE  reason: not valid java name */
    public static final long m109867plusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m109852getXimpl(j) + Offset.m107291getXimpl(j2), IntOffset.m109853getYimpl(j) + Offset.m107292getYimpl(j2));
    }

    @Stable
    /* renamed from: round-k-4lQ0M  reason: not valid java name */
    public static final long m109868roundk4lQ0M(long j) {
        int m103791d;
        int m103791d2;
        m103791d = MathJVM.m103791d(Offset.m107291getXimpl(j));
        m103791d2 = MathJVM.m103791d(Offset.m107292getYimpl(j));
        return IntOffset(m103791d, m103791d2);
    }

    @Stable
    /* renamed from: toOffset--gyyYBs  reason: not valid java name */
    public static final long m109869toOffsetgyyYBs(long j) {
        return OffsetKt.Offset(IntOffset.m109852getXimpl(j), IntOffset.m109853getYimpl(j));
    }
}
