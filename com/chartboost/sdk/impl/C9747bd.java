package com.chartboost.sdk.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.chartboost.sdk.impl.bd */
/* loaded from: classes3.dex */
public class C9747bd implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public boolean f21745a;

    /* renamed from: b */
    public boolean f21746b;

    /* renamed from: c */
    public InterfaceC9748a f21747c;

    /* renamed from: com.chartboost.sdk.impl.bd$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9748a {
        /* renamed from: a */
        void mo80644a(boolean z);
    }

    /* renamed from: a */
    public void m81966a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: b */
    public void mo80988b(boolean z) {
    }

    /* renamed from: c */
    public boolean m81962c() {
        return this.f21746b;
    }

    /* renamed from: d */
    public boolean mo80987d() {
        return false;
    }

    /* renamed from: e */
    public void m81961e() {
        this.f21745a = true;
        boolean m81967a = m81967a();
        this.f21746b = m81967a;
        mo80988b(m81967a);
    }

    /* renamed from: f */
    public void m81960f() {
        this.f21745a = false;
        this.f21747c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m81964a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m81964a(m81967a());
    }

    /* renamed from: a */
    public void m81965a(InterfaceC9748a interfaceC9748a) {
        this.f21747c = interfaceC9748a;
    }

    /* renamed from: b */
    public ActivityManager.RunningAppProcessInfo m81963b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: a */
    public final void m81964a(boolean z) {
        if (this.f21746b != z) {
            this.f21746b = z;
            if (this.f21745a) {
                mo80988b(z);
                InterfaceC9748a interfaceC9748a = this.f21747c;
                if (interfaceC9748a != null) {
                    interfaceC9748a.mo80644a(z);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m81967a() {
        return m81963b().importance == 100 || mo80987d();
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
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
