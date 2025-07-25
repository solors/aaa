package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DecayAnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVectors> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    @NotNull
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(@NotNull FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecaySpec;
        this.absVelocityThreshold = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.m17056y("velocityVector");
            v = null;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        long j = 0;
        for (int i = 0; i < size$animation_core_release; i++) {
            j = Math.max(j, this.floatDecaySpec.getDurationNanos(initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        return j;
    }

    @NotNull
    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public V getTargetValue(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v = this.targetVector;
        if (v == null) {
            Intrinsics.m17056y("targetVector");
            v = null;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v2 = this.targetVector;
            if (v2 == null) {
                Intrinsics.m17056y("targetVector");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.floatDecaySpec.getTargetValue(initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        V v3 = this.targetVector;
        if (v3 == null) {
            Intrinsics.m17056y("targetVector");
            return null;
        }
        return v3;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public V getValueFromNanos(long j, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v = this.valueVector;
        if (v == null) {
            Intrinsics.m17056y("valueVector");
            v = null;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v2 = this.valueVector;
            if (v2 == null) {
                Intrinsics.m17056y("valueVector");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.floatDecaySpec.getValueFromNanos(j, initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        V v3 = this.valueVector;
        if (v3 == null) {
            Intrinsics.m17056y("valueVector");
            return null;
        }
        return v3;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long j, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.m17056y("velocityVector");
            v = null;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v2 = this.velocityVector;
            if (v2 == null) {
                Intrinsics.m17056y("velocityVector");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.floatDecaySpec.getVelocityFromNanos(j, initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        V v3 = this.velocityVector;
        if (v3 == null) {
            Intrinsics.m17056y("velocityVector");
            return null;
        }
        return v3;
    }
}
