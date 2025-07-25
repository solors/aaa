package ie;

import androidx.concurrent.futures.C1074a;
import ie.AbstractC33632e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata
/* renamed from: ie.e */
/* loaded from: classes8.dex */
public abstract class AbstractC33632e<N extends AbstractC33632e<N>> {
    @NotNull

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f92086b = AtomicReferenceFieldUpdater.newUpdater(AbstractC33632e.class, Object.class, "_next");
    @NotNull

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f92087c = AtomicReferenceFieldUpdater.newUpdater(AbstractC33632e.class, Object.class, "_prev");
    @Nullable
    private volatile Object _next;
    @Nullable
    private volatile Object _prev;

    public AbstractC33632e(@Nullable N n) {
        this._prev = n;
    }

    /* renamed from: c */
    private final N m23000c() {
        N m22996g = m22996g();
        while (m22996g != null && m22996g.mo22991h()) {
            m22996g = (N) f92087c.get(m22996g);
        }
        return m22996g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ie.e] */
    /* renamed from: d */
    private final N m22999d() {
        N m22998e = m22998e();
        Intrinsics.m17074g(m22998e);
        while (m22998e.mo22991h()) {
            ?? m22998e2 = m22998e.m22998e();
            if (m22998e2 == 0) {
                return m22998e;
            }
            m22998e = m22998e2;
        }
        return m22998e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final Object m22997f() {
        return f92086b.get(this);
    }

    /* renamed from: b */
    public final void m23001b() {
        f92087c.lazySet(this, null);
    }

    @Nullable
    /* renamed from: e */
    public final N m22998e() {
        Object m22997f = m22997f();
        if (m22997f == ConcurrentLinkedList.m23005a()) {
            return null;
        }
        return (N) m22997f;
    }

    @Nullable
    /* renamed from: g */
    public final N m22996g() {
        return (N) f92087c.get(this);
    }

    /* renamed from: h */
    public abstract boolean mo22991h();

    /* renamed from: i */
    public final boolean m22995i() {
        if (m22998e() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m22994j() {
        return C1074a.m105283a(f92086b, this, null, ConcurrentLinkedList.m23005a());
    }

    /* renamed from: k */
    public final void m22993k() {
        Object obj;
        N n;
        if (m22995i()) {
            return;
        }
        while (true) {
            N m23000c = m23000c();
            N m22999d = m22999d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92087c;
            do {
                obj = atomicReferenceFieldUpdater.get(m22999d);
                if (((AbstractC33632e) obj) == null) {
                    n = null;
                } else {
                    n = m23000c;
                }
            } while (!C1074a.m105283a(atomicReferenceFieldUpdater, m22999d, obj, n));
            if (m23000c != null) {
                f92086b.set(m23000c, m22999d);
            }
            if (!m22999d.mo22991h() || m22999d.m22995i()) {
                if (m23000c == null || !m23000c.mo22991h()) {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean m22992l(@NotNull N n) {
        return C1074a.m105283a(f92086b, this, null, n);
    }
}
