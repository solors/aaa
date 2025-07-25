package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@StabilityInferred(parameters = 1)
@Metadata
/* loaded from: classes.dex */
public final class ProvidedValue<T> {
    public static final int $stable = 0;
    private final boolean canOverride;
    @NotNull
    private final CompositionLocal<T> compositionLocal;
    private final T value;

    public ProvidedValue(@NotNull CompositionLocal<T> compositionLocal, T t, boolean z) {
        Intrinsics.checkNotNullParameter(compositionLocal, "compositionLocal");
        this.compositionLocal = compositionLocal;
        this.value = t;
        this.canOverride = z;
    }

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    @NotNull
    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final T getValue() {
        return this.value;
    }
}
