package id;

import ad.Scheduler;
import java.util.concurrent.Executor;
import p776ld.Schedulers;

/* renamed from: id.b */
/* loaded from: classes9.dex */
public final class ExecutorScheduler extends Scheduler {

    /* renamed from: d */
    static final Scheduler f92044d = Schedulers.m15541b();

    /* renamed from: b */
    final boolean f92045b;

    /* renamed from: c */
    final Executor f92046c;

    public ExecutorScheduler(Executor executor, boolean z) {
        this.f92046c = executor;
        this.f92045b = z;
    }
}
