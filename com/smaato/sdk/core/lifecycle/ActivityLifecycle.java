package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class ActivityLifecycle extends Lifecycle implements Application.ActivityLifecycleCallbacks {
    @Inject
    public static Application application;
    WeakReference<Activity> activity;

    public ActivityLifecycle(Activity activity) {
        this.activity = new WeakReference<>(activity);
        AndroidsInjector.injectStatic(ActivityLifecycle.class);
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39538a(ActivityLifecycle activityLifecycle, Lifecycle.Observer observer) {
        activityLifecycle.lambda$onActivityCreated$0(observer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39537b(ActivityLifecycle activityLifecycle, Lifecycle.Observer observer) {
        activityLifecycle.lambda$onActivityStopped$4(observer);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39536c(ActivityLifecycle activityLifecycle, Lifecycle.Observer observer) {
        activityLifecycle.lambda$onActivityPaused$3(observer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39535d(ActivityLifecycle activityLifecycle, Lifecycle.Observer observer) {
        activityLifecycle.lambda$onActivityStarted$1(observer);
    }

    /* renamed from: e */
    public static /* synthetic */ void m39534e(ActivityLifecycle activityLifecycle, Lifecycle.Observer observer) {
        activityLifecycle.lambda$onActivityDestroyed$5(observer);
    }

    /* renamed from: f */
    public static /* synthetic */ void m39533f(ActivityLifecycle activityLifecycle, Lifecycle.Observer observer) {
        activityLifecycle.lambda$onActivityResumed$2(observer);
    }

    public /* synthetic */ void lambda$onActivityCreated$0(Lifecycle.Observer observer) {
        observer.onCreate(this);
    }

    public /* synthetic */ void lambda$onActivityDestroyed$5(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }

    public /* synthetic */ void lambda$onActivityPaused$3(Lifecycle.Observer observer) {
        observer.onPause(this);
    }

    public /* synthetic */ void lambda$onActivityResumed$2(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public /* synthetic */ void lambda$onActivityStarted$1(Lifecycle.Observer observer) {
        observer.onStart(this);
    }

    public /* synthetic */ void lambda$onActivityStopped$4(Lifecycle.Observer observer) {
        observer.onStop(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        if (activity == this.activity.get()) {
            notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.e
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ActivityLifecycle.m39538a(ActivityLifecycle.this, (Lifecycle.Observer) obj);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        if (activity == this.activity.get()) {
            notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.f
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ActivityLifecycle.m39534e(ActivityLifecycle.this, (Lifecycle.Observer) obj);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        if (activity == this.activity.get()) {
            notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.d
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ActivityLifecycle.m39536c(ActivityLifecycle.this, (Lifecycle.Observer) obj);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        if (activity == this.activity.get()) {
            notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.b
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ActivityLifecycle.m39533f(ActivityLifecycle.this, (Lifecycle.Observer) obj);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        if (activity == this.activity.get()) {
            notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.c
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ActivityLifecycle.m39535d(ActivityLifecycle.this, (Lifecycle.Observer) obj);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        if (activity == this.activity.get()) {
            notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.a
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ActivityLifecycle.m39537b(ActivityLifecycle.this, (Lifecycle.Observer) obj);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
