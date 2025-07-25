package com.meevii.abtest.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public class AbThreadUtil {
    private static Handler sHandler;
    private static Executor sSingleExecutor;

    public static Executor getSingleExecutor() {
        if (sSingleExecutor == null) {
            sSingleExecutor = Executors.newSingleThreadExecutor();
        }
        return sSingleExecutor;
    }

    public static void runOnSingleThread(Runnable runnable) {
        getSingleExecutor().execute(runnable);
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        if (sHandler == null) {
            sHandler = new Handler(Looper.getMainLooper());
        }
        sHandler.post(runnable);
    }
}
