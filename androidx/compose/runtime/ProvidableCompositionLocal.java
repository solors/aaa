package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositionLocal.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvidableCompositionLocal(@NotNull Functions<? extends T> defaultFactory) {
        super(defaultFactory, null);
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
    }

    @NotNull
    public final ProvidedValue<T> provides(T t) {
        return new ProvidedValue<>(this, t, true);
    }

    @NotNull
    public final ProvidedValue<T> providesDefault(T t) {
        return new ProvidedValue<>(this, t, false);
    }
}
