package io.bidmachine.rendering.utils.taskmanager;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class SingleThreadTaskManager extends BaseTaskManager {
    /* renamed from: a */
    protected abstract Handler mo19013a();

    /* renamed from: b */
    protected boolean m19014b() {
        if (Looper.myLooper() == mo19013a().getLooper()) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void cancel(@NonNull Runnable runnable) {
        super.cancel(runnable);
        mo19013a().removeCallbacks(runnable);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void execute(@NonNull Runnable runnable) {
        super.execute(runnable);
        if (m19014b()) {
            runnable.run();
        } else {
            mo19013a().post(runnable);
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j) {
        super.schedule(runnable, j);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        super.schedule(runnable, j, timeUnit);
        mo19013a().postDelayed(runnable, timeUnit.toMillis(j));
    }
}
