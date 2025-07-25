package com.meevii.adsdk.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.meevii.adsdk.common.util.LogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class AppStatus {
    private static final String TAG = "ADSDK_AppStatus";
    private boolean isAppInBackground;
    private int mActivityCount;
    private final List<Activity> mActivityList;
    private final List<AppStatusListener> mAppStatusListenerList;
    private Application mApplication;
    private final Set<Integer> mApplicationSet;
    private final Set<String> mExternalActivitySet;

    /* loaded from: classes6.dex */
    private static class AppStatusInstance {
        private static final AppStatus INSTANCE = new AppStatus();

        private AppStatusInstance() {
        }
    }

    /* loaded from: classes6.dex */
    public interface AppStatusListener {
        void onActivityCreated(Activity activity);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onBackToForeground();

        void onBackground();
    }

    static /* synthetic */ int access$506(AppStatus appStatus) {
        int i = appStatus.mActivityCount - 1;
        appStatus.mActivityCount = i;
        return i;
    }

    static /* synthetic */ int access$508(AppStatus appStatus) {
        int i = appStatus.mActivityCount;
        appStatus.mActivityCount = i + 1;
        return i;
    }

    private Object[] collectAppStatusListeners() {
        Object[] objArr;
        synchronized (this.mAppStatusListenerList) {
            if (!this.mAppStatusListenerList.isEmpty()) {
                objArr = this.mAppStatusListenerList.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    public static AppStatus getInstance() {
        return AppStatusInstance.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExternalActivity(Activity activity) {
        return this.mExternalActivitySet.contains(activity.getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyActivityCreate(Activity activity) {
        Object[] collectAppStatusListeners = collectAppStatusListeners();
        if (collectAppStatusListeners == null) {
            return;
        }
        for (Object obj : collectAppStatusListeners) {
            ((AppStatusListener) obj).onActivityCreated(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyActivityDestroy(Activity activity) {
        Object[] collectAppStatusListeners = collectAppStatusListeners();
        if (collectAppStatusListeners == null) {
            return;
        }
        for (Object obj : collectAppStatusListeners) {
            ((AppStatusListener) obj).onActivityDestroyed(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyActivityPause(Activity activity) {
        Object[] collectAppStatusListeners = collectAppStatusListeners();
        if (collectAppStatusListeners == null) {
            return;
        }
        for (Object obj : collectAppStatusListeners) {
            ((AppStatusListener) obj).onActivityPaused(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyActivityResume(Activity activity) {
        Object[] collectAppStatusListeners = collectAppStatusListeners();
        if (collectAppStatusListeners == null) {
            return;
        }
        for (Object obj : collectAppStatusListeners) {
            ((AppStatusListener) obj).onActivityResumed(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBackToForeground() {
        Object[] collectAppStatusListeners = collectAppStatusListeners();
        if (collectAppStatusListeners == null) {
            return;
        }
        for (Object obj : collectAppStatusListeners) {
            ((AppStatusListener) obj).onBackToForeground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBackground() {
        Object[] collectAppStatusListeners = collectAppStatusListeners();
        if (collectAppStatusListeners == null) {
            return;
        }
        for (Object obj : collectAppStatusListeners) {
            ((AppStatusListener) obj).onBackground();
        }
    }

    public void addAppStatusListener(AppStatusListener appStatusListener) {
        synchronized (this.mAppStatusListenerList) {
            if (this.mAppStatusListenerList.contains(appStatusListener)) {
                return;
            }
            this.mAppStatusListenerList.add(appStatusListener);
        }
    }

    public void addExternalActivity(HashSet<String> hashSet) {
        if (hashSet != null && !hashSet.isEmpty()) {
            this.mExternalActivitySet.addAll(hashSet);
        }
    }

    public Application getApplication() {
        return this.mApplication;
    }

    public Activity getCurrentValidActivity() {
        Activity activity;
        String localClassName;
        if (this.mActivityList.size() > 0) {
            List<Activity> list = this.mActivityList;
            activity = list.get(list.size() - 1);
        } else {
            activity = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getCurrentValidActivity  Activity :");
        if (activity == null) {
            localClassName = "null";
        } else {
            localClassName = activity.getLocalClassName();
        }
        sb2.append(localClassName);
        Log.d(TAG, sb2.toString());
        return activity;
    }

    public Activity getHomeActivity() {
        if (this.mActivityList.size() > 0) {
            return this.mActivityList.get(0);
        }
        return null;
    }

    public boolean isAppInBackground() {
        return this.isAppInBackground;
    }

    public void observeActivityLifeCycle(Application application) {
        this.mApplication = application;
        if (application != null && !this.mApplicationSet.contains(Integer.valueOf(application.hashCode()))) {
            this.mApplicationSet.add(Integer.valueOf(application.hashCode()));
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.meevii.adsdk.common.AppStatus.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (AppStatus.this.isExternalActivity(activity)) {
                        return;
                    }
                    AppStatus.this.mActivityList.add(activity);
                    AppStatus.this.notifyActivityCreate(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    if (AppStatus.this.isExternalActivity(activity)) {
                        return;
                    }
                    AppStatus.this.mActivityList.remove(activity);
                    AppStatus.this.notifyActivityDestroy(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    if (!AppStatus.this.isExternalActivity(activity)) {
                        AppStatus.this.notifyActivityPause(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    if (!AppStatus.this.isExternalActivity(activity)) {
                        AppStatus.this.notifyActivityResume(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    if (AppStatus.access$508(AppStatus.this) >= 0 && AppStatus.this.isAppInBackground) {
                        if (LogUtil.isShowLog()) {
                            LogUtil.m48060i(AppStatus.TAG, "onActivityStarted mActivityCount :" + AppStatus.this.mActivityCount + " BackToForeground");
                        }
                        AppStatus.this.isAppInBackground = false;
                        AppStatus.this.notifyBackToForeground();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    boolean z;
                    AppStatus appStatus = AppStatus.this;
                    if (AppStatus.access$506(appStatus) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    appStatus.isAppInBackground = z;
                    if (LogUtil.isShowLog()) {
                        LogUtil.m48060i(AppStatus.TAG, "onActivityStopped mActivityCount :" + AppStatus.this.mActivityCount + " isAppInBackground :" + AppStatus.this.isAppInBackground);
                    }
                    if (AppStatus.this.isAppInBackground) {
                        AppStatus.this.notifyBackground();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }
            });
        }
    }

    public void removeAppStatusListener(AppStatusListener appStatusListener) {
        synchronized (this.mAppStatusListenerList) {
            this.mAppStatusListenerList.remove(appStatusListener);
        }
    }

    public void setApplication(Application application) {
        if (application == null) {
            return;
        }
        this.mApplication = application;
    }

    private AppStatus() {
        this.mApplicationSet = new HashSet();
        this.mExternalActivitySet = new HashSet();
        this.mAppStatusListenerList = new ArrayList();
        this.mActivityList = new ArrayList(2);
    }
}
