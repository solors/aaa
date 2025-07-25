package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.core.C0379a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.j */
/* loaded from: classes6.dex */
public final class C20123j {
    @NotNull

    /* renamed from: a */
    public static final C20123j f50655a = new C20123j();
    @NotNull

    /* renamed from: b */
    private static AtomicReference<Boolean> f50656b = new AtomicReference<>(Boolean.FALSE);
    @NotNull

    /* renamed from: c */
    private static AtomicReference<WeakReference<Activity>> f50657c = new AtomicReference<>(null);

    @Metadata
    /* renamed from: com.ironsource.j$a */
    /* loaded from: classes6.dex */
    public static final class C20124a implements Application.ActivityLifecycleCallbacks {
        C20124a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C0379a.m105461a(C20123j.f50657c, null, new WeakReference(activity));
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
            C20123j.f50657c.set(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C0379a.m105461a(C20123j.f50657c, null, new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    private C20123j() {
    }

    @Nullable
    /* renamed from: b */
    public final Activity m57926b() {
        WeakReference<Activity> weakReference = f50657c.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    private final void m57928a(Application application) {
        application.registerActivityLifecycleCallbacks(new C20124a());
    }

    /* renamed from: a */
    public final void m57927a(@NotNull Context context) {
        Application application;
        Intrinsics.checkNotNullParameter(context, "context");
        if (C0379a.m105461a(f50656b, Boolean.FALSE, Boolean.TRUE)) {
            if (context instanceof Activity) {
                Application application2 = ((Activity) context).getApplication();
                Intrinsics.checkNotNullExpressionValue(application2, "context.application");
                m57928a(application2);
                f50657c.set(new WeakReference<>(context));
                return;
            }
            if (context instanceof Service) {
                application = ((Service) context).getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "context.application");
            } else if (!(context instanceof Application)) {
                return;
            } else {
                application = (Application) context;
            }
            m57928a(application);
        }
    }
}
