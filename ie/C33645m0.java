package ie;

import kotlin.Metadata;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC37825z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContext.kt */
@Metadata
/* renamed from: ie.m0 */
/* loaded from: classes8.dex */
public final class C33645m0<T> implements InterfaceC37825z2<T> {

    /* renamed from: b */
    private final T f92114b;
    @NotNull

    /* renamed from: c */
    private final ThreadLocal<T> f92115c;
    @NotNull

    /* renamed from: d */
    private final CoroutineContext.InterfaceC37576b<?> f92116d;

    public C33645m0(T t, @NotNull ThreadLocal<T> threadLocal) {
        this.f92114b = t;
        this.f92115c = threadLocal;
        this.f92116d = new C33646n0(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC37825z2.C37826a.m16058a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        if (Intrinsics.m17075f(getKey(), interfaceC37576b)) {
            Intrinsics.m17073h(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.InterfaceC37576b<?> getKey() {
        return this.f92116d;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        if (Intrinsics.m17075f(getKey(), interfaceC37576b)) {
            return C37586g.f99289b;
        }
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return InterfaceC37825z2.C37826a.m16057b(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC37825z2
    public void restoreThreadContext(@NotNull CoroutineContext coroutineContext, T t) {
        this.f92115c.set(t);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.f92114b + ", threadLocal = " + this.f92115c + ')';
    }

    @Override // kotlinx.coroutines.InterfaceC37825z2
    public T updateThreadContext(@NotNull CoroutineContext coroutineContext) {
        T t = this.f92115c.get();
        this.f92115c.set(this.f92114b);
        return t;
    }
}
