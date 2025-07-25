package com.maticoo.sdk.utils;

import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class WorkExecutor {
    private static final ThreadPoolExecutor POOL;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 10, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue(128), new DefaultThreadFactory("maticoo-work"), new RejectedExecutionHandler() { // from class: com.maticoo.sdk.utils.WorkExecutor.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                DeveloperLog.LogD("execute rejected");
            }
        });
        POOL = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private WorkExecutor() {
    }

    public static void execute(Runnable runnable) {
        POOL.execute(runnable);
    }

    public static void remove(Runnable runnable) {
        POOL.remove(runnable);
    }
}
