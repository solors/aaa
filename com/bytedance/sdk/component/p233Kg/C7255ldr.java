package com.bytedance.sdk.component.p233Kg;

import com.bytedance.sdk.component.p233Kg.C7241bg;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.Kg.ldr */
/* loaded from: classes3.dex */
public class C7255ldr extends C7257zx {

    /* renamed from: IL */
    public static InterfaceC7229bX f15662IL;

    /* renamed from: Kg */
    private static volatile ThreadPoolExecutor f15663Kg;

    /* renamed from: VB */
    private static volatile ScheduledExecutorService f15664VB;

    /* renamed from: WR */
    private static volatile ThreadPoolExecutor f15665WR;

    /* renamed from: eo */
    private static volatile ThreadPoolExecutor f15668eo;

    /* renamed from: iR */
    private static volatile ThreadPoolExecutor f15669iR;
    private static volatile ThreadPoolExecutor ldr;

    /* renamed from: zx */
    private static volatile ThreadPoolExecutor f15670zx;

    /* renamed from: bg */
    public static final int f15667bg = Runtime.getRuntime().availableProcessors();

    /* renamed from: bX */
    public static int f15666bX = 120;
    public static boolean eqN = true;

    /* renamed from: IL */
    public static ExecutorService m89464IL() {
        if (f15670zx == null) {
            synchronized (C7255ldr.class) {
                if (f15670zx == null) {
                    f15670zx = new C7241bg.C7243bg().m89481bg("init").m89487bg(0).m89491IL(10).m89486bg(5L).m89476bg(TimeUnit.SECONDS).m89479bg(new SynchronousQueue()).m89478bg(m89460Kg()).m89477bg(C7257zx.m89444bg().createThreadFactory(10, "init")).m89488bg();
                }
            }
        }
        return f15670zx;
    }

    /* renamed from: Kg */
    public static RejectedExecutionHandler m89460Kg() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.Kg.ldr.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    /* renamed from: WR */
    public static InterfaceC7229bX m89459WR() {
        return f15662IL;
    }

    /* renamed from: bX */
    public static ExecutorService m89458bX() {
        return m89454bg(10);
    }

    /* renamed from: bg */
    public static void m89453bg(AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (f15670zx == null) {
            m89464IL();
        }
        if (abstractRunnableC7227Kg == null || f15670zx == null) {
            return;
        }
        f15670zx.execute(abstractRunnableC7227Kg);
    }

