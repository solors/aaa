package com.vungle.ads.internal.executor;

import com.vungle.ads.C29575w1;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.C29518o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.executor.i */
/* loaded from: classes7.dex */
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor {
    @NotNull
    public static final C29199a Companion = new C29199a(null);
    @NotNull
    private static final String TAG = "VungleThreadPool";

    /* compiled from: VungleThreadPoolExecutor.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.executor.i$a */
    /* loaded from: classes7.dex */
    public static final class C29199a {

        /* compiled from: VungleThreadPoolExecutor.kt */
        @Metadata
        /* renamed from: com.vungle.ads.internal.executor.i$a$a */
        /* loaded from: classes7.dex */
        public static final class C29200a extends PriorityRunnable {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            C29200a(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // com.vungle.ads.internal.task.PriorityRunnable, java.lang.Comparable
            public int compareTo(@NotNull Object other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof PriorityRunnable) {
                    return Intrinsics.m17071j(((PriorityRunnable) other).getPriority(), getPriority());
                }
                return 0;
            }

            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return ((PriorityRunnable) this.$command).getPriority();
            }

            @Override // java.lang.Runnable
            public void run() {
                VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        /* compiled from: VungleThreadPoolExecutor.kt */
        @Metadata
        /* renamed from: com.vungle.ads.internal.executor.i$a$b */
        /* loaded from: classes7.dex */
        public static final class C29201b implements InterfaceRunnableC29202b {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            C29201b(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull Object other) {
                Intrinsics.checkNotNullParameter(other, "other");
                Runnable runnable = this.$command;
                if (runnable instanceof PriorityRunnable) {
                    return ((PriorityRunnable) runnable).compareTo(other);
                }
                return 0;
            }

            @Override // java.lang.Runnable
            public void run() {
                VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        private C29199a() {
        }

        public /* synthetic */ C29199a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ Object m37526a(Callable callable, Functions functions) {
            return m110318getWrappedCallableWithFallback$lambda0(callable, functions);
        }

        public final <T> Callable<T> getWrappedCallableWithFallback(final Callable<T> callable, final Functions<Unit> functions) {
            return new Callable() { // from class: com.vungle.ads.internal.executor.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return VungleThreadPoolExecutor.C29199a.m37526a(callable, functions);
                }
            };
        }

        /* renamed from: getWrappedCallableWithFallback$lambda-0 */
        public static final Object m110318getWrappedCallableWithFallback$lambda0(Callable command, Functions failFallback) {
            Intrinsics.checkNotNullParameter(command, "$command");
            Intrinsics.checkNotNullParameter(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }

        public final InterfaceRunnableC29202b getWrappedRunnableWithFail(Runnable runnable, Runnable runnable2) {
            if (runnable instanceof PriorityRunnable) {
                return new C29200a(runnable, runnable2);
            }
            return new C29201b(runnable, runnable2);
        }

        public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
            try {
                runnable.run();
            } catch (OutOfMemoryError unused) {
                runnable2.run();
            }
        }
    }

    /* compiled from: VungleThreadPoolExecutor.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.executor.i$b */
    /* loaded from: classes7.dex */
    public interface InterfaceRunnableC29202b extends Comparable<Object>, Runnable {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VungleThreadPoolExecutor.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.executor.i$c */
    /* loaded from: classes7.dex */
    public static final class C29203c extends Lambda implements Functions<Unit> {
        public static final C29203c INSTANCE = new C29203c();

        C29203c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            new C29575w1("submit callable error").logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public VungleThreadPoolExecutor(int i, int i2, long j, @Nullable TimeUnit timeUnit, @Nullable BlockingQueue<Runnable> blockingQueue, @Nullable ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m37529a() {
        m110315execute$lambda0();
    }

    /* renamed from: b */
    public static /* synthetic */ void m37528b() {
        m110317submit$lambda2();
    }

    /* renamed from: c */
    public static /* synthetic */ void m37527c() {
        m110316submit$lambda1();
    }

    /* renamed from: execute$lambda-0 */
    public static final void m110315execute$lambda0() {
        new C29575w1("execute error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* renamed from: submit$lambda-1 */
    public static final void m110316submit$lambda1() {
        new C29575w1("submit error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* renamed from: submit$lambda-2 */
    public static final void m110317submit$lambda2() {
        new C29575w1("submit error with error").logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, new Runnable() { // from class: com.vungle.ads.internal.executor.e
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m37529a();
                }
            }));
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(TAG, "execute error: " + e);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @NotNull
    public Future<?> submit(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<?> submit = super.submit(Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.g
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m37527c();
                }
            }));
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…\n            })\n        }");
            return submit;
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(TAG, "submit error: " + e);
            return new FutureResult(null);
        }
    }

    public final void execute(@NotNull Runnable command, @NotNull Runnable fail) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, fail));
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(TAG, "execute error with fail: " + e);
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@NotNull Runnable task, T t) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<T> submit = super.submit((Runnable) Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.f
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m37528b();
                }
            }), (InterfaceRunnableC29202b) t);
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…     }, result)\n        }");
            return submit;
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(TAG, "submit error with result: " + e);
            return new FutureResult(null);
        }
    }

    @NotNull
    public final Future<?> submit(@NotNull Runnable task, @NotNull Runnable fail) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            Future<?> submit = super.submit(Companion.getWrappedRunnableWithFail(task, fail));
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…il(task, fail))\n        }");
            return submit;
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(TAG, "submit error with fail: " + e);
            fail.run();
            return new FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@NotNull Callable<T> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<T> submit = super.submit(Companion.getWrappedCallableWithFallback(task, C29203c.INSTANCE));
            Intrinsics.checkNotNullExpressionValue(submit, "{\n            super.subm…\n            })\n        }");
            return submit;
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(TAG, "submit callable: " + e);
            return new FutureResult(null);
        }
    }
}
