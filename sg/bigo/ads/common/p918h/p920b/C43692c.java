package sg.bigo.ads.common.p918h.p920b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.p926n.ThreadFactoryC43725c;

/* renamed from: sg.bigo.ads.common.h.b.c */
/* loaded from: classes10.dex */
class C43692c extends ThreadPoolExecutor {

    /* renamed from: a */
    private static C43692c f114382a;

    private C43692c(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(5, 8, 3000L, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static synchronized C43692c m5187a(boolean z) {
        C43692c c43692c;
        synchronized (C43692c.class) {
            if (f114382a == null) {
                synchronized (C43692c.class) {
                    if (f114382a == null) {
                        m5186b(z);
                    }
                }
            }
            c43692c = f114382a;
        }
        return c43692c;
    }

    /* renamed from: b */
    private static synchronized void m5186b(boolean z) {
        synchronized (C43692c.class) {
            f114382a = new C43692c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC43725c("Download", z), new ThreadPoolExecutor.AbortPolicy());
        }
    }
}
