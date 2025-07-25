package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVectors> {

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static <V extends AnimationVectors> V getEndVelocity(@NotNull VectorizedAnimationSpec<V> vectorizedAnimationSpec, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(targetValue, "targetValue");
            Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
            return (V) VectorizedAnimationSpec.super.getEndVelocity(initialValue, targetValue, initialVelocity);
        }
    }

    long getDurationNanos(@NotNull V v, @NotNull V v2, @NotNull V v3);

    @NotNull
    default V getEndVelocity(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return getVelocityFromNanos(getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    @NotNull
    V getValueFromNanos(long j, @NotNull V v, @NotNull V v2, @NotNull V v3);

    @NotNull
    V getVelocityFromNanos(long j, @NotNull V v, @NotNull V v2, @NotNull V v3);

    boolean isInfinite();
}
