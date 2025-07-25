package com.mobilefuse.sdk.concurrency;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: Schedulers.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SchedulersKt {
    @NotNull
    private static final InterfaceC38501j globalHandler$delegate;
    private static final ScheduledThreadPoolExecutor poolExecutor = new ScheduledThreadPoolExecutor(3);

    @Metadata
    /* loaded from: classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Schedulers.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Schedulers.IO.ordinal()] = 1;
            iArr[Schedulers.MAIN.ordinal()] = 2;
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(SchedulersKt$globalHandler$2.INSTANCE);
        globalHandler$delegate = m14554a;
    }

    @NotNull
    public static final String currentThreadName() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        String name = currentThread.getName();
        Intrinsics.checkNotNullExpressionValue(name, "Thread.currentThread().name");
        return name;
    }

    @NotNull
    public static final Handler getGlobalHandler() {
        return (Handler) globalHandler$delegate.getValue();
    }

    @VisibleForTesting
    public static final boolean isMainThread() {
        return Intrinsics.m17075f(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final void runOnScheduler(@NotNull Schedulers scheduler, @NotNull final Functions<Unit> action) {
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[scheduler.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (isMainThread()) {
                    action.invoke();
                } else {
                    getGlobalHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.concurrency.SchedulersKt$sam$java_lang_Runnable$0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            Intrinsics.checkNotNullExpressionValue(action.invoke(), "invoke(...)");
                        }
                    });
                }
            }
        } else if (isMainThread()) {
            poolExecutor.execute(new Runnable() { // from class: com.mobilefuse.sdk.concurrency.SchedulersKt$sam$java_lang_Runnable$0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Intrinsics.checkNotNullExpressionValue(action.invoke(), "invoke(...)");
                }
            });
        } else {
            action.invoke();
        }
    }

    public static final void safelyRunOnBgThread(@Nullable Function1<? super Throwable, Unit> function1, @NotNull Functions<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        safelyRunOnScheduler(Schedulers.IO, action, function1);
    }

    public static /* synthetic */ void safelyRunOnBgThread$default(Function1 function1, Functions functions, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        safelyRunOnBgThread(function1, functions);
    }

    public static final void safelyRunOnMainThread(@Nullable Function1<? super Throwable, Unit> function1, @NotNull Functions<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        safelyRunOnScheduler(Schedulers.MAIN, action, function1);
    }

    public static /* synthetic */ void safelyRunOnMainThread$default(Function1 function1, Functions functions, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        safelyRunOnMainThread(function1, functions);
    }

    public static final void safelyRunOnScheduler(@NotNull Schedulers scheduler, @NotNull Functions<Unit> action, @Nullable Function1<? super Throwable, Unit> function1) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(action, "action");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            runOnScheduler(scheduler, new C23491x6ea34b2a(scheduler, action, function1));
            errorResult = new SuccessResult(Unit.f99208a);
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            if (function1 != null) {
                function1.invoke(th2);
            }
        }
    }

    public static /* synthetic */ void safelyRunOnScheduler$default(Schedulers schedulers, Functions functions, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        safelyRunOnScheduler(schedulers, functions, function1);
    }
}
