package androidx.compose.animation;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FlingCalculator.kt */
@Metadata
/* loaded from: classes.dex */
public final class FlingCalculator {
    @NotNull
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    /* compiled from: FlingCalculator.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f, float f2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = flingInfo.initialVelocity;
            }
            if ((i & 2) != 0) {
                f2 = flingInfo.distance;
            }
            if ((i & 4) != 0) {
                j = flingInfo.duration;
            }
            return flingInfo.copy(f, f2, j);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        @NotNull
        public final FlingInfo copy(float f, float f2, long j) {
            return new FlingInfo(f, f2, j);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.initialVelocity), Float.valueOf(flingInfo.initialVelocity)) && Intrinsics.m17075f(Float.valueOf(this.distance), Float.valueOf(flingInfo.distance)) && this.duration == flingInfo.duration) {
                return true;
            }
            return false;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public final float position(long j) {
            float f;
            long j2 = this.duration;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return this.distance * Math.signum(this.initialVelocity) * SplineBasedDecay.INSTANCE.flingPosition(f).getDistanceCoefficient();
        }

        @NotNull
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public final float velocity(long j) {
            float f;
            long j2 = this.duration;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return (((SplineBasedDecay.INSTANCE.flingPosition(f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / ((float) this.duration)) * 1000.0f;
        }
    }

    public FlingCalculator(float f, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.friction = f;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        float computeDeceleration;
        computeDeceleration = FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float f) {
        return SplineBasedDecay.INSTANCE.deceleration(f, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        float f2;
        float f3;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        double d = this.friction * this.magicPhysicalCoefficient;
        f3 = FlingCalculatorKt.DecelerationRate;
        return (float) (d * Math.exp((f3 / (f2 - 1.0d)) * splineDeceleration));
    }

    public final long flingDuration(float f) {
        float f2;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        return (long) (Math.exp(splineDeceleration / (f2 - 1.0d)) * 1000.0d);
    }

    @NotNull
    public final FlingInfo flingInfo(float f) {
        float f2;
        float f3;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        double d = f2 - 1.0d;
        f3 = FlingCalculatorKt.DecelerationRate;
        return new FlingInfo(f, (float) (this.friction * this.magicPhysicalCoefficient * Math.exp((f3 / d) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d) * 1000.0d));
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }
}
