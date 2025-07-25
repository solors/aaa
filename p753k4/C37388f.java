package p753k4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ThreadUtils.java */
/* renamed from: k4.f */
/* loaded from: classes6.dex */
public class C37388f {

    /* renamed from: a */
    private static final Handler f98671a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static boolean m18209a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m18208b(Runnable runnable) {
        if (m18209a()) {
            runnable.run();
        } else {
            f98671a.post(runnable);
        }
    }
}
