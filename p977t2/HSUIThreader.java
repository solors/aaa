package p977t2;

import android.os.Handler;
import android.os.Looper;
import p752k3.SafeWrappedRunnable;

/* renamed from: t2.c */
/* loaded from: classes5.dex */
public class HSUIThreader implements HSThreader {
    @Override // p977t2.HSThreader
    public void submit(Runnable runnable) {
        SafeWrappedRunnable safeWrappedRunnable = new SafeWrappedRunnable(runnable);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            safeWrappedRunnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(safeWrappedRunnable);
        }
    }
}
