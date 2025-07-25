package com.taurusx.tax.p606j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.j.h */
/* loaded from: classes7.dex */
public class C28521h {

    /* renamed from: a */
    public static final Handler f73960a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final Handler f73961b;

    static {
        HandlerThread handlerThread = new HandlerThread(C28162a.f73047a.m23824a(new byte[]{49, 40, 48, 34, 115, 33, 50, 39, 55, 37, 54, 59}, new byte[]{83, 73}));
        handlerThread.start();
        f73961b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static void m38005a(Runnable runnable) {
        Handler handler = f73960a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: b */
    public static void m38003b(Runnable runnable, long j) {
        Handler handler = f73960a;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    /* renamed from: a */
    public static void m38004a(Runnable runnable, long j) {
        Handler handler = f73961b;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }
}
