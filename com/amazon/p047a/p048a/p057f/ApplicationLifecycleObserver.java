package com.amazon.p047a.p048a.p057f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazon.p047a.AppstoreSDK;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.ironsource.C21114v8;

/* renamed from: com.amazon.a.a.f.a */
/* loaded from: classes2.dex */
public class ApplicationLifecycleObserver implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static final KiwiLogger f2393a = new KiwiLogger("ApplicationLifecycleObserver");

    /* renamed from: b */
    private static final String f2394b = ApplicationLifecycleObserver.class.getSimpleName();

    /* renamed from: c */
    private static final ApplicationLifecycleObserver f2395c = new ApplicationLifecycleObserver();

    private ApplicationLifecycleObserver() {
    }

    /* renamed from: a */
    public static ApplicationLifecycleObserver m103129a() {
        return f2395c;
    }

    /* renamed from: b */
    private static boolean m103127b() {
        return AppstoreSDK.m103223d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!AppstoreSDK.m103223d()) {
            AppstoreSDK.m103237a((Context) activity.getApplication());
            f2393a.m102829a("AppstoreSDK Re-initialized");
        }
        if (m103128a("onCreate", activity)) {
            AppstoreSDK.m103230b().mo103191a(activity);
        }
        if (KiwiLogger.f2770a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            KiwiLogger kiwiLogger = f2393a;
            kiwiLogger.m102829a("ActivityOnCreate Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m103128a("onDestroy", activity)) {
            try {
                AppstoreSDK.m103230b().mo103186b(activity);
            } catch (Exception e) {
                f2393a.m102825b("ActivityOnDestroy Error: ", e);
            }
        }
        if (KiwiLogger.f2770a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            KiwiLogger kiwiLogger = f2393a;
            kiwiLogger.m102829a("ActivityOnDestroy Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m103128a(C21114v8.C21122h.f54092t0, activity)) {
            AppstoreSDK.m103230b().mo103181d(activity);
        }
        if (KiwiLogger.f2770a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            KiwiLogger kiwiLogger = f2393a;
            kiwiLogger.m102829a("ActivityOnPause Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m103128a(C21114v8.C21122h.f54094u0, activity)) {
            AppstoreSDK.m103230b().mo103183c(activity);
        }
        if (KiwiLogger.f2770a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            KiwiLogger kiwiLogger = f2393a;
            kiwiLogger.m102829a("ActivityOnResume Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        KiwiLogger kiwiLogger = f2393a;
        kiwiLogger.m102829a(f2394b + " onActivitySaveInstanceState " + activity.getLocalClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m103128a("onStart", activity)) {
            AppstoreSDK.m103230b().mo103179e(activity);
        }
        if (KiwiLogger.f2770a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            KiwiLogger kiwiLogger = f2393a;
            kiwiLogger.m102829a("ActivityOnStart Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m103128a("onStop", activity)) {
            AppstoreSDK.m103230b().mo103177f(activity);
        }
        if (KiwiLogger.f2770a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            KiwiLogger kiwiLogger = f2393a;
            kiwiLogger.m102829a("ActivityOnStop Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    /* renamed from: a */
    private static boolean m103128a(String str, Context context) {
        return AppstoreSDK.m103232a(str, context);
    }
}
