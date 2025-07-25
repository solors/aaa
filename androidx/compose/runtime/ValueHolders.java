package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: androidx.compose.runtime.LazyValueHolder */
/* loaded from: classes.dex */
public final class ValueHolders<T> implements State<T> {
    @NotNull
    private final InterfaceC38501j current$delegate;

    public ValueHolders(@NotNull Functions<? extends T> valueProducer) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(valueProducer, "valueProducer");
        m14554a = LazyJVM.m14554a(valueProducer);
        this.current$delegate = m14554a;
    }

    private final T getCurrent() {
        return (T) this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return getCurrent();
    }
}
