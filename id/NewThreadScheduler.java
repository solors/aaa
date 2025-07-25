package id;

import ad.Scheduler;
import java.util.concurrent.ThreadFactory;

/* renamed from: id.d */
/* loaded from: classes9.dex */
public final class NewThreadScheduler extends Scheduler {

    /* renamed from: c */
    private static final RxThreadFactory f92062c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f92063b;

    public NewThreadScheduler() {
        this(f92062c);
    }

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.f92063b = threadFactory;
    }
}
