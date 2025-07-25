package io.appmetrica.analytics.coreutils.internal.executors;

/* loaded from: classes9.dex */
public abstract class SafeRunnable implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            runSafety();
        } catch (Throwable unused) {
        }
    }

    public abstract void runSafety() throws Throwable;
}
