package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class Utils {

    /* renamed from: a */
    private static final ExecutorService f42423a = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    /* renamed from: a */
    public static /* synthetic */ Void m67063a(TaskCompletionSource taskCompletionSource, Task task) {
        return m67054j(taskCompletionSource, task);
    }

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f42423a, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.o
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return Utils.m67061c(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (!task.isCanceled()) {
            if (task.isComplete()) {
                throw new IllegalStateException(task.getException());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    @CanIgnoreReturnValue
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Void m67062b(TaskCompletionSource taskCompletionSource, Task task) {
        return m67055i(taskCompletionSource, task);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m67061c(CountDownLatch countDownLatch, Task task) {
        return m67058f(countDownLatch, task);
    }

    public static <T> Task<T> callTask(final Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.q
            @Override // java.lang.Runnable
            public final void run() {
                Utils.m67059e(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    public static /* synthetic */ Object m67060d(TaskCompletionSource taskCompletionSource, Task task) {
        return m67057g(taskCompletionSource, task);
    }

    /* renamed from: e */
    public static /* synthetic */ void m67059e(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        m67056h(callable, executor, taskCompletionSource);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m67058f(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m67057g(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        } else if (task.getException() != null) {
            taskCompletionSource.setException(task.getException());
            return null;
        } else {
            return null;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m67056h(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.r
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Utils.m67060d(TaskCompletionSource.this, task);
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ Void m67055i(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
            return null;
        } else {
            return null;
        }
    }

    /* renamed from: j */
    public static /* synthetic */ Void m67054j(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
            return null;
        } else {
            return null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.n
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return Utils.m67062b(TaskCompletionSource.this, task3);
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> race(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.p
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return Utils.m67063a(TaskCompletionSource.this, task3);
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
