package p030b7;

import p636d7.PushLogUtil;

/* renamed from: b7.a */
/* loaded from: classes5.dex */
public class ExceptionHandlingRunnable implements Runnable {

    /* renamed from: b */
    private final Runnable f1602b;

    public ExceptionHandlingRunnable(Runnable runnable) {
        this.f1602b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f1602b;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                PushLogUtil.m25696c(th);
            }
        }
    }
}
