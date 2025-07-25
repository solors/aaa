package com.smaato.sdk.core.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.util.p574fi.NullableSupplier;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class Threads {
    @Nullable
    private static Executor bgExecutor;
    @Nullable
    private static ScheduledExecutorService delayExecutor;
    @VisibleForTesting
    static volatile Handler uiHandler;

    private Threads() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m39351a(AtomicReference atomicReference, com.smaato.sdk.core.util.p574fi.Supplier supplier, AtomicBoolean atomicBoolean) {
        lambda$runOnHandlerThreadBlocking$1(atomicReference, supplier, atomicBoolean);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39350b(Runnable runnable, AtomicBoolean atomicBoolean) {
        lambda$runOnUiBlocking$2(runnable, atomicBoolean);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39349c(Runnable runnable, AtomicBoolean atomicBoolean) {
        lambda$runOnHandlerThreadBlocking$0(runnable, atomicBoolean);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39348d(AtomicReference atomicReference, NullableSupplier nullableSupplier, CountDownLatch countDownLatch) {
        lambda$runOnUiBlocking$3(atomicReference, nullableSupplier, countDownLatch);
    }

    public static void ensureHandlerThread(@NonNull Handler handler) {
        if (isHandlerThread(handler)) {
            return;
        }
        throw new IllegalStateException("This method should be called only from a thread bound to the handler");
    }

    public static void ensureInvokedOnHandlerThread(@NonNull Handler handler, @NonNull Runnable runnable) {
        if (isHandlerThread(handler)) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void ensureMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("This method should be called only on MainThread");
    }

    public static void ensureNotMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("This method should NOT be called on MainThread");
    }

    @NonNull
    private static synchronized Executor getBackgroundExecutor() {
        Executor executor;
        synchronized (Threads.class) {
            if (bgExecutor == null) {
                bgExecutor = Executors.newCachedThreadPool();
            }
            executor = bgExecutor;
        }
        return executor;
    }

    @NonNull
    private static synchronized ScheduledExecutorService getDelayExecutor() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (Threads.class) {
            if (delayExecutor == null) {
                delayExecutor = Executors.newSingleThreadScheduledExecutor();
            }
            scheduledExecutorService = delayExecutor;
        }
        return scheduledExecutorService;
    }

    @NonNull
    private static Handler getUiHandler() {
        if (uiHandler == null) {
            synchronized (Threads.class) {
                if (uiHandler == null) {
                    uiHandler = newUiHandler();
                }
            }
        }
        return uiHandler;
    }

    public static boolean isHandlerThread(@NonNull Handler handler) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$runOnHandlerThreadBlocking$0(Runnable runnable, AtomicBoolean atomicBoolean) {
        runnable.run();
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void lambda$runOnHandlerThreadBlocking$1(AtomicReference atomicReference, com.smaato.sdk.core.util.p574fi.Supplier supplier, AtomicBoolean atomicBoolean) {
        atomicReference.set(supplier.get());
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void lambda$runOnUiBlocking$2(Runnable runnable, AtomicBoolean atomicBoolean) {
        runnable.run();
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void lambda$runOnUiBlocking$3(AtomicReference atomicReference, NullableSupplier nullableSupplier, CountDownLatch countDownLatch) {
        atomicReference.set(nullableSupplier.get());
        countDownLatch.countDown();
    }

    @NonNull
    public static Handler newUiHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static void runOnBackgroundThread(@NonNull Runnable runnable) {
        getBackgroundExecutor().execute(runnable);
    }

    public static boolean runOnHandlerThreadBlocking(@NonNull Handler handler, @NonNull final Runnable runnable) {
        if (isHandlerThread(handler)) {
            runnable.run();
            return true;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean post = handler.post(new Runnable() { // from class: com.smaato.sdk.core.util.n
            @Override // java.lang.Runnable
            public final void run() {
                Threads.m39349c(runnable, atomicBoolean);
            }
        });
        if (post) {
            do {
            } while (!atomicBoolean.get());
            return post;
        }
        return post;
    }

    public static boolean runOnNextUiFrame(@NonNull Runnable runnable) {
        return getUiHandler().post(runnable);
    }

    public static boolean runOnUi(@NonNull Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        return getUiHandler().post(runnable);
    }

    public static boolean runOnUiBlocking(@NonNull final Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean post = getUiHandler().post(new Runnable() { // from class: com.smaato.sdk.core.util.k
            @Override // java.lang.Runnable
            public final void run() {
                Threads.m39350b(runnable, atomicBoolean);
            }
        });
        if (post) {
            do {
            } while (!atomicBoolean.get());
            return post;
        }
        return post;
    }

    public static void scheduleDelayed(Long l, Runnable runnable) {
        getDelayExecutor().schedule(runnable, l.longValue(), TimeUnit.MILLISECONDS);
    }

    @NonNull
    public static <T> T runOnHandlerThreadBlocking(@NonNull Handler handler, @NonNull final com.smaato.sdk.core.util.p574fi.Supplier<T> supplier) {
        if (isHandlerThread(handler)) {
            return supplier.get();
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicReference atomicReference = new AtomicReference();
        if (handler.post(new Runnable() { // from class: com.smaato.sdk.core.util.l
            @Override // java.lang.Runnable
            public final void run() {
                Threads.m39351a(atomicReference, supplier, atomicBoolean);
            }
        })) {
            do {
            } while (!atomicBoolean.get());
            return (T) atomicReference.get();
        }
        return (T) atomicReference.get();
    }

    @Nullable
    public static <T> T runOnUiBlocking(@NonNull final NullableSupplier<T> nullableSupplier) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return nullableSupplier.get();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        if (getUiHandler().post(new Runnable() { // from class: com.smaato.sdk.core.util.m
            @Override // java.lang.Runnable
            public final void run() {
                Threads.m39348d(atomicReference, nullableSupplier, countDownLatch);
            }
        })) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                String name = LogDomain.CORE.name();
                Log.e(name, "Internal error while executing on MainThread: " + e.getMessage());
                return null;
            }
        }
        return (T) atomicReference.get();
    }
}
