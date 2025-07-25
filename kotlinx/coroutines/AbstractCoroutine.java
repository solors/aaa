package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes7.dex */
public abstract class AbstractCoroutine<T> extends C37745j2 implements Continuation<T>, CoroutineScope {
    @NotNull

    /* renamed from: d */
    private final CoroutineContext f99503d;

    public AbstractCoroutine(@NotNull CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m16248s0((InterfaceC37708b2) coroutineContext.get(InterfaceC37708b2.f99515b8));
        }
        this.f99503d = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.C37745j2
    @NotNull
    /* renamed from: A0 */
    public String mo16301A0() {
        String m16310b = C37740j0.m16310b(this.f99503d);
        if (m16310b == null) {
            return super.mo16301A0();
        }
        return '\"' + m16310b + "\":" + super.mo16301A0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.C37745j2
    /* renamed from: H0 */
    protected final void mo16292H0(@Nullable Object obj) {
        if (obj instanceof CompletionState) {
            CompletionState completionState = (CompletionState) obj;
            mo16424Z0(completionState.f99520a, completionState.m16399a());
            return;
        }
        mo16423a1(obj);
    }

    /* renamed from: Y0 */
    protected void mo16326Y0(@Nullable Object obj) {
        mo16277S(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.C37745j2
    @NotNull
    /* renamed from: a0 */
    public String mo16263a0() {
        return DebugStrings.m16104a(this) + " was cancelled";
    }

    /* renamed from: b1 */
    public final <R> void m16422b1(@NotNull CoroutineStart coroutineStart, R r, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        coroutineStart.m16113c(function2, r, this);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public final CoroutineContext getContext() {
        return this.f99503d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f99503d;
    }

    @Override // kotlinx.coroutines.C37745j2, kotlinx.coroutines.InterfaceC37708b2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.C37745j2
    /* renamed from: r0 */
    public final void mo16249r0(@NotNull Throwable th) {
        C37774m0.m16176a(this.f99503d, th);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Object m16242y0 = m16242y0(C37730g0.m16344d(obj, null, 1, null));
        if (m16242y0 == C37760k2.f99598b) {
            return;
        }
        mo16326Y0(m16242y0);
    }

    /* renamed from: a1 */
    protected void mo16423a1(T t) {
    }

    /* renamed from: Z0 */
    protected void mo16424Z0(@NotNull Throwable th, boolean z) {
    }
}
