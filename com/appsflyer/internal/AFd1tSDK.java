package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFd1tSDK extends ThreadPoolExecutor {
    @NotNull
    private final Queue<Runnable> AFKeystoreWrapper;

    public /* synthetic */ AFd1tSDK(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, timeUnit, blockingQueue, (i3 & 32) != 0 ? new LinkedList() : queue);
    }

    public static final void AFInAppEventType(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        queue.add(runnable);
    }

    /* renamed from: a */
    public static /* synthetic */ void m92169a(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AFInAppEventType(queue, runnable, threadPoolExecutor);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(@NotNull Runnable runnable, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(runnable, "");
        super.afterExecute(runnable, th);
        Intrinsics.checkNotNullParameter(runnable, "");
        if (th == null) {
            synchronized (this) {
                while (!this.AFKeystoreWrapper.isEmpty()) {
                    Runnable poll = this.AFKeystoreWrapper.poll();
                    if (poll != null) {
                        AFd1rSDK.AFInAppEventParameterName().execute(poll);
                    }
                }
                Unit unit = Unit.f99208a;
            }
            return;
        }
        AFg1cSDK.e$default(AFLogger.INSTANCE, AFg1bSDK.AFEXECUTOR, "Error while executing task: ".concat(String.valueOf(runnable)), th, true, true, true, false, 64, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1tSDK(int i, int i2, long j, @NotNull TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> blockingQueue, @NotNull final Queue<Runnable> queue) {
        super(i, i2, j, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.m
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFd1tSDK.m92169a(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(blockingQueue, "");
        Intrinsics.checkNotNullParameter(queue, "");
        this.AFKeystoreWrapper = queue;
    }
}
