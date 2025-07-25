package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVectors> implements VectorConverters<T, V> {
    @NotNull
    private final Function1<V, T> convertFromVector;
    @NotNull
    private final Function1<T, V> convertToVector;

    /* JADX WARN: Multi-variable type inference failed */
    public TwoWayConverterImpl(@NotNull Function1<? super T, ? extends V> convertToVector, @NotNull Function1<? super V, ? extends T> convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        this.convertToVector = convertToVector;
        this.convertFromVector = convertFromVector;
    }

    @Override // androidx.compose.animation.core.VectorConverters
    @NotNull
    public Function1<V, T> getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.VectorConverters
    @NotNull
    public Function1<T, V> getConvertToVector() {
        return this.convertToVector;
    }
}
