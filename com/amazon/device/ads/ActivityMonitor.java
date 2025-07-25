package com.amazon.device.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class ActivityMonitor implements Application.ActivityLifecycleCallbacks {
    private static ActivityMonitor theInstance;
    private DTBActivityListener activityListener;
    private WeakReference<Activity> currentActivity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityMonitor(Context context) {
        if (context != null) {
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                setCurrentActivity(context);
                application.registerActivityLifecycleCallbacks(this);
            }
            theInstance = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ActivityMonitor getInstance() {
        return theInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.currentActivity = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityDestroyed(activity);
            if (getCurrentActivity() == activity) {
                this.currentActivity = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityStopped(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActivityListener(DTBActivityListener dTBActivityListener) {
        this.activityListener = dTBActivityListener;
    }

    void setCurrentActivity(Context context) {
        if (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.currentActivity = new WeakReference<>((Activity) context);
            } else {
                setCurrentActivity(((ContextWrapper) context).getBaseContext());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
