package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p777le.InterfaceC38169g;
import sd.C42688d;

/* compiled from: CompletableDeferred.kt */
@Metadata
/* renamed from: kotlinx.coroutines.y */
/* loaded from: classes7.dex */
final class C37818y<T> extends C37745j2 implements CompletableDeferred<T> {
    public C37818y(@Nullable InterfaceC37708b2 interfaceC37708b2) {
        super(true);
        m16248s0(interfaceC37708b2);
    }

    @Override // kotlinx.coroutines.Deferred
    @NotNull
    /* renamed from: K */
    public InterfaceC38169g<T> mo16074K() {
        InterfaceC38169g<T> interfaceC38169g = (InterfaceC38169g<T>) m16253l0();
        Intrinsics.m17073h(interfaceC38169g, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return interfaceC38169g;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    /* renamed from: b */
    public boolean mo16073b(@NotNull Throwable th) {
        return m16243x0(new CompletionState(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: e */
    public T mo16072e() {
        return (T) m16257h0();
    }

    @Override // kotlinx.coroutines.Deferred
    @Nullable
    /* renamed from: h */
    public Object mo16071h(@NotNull Continuation<? super T> continuation) {
        Object m16275T = m16275T(continuation);
        C42688d.m6959e();
        return m16275T;
    }

    @Override // kotlinx.coroutines.C37745j2
    /* renamed from: m0 */
    public boolean mo16070m0() {
        return true;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    /* renamed from: n */
    public boolean mo16069n(T t) {
        return m16243x0(t);
    }
}
