package id;

import ad.Scheduler;
import androidx.compose.animation.core.C0379a;
import bd.CompositeDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: id.c */
/* loaded from: classes9.dex */
public final class IoScheduler extends Scheduler {

    /* renamed from: d */
    static final RxThreadFactory f92047d;

    /* renamed from: e */
    static final RxThreadFactory f92048e;

    /* renamed from: h */
    static final C33626b f92051h;

    /* renamed from: i */
    static final RunnableC33625a f92052i;

    /* renamed from: b */
    final ThreadFactory f92053b;

    /* renamed from: c */
    final AtomicReference<RunnableC33625a> f92054c;

    /* renamed from: g */
    private static final TimeUnit f92050g = TimeUnit.SECONDS;

    /* renamed from: f */
    private static final long f92049f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* renamed from: id.c$a */
    /* loaded from: classes9.dex */
    public static final class RunnableC33625a implements Runnable {

        /* renamed from: b */
        private final long f92055b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C33626b> f92056c;

        /* renamed from: d */
        final CompositeDisposable f92057d;

        /* renamed from: f */
        private final ScheduledExecutorService f92058f;

        /* renamed from: g */
        private final Future<?> f92059g;

        /* renamed from: h */
        private final ThreadFactory f92060h;

        RunnableC33625a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f92055b = j3;
            this.f92056c = new ConcurrentLinkedQueue<>();
            this.f92057d = new CompositeDisposable();
            this.f92060h = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, IoScheduler.f92048e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f92058f = scheduledExecutorService;
            this.f92059g = scheduledFuture;
        }

        /* renamed from: a */
        void m23022a() {
            if (!this.f92056c.isEmpty()) {
                long m23021b = m23021b();
                Iterator<C33626b> it = this.f92056c.iterator();
                while (it.hasNext()) {
                    C33626b next = it.next();
                    if (next.m23019a() <= m23021b) {
                        if (this.f92056c.remove(next)) {
                            this.f92057d.m103803c(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        long m23021b() {
            return System.nanoTime();
        }

        /* renamed from: c */
        void m23020c() {
            this.f92057d.dispose();
            Future<?> future = this.f92059g;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f92058f;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m23022a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* renamed from: id.c$b */
    /* loaded from: classes9.dex */
    public static final class C33626b extends NewThreadWorker {

        /* renamed from: d */
        private long f92061d;

        C33626b(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f92061d = 0L;
        }

        /* renamed from: a */
        public long m23019a() {
            return this.f92061d;
        }
    }

    static {
        C33626b c33626b = new C33626b(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f92051h = c33626b;
        c33626b.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        f92047d = rxThreadFactory;
        f92048e = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        RunnableC33625a runnableC33625a = new RunnableC33625a(0L, null, rxThreadFactory);
        f92052i = runnableC33625a;
        runnableC33625a.m23020c();
    }

    public IoScheduler() {
        this(f92047d);
    }

    /* renamed from: a */
    public void m23023a() {
        RunnableC33625a runnableC33625a = new RunnableC33625a(f92049f, f92050g, this.f92053b);
        if (!C0379a.m105461a(this.f92054c, f92052i, runnableC33625a)) {
            runnableC33625a.m23020c();
        }
    }

    public IoScheduler(ThreadFactory threadFactory) {
        this.f92053b = threadFactory;
        this.f92054c = new AtomicReference<>(f92052i);
        m23023a();
    }
}
