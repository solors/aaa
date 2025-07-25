package ie;

import androidx.concurrent.futures.C1074a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ie.t */
/* loaded from: classes8.dex */
public class LockFreeTaskQueue<E> {
    @NotNull

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f92138a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur");
    @Nullable
    private volatile Object _cur;

    public LockFreeTaskQueue(boolean z) {
        this._cur = new C33656u(8, z);
    }

    /* renamed from: a */
    public final boolean m22897a(@NotNull E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92138a;
        while (true) {
            C33656u c33656u = (C33656u) atomicReferenceFieldUpdater.get(this);
            int m22893a = c33656u.m22893a(e);
            if (m22893a == 0) {
                return true;
            }
            if (m22893a != 1) {
                if (m22893a == 2) {
                    return false;
                }
            } else {
                C1074a.m105283a(f92138a, this, c33656u, c33656u.m22885i());
            }
        }
    }

    /* renamed from: b */
    public final void m22896b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92138a;
        while (true) {
            C33656u c33656u = (C33656u) atomicReferenceFieldUpdater.get(this);
            if (c33656u.m22890d()) {
                return;
            }
            C1074a.m105283a(f92138a, this, c33656u, c33656u.m22885i());
        }
    }

    /* renamed from: c */
    public final int m22895c() {
        return ((C33656u) f92138a.get(this)).m22888f();
    }

    @Nullable
    /* renamed from: d */
    public final E m22894d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92138a;
        while (true) {
            C33656u c33656u = (C33656u) atomicReferenceFieldUpdater.get(this);
            E e = (E) c33656u.m22884j();
            if (e != C33656u.f92142h) {
                return e;
            }
            C1074a.m105283a(f92138a, this, c33656u, c33656u.m22885i());
        }
    }
}
