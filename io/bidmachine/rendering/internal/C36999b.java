package io.bidmachine.rendering.internal;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.utils.taskmanager.BackgroundTaskManager;
import io.bidmachine.rendering.utils.taskmanager.TaskManager;
import java.util.concurrent.TimeUnit;

/* renamed from: io.bidmachine.rendering.internal.b */
/* loaded from: classes9.dex */
public class C36999b implements TaskManager {

    /* renamed from: a */
    private static volatile BackgroundTaskManager f97682a;

    /* renamed from: a */
    private static BackgroundTaskManager m19321a() {
        BackgroundTaskManager backgroundTaskManager = f97682a;
        if (backgroundTaskManager == null) {
            synchronized (BackgroundTaskManager.class) {
                backgroundTaskManager = f97682a;
                if (backgroundTaskManager == null) {
                    backgroundTaskManager = new BackgroundTaskManager();
                    f97682a = backgroundTaskManager;
                }
            }
        }
        return backgroundTaskManager;
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void cancel(Runnable runnable) {
        m19321a().cancel(runnable);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void execute(Runnable runnable) {
        m19321a().execute(runnable);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j) {
        super.schedule(runnable, j);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        m19321a().schedule(runnable, j, timeUnit);
    }
}
