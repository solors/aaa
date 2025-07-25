package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

@Metadata
/* renamed from: kotlinx.coroutines.c3 */
/* loaded from: classes7.dex */
final class Interruptible implements Function1<Throwable, Unit> {
    @NotNull

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f99522f = AtomicIntegerFieldUpdater.newUpdater(Interruptible.class, "_state");
    private volatile int _state;
    @NotNull

    /* renamed from: b */
    private final InterfaceC37708b2 f99523b;

    /* renamed from: c */
    private final Thread f99524c = Thread.currentThread();
    @Nullable

    /* renamed from: d */
    private InterfaceC37731g1 f99525d;

    public Interruptible(@NotNull InterfaceC37708b2 interfaceC37708b2) {
        this.f99523b = interfaceC37708b2;
    }

    /* renamed from: b */
    private final Void m16390b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: a */
    public final void m16391a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f99522f;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m16390b(i);
                        throw new ExceptionsH();
                    }
                }
            } else if (f99522f.compareAndSet(this, i, 1)) {
                InterfaceC37731g1 interfaceC37731g1 = this.f99525d;
                if (interfaceC37731g1 != null) {
                    interfaceC37731g1.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public void m16389c(@Nullable Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f99522f;
        do {
            i = atomicIntegerFieldUpdater2.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    m16390b(i);
                    throw new ExceptionsH();
                }
                return;
            }
            atomicIntegerFieldUpdater = f99522f;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f99524c.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: d */
    public final void m16388d() {
        int i;
        this.f99525d = this.f99523b.mo16116x(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f99522f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    m16390b(i);
                    throw new ExceptionsH();
                }
                return;
            }
        } while (!f99522f.compareAndSet(this, i, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        m16389c(th);
        return Unit.f99208a;
    }
}
