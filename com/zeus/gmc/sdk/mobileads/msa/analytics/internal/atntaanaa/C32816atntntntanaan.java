package com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntaanaa;

import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntaanaa.atntntntanaan */
/* loaded from: classes8.dex */
public class C32816atntntntanaan {
    private static final String atnntnannta = "TaskRunner";
    private static int atntaanaa = Runtime.getRuntime().availableProcessors();
    private static ThreadPoolExecutor atntntntanaan;

    static {
        int i = atntaanaa;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        atntntntanaan = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private C32816atntntntanaan() {
    }

    public static void atnntnannta(Runnable runnable) {
        try {
            atntntntanaan.execute(runnable);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "Exception:", e);
        }
    }
}
