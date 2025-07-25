package io.bidmachine.rendering.utils.taskmanager;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.internal.AbstractC37037k;
import io.bidmachine.rendering.utils.concurrent.ExecutorConfigurator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class BackgroundTaskManager extends BaseTaskManager {

    /* renamed from: a */
    private final ScheduledThreadPoolExecutor f97969a;

    /* renamed from: b */
    private final Map f97970b;

    /* renamed from: io.bidmachine.rendering.utils.taskmanager.BackgroundTaskManager$a */
    /* loaded from: classes9.dex */
    private class RunnableC37090a implements Runnable {

        /* renamed from: a */
        private final Runnable f97971a;

        public RunnableC37090a(Runnable runnable) {
            this.f97971a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BackgroundTaskManager.this.m19016a(this.f97971a);
                this.f97971a.run();
            } catch (Exception e) {
                AbstractC37037k.m19161b(e);
            }
        }
    }

    public BackgroundTaskManager() {
        ExecutorConfigurator executorConfigurator = new ExecutorConfigurator();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(executorConfigurator.getCorePoolSize());
        this.f97969a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setMaximumPoolSize(executorConfigurator.getMaximumPoolSize());
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        this.f97970b = new ConcurrentHashMap();
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void cancel(@NonNull Runnable runnable) {
        super.cancel(runnable);
        try {
            Future m19016a = m19016a(runnable);
            if (m19016a == null) {
                return;
            }
            m19016a.cancel(false);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void execute(@NonNull Runnable runnable) {
        super.execute(runnable);
        try {
            this.f97969a.execute(runnable);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j) {
        super.schedule(runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Future m19016a(Runnable runnable) {
        try {
            return (Future) this.f97970b.remove(runnable);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        super.schedule(runnable, j, timeUnit);
        try {
            this.f97970b.put(runnable, this.f97969a.schedule(new RunnableC37090a(runnable), j, timeUnit));
        } catch (Throwable unused) {
        }
    }
}
