package com.p552ot.pubsub.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ot.pubsub.util.e */
/* loaded from: classes7.dex */
public class C26580e {

    /* renamed from: a */
    private static ThreadPoolExecutor f69723a;

    /* renamed from: b */
    private static int f69724b = Runtime.getRuntime().availableProcessors() + 1;

    static {
        int i = f69724b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f69723a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static void m41105a(Runnable runnable) {
        try {
            f69723a.execute(runnable);
        } catch (Throwable unused) {
        }
    }
}
