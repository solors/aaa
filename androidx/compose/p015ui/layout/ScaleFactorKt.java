package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScaleFactor.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.ScaleFactorKt */
/* loaded from: classes.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m109075constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w  reason: not valid java name */
    public static final long m109089divUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m107360getWidthimpl(j) / ScaleFactor.m109081getScaleXimpl(j2), Size.m107357getHeightimpl(j) / ScaleFactor.m109082getScaleYimpl(j2));
    }

    /* renamed from: isSpecified-FK8aYYs  reason: not valid java name */
    public static final boolean m109090isSpecifiedFK8aYYs(long j) {
        if (j != ScaleFactor.Companion.m109088getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-FK8aYYs  reason: not valid java name */
    public static final boolean m109092isUnspecifiedFK8aYYs(long j) {
        if (j == ScaleFactor.Companion.m109088getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp--bDIf60  reason: not valid java name */
    public static final long m109094lerpbDIf60(long j, long j2, float f) {
        return ScaleFactor(MathHelpers.lerp(ScaleFactor.m109081getScaleXimpl(j), ScaleFactor.m109081getScaleXimpl(j2), f), MathHelpers.lerp(ScaleFactor.m109082getScaleYimpl(j), ScaleFactor.m109082getScaleYimpl(j2), f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    /* renamed from: takeOrElse-oyDd2qo  reason: not valid java name */
    public static final long m109095takeOrElseoyDd2qo(long j, @NotNull Functions<ScaleFactor> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (j != ScaleFactor.Companion.m109088getUnspecified_hLwfpc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return block.invoke().m109086unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: times-UQTWf7w  reason: not valid java name */
    public static final long m109096timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m107360getWidthimpl(j) * ScaleFactor.m109081getScaleXimpl(j2), Size.m107357getHeightimpl(j) * ScaleFactor.m109082getScaleYimpl(j2));
    }

    @Stable
    /* renamed from: times-m-w2e94  reason: not valid java name */
    public static final long m109097timesmw2e94(long j, long j2) {
        return m109096timesUQTWf7w(j2, j);
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m109091isSpecifiedFK8aYYs$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m109093isUnspecifiedFK8aYYs$annotations(long j) {
    }
}
