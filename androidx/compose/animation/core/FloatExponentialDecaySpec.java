package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FloatDecayAnimationSpec.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    public FloatExponentialDecaySpec() {
        this(0.0f, 0.0f, 3, null);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f2) {
        return ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f2))) * 1000.0f) / this.friction) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        if (Math.abs(f2) <= getAbsVelocityThreshold()) {
            return f;
        }
        double log = Math.log(Math.abs(getAbsVelocityThreshold() / f2));
        float f3 = this.friction;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j, float f, float f2) {
        float f3 = this.friction;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((f3 * ((float) (j / 1000000))) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2) {
        return f2 * ((float) Math.exp((((float) (j / 1000000)) / 1000.0f) * this.friction));
    }

    public FloatExponentialDecaySpec(float f, float f2) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f2));
        this.friction = Math.max(1.0E-4f, f) * (-4.2f);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.1f : f2);
    }
}
