package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
class SafeLoggingExecutor implements Executor {

    /* renamed from: b */
    private final Executor f31054b;

    /* loaded from: classes4.dex */
    static class SafeLoggingRunnable implements Runnable {

        /* renamed from: b */
        private final Runnable f31055b;

        SafeLoggingRunnable(Runnable runnable) {
            this.f31055b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f31055b.run();
            } catch (Exception e) {
                Logging.m76287e("Executor", "Background execution failure.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SafeLoggingExecutor(Executor executor) {
        this.f31054b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31054b.execute(new SafeLoggingRunnable(runnable));
    }
}
