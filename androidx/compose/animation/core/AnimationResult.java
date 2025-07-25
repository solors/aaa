package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Animatable.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AnimationResult<T, V extends AnimationVectors> {
    public static final int $stable = 0;
    @NotNull
    private final AnimationEndReason endReason;
    @NotNull
    private final AnimationState<T, V> endState;

    public AnimationResult(@NotNull AnimationState<T, V> endState, @NotNull AnimationEndReason endReason) {
        Intrinsics.checkNotNullParameter(endState, "endState");
        Intrinsics.checkNotNullParameter(endReason, "endReason");
        this.endState = endState;
        this.endReason = endReason;
    }

    @NotNull
    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    @NotNull
    public final AnimationState<T, V> getEndState() {
        return this.endState;
    }

    @NotNull
    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
