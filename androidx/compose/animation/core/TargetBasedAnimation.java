package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Animation.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class TargetBasedAnimation<T, V extends AnimationVectors> implements Animation<T, V> {
    public static final int $stable = 0;
    @NotNull
    private final VectorizedAnimationSpec<V> animationSpec;
    private final long durationNanos;
    @NotNull
    private final V endVelocity;
    private final T initialValue;
    @NotNull
    private final V initialValueVector;
    @NotNull
    private final V initialVelocityVector;
    private final T targetValue;
    @NotNull
    private final V targetValueVector;
    @NotNull
    private final VectorConverters<T, V> typeConverter;

    public TargetBasedAnimation(@NotNull VectorizedAnimationSpec<V> animationSpec, @NotNull VectorConverters<T, V> typeConverter, T t, T t2, @Nullable V v) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t;
        this.targetValue = t2;
        V invoke = getTypeConverter().getConvertToVector().invoke(t);
        this.initialValueVector = invoke;
        V invoke2 = getTypeConverter().getConvertToVector().invoke(getTargetValue());
        this.targetValueVector = invoke2;
        V v2 = (v == null || (v2 = (V) AnimationVectorsKt.copy(v)) == null) ? (V) AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(t)) : v2;
        this.initialVelocityVector = v2;
        this.durationNanos = animationSpec.getDurationNanos(invoke, invoke2, v2);
        this.endVelocity = animationSpec.getEndVelocity(invoke, invoke2, v2);
    }

    @NotNull
    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
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
            return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public V getVelocityVectorFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    @NotNull
    public String toString() {
        return "TargetBasedAnimation: " + this.initialValue + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms";
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, VectorConverters vectorConverters, Object obj, Object obj2, AnimationVectors animationVectors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedAnimationSpec, vectorConverters, obj, obj2, (i & 16) != 0 ? null : animationVectors);
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, VectorConverters vectorConverters, Object obj, Object obj2, AnimationVectors animationVectors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationSpec, vectorConverters, obj, obj2, (i & 16) != 0 ? null : animationVectors);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetBasedAnimation(@NotNull AnimationSpec<T> animationSpec, @NotNull VectorConverters<T, V> typeConverter, T t, T t2, @Nullable V v) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t, t2, v);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
