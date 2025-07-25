package ie;

import androidx.concurrent.futures.C1074a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.DebugStrings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@Metadata
/* renamed from: ie.s */
/* loaded from: classes8.dex */
public class C33653s {
    @NotNull

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f92133b = AtomicReferenceFieldUpdater.newUpdater(C33653s.class, Object.class, "_next");
    @NotNull

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f92134c = AtomicReferenceFieldUpdater.newUpdater(C33653s.class, Object.class, "_prev");
    @NotNull

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f92135d = AtomicReferenceFieldUpdater.newUpdater(C33653s.class, Object.class, "_removedRef");
    @Nullable
    private volatile Object _next = this;
    @Nullable
    private volatile Object _prev = this;
    @Nullable
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata
    /* renamed from: ie.s$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC33654a extends AbstractC33631b<C33653s> {
        @NotNull

        /* renamed from: b */
        public final C33653s f92136b;
        @Nullable

        /* renamed from: c */
        public C33653s f92137c;

        public AbstractC33654a(@NotNull C33653s c33653s) {
            this.f92136b = c33653s;
        }

        @Override // ie.AbstractC33631b
        /* renamed from: e */
        public void mo22899b(@NotNull C33653s c33653s, @Nullable Object obj) {
            boolean z;
            C33653s c33653s2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c33653s2 = this.f92136b;
            } else {
                c33653s2 = this.f92137c;
            }
            if (c33653s2 != null && C1074a.m105283a(C33653s.f92133b, c33653s, this, c33653s2) && z) {
                C33653s c33653s3 = this.f92136b;
                C33653s c33653s4 = this.f92137c;
                Intrinsics.m17074g(c33653s4);
                c33653s3.m22908h(c33653s4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (androidx.concurrent.futures.C1074a.m105283a(r4, r3, r2, ((ie.LockFreeLinkedList) r5).f92082a) != false) goto L23;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ie.C33653s m22910f(ie.AbstractC33630a0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ie.C33653s.f92134c
            java.lang.Object r0 = r0.get(r8)
            ie.s r0 = (ie.C33653s) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = ie.C33653s.f92133b
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ie.C33653s.f92134c
            boolean r0 = androidx.concurrent.futures.C1074a.m105283a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.mo22904l()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof ie.AbstractC33630a0
            if (r6 == 0) goto L34
            ie.a0 r5 = (ie.AbstractC33630a0) r5
            r5.mo23011a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof ie.LockFreeLinkedList
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            ie.b0 r5 = (ie.LockFreeLinkedList) r5
            ie.s r5 = r5.f92082a
            boolean r2 = androidx.concurrent.futures.C1074a.m105283a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = ie.C33653s.f92134c
            java.lang.Object r2 = r4.get(r2)
            ie.s r2 = (ie.C33653s) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.m17073h(r5, r3)
            r3 = r5
            ie.s r3 = (ie.C33653s) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.C33653s.m22910f(ie.a0):ie.s");
    }

    /* renamed from: g */
    private final C33653s m22909g(C33653s c33653s) {
        while (c33653s.mo22904l()) {
            c33653s = (C33653s) f92134c.get(c33653s);
        }
        return c33653s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m22908h(C33653s c33653s) {
        C33653s c33653s2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92134c;
        do {
            c33653s2 = (C33653s) atomicReferenceFieldUpdater.get(c33653s);
            if (m22907i() != c33653s) {
                return;
            }
        } while (!C1074a.m105283a(f92134c, c33653s, c33653s2, this));
        if (mo22904l()) {
            c33653s.m22910f(null);
        }
    }

    /* renamed from: o */
    private final LockFreeLinkedList m22901o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92135d;
        LockFreeLinkedList lockFreeLinkedList = (LockFreeLinkedList) atomicReferenceFieldUpdater.get(this);
        if (lockFreeLinkedList == null) {
            LockFreeLinkedList lockFreeLinkedList2 = new LockFreeLinkedList(this);
            atomicReferenceFieldUpdater.lazySet(this, lockFreeLinkedList2);
            return lockFreeLinkedList2;
        }
        return lockFreeLinkedList;
    }

    /* renamed from: e */
    public final boolean m22911e(@NotNull C33653s c33653s) {
        f92134c.lazySet(c33653s, this);
        f92133b.lazySet(c33653s, this);
        while (m22907i() == this) {
            if (C1074a.m105283a(f92133b, this, this, c33653s)) {
                c33653s.m22908h(this);
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: i */
    public final Object m22907i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92133b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC33630a0)) {
                return obj;
            }
            ((AbstractC33630a0) obj).mo23011a(this);
        }
    }

    @NotNull
    /* renamed from: j */
    public final C33653s m22906j() {
        return C33651r.m22916b(m22907i());
    }

    @NotNull
    /* renamed from: k */
    public final C33653s m22905k() {
        C33653s m22910f = m22910f(null);
        if (m22910f == null) {
            return m22909g((C33653s) f92134c.get(this));
        }
        return m22910f;
    }

    /* renamed from: l */
    public boolean mo22904l() {
        return m22907i() instanceof LockFreeLinkedList;
    }

    /* renamed from: m */
    public boolean m22903m() {
        if (m22902n() == null) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: n */
    public final C33653s m22902n() {
        Object m22907i;
        C33653s c33653s;
        do {
            m22907i = m22907i();
            if (m22907i instanceof LockFreeLinkedList) {
                return ((LockFreeLinkedList) m22907i).f92082a;
            }
            if (m22907i == this) {
                return (C33653s) m22907i;
            }
            Intrinsics.m17073h(m22907i, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c33653s = (C33653s) m22907i;
        } while (!C1074a.m105283a(f92133b, this, m22907i, c33653s.m22901o()));
        c33653s.m22910f(null);
        return null;
    }

    /* renamed from: p */
    public final int m22900p(@NotNull C33653s c33653s, @NotNull C33653s c33653s2, @NotNull AbstractC33654a abstractC33654a) {
        f92134c.lazySet(c33653s, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92133b;
        atomicReferenceFieldUpdater.lazySet(c33653s, c33653s2);
        abstractC33654a.f92137c = c33653s2;
        if (!C1074a.m105283a(atomicReferenceFieldUpdater, this, c33653s2, abstractC33654a)) {
            return 0;
        }
        if (abstractC33654a.mo23011a(this) == null) {
            return 1;
        }
        return 2;
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: ie.s.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return DebugStrings.m16104a(this.receiver);
            }
        } + '@' + DebugStrings.m16103b(this);
    }
}
