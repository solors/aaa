package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.i0 */
/* loaded from: classes9.dex */
class TaskExecutorImpl implements TaskExecutor {
    private static final int CORE_POOL_SIZE = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
    @NonNull
    @VisibleForTesting
    final ScheduledExecutorService executorService;

    public TaskExecutorImpl() {
        this(Executors.newScheduledThreadPool(CORE_POOL_SIZE));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.TaskExecutor
    public boolean execute(@NonNull Runnable runnable) {
        return execute(runnable, 0L);
    }

    public TaskExecutorImpl(@NonNull ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.TaskExecutor
    public boolean execute(@NonNull Runnable runnable, long j) {
        try {
            this.executorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            Logger.m20086w(th);
            return false;
        }
    }
}
