package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import kotlinx.coroutines.AbstractC37767l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.t0 */
/* loaded from: classes7.dex */
public final class DefaultExecutor extends AbstractC37767l1 implements Runnable {
    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    @NotNull

    /* renamed from: i */
    public static final DefaultExecutor f99642i;

    /* renamed from: j */
    private static final long f99643j;

    static {
        Long l;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        f99642i = defaultExecutor;
        AbstractC37759k1.m16217P(defaultExecutor, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f99643j = timeUnit.toNanos(l.longValue());
    }

    private DefaultExecutor() {
    }

    /* renamed from: l0 */
    private final synchronized void m16094l0() {
        if (!m16091o0()) {
            return;
        }
        debugStatus = 3;
        m16188f0();
        Intrinsics.m17073h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
    }

    /* renamed from: m0 */
    private final synchronized Thread m16093m0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: n0 */
    private final boolean m16092n0() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    private final boolean m16091o0() {
        int i = debugStatus;
        if (i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    private final synchronized boolean m16090p0() {
        if (m16091o0()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.m17073h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: q0 */
    private final void m16089q0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC37775m1
    @NotNull
    /* renamed from: V */
    protected Thread mo16097V() {
        Thread thread = _thread;
        if (thread == null) {
            return m16093m0();
        }
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC37775m1
    /* renamed from: W */
    public void mo16096W(long j, @NotNull AbstractC37767l1.AbstractRunnableC37770c abstractRunnableC37770c) {
        m16089q0();
    }

    @Override // kotlinx.coroutines.AbstractC37767l1
    /* renamed from: b0 */
    public void mo16095b0(@NotNull Runnable runnable) {
        if (m16092n0()) {
            m16089q0();
        }
        super.mo16095b0(runnable);
    }

    @Override // kotlinx.coroutines.AbstractC37767l1, kotlinx.coroutines.InterfaceC37814x0
    @NotNull
    public InterfaceC37731g1 invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return m16185i0(j, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m16190d0;
        C37711b3.f99517a.m16401d(this);
        C37712c.m16400a();
        try {
            if (!m16090p0()) {
                if (!m16190d0) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo16195S = mo16195S();
                if (mo16195S == Long.MAX_VALUE) {
                    C37712c.m16400a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f99643j + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 > 0) {
                        mo16195S = _Ranges.m16911k(mo16195S, j2);
                    } else {
                        _thread = null;
                        m16094l0();
                        C37712c.m16400a();
                        if (!m16190d0()) {
                            mo16097V();
                            return;
                        }
                        return;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (mo16195S > 0) {
                    if (m16091o0()) {
                        _thread = null;
                        m16094l0();
                        C37712c.m16400a();
                        if (!m16190d0()) {
                            mo16097V();
                            return;
                        }
                        return;
                    }
                    C37712c.m16400a();
                    LockSupport.parkNanos(this, mo16195S);
                }
            }
        } finally {
            _thread = null;
            m16094l0();
            C37712c.m16400a();
            if (!m16190d0()) {
                mo16097V();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC37767l1, kotlinx.coroutines.AbstractC37759k1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
