package com.meevii.abtest.business;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meevii.abtest.util.Constant;

/* loaded from: classes6.dex */
public class AbLifecycleManager {
    private boolean isFirstActivityCreate;
    private volatile boolean isInit;

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final AbLifecycleManager singleton = new AbLifecycleManager();

        private Holder() {
        }
    }

    public static AbLifecycleManager get() {
        return Holder.singleton;
    }

    public void init(Application application) {
        if (this.isInit || application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.meevii.abtest.business.AbLifecycleManager.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (!DisObserveActivityManager.get().isDisObserveActivity(activity.getClass()) && !AbLifecycleManager.this.isFirstActivityCreate) {
                    RelyTaskManager.get().markTaskCanDeal(Constant.TASK_KEY_SDK_REQUEST_REMOTE_DATA);
                    RelyTaskManager.get().markTaskCanDeal(Constant.TASK_KEY_SDK_SEND_FOREGROUND_EVENT);
                    AbLifecycleManager.this.isFirstActivityCreate = true;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }
        });
        this.isInit = true;
    }

    private AbLifecycleManager() {
    }
}
