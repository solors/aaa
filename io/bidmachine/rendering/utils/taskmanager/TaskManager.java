package io.bidmachine.rendering.utils.taskmanager;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public interface TaskManager {
    void cancel(@NonNull Runnable runnable);

    void execute(@NonNull Runnable runnable);

    default void schedule(@NonNull Runnable runnable, long j) {
        schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    void schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit);
}
