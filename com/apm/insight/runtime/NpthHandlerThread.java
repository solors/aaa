package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.apm.insight.runtime.n */
/* loaded from: classes2.dex */
public class NpthHandlerThread {

    /* renamed from: a */
    private static volatile ThreadWithHandler f4082a;

    /* renamed from: b */
    private static volatile Handler f4083b;

    /* renamed from: a */
    public static ThreadWithHandler m101339a() {
        if (f4082a == null) {
            m101338b();
        }
        return f4082a;
    }

    /* renamed from: b */
    private static HandlerThread m101338b() {
        if (f4082a == null) {
            synchronized (NpthHandlerThread.class) {
                if (f4082a == null) {
                    ThreadWithHandler threadWithHandler = new ThreadWithHandler("default_npth_thread");
                    f4082a = threadWithHandler;
                    threadWithHandler.m101307b();
                }
            }
        }
        return f4082a.m101303c();
    }
}
