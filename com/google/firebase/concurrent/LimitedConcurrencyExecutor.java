package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public class LimitedConcurrencyExecutor implements Executor {

    /* renamed from: b */
    private final Executor f42172b;

    /* renamed from: c */
    private final Semaphore f42173c;

    /* renamed from: d */
    private final LinkedBlockingQueue<Runnable> f42174d = new LinkedBlockingQueue<>();

    public LimitedConcurrencyExecutor(Executor executor, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "concurrency must be positive.");
        this.f42172b = executor;
        this.f42173c = new Semaphore(i, true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m67262a(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable) {
        limitedConcurrencyExecutor.m67260c(runnable);
    }

    /* renamed from: b */
    private Runnable m67261b(final Runnable runnable) {
        return new Runnable() { // from class: com.google.firebase.concurrent.w
            @Override // java.lang.Runnable
            public final void run() {
                LimitedConcurrencyExecutor.m67262a(LimitedConcurrencyExecutor.this, runnable);
            }
        };
    }

    /* renamed from: c */
    public /* synthetic */ void m67260c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f42173c.release();
            m67259d();
        }
    }

    /* renamed from: d */
    private void m67259d() {
        while (this.f42173c.tryAcquire()) {
            Runnable poll = this.f42174d.poll();
            if (poll != null) {
                this.f42172b.execute(m67261b(poll));
            } else {
                this.f42173c.release();
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f42174d.offer(runnable);
        m67259d();
    }
}
