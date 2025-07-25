package androidx.compose.p015ui.geometry;

import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Offset.kt */
@Metadata
/* renamed from: androidx.compose.ui.geometry.OffsetKt */
/* loaded from: classes.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f, float f2) {
        return Offset.m107283constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M  reason: not valid java name */
    public static final boolean m107308isFinitek4lQ0M(long j) {
        boolean z;
        boolean z2;
        float m107291getXimpl = Offset.m107291getXimpl(j);
        if (!Float.isInfinite(m107291getXimpl) && !Float.isNaN(m107291getXimpl)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float m107292getYimpl = Offset.m107292getYimpl(j);
            if (!Float.isInfinite(m107292getYimpl) && !Float.isNaN(m107292getYimpl)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSpecified-k-4lQ0M  reason: not valid java name */
    public static final boolean m107310isSpecifiedk4lQ0M(long j) {
        if (j != Offset.Companion.m107306getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-k-4lQ0M  reason: not valid java name */
    public static final boolean m107312isUnspecifiedk4lQ0M(long j) {
        if (j == Offset.Companion.m107306getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-Wko1d7g  reason: not valid java name */
    public static final long m107314lerpWko1d7g(long j, long j2, float f) {
        return Offset(MathHelpers.lerp(Offset.m107291getXimpl(j), Offset.m107291getXimpl(j2), f), MathHelpers.lerp(Offset.m107292getYimpl(j), Offset.m107292getYimpl(j2), f));
    }

    /* renamed from: takeOrElse-3MmeM6k  reason: not valid java name */
    public static final long m107315takeOrElse3MmeM6k(long j, @NotNull Functions<Offset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!m107310isSpecifiedk4lQ0M(j)) {
            return block.invoke().m107301unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m107309isFinitek4lQ0M$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m107311isSpecifiedk4lQ0M$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations  reason: not valid java name */
    public static /* synthetic */ void m107313isUnspecifiedk4lQ0M$annotations(long j) {
    }
}
