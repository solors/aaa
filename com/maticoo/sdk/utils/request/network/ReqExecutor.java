package com.maticoo.sdk.utils.request.network;

import com.maticoo.sdk.utils.DefaultThreadFactory;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
class ReqExecutor {
    private static final int CPU_COUNT;
    static int count;
    private static ThreadPoolExecutor mPoolExecutor;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(2, Math.min(availableProcessors - 1, 4)), (availableProcessors * 2) + 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new DefaultThreadFactory("maticoo-req"));
        mPoolExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        mPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.maticoo.sdk.utils.request.network.ReqExecutor.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                DeveloperLog.LogD("ReqExecutor", "execute rejected");
            }
        });
        count = 0;
    }

    ReqExecutor() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void execute(Runnable runnable) {
        mPoolExecutor.execute(runnable);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ReqExecutor execute count=");
        int i = count + 1;
        count = i;
        sb2.append(i);
        DeveloperLog.LogD(sb2.toString());
    }
}
