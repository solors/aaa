package p1020w3;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: w3.b */
/* loaded from: classes6.dex */
public class EventWork {

    /* renamed from: a */
    private static Handler f116996a;

    /* renamed from: a */
    private static void m2362a() {
        HandlerThread handlerThread = new HandlerThread("analyze-work");
        handlerThread.start();
        f116996a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static void m2361b(Runnable runnable) {
        if (f116996a == null) {
            m2362a();
        }
        f116996a.post(runnable);
    }
}
