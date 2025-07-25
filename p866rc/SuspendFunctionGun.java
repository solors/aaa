package p866rc;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

@Metadata
/* renamed from: rc.n */
/* loaded from: classes9.dex */
public final class SuspendFunctionGun<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    @NotNull

    /* renamed from: c */
    private final List<InterfaceC45268n<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> f103789c;
    @NotNull

    /* renamed from: d */
    private final Continuation<Unit> f103790d;
    @NotNull

    /* renamed from: f */
    private TSubject f103791f;
    @NotNull

    /* renamed from: g */
    private final Continuation<TSubject>[] f103792g;

    /* renamed from: h */
    private int f103793h;

    /* renamed from: i */
    private int f103794i;

    /* compiled from: SuspendFunctionGun.kt */
    @Metadata
    /* renamed from: rc.n$a */
    /* loaded from: classes9.dex */
    public static final class C39475a implements Continuation<Unit>, CoroutineStackFrame {

        /* renamed from: b */
        private int f103795b = Integer.MIN_VALUE;

        /* renamed from: c */
        final /* synthetic */ SuspendFunctionGun<TSubject, TContext> f103796c;

        C39475a(SuspendFunctionGun<TSubject, TContext> suspendFunctionGun) {
            this.f103796c = suspendFunctionGun;
        }

        /* renamed from: a */
        private final Continuation<?> m12524a() {
            if (this.f103795b == Integer.MIN_VALUE) {
                this.f103795b = ((SuspendFunctionGun) this.f103796c).f103793h;
            }
            if (this.f103795b >= 0) {
                try {
                    Continuation<?>[] continuationArr = ((SuspendFunctionGun) this.f103796c).f103792g;
                    int i = this.f103795b;
                    Continuation<?> continuation = continuationArr[i];
                    if (continuation == null) {
                        return StackWalkingFailedFrame.f103788b;
                    }
                    this.f103795b = i - 1;
                    return continuation;
                } catch (Throwable unused) {
                    return StackWalkingFailedFrame.f103788b;
                }
            }
            this.f103795b = Integer.MIN_VALUE;
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            Continuation<?> m12524a = m12524a();
            if (m12524a instanceof CoroutineStackFrame) {
                return (CoroutineStackFrame) m12524a;
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            Continuation continuation = ((SuspendFunctionGun) this.f103796c).f103792g[((SuspendFunctionGun) this.f103796c).f103793h];
            if (continuation != this && continuation != null) {
                return continuation.getContext();
            }
            int i = ((SuspendFunctionGun) this.f103796c).f103793h - 1;
            while (i >= 0) {
                int i2 = i - 1;
                Continuation continuation2 = ((SuspendFunctionGun) this.f103796c).f103792g[i];
                if (continuation2 != this && continuation2 != null) {
                    return continuation2.getContext();
                }
                i = i2;
            }
            throw new IllegalStateException("Not started".toString());
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            if (!Result.m14544g(obj)) {
                this.f103796c.m12527n(false);
                return;
            }
            SuspendFunctionGun<TSubject, TContext> suspendFunctionGun = this.f103796c;
            Throwable m14546e = Result.m14546e(obj);
            Intrinsics.m17074g(m14546e);
            suspendFunctionGun.m12526o(Result.m14549b(C38508r.m14540a(m14546e)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendFunctionGun(@NotNull TSubject initial, @NotNull TContext context, @NotNull List<? extends InterfaceC45268n<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> blocks) {
        super(context);
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f103789c = blocks;
        this.f103790d = new C39475a(this);
        this.f103791f = initial;
        this.f103792g = new Continuation[blocks.size()];
        this.f103793h = -1;
    }

    /* renamed from: l */
    private final void m12529l() {
        int i = this.f103793h;
        if (i >= 0) {
            Continuation<TSubject>[] continuationArr = this.f103792g;
            this.f103793h = i - 1;
            continuationArr[i] = null;
            return;
        }
        throw new IllegalStateException("No more continuations to resume");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m12527n(boolean z) {
        Object invoke;
        Object m6959e;
        do {
            int i = this.f103794i;
            if (i == this.f103789c.size()) {
                if (!z) {
                    Result.C38506a c38506a = Result.f101870c;
                    m12526o(Result.m14549b(m12528m()));
                    return false;
                }
                return true;
            }
            this.f103794i = i + 1;
            try {
                invoke = this.f103789c.get(i).invoke(this, m12528m(), this.f103790d);
                m6959e = C42688d.m6959e();
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m12526o(Result.m14549b(C38508r.m14540a(th)));
                return false;
            }
        } while (invoke != m6959e);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m12526o(Object obj) {
        int i = this.f103793h;
        if (i >= 0) {
            Continuation<TSubject> continuation = this.f103792g[i];
            Intrinsics.m17074g(continuation);
            Continuation<TSubject>[] continuationArr = this.f103792g;
            int i2 = this.f103793h;
            this.f103793h = i2 - 1;
            continuationArr[i2] = null;
            if (!Result.m14544g(obj)) {
                continuation.resumeWith(obj);
                return;
            }
            Throwable m14546e = Result.m14546e(obj);
            Intrinsics.m17074g(m14546e);
            continuation.resumeWith(Result.m14549b(C38508r.m14540a(StackTraceRecover.m12539a(m14546e, continuation))));
            return;
        }
        throw new IllegalStateException("No more continuations to resume".toString());
    }

    @Override // p866rc.PipelineContext
    @Nullable
    /* renamed from: b */
    public Object mo12537b(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        this.f103794i = 0;
        if (this.f103789c.size() == 0) {
            return tsubject;
        }
        m12525p(tsubject);
        if (this.f103793h < 0) {
            return mo12536d(continuation);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // p866rc.PipelineContext
    @Nullable
    /* renamed from: d */
    public Object mo12536d(@NotNull Continuation<? super TSubject> continuation) {
        Continuation<? super TSubject> m6961c;
        Object m6959e;
        Object m6959e2;
        if (this.f103794i != this.f103789c.size()) {
            m6961c = IntrinsicsJvm.m6961c(continuation);
            m12530k(m6961c);
            if (!m12527n(true)) {
                m6959e = C42688d.m6959e();
            } else {
                m12529l();
                m6959e = m12528m();
            }
        } else {
            m6959e = m12528m();
        }
        m6959e2 = C42688d.m6959e();
        if (m6959e == m6959e2) {
            C37591h.m17084c(continuation);
        }
        return m6959e;
    }

    @Override // p866rc.PipelineContext
    @Nullable
    /* renamed from: e */
    public Object mo12535e(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        m12525p(tsubject);
        return mo12536d(continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f103790d.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m12530k(@NotNull Continuation<? super TSubject> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        int i = this.f103793h + 1;
        this.f103793h = i;
        this.f103792g[i] = continuation;
    }

    @NotNull
    /* renamed from: m */
    public TSubject m12528m() {
        return this.f103791f;
    }

    /* renamed from: p */
    public void m12525p(@NotNull TSubject tsubject) {
        Intrinsics.checkNotNullParameter(tsubject, "<set-?>");
        this.f103791f = tsubject;
    }
}
