package ke;

import androidx.concurrent.futures.C1074a;
import com.google.common.util.concurrent.C17170p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C37609n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ke.n */
/* loaded from: classes8.dex */
public final class WorkQueue {
    @NotNull

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f99172b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");
    @NotNull

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f99173c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");
    @NotNull

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f99174d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");
    @NotNull

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f99175e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");
    @NotNull

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC37508h> f99176a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    @Nullable
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* renamed from: b */
    private final AbstractRunnableC37508h m17675b(AbstractRunnableC37508h abstractRunnableC37508h) {
        if (m17673d() == 127) {
            return abstractRunnableC37508h;
        }
        boolean z = true;
        if (abstractRunnableC37508h.f99160c.mo17677b() != 1) {
            z = false;
        }
        if (z) {
            f99175e.incrementAndGet(this);
        }
        int i = f99173c.get(this) & 127;
        while (this.f99176a.get(i) != null) {
            Thread.yield();
        }
        this.f99176a.lazySet(i, abstractRunnableC37508h);
        f99173c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    private final void m17674c(AbstractRunnableC37508h abstractRunnableC37508h) {
        if (abstractRunnableC37508h != null) {
            boolean z = true;
            if (abstractRunnableC37508h.f99160c.mo17677b() != 1) {
                z = false;
            }
            if (z) {
                f99175e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: d */
    private final int m17673d() {
        return f99173c.get(this) - f99174d.get(this);
    }

    /* renamed from: i */
    private final AbstractRunnableC37508h m17668i() {
        AbstractRunnableC37508h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f99174d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f99173c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.f99176a.getAndSet(i2, null)) != null) {
                m17674c(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m17667j(Tasks tasks) {
        AbstractRunnableC37508h m17668i = m17668i();
        if (m17668i == null) {
            return false;
        }
        tasks.m22897a(m17668i);
        return true;
    }

    /* renamed from: k */
    private final AbstractRunnableC37508h m17666k(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC37508h abstractRunnableC37508h;
        do {
            atomicReferenceFieldUpdater = f99172b;
            abstractRunnableC37508h = (AbstractRunnableC37508h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC37508h != null) {
                boolean z2 = true;
                if (abstractRunnableC37508h.f99160c.mo17677b() != 1) {
                    z2 = false;
                }
                if (z2 == z) {
                }
            }
            int i = f99174d.get(this);
            int i2 = f99173c.get(this);
            while (i != i2) {
                if (z && f99175e.get(this) == 0) {
                    return null;
                }
                i2--;
                AbstractRunnableC37508h m17664m = m17664m(i2, z);
                if (m17664m != null) {
                    return m17664m;
                }
            }
            return null;
        } while (!C1074a.m105283a(atomicReferenceFieldUpdater, this, abstractRunnableC37508h, null));
        return abstractRunnableC37508h;
    }

    /* renamed from: l */
    private final AbstractRunnableC37508h m17665l(int i) {
        int i2 = f99174d.get(this);
        int i3 = f99173c.get(this);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        while (i2 != i3) {
            if (z && f99175e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            AbstractRunnableC37508h m17664m = m17664m(i2, z);
            if (m17664m == null) {
                i2 = i4;
            } else {
                return m17664m;
            }
        }
        return null;
    }

    /* renamed from: m */
    private final AbstractRunnableC37508h m17664m(int i, boolean z) {
        int i2 = i & 127;
        AbstractRunnableC37508h abstractRunnableC37508h = this.f99176a.get(i2);
        if (abstractRunnableC37508h != null) {
            boolean z2 = true;
            if (abstractRunnableC37508h.f99160c.mo17677b() != 1) {
                z2 = false;
            }
            if (z2 == z && C17170p.m67426a(this.f99176a, i2, abstractRunnableC37508h, null)) {
                if (z) {
                    f99175e.decrementAndGet(this);
                }
                return abstractRunnableC37508h;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, ke.h, java.lang.Object] */
    /* renamed from: o */
    private final long m17662o(int i, C37609n0<AbstractRunnableC37508h> c37609n0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        boolean z;
        do {
            atomicReferenceFieldUpdater = f99172b;
            r1 = (AbstractRunnableC37508h) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            int i2 = 1;
            if (r1.f99160c.mo17677b() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = 2;
            }
            if ((i2 & i) == 0) {
                return -2L;
            }
            long mo17679a = C37512l.f99168f.mo17679a() - r1.f99159b;
            long j = C37512l.f99164b;
            if (mo17679a < j) {
                return j - mo17679a;
            }
        } while (!C1074a.m105283a(atomicReferenceFieldUpdater, this, r1, null));
        c37609n0.f99327b = r1;
        return -1L;
    }

    @Nullable
    /* renamed from: a */
    public final AbstractRunnableC37508h m17676a(@NotNull AbstractRunnableC37508h abstractRunnableC37508h, boolean z) {
        if (z) {
            return m17675b(abstractRunnableC37508h);
        }
        AbstractRunnableC37508h abstractRunnableC37508h2 = (AbstractRunnableC37508h) f99172b.getAndSet(this, abstractRunnableC37508h);
        if (abstractRunnableC37508h2 == null) {
            return null;
        }
        return m17675b(abstractRunnableC37508h2);
    }

    /* renamed from: e */
    public final int m17672e() {
        if (f99172b.get(this) != null) {
            return m17673d() + 1;
        }
        return m17673d();
    }

    /* renamed from: f */
    public final void m17671f(@NotNull Tasks tasks) {
        AbstractRunnableC37508h abstractRunnableC37508h = (AbstractRunnableC37508h) f99172b.getAndSet(this, null);
        if (abstractRunnableC37508h != null) {
            tasks.m22897a(abstractRunnableC37508h);
        }
        do {
        } while (m17667j(tasks));
    }

    @Nullable
    /* renamed from: g */
    public final AbstractRunnableC37508h m17670g() {
        AbstractRunnableC37508h abstractRunnableC37508h = (AbstractRunnableC37508h) f99172b.getAndSet(this, null);
        if (abstractRunnableC37508h == null) {
            return m17668i();
        }
        return abstractRunnableC37508h;
    }

    @Nullable
    /* renamed from: h */
    public final AbstractRunnableC37508h m17669h() {
        return m17666k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public final long m17663n(int i, @NotNull C37609n0<AbstractRunnableC37508h> c37609n0) {
        T t;
        if (i == 3) {
            t = m17668i();
        } else {
            t = m17665l(i);
        }
        if (t != 0) {
            c37609n0.f99327b = t;
            return -1L;
        }
        return m17662o(i, c37609n0);
    }
}
