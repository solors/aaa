package p030b7;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: b7.b */
/* loaded from: classes5.dex */
public class PushWork {

    /* renamed from: a */
    private static Handler f1603a;

    /* renamed from: a */
    private static void m103898a() {
        if (f1603a != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("meevii_push_work");
        handlerThread.start();
        f1603a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static void m103897b(Runnable runnable) {
        if (f1603a == null) {
            m103898a();
        }
        f1603a.post(new ExceptionHandlingRunnable(runnable));
    }
}
