package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Animation.kt */
@Metadata
/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;

    @NotNull
    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(@NotNull FloatDecayAnimationSpec animationSpec, float f, float f2) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new DecayAnimation<>(DecayAnimationSpecKt.generateDecayAnimationSpec(animationSpec), VectorConvertersKt.getVectorConverter(C37606l.f99324a), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f2));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f, f2);
    }

    @NotNull
    public static final <T, V extends AnimationVectors> TargetBasedAnimation<T, V> TargetBasedAnimation(@NotNull AnimationSpec<T> animationSpec, @NotNull VectorConverters<T, V> typeConverter, T t, T t2, T t3) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new TargetBasedAnimation<>(animationSpec, typeConverter, t, t2, typeConverter.getConvertToVector().invoke(t3));
    }

    @NotNull
    public static final <V extends AnimationVectors> TargetBasedAnimation<V, V> createAnimation(@NotNull VectorizedAnimationSpec<V> vectorizedAnimationSpec, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(vectorizedAnimationSpec, "<this>");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, VectorConvertersKt.TwoWayConverter(AnimationKt$createAnimation$1.INSTANCE, AnimationKt$createAnimation$2.INSTANCE), initialValue, targetValue, initialVelocity);
    }

    public static final long getDurationMillis(@NotNull Animation<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        return animation.getDurationNanos() / 1000000;
    }

    public static final <T, V extends AnimationVectors> T getVelocityFromNanos(@NotNull Animation<T, V> animation, long j) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        return animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j));
    }
}
