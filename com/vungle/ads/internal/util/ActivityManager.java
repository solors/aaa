package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.p623ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.C29518o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.c */
/* loaded from: classes7.dex */
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {
    @Nullable
    private Handler handler;
    @Nullable
    private String lastStoppedActivityName;
    @NotNull
    public static final C29502a Companion = new C29502a(null);
    private static final String TAG = ActivityManager.class.getSimpleName();
    @NotNull
    private static final ActivityManager instance = new ActivityManager();
    private static final long TIMEOUT = 3000;
    private static final long CONFIG_CHANGE_DELAY = 700;
    @NotNull
    private EnumC29506d state = EnumC29506d.UNKNOWN;
    @NotNull
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    @NotNull
    private final CopyOnWriteArraySet<String> startedActivities = new CopyOnWriteArraySet<>();
    @NotNull
    private final CopyOnWriteArraySet<String> resumedActivities = new CopyOnWriteArraySet<>();
    @NotNull
    private final CopyOnWriteArraySet<C29505c> callbacks = new CopyOnWriteArraySet<>();
    @NotNull
    private final ConcurrentHashMap<InterfaceC29504b, C29505c> adLeftCallbacks = new ConcurrentHashMap<>();
    @NotNull
    private final Runnable configChangeRunnable = new Runnable() { // from class: com.vungle.ads.internal.util.a
        @Override // java.lang.Runnable
        public final void run() {
            ActivityManager.m37479b(ActivityManager.this);
        }
    };

    /* compiled from: ActivityManager.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.c$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC29504b {
        void onLeftApplication();
    }

    /* compiled from: ActivityManager.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.c$d */
    /* loaded from: classes7.dex */
    public enum EnumC29506d {
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        UNKNOWN
    }

    /* compiled from: ActivityManager.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.c$e */
    /* loaded from: classes7.dex */
    public static final class C29507e extends C29505c {
        final /* synthetic */ Runnable $cancelRunnable;
        final /* synthetic */ WeakReference<InterfaceC29504b> $weakCallback;

        C29507e(WeakReference<InterfaceC29504b> weakReference, Runnable runnable) {
            ActivityManager.this = r1;
            this.$weakCallback = weakReference;
            this.$cancelRunnable = runnable;
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.C29505c
        public void onStart() {
            C29502a c29502a = ActivityManager.Companion;
            c29502a.getInstance$vungle_ads_release().removeListener(this);
            C29505c c29505c = (C29505c) ActivityManager.this.adLeftCallbacks.get(this.$weakCallback.get());
            if (c29505c != null) {
                Handler handler = ActivityManager.this.handler;
                if (handler != null) {
                    handler.postDelayed(this.$cancelRunnable, c29502a.getTIMEOUT());
                }
                ActivityManager.this.addListener(c29505c);
            }
        }
    }

    /* compiled from: ActivityManager.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.c$f */
    /* loaded from: classes7.dex */
    public static final class C29508f extends C29505c {
        final /* synthetic */ Runnable $cancelRunnable;
        final /* synthetic */ WeakReference<InterfaceC29504b> $weakCallback;
        final /* synthetic */ ActivityManager this$0;
        private boolean wasPaused;

        C29508f(WeakReference<InterfaceC29504b> weakReference, ActivityManager activityManager, Runnable runnable) {
            this.$weakCallback = weakReference;
            this.this$0 = activityManager;
            this.$cancelRunnable = runnable;
        }

        public final boolean getWasPaused() {
            return this.wasPaused;
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.C29505c
        public void onPause() {
            super.onPause();
            this.wasPaused = true;
            Handler handler = this.this$0.handler;
            if (handler != null) {
                handler.removeCallbacks(this.$cancelRunnable);
            }
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.C29505c
        public void onResume() {
            super.onResume();
            Handler handler = this.this$0.handler;
            if (handler != null) {
                handler.postDelayed(this.$cancelRunnable, ActivityManager.Companion.getCONFIG_CHANGE_DELAY() * 2);
            }
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.C29505c
        public void onStop() {
            super.onStop();
            InterfaceC29504b interfaceC29504b = this.$weakCallback.get();
            if (this.wasPaused && interfaceC29504b != null && this.this$0.adLeftCallbacks.containsKey(interfaceC29504b)) {
                interfaceC29504b.onLeftApplication();
            }
            this.this$0.removeOnNextAppLeftCallback(interfaceC29504b);
            Handler handler = this.this$0.handler;
            if (handler != null) {
                handler.removeCallbacks(this.$cancelRunnable);
            }
        }

        public final void setWasPaused(boolean z) {
            this.wasPaused = z;
        }
    }

    /* compiled from: ActivityManager.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.c$g */
    /* loaded from: classes7.dex */
    public static final class RunnableC29509g implements Runnable {
        final /* synthetic */ WeakReference<InterfaceC29504b> $weakCallback;

        RunnableC29509g(WeakReference<InterfaceC29504b> weakReference) {
            ActivityManager.this = r1;
            this.$weakCallback = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler = ActivityManager.this.handler;
            if (handler != null) {
                handler.removeCallbacks(this);
            }
            ActivityManager.this.removeOnNextAppLeftCallback(this.$weakCallback.get());
        }
    }

    private ActivityManager() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m37480a(Context context, ActivityManager activityManager) {
        m110396init$lambda1(context, activityManager);
    }

    /* renamed from: b */
    public static /* synthetic */ void m37479b(ActivityManager activityManager) {
        m110395configChangeRunnable$lambda0(activityManager);
    }

    /* renamed from: configChangeRunnable$lambda-0 */
    public static final void m110395configChangeRunnable$lambda0(ActivityManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getNoResumedActivities()) {
            EnumC29506d enumC29506d = this$0.state;
            EnumC29506d enumC29506d2 = EnumC29506d.PAUSED;
            if (enumC29506d != enumC29506d2) {
                this$0.state = enumC29506d2;
                Iterator<C29505c> it = this$0.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onPause();
                }
            }
        }
        if (this$0.getNoStartedActivities() && this$0.state == EnumC29506d.PAUSED) {
            this$0.state = EnumC29506d.STOPPED;
            Iterator<C29505c> it2 = this$0.callbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onStop();
            }
        }
    }

    private final boolean getNoResumedActivities() {
        return this.resumedActivities.isEmpty();
    }

    private final boolean getNoStartedActivities() {
        return this.startedActivities.isEmpty();
    }

    private final int getResumedActivitiesCount() {
        return this.resumedActivities.size();
    }

    private final int getStartedActivitiesCount() {
        return this.startedActivities.size();
    }

    public final boolean inForeground() {
        if (this.isInitialized.get() && this.lastStoppedActivityName != null && !isAppForeground()) {
            return false;
        }
        return true;
    }

    /* renamed from: init$lambda-1 */
    public static final void m110396init$lambda1(Context context, ActivityManager this$0) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m17073h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this$0);
    }

    private final boolean isAppForeground() {
        return !this.resumedActivities.isEmpty();
    }

    public final void removeListener(C29505c c29505c) {
        this.callbacks.remove(c29505c);
    }

    public final void removeOnNextAppLeftCallback(InterfaceC29504b interfaceC29504b) {
        C29505c remove;
        if (interfaceC29504b != null && (remove = this.adLeftCallbacks.remove(interfaceC29504b)) != null) {
            removeListener(remove);
        }
    }

    public final void addListener(@NotNull C29505c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.add(callback);
    }

    public final void addOnNextAppLeftCallback(@Nullable InterfaceC29504b interfaceC29504b) {
        if (interfaceC29504b == null) {
            return;
        }
        if (!this.isInitialized.get()) {
            interfaceC29504b.onLeftApplication();
            return;
        }
        WeakReference weakReference = new WeakReference(interfaceC29504b);
        RunnableC29509g runnableC29509g = new RunnableC29509g(weakReference);
        C29508f c29508f = new C29508f(weakReference, this, runnableC29509g);
        this.adLeftCallbacks.put(interfaceC29504b, c29508f);
        if (inForeground()) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.postDelayed(runnableC29509g, TIMEOUT);
            }
            addListener(c29508f);
            return;
        }
        instance.addListener(new C29507e(weakReference, runnableC29509g));
    }

    @VisibleForTesting
    public final void deInit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m17073h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.startedActivities.clear();
        this.resumedActivities.clear();
        this.isInitialized.set(false);
        this.callbacks.clear();
        this.adLeftCallbacks.clear();
    }

    public final void init(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            Handler handler = new Handler(Looper.getMainLooper());
            this.handler = handler;
            handler.post(new Runnable() { // from class: com.vungle.ads.internal.util.b
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManager.m37480a(context, this);
                }
            });
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c29519a.m37466e(TAG2, "Error initializing ActivityManager", e);
            this.isInitialized.set(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.resumedActivities.remove(activity.toString());
        if (getNoResumedActivities()) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.configChangeRunnable);
            }
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        List m17175e;
        Intrinsics.checkNotNullParameter(activity, "activity");
        boolean noResumedActivities = getNoResumedActivities();
        this.resumedActivities.add(activity.toString());
        if (getResumedActivitiesCount() == 1) {
            if (noResumedActivities) {
                EnumC29506d enumC29506d = EnumC29506d.RESUMED;
                m17175e = CollectionsJVM.m17175e(enumC29506d);
                if (!m17175e.contains(this.state)) {
                    this.state = enumC29506d;
                    Iterator<C29505c> it = this.callbacks.iterator();
                    while (it.hasNext()) {
                        it.next().onResume();
                    }
                    return;
                }
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.configChangeRunnable);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        List m17163p;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.startedActivities.add(activity.toString());
        if (getStartedActivitiesCount() == 1) {
            EnumC29506d enumC29506d = EnumC29506d.STARTED;
            m17163p = C37563v.m17163p(enumC29506d, EnumC29506d.RESUMED);
            if (!m17163p.contains(this.state)) {
                this.state = enumC29506d;
                Iterator<C29505c> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onStart();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Handler handler;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.lastStoppedActivityName = activity.toString();
        this.startedActivities.remove(activity.toString());
        if (getNoStartedActivities() && (handler = this.handler) != null) {
            handler.removeCallbacks(this.configChangeRunnable);
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }

    /* compiled from: ActivityManager.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.c$a */
    /* loaded from: classes7.dex */
    public static final class C29502a {

        /* compiled from: ActivityManager.kt */
        @Metadata
        /* renamed from: com.vungle.ads.internal.util.c$a$a */
        /* loaded from: classes7.dex */
        public static final class C29503a extends C29505c {
            final /* synthetic */ PresenterAdOpenCallback $adOpenCallback;
            final /* synthetic */ Intent $deepLinkOverrideIntent;
            final /* synthetic */ Intent $defaultIntent;
            final /* synthetic */ InterfaceC29504b $leftCallback;
            final /* synthetic */ WeakReference<Context> $weakContext;

            C29503a(WeakReference<Context> weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback, InterfaceC29504b interfaceC29504b) {
                this.$weakContext = weakReference;
                this.$deepLinkOverrideIntent = intent;
                this.$defaultIntent = intent2;
                this.$adOpenCallback = presenterAdOpenCallback;
                this.$leftCallback = interfaceC29504b;
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.C29505c
            public void onStart() {
                super.onStart();
                C29502a c29502a = ActivityManager.Companion;
                c29502a.getInstance$vungle_ads_release().removeListener(this);
                Context context = this.$weakContext.get();
                if (context != null && c29502a.startActivityHandleException(context, this.$deepLinkOverrideIntent, this.$defaultIntent, this.$adOpenCallback)) {
                    c29502a.getInstance$vungle_ads_release().addOnNextAppLeftCallback(this.$leftCallback);
                }
            }
        }

        private C29502a() {
        }

        public /* synthetic */ C29502a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean startActivityHandleException(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            if (intent == null && intent2 == null) {
                return false;
            }
            try {
                if (intent != null) {
                    context.startActivity(intent);
                    if (presenterAdOpenCallback != null) {
                        presenterAdOpenCallback.onDeeplinkClick(true);
                    }
                } else {
                    context.startActivity(intent2);
                }
                return true;
            } catch (Exception e) {
                C29518o.C29519a c29519a = C29518o.Companion;
                String TAG = getTAG();
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c29519a.m37467e(TAG, "Cannot launch/find activity to handle the Implicit intent: " + e);
                if (intent != null) {
                    try {
                        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                        analyticsClient.logError$vungle_ads_release(312, "Fail to open " + intent.getDataString(), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                        if (presenterAdOpenCallback != null) {
                            presenterAdOpenCallback.onDeeplinkClick(false);
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
                if (intent != null && intent2 != null) {
                    context.startActivity(intent2);
                    return true;
                }
                return false;
            }
        }

        public final void addLifecycleListener(@NotNull C29505c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final long getCONFIG_CHANGE_DELAY() {
            return ActivityManager.CONFIG_CHANGE_DELAY;
        }

        @NotNull
        public final ActivityManager getInstance$vungle_ads_release() {
            return ActivityManager.instance;
        }

        public final String getTAG() {
            return ActivityManager.TAG;
        }

        public final long getTIMEOUT() {
            return ActivityManager.TIMEOUT;
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final void startWhenForeground(@NotNull Context context, @Nullable Intent intent, @Nullable Intent intent2, @Nullable InterfaceC29504b interfaceC29504b, @Nullable PresenterAdOpenCallback presenterAdOpenCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            WeakReference weakReference = new WeakReference(context);
            if (getInstance$vungle_ads_release().inForeground()) {
                if (startActivityHandleException(context, intent, intent2, presenterAdOpenCallback)) {
                    getInstance$vungle_ads_release().addOnNextAppLeftCallback(interfaceC29504b);
                    return;
                }
                return;
            }
            getInstance$vungle_ads_release().addListener(new C29503a(weakReference, intent, intent2, presenterAdOpenCallback, interfaceC29504b));
        }

        public final void startWhenForeground(@NotNull Context context, @Nullable Intent intent, @Nullable Intent intent2, @Nullable InterfaceC29504b interfaceC29504b) {
            Intrinsics.checkNotNullParameter(context, "context");
            startWhenForeground(context, intent, intent2, interfaceC29504b, null);
        }

        @VisibleForTesting
        public static /* synthetic */ void getCONFIG_CHANGE_DELAY$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getTIMEOUT$annotations() {
        }
    }

    /* compiled from: ActivityManager.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.c$c */
    /* loaded from: classes7.dex */
    public static class C29505c {
        public void onPause() {
        }

        public void onResume() {
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }
}
