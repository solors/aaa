package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.tracker.j */
/* loaded from: classes6.dex */
final class ExecutorManager {

    /* renamed from: a */
    private final Executor f59684a;

    /* renamed from: b */
    private final Executor f59685b;

    /* compiled from: ExecutorManager.java */
    /* renamed from: com.mbridge.msdk.tracker.j$a */
    /* loaded from: classes6.dex */
    private static final class RunnableC22889a implements Runnable {

        /* renamed from: a */
        private final Runnable f59688a;

        public RunnableC22889a(Runnable runnable) {
            this.f59688a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C22949y.m49289a(this.f59688a)) {
                return;
            }
            try {
                this.f59688a.run();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "execute error", e);
                }
            }
        }
    }

    public ExecutorManager() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f59684a = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.j.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.f59685b = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.j.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackDatabaseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    /* renamed from: a */
    public final void m49567a(Runnable runnable) {
        this.f59684a.execute(new RunnableC22889a(runnable));
    }

    /* renamed from: b */
    public final void m49566b(Runnable runnable) {
        this.f59685b.execute(new RunnableC22889a(runnable));
    }
}
