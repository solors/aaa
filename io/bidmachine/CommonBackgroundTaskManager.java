package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.task.BackgroundTaskManager;
import io.bidmachine.utils.task.TaskManager;

/* renamed from: io.bidmachine.q2 */
/* loaded from: classes9.dex */
class CommonBackgroundTaskManager {
    @Nullable
    private static volatile TaskManager instance;

    CommonBackgroundTaskManager() {
    }

    @NonNull
    public static TaskManager get() {
        TaskManager taskManager = instance;
        if (taskManager == null) {
            synchronized (CommonBackgroundTaskManager.class) {
                taskManager = instance;
                if (taskManager == null) {
                    taskManager = new BackgroundTaskManager();
                    instance = taskManager;
                }
            }
        }
        return taskManager;
    }
}
