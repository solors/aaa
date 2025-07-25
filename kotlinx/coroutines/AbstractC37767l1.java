package kotlinx.coroutines;

import androidx.concurrent.futures.C1074a;
import ie.C33656u;
import ie.InterfaceC33650q0;
import ie.Symbol;
import ie.ThreadSafeHeap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import kotlinx.coroutines.InterfaceC37814x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventLoop.common.kt */
@Metadata
/* renamed from: kotlinx.coroutines.l1 */
/* loaded from: classes7.dex */
public abstract class AbstractC37767l1 extends AbstractC37775m1 implements InterfaceC37814x0 {
    @NotNull

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f99609f = AtomicReferenceFieldUpdater.newUpdater(AbstractC37767l1.class, Object.class, "_queue");
    @NotNull

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f99610g = AtomicReferenceFieldUpdater.newUpdater(AbstractC37767l1.class, Object.class, "_delayed");
    @NotNull

    /* renamed from: h */
    private static final AtomicIntegerFieldUpdater f99611h = AtomicIntegerFieldUpdater.newUpdater(AbstractC37767l1.class, "_isCompleted");
    @Nullable
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    @Nullable
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.l1$a */
    /* loaded from: classes7.dex */
    private final class C37768a extends AbstractRunnableC37770c {
        @NotNull

        /* renamed from: d */
        private final InterfaceC37780o<Unit> f99612d;

        /* JADX WARN: Multi-variable type inference failed */
        public C37768a(long j, @NotNull InterfaceC37780o<? super Unit> interfaceC37780o) {
            super(j);
            this.f99612d = interfaceC37780o;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f99612d.mo15169D(AbstractC37767l1.this, Unit.f99208a);
        }

