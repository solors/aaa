package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public interface FiniteAnimationSpec<T> extends AnimationSpec<T> {
    @Override // androidx.compose.animation.core.AnimationSpec
    @NotNull
    <V extends AnimationVectors> VectorizedFiniteAnimationSpec<V> vectorize(@NotNull VectorConverters<T, V> vectorConverters);
}
