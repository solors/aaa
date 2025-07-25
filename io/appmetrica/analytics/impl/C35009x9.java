package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x9 */
/* loaded from: classes9.dex */
public final class C35009x9 implements IHandlerExecutor {

    /* renamed from: a */
    public final Looper f95591a;

    /* renamed from: b */
    public final Handler f95592b;

    /* renamed from: c */
    public final HandlerThreadC34348Ya f95593c;

    public C35009x9(@NonNull String str) {
        this(m20782a(str));
    }

    /* renamed from: a */
    public static HandlerThreadC34348Ya m20782a(String str) {
        HandlerThreadC34348Ya handlerThreadC34348Ya = new HandlerThreadC34348Ya(str + "-" + ThreadFactoryC34480dd.f94200a.incrementAndGet());
        handlerThreadC34348Ya.start();
        return handlerThreadC34348Ya;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f95592b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j) {
        this.f95592b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f95592b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f95591a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC34348Ya handlerThreadC34348Ya = this.f95593c;
        synchronized (handlerThreadC34348Ya) {
            z = handlerThreadC34348Ya.f93820a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f95592b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f95592b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC34348Ya handlerThreadC34348Ya = this.f95593c;
        synchronized (handlerThreadC34348Ya) {
            handlerThreadC34348Ya.f93820a = false;
            handlerThreadC34348Ya.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f95592b.post(futureTask);
        return futureTask;
    }

    public C35009x9(HandlerThreadC34348Ya handlerThreadC34348Ya) {
        this(handlerThreadC34348Ya, handlerThreadC34348Ya.getLooper(), new Handler(handlerThreadC34348Ya.getLooper()));
    }

    @VisibleForTesting
    public C35009x9(@NonNull HandlerThreadC34348Ya handlerThreadC34348Ya, @NonNull Looper looper, @NonNull Handler handler) {
        this.f95593c = handlerThreadC34348Ya;
        this.f95591a = looper;
        this.f95592b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        this.f95592b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
