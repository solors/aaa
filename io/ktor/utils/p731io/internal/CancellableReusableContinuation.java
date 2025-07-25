package io.ktor.utils.p731io.internal;

import androidx.concurrent.futures.C1074a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC37708b2;
import kotlinx.coroutines.InterfaceC37731g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;

@Metadata
/* renamed from: io.ktor.utils.io.internal.b */
/* loaded from: classes9.dex */
public final class CancellableReusableContinuation<T> implements Continuation<T> {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f98203b = AtomicReferenceFieldUpdater.newUpdater(CancellableReusableContinuation.class, Object.class, "state");

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f98204c = AtomicReferenceFieldUpdater.newUpdater(CancellableReusableContinuation.class, Object.class, "jobCancellationHandler");
    @NotNull
    private volatile /* synthetic */ Object state = null;
    @NotNull
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CancellableReusableContinuation.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.b$a */
    /* loaded from: classes9.dex */
    public final class C37193a implements Function1<Throwable, Unit> {
        @NotNull

        /* renamed from: b */
        private final InterfaceC37708b2 f98205b;
        @Nullable

        /* renamed from: c */
        private InterfaceC37731g1 f98206c;

        /* renamed from: d */
        final /* synthetic */ CancellableReusableContinuation<T> f98207d;

        public C37193a(@NotNull CancellableReusableContinuation cancellableReusableContinuation, InterfaceC37708b2 job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.f98207d = cancellableReusableContinuation;
            this.f98205b = job;
            InterfaceC37731g1 m16407d = InterfaceC37708b2.C37709a.m16407d(job, true, false, this, 2, null);
            if (job.isActive()) {
                this.f98206c = m16407d;
            }
        }

        /* renamed from: a */
        public final void m18809a() {
            InterfaceC37731g1 interfaceC37731g1 = this.f98206c;
            if (interfaceC37731g1 != null) {
                this.f98206c = null;
                interfaceC37731g1.dispose();
            }
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC37708b2 m18808b() {
            return this.f98205b;
        }

        /* renamed from: c */
        public void m18807c(@Nullable Throwable th) {
            this.f98207d.m18812g(this);
            m18809a();
            if (th != null) {
                this.f98207d.m18810i(this.f98205b, th);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            m18807c(th);
            return Unit.f99208a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m18812g(CancellableReusableContinuation<T>.C37193a c37193a) {
        C1074a.m105283a(f98204c, this, c37193a, null);
    }

    /* renamed from: h */
    private final void m18811h(CoroutineContext coroutineContext) {
        InterfaceC37708b2 interfaceC37708b2;
        Object obj;
        C37193a c37193a;
        InterfaceC37708b2 interfaceC37708b22 = (InterfaceC37708b2) coroutineContext.get(InterfaceC37708b2.f99515b8);
        C37193a c37193a2 = (C37193a) this.jobCancellationHandler;
        if (c37193a2 != null) {
            interfaceC37708b2 = c37193a2.m18808b();
        } else {
            interfaceC37708b2 = null;
        }
        if (interfaceC37708b2 == interfaceC37708b22) {
            return;
        }
        if (interfaceC37708b22 == null) {
            C37193a c37193a3 = (C37193a) f98204c.getAndSet(this, null);
            if (c37193a3 != null) {
                c37193a3.m18809a();
                return;
            }
            return;
        }
        C37193a c37193a4 = new C37193a(this, interfaceC37708b22);
        do {
            obj = this.jobCancellationHandler;
            c37193a = (C37193a) obj;
            if (c37193a != null && c37193a.m18808b() == interfaceC37708b22) {
                c37193a4.m18809a();
                return;
            }
        } while (!C1074a.m105283a(f98204c, this, obj, c37193a4));
        if (c37193a != null) {
            c37193a.m18809a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m18810i(InterfaceC37708b2 interfaceC37708b2, Throwable th) {
        Object obj;
        Continuation continuation;
        do {
            obj = this.state;
            if (!(obj instanceof Continuation)) {
                return;
            }
            continuation = (Continuation) obj;
            if (continuation.getContext().get(InterfaceC37708b2.f99515b8) != interfaceC37708b2) {
                return;
            }
        } while (!C1074a.m105283a(f98203b, this, obj, null));
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        Result.C38506a c38506a = Result.f101870c;
        continuation.resumeWith(Result.m14549b(C38508r.m14540a(th)));
    }

    /* renamed from: d */
    public final void m18815d(@NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        resumeWith(Result.m14549b(value));
        C37193a c37193a = (C37193a) f98204c.getAndSet(this, null);
        if (c37193a != null) {
            c37193a.m18809a();
        }
    }

    /* renamed from: e */
    public final void m18814e(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Result.C38506a c38506a = Result.f101870c;
        resumeWith(Result.m14549b(C38508r.m14540a(cause)));
        C37193a c37193a = (C37193a) f98204c.getAndSet(this, null);
        if (c37193a != null) {
            c37193a.m18809a();
        }
    }

    @NotNull
    /* renamed from: f */
    public final Object m18813f(@NotNull Continuation<? super T> actual) {
        Object m6959e;
        Intrinsics.checkNotNullParameter(actual, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (C1074a.m105283a(f98203b, this, null, actual)) {
                    m18811h(actual.getContext());
                    m6959e = C42688d.m6959e();
                    return m6959e;
                }
            } else if (C1074a.m105283a(f98203b, this, obj, null)) {
                if (!(obj instanceof Throwable)) {
                    Intrinsics.m17073h(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
                    return obj;
                }
                throw ((Throwable) obj);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        Continuation continuation;
        CoroutineContext context;
        Object obj = this.state;
        if (obj instanceof Continuation) {
            continuation = (Continuation) obj;
        } else {
            continuation = null;
        }
        if (continuation == null || (context = continuation.getContext()) == null) {
            return C37586g.f99289b;
        }
        return context;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        Object obj2;
        Object obj3;
        do {
            obj2 = this.state;
            if (obj2 == null) {
                obj3 = Result.m14546e(obj);
                if (obj3 == null) {
                    C38508r.m14539b(obj);
                    obj3 = obj;
                }
            } else if (obj2 instanceof Continuation) {
                obj3 = null;
            } else {
                return;
            }
        } while (!C1074a.m105283a(f98203b, this, obj2, obj3));
        if (obj2 instanceof Continuation) {
            ((Continuation) obj2).resumeWith(obj);
        }
    }
}
