package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class ActivityProvider {
    private static final ActivityProvider instance = new ActivityProvider();
    @NonNull
    private WeakReference<Activity> activityWeakReference = new WeakReference<>(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.smaato.sdk.core.lifecycle.ActivityProvider$a */
    /* loaded from: classes7.dex */
    public class C27124a extends ActivityLifecycleCallbacksAdapter {
        C27124a() {
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@Nullable Activity activity, @Nullable Bundle bundle) {
            ActivityProvider.this.activityWeakReference = new WeakReference(activity);
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@Nullable Activity activity) {
            if (ActivityProvider.this.activityWeakReference.get() == activity) {
                ActivityProvider.this.activityWeakReference.clear();
            }
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@Nullable Activity activity) {
            ActivityProvider.this.activityWeakReference = new WeakReference(activity);
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@Nullable Activity activity) {
            ActivityProvider.this.activityWeakReference = new WeakReference(activity);
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@Nullable Activity activity) {
            if (ActivityProvider.this.activityWeakReference.get() == activity) {
                ActivityProvider.this.activityWeakReference.clear();
            }
        }
    }

    private ActivityProvider() {
    }

    private void attach(@Nullable Context context) {
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C27124a());
        }
    }

    @NonNull
    public static ActivityProvider get() {
        return instance;
    }

    public static void init(@Nullable Context context) {
        instance.attach(context);
    }

    @Nullable
    public Activity getCurrentActivity() {
        return this.activityWeakReference.get();
    }
}
