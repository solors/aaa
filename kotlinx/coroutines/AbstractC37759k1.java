package kotlinx.coroutines;

import ie.C33648p;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventLoop.common.kt */
@Metadata
/* renamed from: kotlinx.coroutines.k1 */
/* loaded from: classes7.dex */
public abstract class AbstractC37759k1 extends CoroutineDispatcher {

    /* renamed from: b */
    private long f99594b;

    /* renamed from: c */
    private boolean f99595c;
    @Nullable

    /* renamed from: d */
    private ArrayDeque<DispatchedTask<?>> f99596d;

    /* renamed from: P */
    public static /* synthetic */ void m16217P(AbstractC37759k1 abstractC37759k1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC37759k1.m16218O(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: s */
    public static /* synthetic */ void m16211s(AbstractC37759k1 abstractC37759k1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC37759k1.m16212r(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: u */
    private final long m16210u(boolean z) {
        if (z) {
            return 4294967296L;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public long mo16196N() {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.f99596d;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: O */
    public final void m16218O(boolean z) {
        this.f99594b += m16210u(z);
        if (!z) {
            this.f99595c = true;
        }
    }

    /* renamed from: Q */
    public final boolean m16216Q() {
        if (this.f99594b >= m16210u(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final boolean m16215R() {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.f99596d;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    /* renamed from: S */
    public long mo16195S() {
        if (!m16214T()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: T */
    public final boolean m16214T() {
        DispatchedTask<?> m17491l;
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.f99596d;
        if (arrayDeque == null || (m17491l = arrayDeque.m17491l()) == null) {
            return false;
        }
        m17491l.run();
        return true;
    }

    /* renamed from: U */
    public boolean m16213U() {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public final CoroutineDispatcher limitedParallelism(int i) {
        C33648p.m22931a(i);
        return this;
    }

    /* renamed from: r */
    public final void m16212r(boolean z) {
        long m16210u = this.f99594b - m16210u(z);
        this.f99594b = m16210u;
        if (m16210u <= 0 && this.f99595c) {
            shutdown();
        }
    }

    /* renamed from: w */
    public final void m16209w(@NotNull DispatchedTask<?> dispatchedTask) {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.f99596d;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.f99596d = arrayDeque;
        }
        arrayDeque.addLast(dispatchedTask);
    }

    public void shutdown() {
    }
}
