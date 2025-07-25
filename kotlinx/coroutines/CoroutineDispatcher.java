package kotlinx.coroutines;

import ie.C33648p;
import ie.DispatchedContinuation;
import ie.LimitedDispatcher;
import kotlin.Metadata;
import kotlin.coroutines.AbstractC37577b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.k0 */
/* loaded from: classes7.dex */
public abstract class CoroutineDispatcher extends CoroutineContextImpl implements ContinuationInterceptor {
    @NotNull
    public static final C37757a Key = new C37757a(null);

    /* compiled from: CoroutineDispatcher.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.k0$a */
    /* loaded from: classes7.dex */
    public static final class C37757a extends AbstractC37577b<ContinuationInterceptor, CoroutineDispatcher> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata
        /* renamed from: kotlinx.coroutines.k0$a$a */
        /* loaded from: classes7.dex */
        static final class C37758a extends Lambda implements Function1<CoroutineContext.Element, CoroutineDispatcher> {

            /* renamed from: g */
            public static final C37758a f99593g = new C37758a();

            C37758a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: a */
            public final CoroutineDispatcher invoke(@NotNull CoroutineContext.Element element) {
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            }
        }

        public /* synthetic */ C37757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C37757a() {
            super(ContinuationInterceptor.f99287Z7, C37758a.f99593g);
        }
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.f99287Z7);
    }

    public abstract void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable);

    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        dispatch(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.CoroutineContextImpl, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) ContinuationInterceptor.C37583a.m17105a(this, interfaceC37576b);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    @NotNull
    public final <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        return true;
    }

    @NotNull
    public CoroutineDispatcher limitedParallelism(int i) {
        C33648p.m22931a(i);
        return new LimitedDispatcher(this, i);
    }

    @Override // kotlin.coroutines.CoroutineContextImpl, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return ContinuationInterceptor.C37583a.m17104b(this, interfaceC37576b);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(@NotNull Continuation<?> continuation) {
        Intrinsics.m17073h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((DispatchedContinuation) continuation).m22966q();
    }

    @NotNull
    public String toString() {
        return DebugStrings.m16104a(this) + '@' + DebugStrings.m16103b(this);
    }

    @NotNull
    public final CoroutineDispatcher plus(@NotNull CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }
}
