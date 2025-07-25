package p1059ya;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: ya.d */
/* loaded from: classes8.dex */
public final class DoubleCheckProvider<T> implements Provider<T> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38501j f118543a;

    public DoubleCheckProvider(@NotNull Functions<? extends T> init) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(init, "init");
        m14554a = LazyJVM.m14554a(init);
        this.f118543a = m14554a;
    }

    /* renamed from: a */
    private final T m1007a() {
        return (T) this.f118543a.getValue();
    }

    @Override // md.Provider
    public T get() {
        return m1007a();
    }
}
