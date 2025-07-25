package com.maticoo.sdk.utils.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.maticoo.sdk.BuildConfig;
import com.maticoo.sdk.core.AdPage;
import com.maticoo.sdk.p405ad.utils.AdsUtil;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.ViewUtils;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.unity3d.player.UnityPlayerActivity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class ActLifecycle implements Application.ActivityLifecycleCallbacks {
    private final List<Activity> mRefActivities;
    private long startTime;
    private static final AtomicBoolean mIsBackgroundRun = new AtomicBoolean(false);
    private static final AtomicBoolean hasRegister = new AtomicBoolean(false);
    private static final AtomicBoolean mIsMaticoo = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class DKLifecycleHolder {
        private static final ActLifecycle INSTANCE = new ActLifecycle();

        private DKLifecycleHolder() {
        }
    }

    public static ActLifecycle getInstance() {
        return DKLifecycleHolder.INSTANCE;
    }

    private void handleActivityStarted(Activity activity) {
        if (!ApplicationUtil.getInstance().isMainProcess(activity)) {
            DeveloperLog.LogD("ActLifecycle, handleActivityStarted, not main progress");
            return;
        }
        try {
            mIsMaticoo.set(isMaticooActivity(activity));
            if (setActivity(activity) && this.mRefActivities.size() == 1) {
                this.startTime = System.currentTimeMillis();
            }
            DeveloperLog.LogD("ActLifecycle, handleActivityStarted: size = " + this.mRefActivities.size());
        } catch (Exception e) {
            DeveloperLog.LogD("handleActivityStarted, Exception: " + e);
        }
    }

    private void handleActivityStopped(Activity activity) {
        try {
            this.mRefActivities.remove(activity);
            DeveloperLog.LogD("ActLifecycle, handleActivityStopped: size = " + this.mRefActivities.size());
            if (this.mRefActivities.size() == 0) {
                long j = this.startTime;
                if (j > 0) {
                    AdsUtil.reportAppDuration(j);
                }
                this.startTime = 0L;
            }
        } catch (Exception unused) {
        }
    }

    public static boolean isBackgroundRun() {
        return mIsBackgroundRun.get();
    }

    public static boolean isMaticoo() {
        return mIsMaticoo.get();
    }

    private static boolean isMaticooActivity(Activity activity) {
        if (activity == null || !activity.toString().contains(BuildConfig.LIBRARY_PACKAGE_NAME) || !(activity instanceof AdPage)) {
            return false;
        }
        return true;
    }

    private boolean isUnity(Activity activity) {
        try {
            Class<?> cls = activity.getClass();
            int i = UnityPlayerActivity.f74821b;
            return UnityPlayerActivity.class.isAssignableFrom(cls);
        } catch (Throwable unused) {
            return false;
        }
    }

    public Activity getActivity() {
        if (this.mRefActivities.isEmpty()) {
            return null;
        }
        for (int size = this.mRefActivities.size() - 1; size >= 0; size--) {
            Activity activity = this.mRefActivities.get(size);
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                return activity;
            }
        }
        return null;
    }

    public void init() {
        if (!hasRegister.compareAndSet(false, true)) {
            return;
        }
        DeveloperLog.LogD("ActLifecycle register");
        Application applicationContext = ApplicationUtil.getInstance().getApplicationContext();
        applicationContext.registerActivityLifecycleCallbacks(this);
        boolean isAppForeground = ApplicationUtil.getInstance().isAppForeground(applicationContext);
        DeveloperLog.LogD("ActLifecycle register, isAppForeground = " + isAppForeground);
        if (isAppForeground) {
            this.startTime = System.currentTimeMillis();
        }
    }

    public boolean isActivityStarted(Activity activity) {
        if (activity == null) {
            return false;
        }
        DeveloperLog.LogD("ActLifecycle, isActivityStarted, activity = " + activity);
        if (!this.mRefActivities.contains(activity)) {
            return false;
        }
        return true;
    }

    public boolean isViewInForeground(View view) {
        DeveloperLog.LogD("ActLifecycle, isViewInForeground, view = " + view);
        if (view == null) {
            return false;
        }
        Activity scanForActivity = ViewUtils.scanForActivity(view.getContext());
        if (scanForActivity != null) {
            return isActivityStarted(scanForActivity);
        }
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof View)) {
            return false;
        }
        return isViewInForeground((View) parent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        DeveloperLog.LogD("ActLifecycle, onActivityCreated: " + activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        DeveloperLog.LogD("ActLifecycle, onActivityDestroyed: " + activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        DeveloperLog.LogD("ActLifecycle, onActivityPaused: " + activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        DeveloperLog.LogD("ActLifecycle, onActivityResumed: " + activity.toString());
        handleActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        DeveloperLog.LogD("ActLifecycle, onActivityStarted: " + activity.toString());
        mIsBackgroundRun.set(false);
        handleActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        DeveloperLog.LogD("ActLifecycle, onActivityStopped: " + activity.toString());
        mIsBackgroundRun.set(true);
        handleActivityStopped(activity);
    }

    public boolean setActivity(Activity activity) {
        if (!this.mRefActivities.contains(activity)) {
            this.mRefActivities.add(activity);
            return true;
        }
        return false;
    }

    private ActLifecycle() {
        this.mRefActivities = new CopyOnWriteArrayList();
        this.startTime = 0L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
