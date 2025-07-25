package com.bytedance.sdk.component.p275zx.p283bg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.zx.bg.bX */
/* loaded from: classes3.dex */
public class C7829bX {

    /* renamed from: bg */
    private static final TimeUnit f17102bg = TimeUnit.SECONDS;

    /* renamed from: bg */
    public static ExecutorService m87579bg() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, f17102bg, new LinkedBlockingQueue(), new ThreadFactoryC7830bg("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
