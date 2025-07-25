package com.p552ot.pubsub.p557e;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* renamed from: com.ot.pubsub.e.a */
/* loaded from: classes7.dex */
public class C26532a {

    /* renamed from: a */
    private static final String f69438a = "BroadcastExecutor";

    /* renamed from: b */
    private static String f69439b = "pub_broadcast";

    /* renamed from: c */
    private static Handler f69440c;

    /* renamed from: a */
    public static void m41293a() {
        if (f69440c == null) {
            synchronized (C26532a.class) {
                if (f69440c == null) {
                    Log.d(f69438a, "initIfNeeded : " + Thread.currentThread().getId());
                    HandlerThread handlerThread = new HandlerThread(f69439b);
                    handlerThread.start();
                    f69440c = new Handler(handlerThread.getLooper());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m41292a(Runnable runnable) {
        Log.d(f69438a, "BroadcastExecutor : " + Thread.currentThread().getId());
        m41293a();
        f69440c.post(runnable);
    }
}
