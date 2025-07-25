package io.bidmachine.utils.task;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public interface TaskManager {
    void cancel(@NonNull CancelableTask cancelableTask);

    void execute(@NonNull Runnable runnable);

    default void schedule(@NonNull CancelableTask cancelableTask, long j) {
        schedule(cancelableTask, j, TimeUnit.MILLISECONDS);
    }

    void schedule(@NonNull CancelableTask cancelableTask, long j, @NonNull TimeUnit timeUnit);
}
