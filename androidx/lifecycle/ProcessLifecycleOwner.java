package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ReportFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProcessLifecycleOwner.kt */
@Metadata
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final long TIMEOUT_MS = 700;
    @Nullable
    private Handler handler;
    private int resumedCounter;
    private int startedCounter;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    private boolean pauseSent = true;
    private boolean stopSent = true;
    @NotNull
    private final LifecycleRegistry registry = new LifecycleRegistry(this);
    @NotNull
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.i
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.m104700a(ProcessLifecycleOwner.this);
        }
    };
    @NotNull
    private final ReportFragment.ActivityInitializationListener initializationListener = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }
    };

    /* compiled from: ProcessLifecycleOwner.kt */
    @RequiresApi(29)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Api29Impl {
        @NotNull
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @DoNotInline
        public static final void registerActivityLifecycleCallbacks(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m104700a(ProcessLifecycleOwner processLifecycleOwner) {
        delayedPauseRunnable$lambda$0(processLifecycleOwner);
    }

    public static final /* synthetic */ ReportFragment.ActivityInitializationListener access$getInitializationListener$p(ProcessLifecycleOwner processLifecycleOwner) {
        return processLifecycleOwner.initializationListener;
    }

    public static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dispatchPauseIfNeeded$lifecycle_process_release();
        this$0.dispatchStopIfNeeded$lifecycle_process_release();
    }

    @NotNull
    public static final LifecycleOwner get() {
        return Companion.get();
    }

    public final void activityPaused$lifecycle_process_release() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler = this.handler;
            Intrinsics.m17074g(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
                return;
            }
            Handler handler = this.handler;
            Intrinsics.m17074g(handler);
            handler.removeCallbacks(this.delayedPauseRunnable);
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m17073h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment.Companion.get(activity).setProcessListener(ProcessLifecycleOwner.access$getInitializationListener$p(ProcessLifecycleOwner.this));
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                ProcessLifecycleOwner.this.activityPaused$lifecycle_process_release();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            @RequiresApi(29)
            public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
                ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@NotNull Activity activity2) {
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@NotNull Activity activity2) {
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                ProcessLifecycleOwner.this.activityStopped$lifecycle_process_release();
            }
        });
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.newInstance;
        }

        public final void init$lifecycle_process_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ProcessLifecycleOwner.newInstance.attach$lifecycle_process_release(context);
        }

        @VisibleForTesting
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }
    }
}
