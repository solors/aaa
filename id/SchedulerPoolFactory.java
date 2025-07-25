package id;

import androidx.compose.animation.core.C0379a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: id.g */
/* loaded from: classes9.dex */
public final class SchedulerPoolFactory {

    /* renamed from: a */
    public static final boolean f92069a;

    /* renamed from: b */
    public static final int f92070b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f92071c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f92072d = new ConcurrentHashMap();

    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: id.g$a */
    /* loaded from: classes9.dex */
    static final class C33628a {

        /* renamed from: a */
        boolean f92073a;

        /* renamed from: b */
        int f92074b;

        C33628a() {
        }

        /* renamed from: a */
        void m23014a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f92073a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f92073a = true;
            }
            if (this.f92073a && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.f92074b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                    this.f92074b = 1;
                    return;
                }
            }
            this.f92074b = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: id.g$b */
    /* loaded from: classes9.dex */
    public static final class RunnableC33629b implements Runnable {
        RunnableC33629b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(SchedulerPoolFactory.f92072d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.f92072d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C33628a c33628a = new C33628a();
        c33628a.m23014a(properties);
        f92069a = c33628a.f92073a;
        f92070b = c33628a.f92074b;
        m23017b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m23018a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m23016c(f92069a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m23017b() {
        m23015d(f92069a);
    }

    /* renamed from: c */
    static void m23016c(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f92072d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    static void m23015d(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f92071c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (C0379a.m105461a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                RunnableC33629b runnableC33629b = new RunnableC33629b();
                int i = f92070b;
                newScheduledThreadPool.scheduleAtFixedRate(runnableC33629b, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
