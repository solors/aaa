package id;

import ad.Scheduler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: id.h */
/* loaded from: classes9.dex */
public final class SingleScheduler extends Scheduler {

    /* renamed from: d */
    static final RxThreadFactory f92075d;

    /* renamed from: e */
    static final ScheduledExecutorService f92076e;

    /* renamed from: b */
    final ThreadFactory f92077b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f92078c;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f92076e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f92075d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        this(f92075d);
    }

    /* renamed from: a */
    static ScheduledExecutorService m23013a(ThreadFactory threadFactory) {
        return SchedulerPoolFactory.m23018a(threadFactory);
    }

    public SingleScheduler(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f92078c = atomicReference;
        this.f92077b = threadFactory;
        atomicReference.lazySet(m23013a(threadFactory));
    }
}
