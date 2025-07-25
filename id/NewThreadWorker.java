package id;

import ad.Scheduler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: id.e */
/* loaded from: classes9.dex */
public class NewThreadWorker extends Scheduler.AbstractC0035a {

    /* renamed from: b */
    private final ScheduledExecutorService f92064b;

    /* renamed from: c */
    volatile boolean f92065c;

    public NewThreadWorker(ThreadFactory threadFactory) {
        this.f92064b = SchedulerPoolFactory.m23018a(threadFactory);
    }

    @Override // bd.Disposable
    public void dispose() {
        if (!this.f92065c) {
            this.f92065c = true;
            this.f92064b.shutdownNow();
        }
    }
}
