package com.learnings.unity.analytics;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes6.dex */
public class EventWorker {
    private static Handler sHandler;

    private static void init() {
        HandlerThread handlerThread = new HandlerThread("analyze-unity-work");
        handlerThread.start();
        sHandler = new Handler(handlerThread.getLooper());
    }

    public static void run(Runnable runnable) {
        if (sHandler == null) {
            init();
        }
        sHandler.post(runnable);
    }
}
