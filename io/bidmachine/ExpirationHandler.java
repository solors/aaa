package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.task.CancelableTask;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class ExpirationHandler {
    private final long expirationTimeMs;
    @NonNull
    private final C35186c expiredTask;
    @NonNull
    private final AtomicBoolean isExpireTrackerSubscribed;
    @NonNull
    private final TaskScheduler taskScheduler;

    /* loaded from: classes9.dex */
    public interface Listener {
        void onExpired();
    }

    /* loaded from: classes9.dex */
    public interface TaskScheduler {
        void cancelTask(@NonNull CancelableTask cancelableTask);

        void scheduleTask(@NonNull CancelableTask cancelableTask, long j);
    }

    /* renamed from: io.bidmachine.ExpirationHandler$b */
    /* loaded from: classes9.dex */
    private static class C35185b implements TaskScheduler {
        private C35185b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(@NonNull CancelableTask cancelableTask) {
            cancelableTask.setCancel(true);
            Utils.cancelBackgroundThreadTask(cancelableTask);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(@NonNull CancelableTask cancelableTask, long j) {
            cancelableTask.setCancel(false);
            Utils.onBackgroundThread(cancelableTask, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.ExpirationHandler$c */
    /* loaded from: classes9.dex */
    public static class C35186c extends CancelableTask {
        @NonNull
        private final WeakReference<Listener> weakExpirationListener;

        public C35186c(@NonNull Listener listener) {
            this.weakExpirationListener = new WeakReference<>(listener);
        }

        @Override // io.bidmachine.utils.task.CancelableTask
        public void runTask() {
            Listener listener = this.weakExpirationListener.get();
            if (listener != null) {
                listener.onExpired();
            }
        }
    }

    public ExpirationHandler(long j, @NonNull Listener listener) {
        this(j, listener, new C35185b());
    }

    @NonNull
    TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    public void start() {
        if (this.expirationTimeMs > 0 && this.isExpireTrackerSubscribed.compareAndSet(false, true)) {
            this.taskScheduler.scheduleTask(this.expiredTask, this.expirationTimeMs);
        }
    }

    public void stop() {
        this.isExpireTrackerSubscribed.set(false);
        this.taskScheduler.cancelTask(this.expiredTask);
    }

    public ExpirationHandler(long j, @NonNull Listener listener, @NonNull TaskScheduler taskScheduler) {
        this.expiredTask = new C35186c(listener);
        this.expirationTimeMs = j;
        this.taskScheduler = taskScheduler;
        this.isExpireTrackerSubscribed = new AtomicBoolean(false);
    }
}
