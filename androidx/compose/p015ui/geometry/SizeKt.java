package androidx.compose.p015ui.geometry;

import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata
/* renamed from: androidx.compose.ui.geometry.SizeKt */
/* loaded from: classes.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f, float f2) {
        return Size.m107351constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: getCenter-uvyYCjk */
    public static final long m107370getCenteruvyYCjk(long j) {
        return OffsetKt.Offset(Size.m107360getWidthimpl(j) / 2.0f, Size.m107357getHeightimpl(j) / 2.0f);
    }

    /* renamed from: isSpecified-uvyYCjk */
    public static final boolean m107372isSpecifieduvyYCjk(long j) {
        if (j != Size.Companion.m107368getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-uvyYCjk */
    public static final boolean m107374isUnspecifieduvyYCjk(long j) {
        if (j == Size.Companion.m107368getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ */
    public static final long m107376lerpVgWVRYQ(long j, long j2, float f) {
        return Size(MathHelpers.lerp(Size.m107360getWidthimpl(j), Size.m107360getWidthimpl(j2), f), MathHelpers.lerp(Size.m107357getHeightimpl(j), Size.m107357getHeightimpl(j2), f));
    }

    /* renamed from: takeOrElse-TmRCtEA */
    public static final long m107377takeOrElseTmRCtEA(long j, @NotNull Functions<Size> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (j != Size.Companion.m107368getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return block.invoke().m107365unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: times-d16Qtg0 */
    public static final long m107380timesd16Qtg0(int i, long j) {
        return Size.m107363times7Ah8Wj8(j, i);
    }

    @Stable
    @NotNull
    /* renamed from: toRect-uvyYCjk */
    public static final Rect m107381toRectuvyYCjk(long j) {
        return RectKt.m107331Recttz77jQw(Offset.Companion.m107307getZeroF1C5BW0(), j);
    }

    @Stable
    /* renamed from: times-d16Qtg0 */
    public static final long m107378timesd16Qtg0(double d, long j) {
        return Size.m107363times7Ah8Wj8(j, (float) d);
    }

    @Stable
    /* renamed from: times-d16Qtg0 */
    public static final long m107379timesd16Qtg0(float f, long j) {
        return Size.m107363times7Ah8Wj8(j, f);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations */
    public static /* synthetic */ void m107371getCenteruvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations */
    public static /* synthetic */ void m107373isSpecifieduvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations */
    public static /* synthetic */ void m107375isUnspecifieduvyYCjk$annotations(long j) {
    }
}
