package p713i6;

import android.util.Log;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: i6.c */
/* loaded from: classes6.dex */
public class SpBlockClear {

    /* renamed from: a */
    private static boolean f91936a = false;

    /* renamed from: b */
    private static ConcurrentLinkedQueue<Runnable> f91937b;

    /* renamed from: a */
    public static void m23104a(String str) {
        if (!f91936a) {
            m23103b();
            f91936a = true;
        }
        Log.d("FixSpANR", "clearSpBlock " + str);
        ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue = f91937b;
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.clear();
        }
    }

    /* renamed from: b */
    private static void m23103b() {
        Log.d("FixSpANR", "getPendingWorkFinishers");
        try {
            Field declaredField = Class.forName("android.app.QueuedWork").getDeclaredField("sPendingWorkFinishers");
            declaredField.setAccessible(true);
            f91937b = (ConcurrentLinkedQueue) declaredField.get(null);
            Log.d("FixSpANR", "getPendingWorkFinishers success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
