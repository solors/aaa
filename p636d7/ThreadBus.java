package p636d7;

import android.os.Handler;
import android.os.Looper;

/* renamed from: d7.l */
/* loaded from: classes5.dex */
public class ThreadBus {

    /* renamed from: a */
    private static final Handler f89544a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m25680a(Runnable runnable) {
        f89544a.post(runnable);
    }
}
