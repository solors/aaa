package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FloatAnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* compiled from: FloatAnimationSpec.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(@NotNull FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
            return FloatAnimationSpec.super.getEndVelocity(f, f2, f3);
        }

        @Deprecated
        @NotNull
        public static <V extends AnimationVectors> VectorizedFloatAnimationSpec<V> vectorize(@NotNull FloatAnimationSpec floatAnimationSpec, @NotNull VectorConverters<Float, V> converter) {
            Intrinsics.checkNotNullParameter(converter, "converter");
            return FloatAnimationSpec.super.vectorize((VectorConverters) converter);
        }
    }

    long getDurationNanos(float f, float f2, float f3);

    default float getEndVelocity(float f, float f2, float f3) {
        return getVelocityFromNanos(getDurationNanos(f, f2, f3), f, f2, f3);
    }

    float getValueFromNanos(long j, float f, float f2, float f3);

    float getVelocityFromNanos(long j, float f, float f2, float f3);

    @Override // androidx.compose.animation.core.AnimationSpec
    @NotNull
    default <V extends AnimationVectors> VectorizedFloatAnimationSpec<V> vectorize(@NotNull VectorConverters<Float, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedFloatAnimationSpec<>(this);
    }
}
