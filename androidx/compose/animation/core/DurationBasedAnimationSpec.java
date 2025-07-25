package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public interface DurationBasedAnimationSpec<T> extends FiniteAnimationSpec<T> {
    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    <V extends AnimationVectors> VectorizedDurationBasedAnimationSpec<V> vectorize(@NotNull VectorConverters<T, V> vectorConverters);
}
