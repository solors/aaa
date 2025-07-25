package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes9.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a */
    private volatile boolean f92340a;

    public InterruptionSafeThread() {
        this.f92340a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f92340a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f92340a = false;
        interrupt();
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f92340a = true;
    }

    public InterruptionSafeThread(@NonNull String str) {
        super(str);
        this.f92340a = true;
    }

    @VisibleForTesting(otherwise = 5)
    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
        this.f92340a = true;
    }
}
