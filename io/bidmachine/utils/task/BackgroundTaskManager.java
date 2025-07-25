package io.bidmachine.utils.task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class BackgroundTaskManager implements TaskManager {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    @NonNull
    private final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(CORE_POOL_SIZE);
    @NonNull
    private final Map<Runnable, Future<?>> futureMap = new ConcurrentHashMap();

    /* renamed from: io.bidmachine.utils.task.BackgroundTaskManager$a */
    /* loaded from: classes9.dex */
    private class RunnableC37115a implements Runnable {
        @NonNull
        private final Runnable runnable;

        public RunnableC37115a(@NonNull Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            BackgroundTaskManager.this.removeFuture(this.runnable);
            this.runnable.run();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public Future<?> removeFuture(@NonNull Runnable runnable) {
        try {
            return this.futureMap.remove(runnable);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void cancel(@NonNull CancelableTask cancelableTask) {
        try {
            cancelableTask.setCancel(true);
            Future<?> removeFuture = removeFuture(cancelableTask);
            if (removeFuture == null) {
                return;
            }
            removeFuture.cancel(false);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void execute(@NonNull Runnable runnable) {
        try {
            this.executor.execute(runnable);
        } catch (Throwable unused) {
        }
    }

    @NonNull
    @VisibleForTesting
    Map<Runnable, Future<?>> getFutureMap() {
        return this.futureMap;
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull CancelableTask cancelableTask, long j) {
        super.schedule(cancelableTask, j);
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void schedule(@NonNull CancelableTask cancelableTask, long j, @NonNull TimeUnit timeUnit) {
        try {
            cancelableTask.setCancel(false);
            this.futureMap.put(cancelableTask, this.executor.schedule(new RunnableC37115a(cancelableTask), j, timeUnit));
        } catch (Throwable unused) {
        }
    }
}
