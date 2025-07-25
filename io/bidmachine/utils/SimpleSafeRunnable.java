package io.bidmachine.utils;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface SimpleSafeRunnable extends SafeRunnable {
    @Override // io.bidmachine.utils.SafeRunnable
    /* synthetic */ void onRun() throws Throwable;

    @Override // io.bidmachine.utils.SafeRunnable, java.lang.Runnable
    @CallSuper
    /* bridge */ /* synthetic */ default void run() {
        super.run();
    }

    @Override // io.bidmachine.utils.SafeRunnable
    default void onThrows(@NonNull Throwable th) throws Throwable {
    }
}
