package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class WorkForegroundRunnable implements Runnable {
    static final String TAG = Logger.tagWithPrefix("WorkForegroundRunnable");
    final Context mContext;
    final ForegroundUpdater mForegroundUpdater;
    final SettableFuture<Void> mFuture = SettableFuture.create();
    final TaskExecutor mTaskExecutor;
    final WorkSpec mWorkSpec;
    final ListenableWorker mWorker;

    @SuppressLint({"LambdaLast"})
    public WorkForegroundRunnable(@NonNull Context context, @NonNull WorkSpec workSpec, @NonNull ListenableWorker listenableWorker, @NonNull ForegroundUpdater foregroundUpdater, @NonNull TaskExecutor taskExecutor) {
        this.mContext = context;
        this.mWorkSpec = workSpec;
        this.mWorker = listenableWorker;
        this.mForegroundUpdater = foregroundUpdater;
        this.mTaskExecutor = taskExecutor;
    }

    public /* synthetic */ void lambda$run$0(SettableFuture settableFuture) {
        if (!this.mFuture.isCancelled()) {
            settableFuture.setFuture(this.mWorker.getForegroundInfoAsync());
        } else {
            settableFuture.cancel(true);
        }
    }

    @NonNull
    public ListenableFuture<Void> getFuture() {
        return this.mFuture;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.mWorkSpec.expedited && Build.VERSION.SDK_INT < 31) {
            final SettableFuture create = SettableFuture.create();
            this.mTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.utils.g
                {
                    WorkForegroundRunnable.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WorkForegroundRunnable.this.lambda$run$0(create);
                }
            });
            create.addListener(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.1
                {
                    WorkForegroundRunnable.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (WorkForegroundRunnable.this.mFuture.isCancelled()) {
                        return;
                    }
                    try {
                        ForegroundInfo foregroundInfo = (ForegroundInfo) create.get();
                        if (foregroundInfo != null) {
                            Logger logger = Logger.get();
                            String str = WorkForegroundRunnable.TAG;
                            logger.debug(str, "Updating notification for " + WorkForegroundRunnable.this.mWorkSpec.workerClassName);
                            WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
                            workForegroundRunnable.mFuture.setFuture(workForegroundRunnable.mForegroundUpdater.setForegroundAsync(workForegroundRunnable.mContext, workForegroundRunnable.mWorker.getId(), foregroundInfo));
                            return;
                        }
                        throw new IllegalStateException("Worker was marked important (" + WorkForegroundRunnable.this.mWorkSpec.workerClassName + ") but did not provide ForegroundInfo");
                    } catch (Throwable th) {
                        WorkForegroundRunnable.this.mFuture.setException(th);
                    }
                }
            }, this.mTaskExecutor.getMainThreadExecutor());
            return;
        }
        this.mFuture.set(null);
    }
}
