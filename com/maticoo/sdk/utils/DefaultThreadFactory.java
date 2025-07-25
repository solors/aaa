package com.maticoo.sdk.utils;

import androidx.annotation.NonNull;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class DefaultThreadFactory implements ThreadFactory {
    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final String namePrefix;
    private final AtomicInteger threadNumber = new AtomicInteger(1);

    public DefaultThreadFactory(String str) {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.group = threadGroup;
        this.namePrefix = str + ":pool-" + poolNumber.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.group;
        final Thread thread = new Thread(threadGroup, runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
        thread.setDaemon(true);
        thread.setPriority(1);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.maticoo.sdk.utils.DefaultThreadFactory.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(@NonNull Thread thread2, @NonNull Throwable th) {
                DeveloperLog.LogE("Caught unhandled exception", th);
                CrashUtil.getSingleton().reportException(502, th, thread.getName());
            }
        });
        return thread;
    }
}
