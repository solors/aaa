package com.inmobi.media;

import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.q9 */
/* loaded from: classes6.dex */
public final class C19428q9 extends ThreadPoolExecutor {

    /* renamed from: a */
    public static final /* synthetic */ int f48599a = 0;

    public C19428q9(TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue, ThreadFactoryC18962I4 threadFactoryC18962I4) {
        super(1, 1, 0L, timeUnit, priorityBlockingQueue, threadFactoryC18962I4);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        return (RunnableFuture) callable;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return (RunnableFuture) runnable;
    }
}
