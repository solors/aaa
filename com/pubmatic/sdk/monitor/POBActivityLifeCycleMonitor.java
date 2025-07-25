package com.pubmatic.sdk.monitor;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class POBActivityLifeCycleMonitor implements Application.ActivityLifecycleCallbacks {
    @Nullable

    /* renamed from: a */
    private InterfaceC26743a f70359a;

    /* renamed from: b */
    private Application f70360b;

    /* renamed from: c */
    private boolean f70361c = false;
    @Nullable
    public WeakReference<Activity> currentActivity;

    /* renamed from: com.pubmatic.sdk.monitor.POBActivityLifeCycleMonitor$a */
    /* loaded from: classes7.dex */
    interface InterfaceC26743a {
        /* renamed from: a */
        void mo40505a(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);
    }

    public POBActivityLifeCycleMonitor(Application application) {
        this.f70360b = application;
    }

    @Nullable
    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        InterfaceC26743a interfaceC26743a;
        if (!this.f70361c && (interfaceC26743a = this.f70359a) != null) {
            interfaceC26743a.mo40505a(activity);
        }
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.currentActivity = null;
        this.f70361c = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        InterfaceC26743a interfaceC26743a = this.f70359a;
        if (interfaceC26743a != null) {
            interfaceC26743a.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
        InterfaceC26743a interfaceC26743a = this.f70359a;
        if (interfaceC26743a != null) {
            interfaceC26743a.onActivityResumed(activity);
        }
        this.f70361c = true;
    }

    public void reset() {
        this.f70360b.unregisterActivityLifecycleCallbacks(this);
        this.currentActivity = null;
    }

    public void start(InterfaceC26743a interfaceC26743a) {
        this.f70359a = interfaceC26743a;
        this.f70360b.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
