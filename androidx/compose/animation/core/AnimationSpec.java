package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public interface AnimationSpec<T> {
    @NotNull
    <V extends AnimationVectors> VectorizedAnimationSpec<V> vectorize(@NotNull VectorConverters<T, V> vectorConverters);
}
