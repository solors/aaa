package p977t2;

import com.helpshift.log.HSLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: t2.e */
/* loaded from: classes5.dex */
public class NotifyingRunnable implements Runnable {

    /* renamed from: b */
    private final Runnable f116477b;

    /* renamed from: c */
    private final Object f116478c = new Object();

    /* renamed from: d */
    private AtomicBoolean f116479d = new AtomicBoolean(false);

    public NotifyingRunnable(Runnable runnable) {
        this.f116477b = runnable;
    }

    /* renamed from: a */
    public void m3276a() {
        synchronized (this.f116478c) {
            while (!this.f116479d.get()) {
                try {
                    this.f116478c.wait();
                } catch (InterruptedException e) {
                    HSLogger.m65440d("NotifyingRunnable", "Exception in NotifyingRunnable", e);
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f116478c) {
            this.f116477b.run();
            this.f116479d.set(true);
            this.f116478c.notifyAll();
        }
    }
}
