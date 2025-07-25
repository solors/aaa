package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C20417d;

/* renamed from: com.ironsource.is */
/* loaded from: classes6.dex */
public class C20115is extends Thread {

    /* renamed from: b */
    private static C20115is f50637b;

    /* renamed from: a */
    private HandlerThreadC20116a f50638a;

    /* renamed from: com.ironsource.is$a */
    /* loaded from: classes6.dex */
    private class HandlerThreadC20116a extends HandlerThread {

        /* renamed from: a */
        private Handler f50639a;

        HandlerThreadC20116a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C20417d());
        }

        /* renamed from: a */
        Handler m57939a() {
            return this.f50639a;
        }

        /* renamed from: b */
        void m57938b() {
            this.f50639a = new Handler(getLooper());
        }
    }

    private C20115is() {
        HandlerThreadC20116a handlerThreadC20116a = new HandlerThreadC20116a(getClass().getSimpleName());
        this.f50638a = handlerThreadC20116a;
        handlerThreadC20116a.start();
        this.f50638a.m57938b();
    }

    /* renamed from: a */
    public static synchronized C20115is m57941a() {
        C20115is c20115is;
        synchronized (C20115is.class) {
            if (f50637b == null) {
                f50637b = new C20115is();
            }
            c20115is = f50637b;
        }
        return c20115is;
    }

    /* renamed from: a */
    public synchronized void m57940a(Runnable runnable) {
        HandlerThreadC20116a handlerThreadC20116a = this.f50638a;
        if (handlerThreadC20116a == null) {
            return;
        }
        Handler m57939a = handlerThreadC20116a.m57939a();
        if (m57939a != null) {
            m57939a.post(runnable);
        }
    }
}
