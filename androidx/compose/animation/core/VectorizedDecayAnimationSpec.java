package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorizedDecayAnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVectors> {
    float getAbsVelocityThreshold();

    long getDurationNanos(@NotNull V v, @NotNull V v2);

    @NotNull
    V getTargetValue(@NotNull V v, @NotNull V v2);

    @NotNull
    V getValueFromNanos(long j, @NotNull V v, @NotNull V v2);

    @NotNull
    V getVelocityFromNanos(long j, @NotNull V v, @NotNull V v2);
}
