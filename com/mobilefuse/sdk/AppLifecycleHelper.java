package com.mobilefuse.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: AppLifecycleHelper.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AppLifecycleHelper {
    private static Application appContext;
    @SuppressLint({"StaticFieldLeak"})
    private static WeakReference<Activity> currentActivityRef;
    private static boolean firstActivityKnown;
    private static boolean initialized;
    @NotNull
    public static final AppLifecycleHelper INSTANCE = new AppLifecycleHelper();
    private static final Set<SoftReference<ActivityLifecycleObserver>> activityObservers = new HashSet();
    private static final Object lock = new Object();
    private static boolean appInForeground = true;
    private static final Runnable detectAppBackgroundTask = new Runnable() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$detectAppBackgroundTask$1
        @Override // java.lang.Runnable
        public final void run() {
            AppLifecycleHelper.access$onApplicationTransitionToBackground(AppLifecycleHelper.INSTANCE);
        }
    };

    private AppLifecycleHelper() {
    }

    public static final /* synthetic */ void access$onApplicationTransitionToBackground(AppLifecycleHelper appLifecycleHelper) {
        appLifecycleHelper.onApplicationTransitionToBackground();
    }

    public static final void addActivityLifecycleObserver(@NotNull ActivityLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            synchronized (lock) {
                activityObservers.add(new SoftReference<>(observer));
                Unit unit = Unit.f99208a;
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final void callActivityObservers(Function1<? super ActivityLifecycleObserver, Unit> function1) {
        Set<SoftReference> m17547e1;
        synchronized (lock) {
            m17547e1 = _Collections.m17547e1(activityObservers);
        }
        for (SoftReference softReference : m17547e1) {
            ActivityLifecycleObserver activityLifecycleObserver = (ActivityLifecycleObserver) softReference.get();
            if (activityLifecycleObserver != null) {
                function1.invoke(activityLifecycleObserver);
            }
        }
    }

    private final Application.ActivityLifecycleCallbacks getActivityLifecycleCallbacks() {
        return new Application.ActivityLifecycleCallbacks() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new Try(activity)));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                Runnable runnable;
                Runnable runnable2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AppLifecycleHelper.INSTANCE.onActivityDeactivated(activity);
                    SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new C23371xa9f5767c(activity)));
                    Handler globalHandler = SchedulersKt.getGlobalHandler();
                    runnable = AppLifecycleHelper.detectAppBackgroundTask;
                    globalHandler.removeCallbacks(runnable);
                    Handler globalHandler2 = SchedulersKt.getGlobalHandler();
                    runnable2 = AppLifecycleHelper.detectAppBackgroundTask;
                    globalHandler2.postDelayed(runnable2, 2000L);
                } catch (Throwable th) {
                    int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                    StabilityHelper.logException("[Automatically caught]", th);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new C23373xcbc62f24(activity)));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                SchedulersKt.getGlobalHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityStarted$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLifecycleHelper appLifecycleHelper = AppLifecycleHelper.INSTANCE;
                        AppLifecycleHelper.currentActivityRef = new WeakReference(activity);
                    }
                });
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new C23375x5bd3c66e(activity)));
            }
        };
    }

    @Nullable
    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currentActivityRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NotNull
    public static final Context getGlobalContext() {
        Application application = appContext;
        if (application == null) {
            Intrinsics.m17056y("appContext");
        }
        return application;
    }

    public static final void init(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (initialized) {
                return;
            }
            appContext = context;
            initialized = true;
            if (context == null) {
                Intrinsics.m17056y("appContext");
            }
            context.registerActivityLifecycleCallbacks(INSTANCE.getActivityLifecycleCallbacks());
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public static final boolean isActivityInForeground(@Nullable Activity activity) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (getCurrentActivity() == null && !firstActivityKnown) {
                return true;
            }
            if (getCurrentActivity() == null) {
                return false;
            }
            if (activity != null) {
                if (activity != getCurrentActivity()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return false;
        }
    }

    public static final boolean isAppInForeground() {
        return appInForeground;
    }

    public final void onActivityActivated(Activity activity) {
        currentActivityRef = new WeakReference<>(activity);
    }

    public final void onActivityDeactivated(Activity activity) {
        if (getCurrentActivity() == activity) {
            currentActivityRef = null;
        }
    }

    public final void onApplicationTransitionToBackground() {
        if (!appInForeground) {
            return;
        }
        appInForeground = false;
        SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new C23376x198aab10()));
    }

    public final void onApplicationTransitionToForeground() {
        SchedulersKt.getGlobalHandler().removeCallbacks(detectAppBackgroundTask);
        if (appInForeground) {
            return;
        }
        appInForeground = true;
        SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new C23377xb924cf5b()));
    }

    public static final void removeActivityLifecycleObserver(@NotNull ActivityLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            synchronized (lock) {
                ArrayList<SoftReference> arrayList = new ArrayList();
                for (SoftReference<ActivityLifecycleObserver> softReference : activityObservers) {
                    ActivityLifecycleObserver activityLifecycleObserver = softReference.get();
                    if (activityLifecycleObserver == null) {
                        arrayList.add(softReference);
                    } else if (activityLifecycleObserver == observer) {
                        arrayList.add(softReference);
                    }
                }
                for (SoftReference softReference2 : arrayList) {
                    activityObservers.remove(softReference2);
                }
                Unit unit = Unit.f99208a;
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public static final void tryToRefreshFirstActivity(@Nullable Activity activity) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (firstActivityKnown || getCurrentActivity() != null || activity == null) {
                return;
            }
            currentActivityRef = new WeakReference<>(activity);
            firstActivityKnown = true;
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    /* compiled from: AppLifecycleHelper.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static class ActivityLifecycleObserver {
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onApplicationInBackground() {
        }

        public void onApplicationInForeground() {
        }
    }

    public static /* synthetic */ void getCurrentActivity$annotations() {
    }

    public static /* synthetic */ void getGlobalContext$annotations() {
    }

    public static /* synthetic */ void isAppInForeground$annotations() {
    }
}
