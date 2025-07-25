package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: BroadcastFrameClock.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    @NotNull
    private List<FrameAwaiter<?>> awaiters;
    @Nullable
    private Throwable failureCause;
    @NotNull
    private final Object lock;
    @Nullable
    private final Functions<Unit> onNewAwaiters;
    @NotNull
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BroadcastFrameClock.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class FrameAwaiter<R> {
        @NotNull
        private final Continuation<R> continuation;
        @NotNull
        private final Function1<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(@NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation<? super R> continuation) {
            Intrinsics.checkNotNullParameter(onFrame, "onFrame");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.onFrame = onFrame;
            this.continuation = continuation;
        }

        @NotNull
        public final Continuation<R> getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final Function1<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j) {
            Object m14549b;
            Continuation<R> continuation = this.continuation;
            try {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(this.onFrame.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            continuation.resumeWith(m14549b);
        }
    }

    public BroadcastFrameClock() {
        this(null, 1, null);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = th;
            List<FrameAwaiter<?>> list = this.awaiters;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Continuation<?> continuation = list.get(i).getContinuation();
                Result.C38506a c38506a = Result.f101870c;
                continuation.resumeWith(Result.m14549b(C38508r.m14540a(th)));
            }
            this.awaiters.clear();
            Unit unit = Unit.f99208a;
        }
    }

    public final void cancel(@NotNull CancellationException cancellationException) {
        Intrinsics.checkNotNullParameter(cancellationException, "cancellationException");
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, interfaceC37576b);
    }

    public final boolean getHasAwaiters() {
        boolean z;
        synchronized (this.lock) {
            z = !this.awaiters.isEmpty();
        }
        return z;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, interfaceC37576b);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final void sendFrame(long j) {
        synchronized (this.lock) {
            List<FrameAwaiter<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).resume(j);
            }
            list.clear();
            Unit unit = Unit.f99208a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$FrameAwaiter] */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        Continuation m6961c;
        boolean z;
        FrameAwaiter frameAwaiter;
        Object m6959e;
        m6961c = IntrinsicsJvm.m6961c(continuation);
        C37784p c37784p = new C37784p(m6961c, 1);
        c37784p.m16132y();
        C37609n0 c37609n0 = new C37609n0();
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                Result.C38506a c38506a = Result.f101870c;
                c37784p.resumeWith(Result.m14549b(C38508r.m14540a(th)));
            } else {
                c37609n0.f99327b = new FrameAwaiter(function1, c37784p);
                if (!this.awaiters.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                List list = this.awaiters;
                T t = c37609n0.f99327b;
                if (t == 0) {
                    Intrinsics.m17056y("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) t;
                }
                list.add(frameAwaiter);
                boolean z2 = !z;
                c37784p.mo15160z(new BroadcastFrameClock$withFrameNanos$2$1(this, c37609n0));
                if (z2 && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object m16135u = c37784p.m16135u();
        m6959e = C42688d.m6959e();
        if (m16135u == m6959e) {
            C37591h.m17084c(continuation);
        }
        return m16135u;
    }

    public BroadcastFrameClock(@Nullable Functions<Unit> functions) {
        this.onNewAwaiters = functions;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(Functions functions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : functions);
    }
}
