package com.bytedance.sdk.component.p233Kg;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C7741PX;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.component.Kg.bg */
/* loaded from: classes3.dex */
public class C7241bg extends ThreadPoolExecutor {

    /* renamed from: bg */
    private String f15632bg;

    /* renamed from: com.bytedance.sdk.component.Kg.bg$bg */
    /* loaded from: classes3.dex */
    public static class C7243bg {

        /* renamed from: Kg */
        private RejectedExecutionHandler f15636Kg;

        /* renamed from: bg */
        private String f15639bg = "io";

        /* renamed from: IL */
        private int f15635IL = 1;

        /* renamed from: bX */
        private long f15638bX = 30;
        private TimeUnit eqN = TimeUnit.SECONDS;

        /* renamed from: zx */
        private int f15641zx = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> ldr = null;

        /* renamed from: iR */
        private ThreadFactory f15640iR = null;

        /* renamed from: WR */
        private int f15637WR = 5;

        /* renamed from: IL */
        public C7243bg m89491IL(int i) {
            this.f15637WR = i;
            return this;
        }

        /* renamed from: bg */
        public C7243bg m89481bg(String str) {
            this.f15639bg = str;
            return this;
        }

        /* renamed from: bg */
        public C7243bg m89487bg(int i) {
            this.f15635IL = i;
            return this;
        }

        /* renamed from: bg */
        public C7243bg m89486bg(long j) {
            this.f15638bX = j;
            return this;
        }

        /* renamed from: bg */
        public C7243bg m89476bg(TimeUnit timeUnit) {
            this.eqN = timeUnit;
            return this;
        }

        /* renamed from: bg */
        public C7243bg m89479bg(BlockingQueue<Runnable> blockingQueue) {
            this.ldr = blockingQueue;
            return this;
        }

        /* renamed from: bg */
        public C7243bg m89477bg(ThreadFactory threadFactory) {
            this.f15640iR = threadFactory;
            return this;
        }

        /* renamed from: bg */
        public C7243bg m89478bg(RejectedExecutionHandler rejectedExecutionHandler) {
            this.f15636Kg = rejectedExecutionHandler;
            return this;
        }

        /* renamed from: bg */
        public C7241bg m89488bg() {
            if (this.f15640iR == null) {
                this.f15640iR = C7257zx.m89444bg().createThreadFactory(this.f15637WR, this.f15639bg);
            }
            if (this.f15636Kg == null) {
                this.f15636Kg = C7255ldr.m89460Kg();
            }
            if (this.ldr == null) {
                this.ldr = new LinkedBlockingQueue();
            }
            return new C7241bg(this.f15639bg, this.f15635IL, this.f15641zx, this.f15638bX, this.eqN, this.ldr, this.f15640iR, this.f15636Kg);
        }
    }

    public C7241bg(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f15632bg = str;
    }

    /* renamed from: bg */
    private void m89500bg(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            m89499bg(runnable, e);
        } catch (Throwable th) {
            m89498bg(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (C7255ldr.m89447iR() && !TextUtils.isEmpty(this.f15632bg) && (queue = getQueue()) != null) {
            String str = this.f15632bg;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m89497bg(queue, 2);
                    return;
                case 1:
                    m89497bg(queue, 4);
                    return;
                case 2:
                    m89497bg(queue, 2);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof AbstractRunnableC7227Kg) {
            m89500bg(new RunnableC7225IL((AbstractRunnableC7227Kg) runnable, this));
        } else {
            m89500bg(new RunnableC7225IL(new AbstractRunnableC7227Kg("unknown") { // from class: com.bytedance.sdk.component.Kg.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (C7255ldr.m89447iR() && !TextUtils.isEmpty(this.f15632bg) && (queue = getQueue()) != null) {
            String str = this.f15632bg;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m89496bg(queue, C7255ldr.f15667bg + 2, getCorePoolSize() * 2);
                    return;
                case 1:
                    m89496bg(queue, 8, 8);
                    return;
                case 2:
                    m89496bg(queue, 5, 5);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if (!"io".equals(this.f15632bg) && !"aidl".equals(this.f15632bg)) {
            super.shutdown();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if (!"io".equals(this.f15632bg) && !"aidl".equals(this.f15632bg)) {
            return super.shutdownNow();
        }
        return Collections.emptyList();
    }

    /* renamed from: bg */
    private void m89499bg(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        m89498bg(runnable, (Throwable) outOfMemoryError);
    }

    /* renamed from: bg */
    private void m89498bg(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                C7741PX.m87871bg("", "try exc failed", th2);
            }
        }
    }

    /* renamed from: bg */
    private void m89497bg(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: bg */
    private void m89496bg(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() < i2) {
            return;
        }
        try {
            setCorePoolSize(i);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: bg */
    public String m89501bg() {
        return this.f15632bg;
    }
}
