package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.animation.core.TwoWayConverter */
/* loaded from: classes.dex */
public interface VectorConverters<T, V extends AnimationVectors> {
    @NotNull
    Function1<V, T> getConvertFromVector();

    @NotNull
    Function1<T, V> getConvertToVector();
}
