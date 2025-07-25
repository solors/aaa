package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidExecutors.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AndroidExecutors {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final AndroidExecutors INSTANCE = new AndroidExecutors();
    private static final long KEEP_ALIVE_TIME = 1;
    private static final int MAX_POOL_SIZE;
    @NotNull
    private final Executor uiThread = new ExecutorC13334a();

    /* compiled from: AndroidExecutors.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExecutorService newCachedThreadPool() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(AndroidExecutors.CORE_POOL_SIZE, AndroidExecutors.MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        @NotNull
        public final Executor uiThread() {
            return AndroidExecutors.INSTANCE.uiThread;
        }
    }

    /* compiled from: AndroidExecutors.kt */
    @Metadata
    /* renamed from: com.facebook.bolts.AndroidExecutors$a */
    /* loaded from: classes2.dex */
    private static final class ExecutorC13334a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            new Handler(Looper.getMainLooper()).post(command);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
        MAX_POOL_SIZE = (availableProcessors * 2) + 1;
    }

    private AndroidExecutors() {
    }

    @NotNull
    public static final ExecutorService newCachedThreadPool() {
        return Companion.newCachedThreadPool();
    }

    @NotNull
    public static final Executor uiThread() {
        return Companion.uiThread();
    }
}
