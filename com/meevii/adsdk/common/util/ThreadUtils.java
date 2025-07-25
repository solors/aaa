package com.meevii.adsdk.common.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public class ThreadUtils {
    private static ExecutorService sExecutors;
    private static final Handler sHandler = new Handler(Looper.getMainLooper());

    private static boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static void removeUiThreadCallbacks(Runnable runnable) {
        sHandler.removeCallbacks(runnable);
    }

    public static void runOnSingleThread(Runnable runnable) {
        if (sExecutors == null) {
            sExecutors = Executors.newSingleThreadExecutor();
        }
        sExecutors.execute(runnable);
    }

    public static void runOnUiThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            sHandler.post(runnable);
        }
    }

    public static void runOnUiThreadDelay(Runnable runnable, long j) {
        removeUiThreadCallbacks(runnable);
        sHandler.postDelayed(runnable, j);
    }
}
