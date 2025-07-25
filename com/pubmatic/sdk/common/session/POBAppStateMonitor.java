package com.pubmatic.sdk.common.session;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: POBAppStateMonitor.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBAppStateMonitor implements POBAppStateMonitoring, Application.ActivityLifecycleCallbacks {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable

    /* renamed from: a */
    private static volatile POBAppStateMonitor f70254a;
    @NotNull

    /* renamed from: b */
    private final Application f70255b;
    @NotNull

    /* renamed from: c */
    private Handler f70256c;
    @NotNull

    /* renamed from: d */
    private Runnable f70257d;

    /* renamed from: e */
    private long f70258e;

    /* renamed from: f */
    private long f70259f;

    /* renamed from: g */
    private boolean f70260g;
    @NotNull

    /* renamed from: h */
    private List<POBAppLifecycleListener> f70261h;

    /* compiled from: POBAppStateMonitor.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final POBAppStateMonitor getInstance(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            POBAppStateMonitor pOBAppStateMonitor = POBAppStateMonitor.f70254a;
            if (pOBAppStateMonitor == null) {
                synchronized (this) {
                    pOBAppStateMonitor = POBAppStateMonitor.f70254a;
                    if (pOBAppStateMonitor == null) {
                        pOBAppStateMonitor = new POBAppStateMonitor(application, null);
                        POBAppStateMonitor.f70254a = pOBAppStateMonitor;
                    }
                }
            }
            return pOBAppStateMonitor;
        }

        private Companion() {
        }
    }

    /* compiled from: POBAppStateMonitor.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface POBAppLifecycleListener {
        void onAppMovedToBackground();

        void onAppMovedToForeground();
    }

    public /* synthetic */ POBAppStateMonitor(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* renamed from: a */
    public static final void m40568a(POBAppStateMonitor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f70260g && this$0.f70259f - this$0.f70258e >= 700) {
            this$0.f70260g = false;
            for (POBAppLifecycleListener pOBAppLifecycleListener : this$0.f70261h) {
                pOBAppLifecycleListener.onAppMovedToBackground();
            }
        }
    }

    /* renamed from: b */
    public static final void m40567b(POBAppStateMonitor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f70255b.registerActivityLifecycleCallbacks(this$0);
    }

    /* renamed from: c */
    public static final void m40566c(POBAppStateMonitor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f70255b.unregisterActivityLifecycleCallbacks(this$0);
    }

    /* renamed from: d */
    public static /* synthetic */ void m40565d(POBAppStateMonitor pOBAppStateMonitor) {
        m40566c(pOBAppStateMonitor);
    }

    /* renamed from: e */
    public static /* synthetic */ void m40564e(POBAppStateMonitor pOBAppStateMonitor) {
        m40567b(pOBAppStateMonitor);
    }

    /* renamed from: f */
    public static /* synthetic */ void m40563f(POBAppStateMonitor pOBAppStateMonitor) {
        m40568a(pOBAppStateMonitor);
    }

    @NotNull
    public static final POBAppStateMonitor getInstance(@NotNull Application application) {
        return Companion.getInstance(application);
    }

    @Override // com.pubmatic.sdk.common.session.POBAppStateMonitoring
    public void addAppLifecycleListener(@NotNull POBAppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f70261h.add(listener);
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.f70260g) {
            this.f70260g = true;
            for (POBAppLifecycleListener pOBAppLifecycleListener : this.f70261h) {
                pOBAppLifecycleListener.onAppMovedToForeground();
            }
        }
        this.f70258e = System.currentTimeMillis();
        this.f70256c.removeCallbacks(this.f70257d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f70259f = System.currentTimeMillis();
        this.f70256c.postDelayed(this.f70257d, 700L);
    }

    @Override // com.pubmatic.sdk.common.session.POBAppStateMonitoring
    public void release() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pubmatic.sdk.common.session.a
            @Override // java.lang.Runnable
            public final void run() {
                POBAppStateMonitor.m40565d(POBAppStateMonitor.this);
            }
        });
        this.f70258e = 0L;
        this.f70259f = 0L;
        this.f70261h.clear();
    }

    @Override // com.pubmatic.sdk.common.session.POBAppStateMonitoring
    public void removeAppLifecycleListener(@NotNull POBAppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f70261h.remove(listener);
    }

    private POBAppStateMonitor(Application application) {
        this.f70255b = application;
        this.f70260g = true;
        this.f70261h = new ArrayList();
        this.f70257d = new Runnable() { // from class: com.pubmatic.sdk.common.session.b
            @Override // java.lang.Runnable
            public final void run() {
                POBAppStateMonitor.m40563f(POBAppStateMonitor.this);
            }
        };
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            HandlerThread handlerThread = new HandlerThread("POBAppStateMonitor");
            handlerThread.start();
            myLooper = handlerThread.getLooper();
        }
        this.f70256c = new Handler(myLooper);
        this.f70260g = true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pubmatic.sdk.common.session.c
            @Override // java.lang.Runnable
            public final void run() {
                POBAppStateMonitor.m40564e(POBAppStateMonitor.this);
            }
        });
    }
}
