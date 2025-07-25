package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class CrashlyticsBackgroundWorker {

    /* renamed from: a */
    private final Executor f42312a;

    /* renamed from: b */
    private Task<Void> f42313b = Tasks.forResult(null);

    /* renamed from: c */
    private final Object f42314c = new Object();

    /* renamed from: d */
    private final ThreadLocal<Boolean> f42315d = new ThreadLocal<>();

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.f42312a = executor;
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.1
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsBackgroundWorker.this.f42315d.set(Boolean.TRUE);
            }
        });
    }

    /* renamed from: b */
    private <T> Task<Void> m67181b(Task<T> task) {
        return task.continueWith(this.f42312a, (Continuation<T, Void>) new Continuation<T, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.4
            @Override // com.google.android.gms.tasks.Continuation
            public Void then(@NonNull Task<T> task2) throws Exception {
                return null;
            }
        });
    }

    /* renamed from: c */
    private boolean m67180c() {
        return Boolean.TRUE.equals(this.f42315d.get());
    }

    /* renamed from: d */
    private <T> Continuation<Void, T> m67179d(final Callable<T> callable) {
        return new Continuation<Void, T>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.3
            @Override // com.google.android.gms.tasks.Continuation
            public T then(@NonNull Task<Void> task) throws Exception {
                return (T) callable.call();
            }
        };
    }

    public void checkRunningOnThread() {
        if (m67180c()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Task<Void> m67178e(final Runnable runnable) {
        return submit(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker.2
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                runnable.run();
                return null;
            }
        });
    }

    public Executor getExecutor() {
        return this.f42312a;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f42314c) {
            continueWith = this.f42313b.continueWith(this.f42312a, m67179d(callable));
            this.f42313b = m67181b(continueWith);
        }
        return continueWith;
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f42314c) {
            continueWithTask = this.f42313b.continueWithTask(this.f42312a, m67179d(callable));
            this.f42313b = m67181b(continueWithTask);
        }
        return continueWithTask;
    }
}
