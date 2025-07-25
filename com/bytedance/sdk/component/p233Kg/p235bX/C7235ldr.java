package com.bytedance.sdk.component.p233Kg.p235bX;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p233Kg.p235bX.p236bg.C7233bg;
import com.bytedance.sdk.component.utils.C7741PX;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.bytedance.sdk.component.Kg.bX.ldr */
/* loaded from: classes3.dex */
public class C7235ldr extends ThreadPoolExecutor {

    /* renamed from: IL */
    private int f15611IL;

    /* renamed from: Kg */
    private LinkedHashMap<String, C7233bg> f15612Kg;

    /* renamed from: bX */
    private int f15613bX;

    /* renamed from: bg */
    private final String f15614bg;
    private int eqN;

    /* renamed from: iR */
    private boolean f15615iR;
    private int ldr;

    /* renamed from: zx */
    private int f15616zx;

    /* renamed from: com.bytedance.sdk.component.Kg.bX.ldr$bg */
    /* loaded from: classes3.dex */
    public static class C7239bg {

        /* renamed from: bg */
        private String f15628bg = Reporting.EventType.CACHE;

        /* renamed from: IL */
        private int f15622IL = 4;

        /* renamed from: bX */
        private int f15627bX = 100;
        private int eqN = 0;

        /* renamed from: zx */
        private long f15631zx = 30000;
        private boolean ldr = false;

        /* renamed from: iR */
        private TimeUnit f15630iR = TimeUnit.MILLISECONDS;

        /* renamed from: Kg */
        private int f15623Kg = -1;

        /* renamed from: WR */
        private int f15626WR = 20;

        /* renamed from: eo */
        private boolean f15629eo = false;

        /* renamed from: VB */
        private BlockingQueue<Runnable> f15625VB = new PriorityBlockingQueue();

        /* renamed from: PX */
        private ThreadFactory f15624PX = null;

        /* renamed from: IL */
        public C7239bg m89520IL(int i) {
            this.f15627bX = i;
            return this;
        }

        /* renamed from: bX */
        public C7239bg m89513bX(int i) {
            this.eqN = i;
            return this;
        }

        /* renamed from: bg */
        public C7239bg m89507bg(String str) {
            this.f15628bg = str;
            return this;
        }

        public C7239bg eqN(int i) {
            this.f15626WR = i;
            return this;
        }

        /* renamed from: zx */
        public C7239bg m89503zx(int i) {
            this.f15623Kg = i;
            return this;
        }

        /* renamed from: IL */
        public C7239bg m89518IL(boolean z) {
            this.f15629eo = z;
            return this;
        }

        /* renamed from: bg */
        public C7239bg m89510bg(int i) {
            this.f15622IL = i;
            return this;
        }

        /* renamed from: bg */
        public C7239bg m89509bg(long j) {
            this.f15631zx = j;
            return this;
        }

        /* renamed from: bg */
        public C7239bg m89506bg(boolean z) {
            this.ldr = z;
            return this;
        }

        /* renamed from: bg */
        public C7235ldr m89511bg() {
            if (this.f15624PX == null) {
                this.f15624PX = new ThreadFactoryC7234eqN(this.f15628bg);
            }
            if (this.f15622IL < 0) {
                this.f15622IL = 8;
            }
            if (this.f15622IL == 0) {
                this.f15625VB = new SynchronousQueue();
            }
            if (this.f15625VB == null) {
                this.f15625VB = new LinkedBlockingQueue();
            }
            if (this.f15627bX > 100) {
                this.f15627bX = 100;
            }
            int i = this.f15627bX;
            int i2 = this.f15622IL;
            if (i < i2) {
                this.f15627bX = i2;
            }
            if (this.f15626WR < 0) {
                this.f15626WR = 20;
            }
            if (this.f15626WR > 100) {
                this.f15626WR = 100;
            }
            return new C7235ldr(this);
        }
    }

