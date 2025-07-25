package ie;

import androidx.core.internal.view.SupportMenu;
import ie.AbstractC33633e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC37796r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata
/* renamed from: ie.e0 */
/* loaded from: classes8.dex */
public abstract class AbstractC33633e0<S extends AbstractC33633e0<S>> extends AbstractC33632e<S> implements InterfaceC37796r2 {
    @NotNull

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f92088f = AtomicIntegerFieldUpdater.newUpdater(AbstractC33633e0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: d */
    public final long f92089d;

    public AbstractC33633e0(long j, @Nullable S s, int i) {
        super(s);
        this.f92089d = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // ie.AbstractC33632e
    /* renamed from: h */
    public boolean mo22991h() {
        if (f92088f.get(this) == mo15131n() && !m22995i()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m22990m() {
        if (f92088f.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo15131n() && !m22995i()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public abstract int mo15131n();

    /* renamed from: o */
    public abstract void mo15130o(int i, @Nullable Throwable th, @NotNull CoroutineContext coroutineContext);

    /* renamed from: p */
    public final void m22989p() {
        if (f92088f.incrementAndGet(this) == mo15131n()) {
            m22993k();
        }
    }

    /* renamed from: q */
    public final boolean m22988q() {
        int i;
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f92088f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo15131n() && !m22995i()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
