package io.bidmachine.rendering.internal;

import androidx.annotation.CallSuper;
import io.bidmachine.rendering.utils.SafeRunnable;

/* renamed from: io.bidmachine.rendering.internal.j */
/* loaded from: classes9.dex */
public interface InterfaceC37036j extends SafeRunnable {
    @Override // io.bidmachine.rendering.utils.SafeRunnable
    /* synthetic */ void onRun();

    @Override // io.bidmachine.rendering.utils.SafeRunnable
    default void onThrows(Throwable th) {
        AbstractC37037k.m19161b(th);
    }

    @Override // io.bidmachine.rendering.utils.SafeRunnable, java.lang.Runnable
    @CallSuper
    /* bridge */ /* synthetic */ default void run() {
        super.run();
    }
}
