package com.bytedance.sdk.openadsdk.core.p332WR.p333bg;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.bytedance.sdk.openadsdk.core.WR.bg.bg */
/* loaded from: classes3.dex */
public class C8855bg implements Application.ActivityLifecycleCallbacks {

    /* renamed from: bg */
    private static volatile C8855bg f19559bg;

    /* renamed from: IL */
    private final C8854IL f19560IL;

    private C8855bg(Application application) {
        this.f19560IL = C8854IL.m84653bg(application);
    }

    /* renamed from: bg */
    public static C8855bg m84649bg(Application application) {
        if (f19559bg == null) {
            synchronized (C8855bg.class) {
                if (f19559bg == null) {
                    f19559bg = new C8855bg(application);
                    application.registerActivityLifecycleCallbacks(f19559bg);
                }
            }
        }
        return f19559bg;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C8854IL c8854il = this.f19560IL;
        if (c8854il != null) {
            c8854il.m84654bg(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C8854IL c8854il = this.f19560IL;
        if (c8854il != null) {
            c8854il.m84656IL(activity);
        }
    }

    /* renamed from: bg */
    public String m84648bg(String str, long j, int i) {
        C8854IL c8854il = this.f19560IL;
        return c8854il != null ? c8854il.m84650bg(str, j, i) : "null";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
