package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DecayAnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public interface DecayAnimationSpec<T> {
    @NotNull
    <V extends AnimationVectors> VectorizedDecayAnimationSpec<V> vectorize(@NotNull VectorConverters<T, V> vectorConverters);
}
