package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.p1 */
/* loaded from: classes3.dex */
public final class C10108p1 {

    /* renamed from: a */
    public static final C10108p1 f22873a = new C10108p1();

    /* renamed from: com.chartboost.sdk.impl.p1$a */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC10109a implements ThreadFactory {

        /* renamed from: a */
        public final String f22874a;

        /* renamed from: b */
        public final AtomicInteger f22875b;

        public ThreadFactoryC10109a(String prefix) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            this.f22874a = prefix;
            this.f22875b = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            String str = this.f22874a;
            int andIncrement = this.f22875b.getAndIncrement();
            return new Thread(r, str + andIncrement);
        }
    }

    /* renamed from: a */
    public static final ScheduledExecutorService m80863a(int i, String threadPrefix) {
        Intrinsics.checkNotNullParameter(threadPrefix, "threadPrefix");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new ThreadFactoryC10109a(threadPrefix));
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public static /* synthetic */ ScheduledExecutorService m80862a(int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            str = "CBAsync-";
        }
        return m80863a(i, str);
    }

    /* renamed from: a */
    public static final ExecutorService m80865a(int i, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, j, timeUnit, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }

    /* renamed from: a */
    public static /* synthetic */ ExecutorService m80864a(int i, long j, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 10;
        }
        if ((i2 & 4) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        return m80865a(i, j, timeUnit);
    }
}
