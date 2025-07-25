package p694h4;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: h4.h */
/* loaded from: classes6.dex */
public class EventWorker {

    /* renamed from: a */
    private static Handler f91330a;

    /* renamed from: a */
    private static void m23708a() {
        if (f91330a != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("learnings_grt_event_worker");
        handlerThread.start();
        f91330a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static void m23707b(Runnable runnable) {
        if (f91330a == null) {
            m23708a();
        }
        f91330a.post(runnable);
    }
}
