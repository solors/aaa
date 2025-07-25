package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p777le.InterfaceC38169g;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata
/* renamed from: kotlinx.coroutines.w0 */
/* loaded from: classes7.dex */
public class C37811w0<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public C37811w0(@NotNull CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    /* renamed from: c1 */
    static /* synthetic */ <T> Object m16083c1(C37811w0<T> c37811w0, Continuation<? super T> continuation) {
        Object m16275T = c37811w0.m16275T(continuation);
        C42688d.m6959e();
        return m16275T;
    }

    @Override // kotlinx.coroutines.Deferred
    @NotNull
    /* renamed from: K */
    public InterfaceC38169g<T> mo16074K() {
        InterfaceC38169g<T> interfaceC38169g = (InterfaceC38169g<T>) m16253l0();
        Intrinsics.m17073h(interfaceC38169g, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return interfaceC38169g;
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
        return m16083c1(this, continuation);
    }
}
