package com.p552ot.pubsub.p559g;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.ot.pubsub.g.a */
/* loaded from: classes7.dex */
public class C26536a {

    /* renamed from: a */
    private static final String f69449a = "DbExecutor";

    /* renamed from: b */
    private static String f69450b = "ot_pubsub_db";

    /* renamed from: c */
    private static Handler f69451c;

    /* renamed from: a */
    public static void m41289a() {
        if (f69451c == null) {
            synchronized (C26536a.class) {
                if (f69451c == null) {
                    HandlerThread handlerThread = new HandlerThread(f69450b);
                    handlerThread.start();
                    f69451c = new Handler(handlerThread.getLooper());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m41288a(Runnable runnable) {
        m41289a();
        f69451c.post(runnable);
    }
}
