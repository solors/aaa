package p752k3;

import com.helpshift.log.HSLogger;

/* renamed from: k3.j */
/* loaded from: classes5.dex */
public class SafeWrappedRunnable implements Runnable {

    /* renamed from: b */
    private final Runnable f98661b;

    public SafeWrappedRunnable(Runnable runnable) {
        this.f98661b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f98661b.run();
        } catch (Exception e) {
            HSLogger.m65438e("SfeWrpRnnble", "Error running operation", e);
        }
    }
}
