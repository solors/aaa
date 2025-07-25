package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.util.p */
/* loaded from: classes4.dex */
public abstract class AbstractC15465p {

    /* renamed from: a */
    public static final ThreadPoolExecutor f30611a;

    /* renamed from: b */
    public static final Handler f30612b = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(32), new ThreadFactoryC15461n(), new RejectedExecutionHandlerC15463o());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f30611a = threadPoolExecutor;
    }
}
