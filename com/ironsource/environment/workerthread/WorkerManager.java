package com.ironsource.environment.workerthread;

import com.ironsource.C20086i9;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class WorkerManager<T> {

    /* renamed from: a */
    List<Callable<T>> f49945a = new ArrayList();

    /* renamed from: b */
    private final ExecutorService f49946b;

    /* loaded from: classes6.dex */
    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public WorkerManager(@NotNull ExecutorService executorService) {
        this.f49946b = executorService;
    }

    public void addCallable(@NotNull Callable<T> callable) {
        this.f49945a.add(callable);
    }

    public void startWork(@NotNull WorkEndedListener<T> workEndedListener, long j, @NotNull TimeUnit timeUnit) {
        WorkerResult.Canceled canceled;
        if (this.f49946b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
        } else if (this.f49945a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            try {
                List<Future<T>> invokeAll = this.f49946b.invokeAll(this.f49945a, j, timeUnit);
                for (int i = 0; i < invokeAll.size(); i++) {
                    Future<T> future = invokeAll.get(i);
                    if (future.isDone() && !future.isCancelled()) {
                        try {
                            arrayList.add(new WorkerResult.Completed(future.get()));
                        } catch (InterruptedException e) {
                            e = e;
                            C20086i9.m57997d().m58003a(e);
                            arrayList.add(new WorkerResult.Failed(this.f49945a.get(i), e));
                        } catch (CancellationException e2) {
                            C20086i9.m57997d().m58003a(e2);
                            canceled = new WorkerResult.Canceled(this.f49945a.get(i));
                        } catch (ExecutionException e3) {
                            e = e3;
                            C20086i9.m57997d().m58003a(e);
                            arrayList.add(new WorkerResult.Failed(this.f49945a.get(i), e));
                        }
                    } else {
                        canceled = new WorkerResult.Canceled(this.f49945a.get(i));
                    }
                    arrayList.add(canceled);
                }
                workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - currentTimeMillis);
                this.f49946b.shutdownNow();
            } catch (Exception e4) {
                C20086i9.m57997d().m58003a(e4);
                IronLog.INTERNAL.error(e4.toString());
                workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
                this.f49946b.shutdownNow();
            }
        }
    }
}
