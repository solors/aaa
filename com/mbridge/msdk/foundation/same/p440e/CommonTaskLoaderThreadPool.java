package com.mbridge.msdk.foundation.same.p440e;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.e.c */
/* loaded from: classes6.dex */
public final class CommonTaskLoaderThreadPool {

    /* renamed from: a */
    private static volatile ThreadPoolExecutor f56565a;

    /* renamed from: a */
    private static int m52229a(int i, String str) {
        try {
            int m51813a = SameOptimizedController.m51814a().m51813a(str, i);
            return m51813a <= 0 ? i : m51813a;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CommonTaskLoaderThreadPool", e.getMessage());
                return i;
            }
            return i;
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m52230a() {
        if (f56565a == null) {
            int m52229a = m52229a(10, "c_t_l_t_p_c");
            int m52229a2 = m52229a(50, "c_t_l_t_p_m");
            int m52229a3 = m52229a(5, "c_t_l_t_p_t");
            int i = m52229a2 < m52229a ? m52229a : m52229a2;
            try {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51827a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + m52229a + " max " + i + " timeout " + m52229a3);
                }
                long j = m52229a3;
                if (j <= 0) {
                    j = 1;
                }
                f56565a = new ThreadPoolExecutor(m52229a, i, j, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        thread.setName("mb-task-loader-thread");
                        return thread;
                    }
                }, new ThreadPoolExecutor.DiscardPolicy());
                f56565a.allowCoreThreadTimeOut(true);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e);
                }
            }
        }
        if (f56565a == null) {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f56565a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-task-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            f56565a.allowCoreThreadTimeOut(true);
        }
        return f56565a;
    }
}