        @Override // kotlinx.coroutines.AbstractC37767l1.AbstractRunnableC37770c
        @NotNull
        public String toString() {
            return super.toString() + this.f99612d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventLoop.common.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.l1$b */
    /* loaded from: classes7.dex */
    public static final class C37769b extends AbstractRunnableC37770c {
        @NotNull

        /* renamed from: d */
        private final Runnable f99614d;

        public C37769b(long j, @NotNull Runnable runnable) {
            super(j);
            this.f99614d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f99614d.run();
        }

        @Override // kotlinx.coroutines.AbstractC37767l1.AbstractRunnableC37770c
        @NotNull
        public String toString() {
            return super.toString() + this.f99614d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.l1$c */
    /* loaded from: classes7.dex */
    public static abstract class AbstractRunnableC37770c implements Runnable, Comparable<AbstractRunnableC37770c>, InterfaceC37731g1, InterfaceC33650q0 {
        @Nullable
        private volatile Object _heap;

        /* renamed from: b */
        public long f99615b;

        /* renamed from: c */
        private int f99616c = -1;

        public AbstractRunnableC37770c(long j) {
            this.f99615b = j;
        }

        @Override // ie.InterfaceC33650q0
        @Nullable
        /* renamed from: c */
        public ThreadSafeHeap<?> mo16182c() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // ie.InterfaceC33650q0
        /* renamed from: d */
        public void mo16181d(@Nullable ThreadSafeHeap<?> threadSafeHeap) {
            Symbol symbol;
            boolean z;
            Object obj = this._heap;
            symbol = C37782o1.f99622a;
            if (obj != symbol) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = threadSafeHeap;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.InterfaceC37731g1
        public final void dispose() {
            Symbol symbol;
            C37771d c37771d;
            Symbol symbol2;
            synchronized (this) {
                Object obj = this._heap;
                symbol = C37782o1.f99622a;
                if (obj == symbol) {
                    return;
                }
                if (obj instanceof C37771d) {
                    c37771d = (C37771d) obj;
                } else {
                    c37771d = null;
                }
                if (c37771d != null) {
                    c37771d.m22924g(this);
                }
                symbol2 = C37782o1.f99622a;
                this._heap = symbol2;
                Unit unit = Unit.f99208a;
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(@NotNull AbstractRunnableC37770c abstractRunnableC37770c) {
            int i = ((this.f99615b - abstractRunnableC37770c.f99615b) > 0L ? 1 : ((this.f99615b - abstractRunnableC37770c.f99615b) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        /* renamed from: f */
        public final int m16179f(long j, @NotNull C37771d c37771d, @NotNull AbstractC37767l1 abstractC37767l1) {
            Symbol symbol;
            synchronized (this) {
                Object obj = this._heap;
                symbol = C37782o1.f99622a;
                if (obj == symbol) {
                    return 2;
                }
                synchronized (c37771d) {
                    AbstractRunnableC37770c m22929b = c37771d.m22929b();
                    if (abstractC37767l1.isCompleted()) {
                        return 1;
                    }
                    if (m22929b == null) {
                        c37771d.f99617c = j;
                    } else {
                        long j2 = m22929b.f99615b;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c37771d.f99617c > 0) {
                            c37771d.f99617c = j;
                        }
                    }
                    long j3 = this.f99615b;
                    long j4 = c37771d.f99617c;
                    if (j3 - j4 < 0) {
                        this.f99615b = j4;
                    }
                    c37771d.m22930a(this);
                    return 0;
                }
            }
        }

        /* renamed from: g */
        public final boolean m16178g(long j) {
            if (j - this.f99615b >= 0) {
                return true;
            }
            return false;
        }

        @Override // ie.InterfaceC33650q0
        public int getIndex() {
            return this.f99616c;
        }

        @Override // ie.InterfaceC33650q0
        public void setIndex(int i) {
            this.f99616c = i;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f99615b + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.l1$d */
    /* loaded from: classes7.dex */
    public static final class C37771d extends ThreadSafeHeap<AbstractRunnableC37770c> {

        /* renamed from: c */
        public long f99617c;

        public C37771d(long j) {
            this.f99617c = j;
        }
    }

    /* renamed from: Z */
    private final void m16193Z() {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99609f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f99609f;
                symbol = C37782o1.f99623b;
                if (C1074a.m105283a(atomicReferenceFieldUpdater2, this, null, symbol)) {
                    return;
                }
            } else if (!(obj instanceof C33656u)) {
                symbol2 = C37782o1.f99623b;
                if (obj == symbol2) {
                    return;
                }
                C33656u c33656u = new C33656u(8, true);
                Intrinsics.m17073h(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c33656u.m22893a((Runnable) obj);
                if (C1074a.m105283a(f99609f, this, obj, c33656u)) {
                    return;
                }
            } else {
                ((C33656u) obj).m22890d();
                return;
            }
        }
    }

    /* renamed from: a0 */
    private final Runnable m16192a0() {
        Symbol symbol;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99609f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof C33656u)) {
                symbol = C37782o1.f99623b;
                if (obj == symbol) {
                    return null;
                }
                if (C1074a.m105283a(f99609f, this, obj, null)) {
                    Intrinsics.m17073h(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            } else {
                Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C33656u c33656u = (C33656u) obj;
                Object m22884j = c33656u.m22884j();
                if (m22884j != C33656u.f92142h) {
                    return (Runnable) m22884j;
                }
                C1074a.m105283a(f99609f, this, obj, c33656u.m22885i());
            }
        }
    }

    /* renamed from: c0 */
    private final boolean m16191c0(Runnable runnable) {
        Symbol symbol;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99609f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (C1074a.m105283a(f99609f, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof C33656u)) {
                symbol = C37782o1.f99623b;
                if (obj == symbol) {
                    return false;
                }
                C33656u c33656u = new C33656u(8, true);
                Intrinsics.m17073h(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c33656u.m22893a((Runnable) obj);
                c33656u.m22893a(runnable);
                if (C1074a.m105283a(f99609f, this, obj, c33656u)) {
                    return true;
                }
            } else {
                Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C33656u c33656u2 = (C33656u) obj;
                int m22893a = c33656u2.m22893a(runnable);
                if (m22893a == 0) {
                    return true;
                }
                if (m22893a != 1) {
                    if (m22893a == 2) {
                        return false;
                    }
                } else {
                    C1074a.m105283a(f99609f, this, obj, c33656u2.m22885i());
                }
            }
        }
    }

    /* renamed from: e0 */
    private final void m16189e0() {
        AbstractRunnableC37770c m22922i;
        C37712c.m16400a();
        long nanoTime = System.nanoTime();
        while (true) {
            C37771d c37771d = (C37771d) f99610g.get(this);
            if (c37771d != null && (m22922i = c37771d.m22922i()) != null) {
                mo16096W(nanoTime, m22922i);
            } else {
                return;
            }
        }
    }

    /* renamed from: h0 */
    private final int m16186h0(long j, AbstractRunnableC37770c abstractRunnableC37770c) {
        if (isCompleted()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99610g;
        C37771d c37771d = (C37771d) atomicReferenceFieldUpdater.get(this);
        if (c37771d == null) {
            C1074a.m105283a(atomicReferenceFieldUpdater, this, null, new C37771d(j));
            Object obj = atomicReferenceFieldUpdater.get(this);
            Intrinsics.m17074g(obj);
            c37771d = (C37771d) obj;
        }
        return abstractRunnableC37770c.m16179f(j, c37771d, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        if (f99611h.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    private final void m16184j0(boolean z) {
        f99611h.set(this, z ? 1 : 0);
    }

    /* renamed from: k0 */
    private final boolean m16183k0(AbstractRunnableC37770c abstractRunnableC37770c) {
        AbstractRunnableC37770c abstractRunnableC37770c2;
        C37771d c37771d = (C37771d) f99610g.get(this);
        if (c37771d != null) {
            abstractRunnableC37770c2 = c37771d.m22926e();
        } else {
            abstractRunnableC37770c2 = null;
        }
        if (abstractRunnableC37770c2 == abstractRunnableC37770c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC37759k1
    /* renamed from: N */
    public long mo16196N() {
        AbstractRunnableC37770c m22926e;
        long m16916f;
        Symbol symbol;
        if (super.mo16196N() == 0) {
            return 0L;
        }
        Object obj = f99609f.get(this);
        if (obj != null) {
            if (!(obj instanceof C33656u)) {
                symbol = C37782o1.f99623b;
                if (obj != symbol) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            } else if (!((C33656u) obj).m22887g()) {
                return 0L;
            }
        }
        C37771d c37771d = (C37771d) f99610g.get(this);
        if (c37771d == null || (m22926e = c37771d.m22926e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = m22926e.f99615b;
        C37712c.m16400a();
        m16916f = _Ranges.m16916f(j - System.nanoTime(), 0L);
        return m16916f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    @Override // kotlinx.coroutines.AbstractC37759k1
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo16195S() {
        /*
            r9 = this;
            boolean r0 = r9.m16214T()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC37767l1.f99610g
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.l1$d r0 = (kotlinx.coroutines.AbstractC37767l1.C37771d) r0
            if (r0 == 0) goto L49
            boolean r3 = r0.m22927d()
            if (r3 != 0) goto L49
            kotlinx.coroutines.C37712c.m16400a()
            long r3 = java.lang.System.nanoTime()
        L20:
            monitor-enter(r0)
            ie.q0 r5 = r0.m22929b()     // Catch: java.lang.Throwable -> L46
            r6 = 0
            if (r5 != 0) goto L2a
            monitor-exit(r0)
            goto L41
        L2a:
            kotlinx.coroutines.l1$c r5 = (kotlinx.coroutines.AbstractC37767l1.AbstractRunnableC37770c) r5     // Catch: java.lang.Throwable -> L46
            boolean r7 = r5.m16178g(r3)     // Catch: java.lang.Throwable -> L46
            r8 = 0
            if (r7 == 0) goto L38
            boolean r5 = r9.m16191c0(r5)     // Catch: java.lang.Throwable -> L46
            goto L39
        L38:
            r5 = r8
        L39:
            if (r5 == 0) goto L40
            ie.q0 r5 = r0.m22923h(r8)     // Catch: java.lang.Throwable -> L46
            r6 = r5
        L40:
            monitor-exit(r0)
        L41:
            kotlinx.coroutines.l1$c r6 = (kotlinx.coroutines.AbstractC37767l1.AbstractRunnableC37770c) r6
            if (r6 != 0) goto L20
            goto L49
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L49:
            java.lang.Runnable r0 = r9.m16192a0()
            if (r0 == 0) goto L53
            r0.run()
            return r1
        L53:
            long r0 = r9.mo16196N()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC37767l1.mo16195S():long");
    }

    /* renamed from: b0 */
    public void mo16095b0(@NotNull Runnable runnable) {
        if (m16191c0(runnable)) {
            m16174X();
        } else {
            DefaultExecutor.f99642i.mo16095b0(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public boolean m16190d0() {
        Symbol symbol;
        if (!m16215R()) {
            return false;
        }
        C37771d c37771d = (C37771d) f99610g.get(this);
        if (c37771d != null && !c37771d.m22927d()) {
            return false;
        }
        Object obj = f99609f.get(this);
        if (obj != null) {
            if (!(obj instanceof C33656u)) {
                symbol = C37782o1.f99623b;
                if (obj != symbol) {
                    return false;
                }
            } else {
                return ((C33656u) obj).m22887g();
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        mo16095b0(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f0 */
    public final void m16188f0() {
        f99609f.set(this, null);
        f99610g.set(this, null);
    }

    /* renamed from: g0 */
    public final void m16187g0(long j, @NotNull AbstractRunnableC37770c abstractRunnableC37770c) {
        int m16186h0 = m16186h0(j, abstractRunnableC37770c);
        if (m16186h0 != 0) {
            if (m16186h0 != 1) {
                if (m16186h0 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            mo16096W(j, abstractRunnableC37770c);
        } else if (m16183k0(abstractRunnableC37770c)) {
            m16174X();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: i0 */
    public final InterfaceC37731g1 m16185i0(long j, @NotNull Runnable runnable) {
        long m16166c = C37782o1.m16166c(j);
        if (m16166c < 4611686018427387903L) {
            C37712c.m16400a();
            long nanoTime = System.nanoTime();
            C37769b c37769b = new C37769b(m16166c + nanoTime, runnable);
            m16187g0(nanoTime, c37769b);
            return c37769b;
        }
        return C37792q2.f99638b;
    }

    @Override // kotlinx.coroutines.InterfaceC37814x0
    @NotNull
    public InterfaceC37731g1 invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC37814x0.C37815a.m16080b(this, j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC37814x0
    public void scheduleResumeAfterDelay(long j, @NotNull InterfaceC37780o<? super Unit> interfaceC37780o) {
        long m16166c = C37782o1.m16166c(j);
        if (m16166c < 4611686018427387903L) {
            C37712c.m16400a();
            long nanoTime = System.nanoTime();
            C37768a c37768a = new C37768a(m16166c + nanoTime, interfaceC37780o);
            m16187g0(nanoTime, c37768a);
            C37793r.m16110a(interfaceC37780o, c37768a);
        }
    }

    @Override // kotlinx.coroutines.AbstractC37759k1
    public void shutdown() {
        C37711b3.f99517a.m16402c();
        m16184j0(true);
        m16193Z();
        do {
        } while (mo16195S() <= 0);
        m16189e0();
    }
}
