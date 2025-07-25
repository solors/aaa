package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private final Set<Intent> f43188b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static /* synthetic */ void m66673a(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        fcmLifecycleCallbacks.m66672b(intent);
    }

    /* renamed from: c */
    public void m66672b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle(Constants.MessageNotificationKeys.ANALYTICS_DATA);
            }
        } catch (RuntimeException e) {
            Log.w(Constants.TAG, "Failed trying to get analytics data from Intent extras.", e);
        }
        if (MessagingAnalytics.shouldUploadScionMetrics(bundle)) {
            MessagingAnalytics.logNotificationOpen(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent != null && this.f43188b.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        FcmLifecycleCallbacks.m66673a(FcmLifecycleCallbacks.this, intent);
                    }
                });
            } else {
                m66672b(intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f43188b.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
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
}
