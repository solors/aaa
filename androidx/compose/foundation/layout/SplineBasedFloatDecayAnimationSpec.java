package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WindowInsetsConnection.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    public SplineBasedFloatDecayAnimationSpec(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f) {
        float f2;
        AndroidFlingSpline androidFlingSpline = AndroidFlingSpline.INSTANCE;
        f2 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        return androidFlingSpline.deceleration(f, f2 * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        float f2;
        double d;
        double d2;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        d = WindowInsetsConnection_androidKt.DecelerationRate;
        d2 = WindowInsetsConnection_androidKt.DecelMinusOne;
        return ((float) (f2 * this.magicPhysicalCoefficient * Math.exp((d / d2) * splineDeceleration))) * Math.signum(f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f2) {
        double d;
        double splineDeceleration = getSplineDeceleration(f2);
        d = WindowInsetsConnection_androidKt.DecelMinusOne;
        return (long) (Math.exp(splineDeceleration / d) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j, float f, float f2) {
        float f3;
        long durationNanos = getDurationNanos(0.0f, f2);
        if (durationNanos > 0) {
            f3 = ((float) j) / ((float) durationNanos);
        } else {
            f3 = 1.0f;
        }
        return f + (flingDistance(f2) * AndroidFlingSpline.FlingResult.m106259getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m106254flingPositionLfoxSSI(f3)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2) {
        float f3;
        long durationNanos = getDurationNanos(0.0f, f2);
        if (durationNanos > 0) {
            f3 = ((float) j) / ((float) durationNanos);
        } else {
            f3 = 1.0f;
        }
        return ((AndroidFlingSpline.FlingResult.m106260getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m106254flingPositionLfoxSSI(f3)) * flingDistance(f2)) / ((float) durationNanos)) * 1.0E9f;
    }
}
