package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class ThreadFactoryBuilder {

    /* renamed from: a */
    private String f41966a = null;

    /* renamed from: b */
    private Boolean f41967b = null;

    /* renamed from: c */
    private Integer f41968c = null;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f41969d = null;

    /* renamed from: e */
    private ThreadFactory f41970e = null;

    /* renamed from: b */
    private static ThreadFactory m67450b(ThreadFactoryBuilder threadFactoryBuilder) {
        AtomicLong atomicLong;
        final String str = threadFactoryBuilder.f41966a;
        final Boolean bool = threadFactoryBuilder.f41967b;
        final Integer num = threadFactoryBuilder.f41968c;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.f41969d;
        ThreadFactory threadFactory = threadFactoryBuilder.f41970e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory2 = threadFactory;
        if (str != null) {
            atomicLong = new AtomicLong(0L);
        } else {
            atomicLong = null;
        }
        final AtomicLong atomicLong2 = atomicLong;
        return new ThreadFactory() { // from class: com.google.common.util.concurrent.ThreadFactoryBuilder.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory2.newThread(runnable);
                String str2 = str;
                if (str2 != null) {
                    AtomicLong atomicLong3 = atomicLong2;
                    Objects.requireNonNull(atomicLong3);
                    newThread.setName(ThreadFactoryBuilder.m67449c(str2, Long.valueOf(atomicLong3.getAndIncrement())));
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    newThread.setDaemon(bool2.booleanValue());
                }
                Integer num2 = num;
                if (num2 != null) {
                    newThread.setPriority(num2.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler2 != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return newThread;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static String m67449c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    @CheckReturnValue
    public ThreadFactory build() {
        return m67450b(this);
    }

    public ThreadFactoryBuilder setDaemon(boolean z) {
        this.f41967b = Boolean.valueOf(z);
        return this;
    }

    public ThreadFactoryBuilder setNameFormat(String str) {
        m67449c(str, 0);
        this.f41966a = str;
        return this;
    }

    public ThreadFactoryBuilder setPriority(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Thread priority (%s) must be >= %s", i, 1);
        if (i <= 10) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Thread priority (%s) must be <= %s", i, 10);
        this.f41968c = Integer.valueOf(i);
        return this;
    }

    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.f41970e = (ThreadFactory) Preconditions.checkNotNull(threadFactory);
        return this;
    }

    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f41969d = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
