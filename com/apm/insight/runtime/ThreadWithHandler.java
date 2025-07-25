package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.apm.insight.Ensure;
import com.apm.insight.NpthBus;
import com.apm.insight.p119b.CrashANRHandler;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.apm.insight.runtime.r */
/* loaded from: classes2.dex */
public final class ThreadWithHandler {

    /* renamed from: a */
    private final HandlerThread f4102a;

    /* renamed from: d */
    private volatile Handler f4105d;

    /* renamed from: b */
    private final Queue<C3867c> f4103b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final Queue<Message> f4104c = new ConcurrentLinkedQueue();

    /* renamed from: e */
    private final Object f4106e = new Object();

    /* compiled from: ThreadWithHandler.java */
    /* renamed from: com.apm.insight.runtime.r$a */
    /* loaded from: classes2.dex */
    class RunnableC3865a implements Runnable {
        RunnableC3865a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!ThreadWithHandler.this.f4104c.isEmpty()) {
                if (ThreadWithHandler.this.f4105d != null) {
                    try {
                        ThreadWithHandler.this.f4105d.sendMessageAtFrontOfQueue((Message) ThreadWithHandler.this.f4104c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!ThreadWithHandler.this.f4103b.isEmpty()) {
                C3867c c3867c = (C3867c) ThreadWithHandler.this.f4103b.poll();
                if (ThreadWithHandler.this.f4105d != null) {
                    try {
                        ThreadWithHandler.this.f4105d.sendMessageAtTime(c3867c.f4111a, c3867c.f4112b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* compiled from: ThreadWithHandler.java */
    /* renamed from: com.apm.insight.runtime.r$b */
    /* loaded from: classes2.dex */
    class HandlerThreadC3866b extends HandlerThread {

        /* renamed from: a */
        private volatile int f4108a;

        /* renamed from: b */
        private volatile boolean f4109b;

        HandlerThreadC3866b(String str) {
            super(str);
            this.f4108a = 0;
            this.f4109b = false;
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (ThreadWithHandler.this.f4106e) {
                ThreadWithHandler.this.f4105d = new Handler();
            }
            ThreadWithHandler.this.f4105d.post(new RunnableC3865a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        CrashANRHandler.m102099a(NpthBus.m102011g()).m102100a().m102122c();
                        if (this.f4108a < 5) {
                            Ensure.m102051a();
                            MonitorCrashInner.m101391a(th, "NPTH_CATCH");
                        } else if (!this.f4109b) {
                            this.f4109b = true;
                            Ensure.m102051a();
                            MonitorCrashInner.m101391a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f4108a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ThreadWithHandler.java */
    /* renamed from: com.apm.insight.runtime.r$c */
    /* loaded from: classes2.dex */
    public static class C3867c {

        /* renamed from: a */
        Message f4111a;

        /* renamed from: b */
        long f4112b;

        C3867c(Message message, long j) {
            this.f4111a = message;
            this.f4112b = j;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.r.1
        };
        new Object() { // from class: com.apm.insight.runtime.r.2
        };
    }

    public ThreadWithHandler(String str) {
        this.f4102a = new HandlerThreadC3866b(str);
    }

    /* renamed from: b */
    public final void m101307b() {
        this.f4102a.start();
    }

    /* renamed from: c */
    public final HandlerThread m101303c() {
        return this.f4102a;
    }

    /* renamed from: b */
    private Message m101304b(Runnable runnable) {
        return Message.obtain(this.f4105d, runnable);
    }

    @Nullable
    /* renamed from: a */
    public final Handler m101313a() {
        return this.f4105d;
    }

    /* renamed from: b */
    private boolean m101306b(Message message, long j) {
        if (this.f4105d == null) {
            synchronized (this.f4106e) {
                if (this.f4105d == null) {
                    this.f4103b.add(new C3867c(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f4105d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m101309a(Runnable runnable) {
        return m101312a(m101304b(runnable), 0L);
    }

    /* renamed from: a */
    public final boolean m101308a(Runnable runnable, long j) {
        return m101312a(m101304b(runnable), j);
    }

    /* renamed from: a */
    private boolean m101312a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m101306b(message, SystemClock.uptimeMillis() + j);
    }
}
