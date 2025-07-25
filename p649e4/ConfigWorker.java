package p649e4;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: e4.h */
/* loaded from: classes6.dex */
public class ConfigWorker {

    /* renamed from: a */
    private static Handler f89756a;

    /* renamed from: a */
    private static void m25502a() {
        if (f89756a != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("learnings_grt_config_worker");
        handlerThread.start();
        f89756a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static void m25501b(Runnable runnable) {
        if (f89756a == null) {
            m25502a();
        }
        f89756a.post(runnable);
    }
}
