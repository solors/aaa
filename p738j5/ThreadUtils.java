package p738j5;

import android.os.Handler;
import android.os.Looper;

/* renamed from: j5.g */
/* loaded from: classes6.dex */
public class ThreadUtils {

    /* renamed from: a */
    private static final Handler f98455a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m18526a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f98455a.post(runnable);
        }
    }
}
