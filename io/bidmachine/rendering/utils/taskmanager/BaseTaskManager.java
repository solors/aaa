package io.bidmachine.rendering.utils.taskmanager;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import io.bidmachine.rendering.utils.Cancelable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class BaseTaskManager implements TaskManager {
    /* renamed from: a */
    private void m19015a(Runnable runnable, boolean z) {
        try {
            if (runnable instanceof Cancelable) {
                ((Cancelable) runnable).setCancel(z);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void cancel(@NonNull Runnable runnable) {
        m19015a(runnable, true);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void execute(@NonNull Runnable runnable) {
        m19015a(runnable, false);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j) {
        super.schedule(runnable, j);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        m19015a(runnable, false);
    }
}
