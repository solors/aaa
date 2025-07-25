package ie;

import androidx.concurrent.futures.C1074a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata
/* renamed from: ie.u */
/* loaded from: classes8.dex */
public final class C33656u<E> {
    @NotNull

    /* renamed from: e */
    public static final C33657a f92139e = new C33657a(null);
    @NotNull

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f92140f = AtomicReferenceFieldUpdater.newUpdater(C33656u.class, Object.class, "_next");
    @NotNull

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f92141g = AtomicLongFieldUpdater.newUpdater(C33656u.class, "_state");
    @NotNull

    /* renamed from: h */
    public static final Symbol f92142h = new Symbol("REMOVE_FROZEN");
    @Nullable
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a */
    private final int f92143a;

    /* renamed from: b */
    private final boolean f92144b;

    /* renamed from: c */
    private final int f92145c;
    @NotNull

    /* renamed from: d */
    private final AtomicReferenceArray f92146d;

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata
    /* renamed from: ie.u$a */
    /* loaded from: classes8.dex */
    public static final class C33657a {
        private C33657a() {
        }

        public /* synthetic */ C33657a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m22882a(long j) {
            if ((j & 2305843009213693952L) != 0) {
                return 2;
            }
            return 1;
        }

        /* renamed from: b */
        public final long m22881b(long j, int i) {
            return m22879d(j, 1073741823L) | (i << 0);
        }

        /* renamed from: c */
        public final long m22880c(long j, int i) {
            return m22879d(j, 1152921503533105152L) | (i << 30);
        }

        /* renamed from: d */
        public final long m22879d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata
    /* renamed from: ie.u$b */
    /* loaded from: classes8.dex */
    public static final class C33658b {

        /* renamed from: a */
        public final int f92147a;

        public C33658b(int i) {
            this.f92147a = i;
        }
    }

    public C33656u(int i, boolean z) {
        boolean z2;
        this.f92143a = i;
        this.f92144b = z;
        int i2 = i - 1;
        this.f92145c = i2;
        this.f92146d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((i & i2) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C33656u<E> m22892b(long j) {
        C33656u<E> c33656u = new C33656u<>(this.f92143a * 2, this.f92144b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f92145c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f92146d.get(i3 & i);
                if (obj == null) {
                    obj = new C33658b(i);
                }
                c33656u.f92146d.set(c33656u.f92145c & i, obj);
                i++;
            } else {
                f92141g.set(c33656u, f92139e.m22879d(j, 1152921504606846976L));
                return c33656u;
            }
        }
    }

    /* renamed from: c */
    private final C33656u<E> m22891c(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92140f;
        while (true) {
            C33656u<E> c33656u = (C33656u) atomicReferenceFieldUpdater.get(this);
            if (c33656u != null) {
                return c33656u;
            }
            C1074a.m105283a(f92140f, this, null, m22892b(j));
        }
    }

    /* renamed from: e */
    private final C33656u<E> m22889e(int i, E e) {
        Object obj = this.f92146d.get(this.f92145c & i);
        if ((obj instanceof C33658b) && ((C33658b) obj).f92147a == i) {
            this.f92146d.set(i & this.f92145c, e);
            return this;
        }
        return null;
    }

    /* renamed from: h */
    private final long m22886h() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f92141g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C33656u<E> m22883k(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f92141g;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return m22885i();
            }
        } while (!f92141g.compareAndSet(this, j, f92139e.m22881b(j, i2)));
        this.f92146d.set(this.f92145c & i3, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m22893a(@org.jetbrains.annotations.NotNull E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ie.C33656u.f92141g
        L2:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            ie.u$a r14 = ie.C33656u.f92139e
            int r14 = r14.m22882a(r3)
            return r14
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r10 = (int) r5
            int r11 = r13.f92145c
            int r2 = r10 + 2
            r2 = r2 & r11
            r5 = r1 & r11
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r13.f92144b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r13.f92146d
            r12 = r10 & r11
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L51
            int r2 = r13.f92143a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L50
            int r10 = r10 - r1
            r1 = r10 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L50:
            return r6
        L51:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = ie.C33656u.f92141g
            ie.u$a r5 = ie.C33656u.f92139e
            long r5 = r5.m22880c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f92146d
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = ie.C33656u.f92141g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L83
            ie.u r0 = r0.m22885i()
            ie.u r0 = r0.m22889e(r10, r14)
            if (r0 != 0) goto L6c
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.C33656u.m22893a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m22890d() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f92141g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m22888f() {
        long j = f92141g.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean m22887g() {
        long j = f92141g.get(this);
        if (((int) ((1073741823 & j) >> 0)) != ((int) ((j & 1152921503533105152L) >> 30))) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: i */
    public final C33656u<E> m22885i() {
        return m22891c(m22886h());
    }

    @Nullable
    /* renamed from: j */
    public final Object m22884j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f92141g;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return f92142h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f92145c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f92146d.get(i2 & i);
            if (obj == null) {
                if (this.f92144b) {
                    return null;
                }
            } else if (obj instanceof C33658b) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f92141g.compareAndSet(this, j, f92139e.m22881b(j, i3))) {
                    this.f92146d.set(this.f92145c & i, null);
                    return obj;
                } else if (this.f92144b) {
                    C33656u<E> c33656u = this;
                    do {
                        c33656u = c33656u.m22883k(i, i3);
                    } while (c33656u != null);
                    return obj;
                }
            }
        }
    }
}
