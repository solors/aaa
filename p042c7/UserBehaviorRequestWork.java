package p042c7;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: c7.f */
/* loaded from: classes5.dex */
public class UserBehaviorRequestWork {

    /* renamed from: a */
    private static Handler f1912a;

    /* renamed from: a */
    private static void m103583a() {
        if (f1912a != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("meevii_push_user_behavior_work");
        handlerThread.start();
        f1912a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static void m103582b(Runnable runnable) {
        if (f1912a == null) {
            m103583a();
        }
        f1912a.post(runnable);
    }
}
