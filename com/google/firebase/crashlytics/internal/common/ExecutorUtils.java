package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class ExecutorUtils {
    private ExecutorUtils() {
    }

    /* renamed from: a */
    private static void m67091a(String str, ExecutorService executorService) {
        m67090b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    private static void m67090b(final String str, final ExecutorService executorService, final long j, final TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        BackgroundPriorityRunnable backgroundPriorityRunnable = new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.2
            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void onRun() {
                try {
                    Logger logger = Logger.getLogger();
                    logger.m67216d("Executing shutdown hook for " + str);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(j, timeUnit)) {
                        Logger logger2 = Logger.getLogger();
                        logger2.m67216d(str + " did not shut down in the allocated time. Requesting immediate shutdown.");
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Logger.getLogger().m67216d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        };
        runtime.addShutdownHook(new Thread(backgroundPriorityRunnable, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService m67089c = m67089c(getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy());
        m67091a(str, m67089c);
        return m67089c;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        m67091a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: c */
    private static ExecutorService m67089c(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    public static ThreadFactory getNamedThreadFactory(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1L);
        return new ThreadFactory() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1.1
                    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                    public void onRun() {
                        runnable.run();
                    }
                });
                newThread.setName(str + atomicLong.getAndIncrement());
                return newThread;
            }
        };
    }
}
