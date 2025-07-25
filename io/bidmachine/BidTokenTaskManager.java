package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.task.BackgroundTaskManager;
import io.bidmachine.utils.task.CancelableTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class BidTokenTaskManager {
    @Nullable
    private static volatile BackgroundTaskManager instance;

    public static void cancel(@NonNull CancelableTask cancelableTask) {
        get().cancel(cancelableTask);
    }

    public static void execute(@NonNull Runnable runnable) {
        get().execute(runnable);
    }

    @NonNull
    private static BackgroundTaskManager get() {
        BackgroundTaskManager backgroundTaskManager = instance;
        if (backgroundTaskManager == null) {
            synchronized (BackgroundTaskManager.class) {
                backgroundTaskManager = instance;
                if (backgroundTaskManager == null) {
                    backgroundTaskManager = new BackgroundTaskManager();
                    instance = backgroundTaskManager;
                }
            }
        }
        return backgroundTaskManager;
    }

    public static void schedule(@NonNull CancelableTask cancelableTask, long j, @NonNull TimeUnit timeUnit) {
        get().schedule(cancelableTask, j, timeUnit);
    }
}
