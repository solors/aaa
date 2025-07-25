package com.learnings.unity.nativeutil.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public class ExecutorUtils {
    private static ExecutorService executors;

    public static void runExecutorService(Runnable runnable) {
        if (executors == null) {
            executors = Executors.newSingleThreadExecutor();
        }
        executors.submit(runnable);
    }
}
