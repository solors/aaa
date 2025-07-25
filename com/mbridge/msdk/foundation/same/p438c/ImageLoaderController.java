package com.mbridge.msdk.foundation.same.p438c;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.c.f */
/* loaded from: classes6.dex */
public final class ImageLoaderController {

    /* renamed from: a */
    private static ThreadPoolExecutor f56547a;

    /* renamed from: a */
    public static ThreadPoolExecutor m52244a() {
        if (f56547a == null) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            f56547a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.c.f.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-image-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        f56547a.allowCoreThreadTimeOut(true);
        return f56547a;
    }
}