    private void eqN() {
        try {
            if (this.eqN != 0 && getCorePoolSize() < this.f15616zx) {
                int size = getQueue().size();
                if (getActiveCount() >= this.eqN && size >= this.ldr) {
                    setCorePoolSize(this.f15616zx);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: iR */
    private boolean m89522iR() {
        if (this.f15611IL > 0) {
            return true;
        }
        return false;
    }

    private void ldr() {
        if (getCompletedTaskCount() > this.f15611IL) {
            InterfaceC7240zx m89539bg = C7231bX.m89539bg();
            if (m89539bg != null) {
                m89539bg.mo82564bg(this);
            }
            this.f15611IL = -1;
        }
    }

    /* renamed from: zx */
    private void m89521zx() {
        try {
            if (this.eqN != 0 && getCorePoolSize() > this.eqN && getQueue().size() == 0) {
                setCorePoolSize(this.eqN);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: IL */
    public String m89528IL() {
        return this.f15614bg;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof AbstractRunnableC7230IL;
        if (z) {
            ((AbstractRunnableC7230IL) runnable).m89548bX(SystemClock.elapsedRealtime());
            try {
                if (m89522iR() && this.f15612Kg != null) {
                    m89525bg((AbstractRunnableC7230IL) runnable);
                    ldr();
                }
            } catch (Exception e) {
                C7741PX.m87873bg("PAGThreadPoolExecutor", e.getMessage());
            }
        }
        super.afterExecute(runnable, th);
        if (z) {
            AbstractRunnableC7230IL abstractRunnableC7230IL = (AbstractRunnableC7230IL) runnable;
            abstractRunnableC7230IL.m89552IL();
            abstractRunnableC7230IL.m89547bg();
            abstractRunnableC7230IL.m89549bX();
            abstractRunnableC7230IL.eqN();
            abstractRunnableC7230IL.m89542zx();
        }
        m89521zx();
    }

    /* renamed from: bX */
    public boolean m89527bX() {
        return this.f15615iR;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof AbstractRunnableC7230IL) {
            ((AbstractRunnableC7230IL) runnable).m89551IL(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    /* renamed from: bg */
    public void m89524bg(C7239bg c7239bg) {
        try {
            if (c7239bg.f15622IL >= 0 && this.eqN != c7239bg.f15622IL) {
                int i = c7239bg.f15622IL;
                this.eqN = i;
                setCorePoolSize(i);
            }
            this.f15616zx = c7239bg.f15627bX;
            this.ldr = c7239bg.eqN;
            allowCoreThreadTimeOut(c7239bg.ldr);
            this.f15611IL = c7239bg.f15623Kg;
            this.f15613bX = c7239bg.f15626WR;
            this.f15615iR = c7239bg.f15629eo;
        } catch (Throwable th) {
            C7741PX.m87873bg("PAGThreadPoolExecutor", th.getMessage());
        }
        String unused = c7239bg.f15628bg;
        int unused2 = c7239bg.f15622IL;
        int unused3 = c7239bg.f15627bX;
        long unused4 = c7239bg.f15631zx;
        int unused5 = c7239bg.eqN;
        int unused6 = c7239bg.f15626WR;
        boolean unused7 = c7239bg.f15629eo;
        BlockingQueue unused8 = c7239bg.f15625VB;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        InterfaceC7232bg m89541IL;
        if (!(runnable instanceof AbstractRunnableC7230IL)) {
            runnable = new AbstractRunnableC7230IL("unknown", runnable) { // from class: com.bytedance.sdk.component.Kg.bX.ldr.3
                @Override // java.lang.Runnable
                public void run() {
                    Runnable m89550Kg = m89550Kg();
                    if (m89550Kg != null) {
                        m89550Kg.run();
                    }
                }
            };
        }
        if (!Reporting.EventType.CACHE.equals(this.f15614bg)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(ThreadFactoryC7234eqN.m89530bg(this.f15614bg)) && (m89541IL = C7231bX.m89541IL()) != null) {
                m89541IL.mo82565bg(this, (AbstractRunnableC7230IL) runnable);
            }
        }
        ((AbstractRunnableC7230IL) runnable).m89545bg(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            eqN();
        } catch (Throwable th) {
            m89523bg(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.f15614bg)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.f15614bg)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof AbstractRunnableC7230IL) {
            AbstractRunnableC7230IL abstractRunnableC7230IL = (AbstractRunnableC7230IL) runnable;
            i = abstractRunnableC7230IL.m89547bg();
            str = abstractRunnableC7230IL.m89552IL();
        } else {
            i = 6;
            str = "";
        }
        if (i == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new AbstractRunnableC7230IL(i, str) { // from class: com.bytedance.sdk.component.Kg.bX.ldr.2
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    private C7235ldr(C7239bg c7239bg) {
        super(c7239bg.f15622IL, Integer.MAX_VALUE, c7239bg.f15631zx, c7239bg.f15630iR, c7239bg.f15625VB, c7239bg.f15624PX);
        this.f15615iR = false;
        String unused = c7239bg.f15628bg;
        int unused2 = c7239bg.f15622IL;
        int unused3 = c7239bg.f15627bX;
        long unused4 = c7239bg.f15631zx;
        int unused5 = c7239bg.eqN;
        int unused6 = c7239bg.f15626WR;
        boolean unused7 = c7239bg.f15629eo;
        BlockingQueue unused8 = c7239bg.f15625VB;
        this.f15614bg = c7239bg.f15628bg;
        this.eqN = c7239bg.f15622IL;
        this.f15616zx = c7239bg.f15627bX;
        this.ldr = c7239bg.eqN;
        allowCoreThreadTimeOut(c7239bg.ldr);
        this.f15611IL = c7239bg.f15623Kg;
        this.f15613bX = c7239bg.f15626WR;
        this.f15615iR = c7239bg.f15629eo;
        if (m89522iR()) {
            final int i = this.f15613bX + 4;
            this.f15612Kg = new LinkedHashMap<String, C7233bg>(i, 0.75f, true) { // from class: com.bytedance.sdk.component.Kg.bX.ldr.1
                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(Map.Entry<String, C7233bg> entry) {
                    if (size() > i) {
                        return true;
                    }
                    return false;
                }
            };
        }
    }

    /* renamed from: bg */
    private void m89523bg(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler m89540bX = C7231bX.m89540bX();
                if (m89540bX != null) {
                    m89540bX.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable th2) {
            C7741PX.m87871bg("PAGThreadPoolExecutor", "try exc failed", th2);
        }
    }

    /* renamed from: bg */
    private void m89525bg(AbstractRunnableC7230IL abstractRunnableC7230IL) {
        LinkedHashMap<String, C7233bg> linkedHashMap = this.f15612Kg;
        if (linkedHashMap != null) {
            C7233bg c7233bg = linkedHashMap.get(abstractRunnableC7230IL.m89552IL());
            if (c7233bg == null) {
                synchronized (linkedHashMap) {
                    c7233bg = linkedHashMap.get(abstractRunnableC7230IL.m89552IL());
                    if (c7233bg == null) {
                        c7233bg = new C7233bg();
                        linkedHashMap.put(abstractRunnableC7230IL.m89552IL(), c7233bg);
                    }
                }
            }
            c7233bg.m89532bg(abstractRunnableC7230IL);
        }
    }

    /* renamed from: bg */
    public LinkedHashMap<String, C7233bg> m89526bg() {
        return this.f15612Kg;
    }
}
