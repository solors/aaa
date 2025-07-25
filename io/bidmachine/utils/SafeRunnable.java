package io.bidmachine.utils;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface SafeRunnable extends Runnable {
    void onRun() throws Throwable;

    void onThrows(@NonNull Throwable th) throws Throwable;

    @Override // java.lang.Runnable
    @CallSuper
    default void run() {
        try {
            onRun();
        } catch (Throwable th) {
            try {
                onThrows(th);
            } catch (Throwable unused) {
            }
        }
    }
}
