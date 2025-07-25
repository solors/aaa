package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Animation.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class DecayAnimation<T, V extends AnimationVectors> implements Animation<T, V> {
    public static final int $stable = 0;
    @NotNull
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;
    @NotNull
    private final V endVelocity;
    private final T initialValue;
    @NotNull
    private final V initialValueVector;
    @NotNull
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;
    @NotNull
    private final VectorConverters<T, V> typeConverter;

    public DecayAnimation(@NotNull VectorizedDecayAnimationSpec<V> animationSpec, @NotNull VectorConverters<T, V> typeConverter, T t, @NotNull V initialVelocityVector) {
        float m16909m;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t;
        V invoke = getTypeConverter().getConvertToVector().invoke(t);
        this.initialValueVector = invoke;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(initialVelocityVector);
        this.targetValue = getTypeConverter().getConvertFromVector().invoke(animationSpec.getTargetValue(invoke, initialVelocityVector));
        this.durationNanos = animationSpec.getDurationNanos(invoke, initialVelocityVector);
        V v = (V) AnimationVectorsKt.copy(animationSpec.getVelocityFromNanos(getDurationNanos(), invoke, initialVelocityVector));
        this.endVelocity = v;
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v2 = this.endVelocity;
            m16909m = _Ranges.m16909m(v2.get$animation_core_release(i), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold());
            v2.set$animation_core_release(i, m16909m);
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    @NotNull
    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public VectorConverters<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public V getVelocityVectorFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.isInfinite;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(@NotNull DecayAnimationSpec<T> animationSpec, @NotNull VectorConverters<T, V> typeConverter, T t, @NotNull V initialVelocityVector) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t, initialVelocityVector);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(@NotNull DecayAnimationSpec<T> animationSpec, @NotNull VectorConverters<T, V> typeConverter, T t, T t2) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t, typeConverter.getConvertToVector().invoke(t2));
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