    /* renamed from: eo */
    public static ExecutorService m89448eo() {
        if (f15665WR == null) {
            synchronized (C7255ldr.class) {
                if (f15665WR == null) {
                    C7241bg m89488bg = new C7241bg.C7243bg().m89481bg("computation").m89487bg(3).m89491IL(10).m89486bg(20L).m89476bg(TimeUnit.SECONDS).m89479bg(new PriorityBlockingQueue()).m89478bg(m89460Kg()).m89477bg(C7257zx.m89444bg().createThreadFactory(10, "computation")).m89488bg();
                    f15665WR = m89488bg;
                    m89488bg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f15665WR;
    }

    public static ExecutorService eqN() {
        if (f15663Kg == null) {
            synchronized (C7255ldr.class) {
                if (f15663Kg == null) {
                    C7241bg m89488bg = new C7241bg.C7243bg().m89481bg("log").m89491IL(10).m89487bg(4).m89486bg(20L).m89476bg(TimeUnit.SECONDS).m89479bg(new PriorityBlockingQueue()).m89478bg(m89460Kg()).m89477bg(C7257zx.m89444bg().createThreadFactory(10, "log")).m89488bg();
                    f15663Kg = m89488bg;
                    m89488bg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f15663Kg;
    }

    /* renamed from: iR */
    public static boolean m89447iR() {
        return eqN;
    }

    public static ScheduledExecutorService ldr() {
        if (f15664VB == null) {
            synchronized (C7255ldr.class) {
                if (f15664VB == null) {
                    f15664VB = Executors.newSingleThreadScheduledExecutor(C7257zx.m89444bg().createThreadFactory(5, "scheduled"));
                }
            }
        }
        return f15664VB;
    }

    /* renamed from: zx */
    public static ExecutorService m89446zx() {
        if (f15668eo == null) {
            synchronized (C7255ldr.class) {
                if (f15668eo == null) {
                    C7241bg m89488bg = new C7241bg.C7243bg().m89481bg("aidl").m89491IL(10).m89487bg(2).m89486bg(30L).m89476bg(TimeUnit.SECONDS).m89479bg(new PriorityBlockingQueue()).m89478bg(m89460Kg()).m89477bg(C7257zx.m89444bg().createThreadFactory(10, "aidl")).m89488bg();
                    f15668eo = m89488bg;
                    m89488bg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f15668eo;
    }

    /* renamed from: bX */
    public static void m89456bX(AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (f15663Kg == null) {
            eqN();
        }
        if (abstractRunnableC7227Kg == null || f15663Kg == null) {
            return;
        }
        f15663Kg.execute(abstractRunnableC7227Kg);
    }

    /* renamed from: bg */
    public static ExecutorService m89454bg(int i) {
        if (ldr == null) {
            synchronized (C7255ldr.class) {
                if (ldr == null) {
                    C7241bg m89488bg = new C7241bg.C7243bg().m89481bg("io").m89487bg(2).m89491IL(i).m89486bg(20L).m89476bg(TimeUnit.SECONDS).m89479bg(new LinkedBlockingQueue()).m89478bg(m89460Kg()).m89477bg(C7257zx.m89444bg().createThreadFactory(i, "io")).m89488bg();
                    ldr = m89488bg;
                    m89488bg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return ldr;
    }

    /* renamed from: bX */
    public static void m89455bX(AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        if (abstractRunnableC7227Kg != null) {
            abstractRunnableC7227Kg.setPriority(i);
        }
        eqN(abstractRunnableC7227Kg);
    }

    /* renamed from: bX */
    public static void m89457bX(int i) {
        f15666bX = i;
    }

    /* renamed from: IL */
    public static void m89462IL(AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (ldr == null) {
            m89458bX();
        }
        if (ldr != null) {
            ldr.execute(abstractRunnableC7227Kg);
        }
    }

    public static void eqN(AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (f15668eo == null) {
            m89446zx();
        }
        if (abstractRunnableC7227Kg == null || f15668eo == null) {
            return;
        }
        f15668eo.execute(abstractRunnableC7227Kg);
    }

    /* renamed from: zx */
    public static void m89445zx(AbstractRunnableC7227Kg abstractRunnableC7227Kg) {
        if (f15669iR == null) {
            m89463IL(5);
        }
        if (abstractRunnableC7227Kg == null || f15669iR == null) {
            return;
        }
        f15669iR.execute(abstractRunnableC7227Kg);
    }

    /* renamed from: IL */
    public static void m89461IL(AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        if (abstractRunnableC7227Kg != null) {
            abstractRunnableC7227Kg.setPriority(i);
        }
        m89456bX(abstractRunnableC7227Kg);
    }

    /* renamed from: bg */
    public static void m89452bg(AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        m89462IL(abstractRunnableC7227Kg);
    }

    /* renamed from: IL */
    public static ExecutorService m89463IL(int i) {
        if (f15669iR == null) {
            synchronized (C7255ldr.class) {
                if (f15669iR == null) {
                    C7241bg m89488bg = new C7241bg.C7243bg().m89481bg("ad").m89487bg(2).m89491IL(i).m89486bg(20L).m89476bg(TimeUnit.SECONDS).m89479bg(new LinkedBlockingQueue()).m89478bg(m89460Kg()).m89477bg(C7257zx.m89444bg().createThreadFactory(i, "ad")).m89488bg();
                    f15669iR = m89488bg;
                    m89488bg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f15669iR;
    }

    /* renamed from: bg */
    public static void m89451bg(AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i, int i2) {
        if (ldr == null) {
            m89454bg(i2);
        }
        if (abstractRunnableC7227Kg == null || ldr == null) {
            return;
        }
        abstractRunnableC7227Kg.setPriority(i);
        ldr.execute(abstractRunnableC7227Kg);
    }

    /* renamed from: bg */
    public static void m89449bg(boolean z) {
        eqN = z;
    }

    /* renamed from: bg */
    public static void m89450bg(InterfaceC7229bX interfaceC7229bX) {
        f15662IL = interfaceC7229bX;
    }
}
