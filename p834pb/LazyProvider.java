package p834pb;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: pb.b */
/* loaded from: classes8.dex */
public final class LazyProvider<T> implements Provider<T> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38501j f103182a;

    public LazyProvider(@NotNull Functions<? extends T> init) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(init, "init");
        m14554a = LazyJVM.m14554a(init);
        this.f103182a = m14554a;
    }

    /* renamed from: a */
    private final T m13202a() {
        return (T) this.f103182a.getValue();
    }

    @Override // md.Provider
    public T get() {
        return m13202a();
    }
}
