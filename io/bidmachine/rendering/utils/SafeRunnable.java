package io.bidmachine.rendering.utils;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface SafeRunnable extends Runnable {
    void onRun();

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

    default void onThrows(@NonNull Throwable th) {
    }
}
