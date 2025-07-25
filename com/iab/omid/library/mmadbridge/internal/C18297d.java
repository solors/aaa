package com.iab.omid.library.mmadbridge.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.mmadbridge.internal.d */
/* loaded from: classes6.dex */
public class C18297d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f45955a;

    /* renamed from: b */
    protected boolean f45956b;

    /* renamed from: c */
    private InterfaceC18298a f45957c;

    /* renamed from: com.iab.omid.library.mmadbridge.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18298a {
        /* renamed from: a */
        void mo63204a(boolean z);
    }

    /* renamed from: a */
    public void m63248a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m63245b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m63243c() {
        return this.f45956b;
    }

    /* renamed from: d */
    protected boolean mo63242d() {
        return false;
    }

    /* renamed from: e */
    public void m63241e() {
        this.f45955a = true;
        boolean m63249a = m63249a();
        this.f45956b = m63249a;
        mo63244b(m63249a);
    }

    /* renamed from: f */
    public void m63240f() {
        this.f45955a = false;
        this.f45957c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m63246a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m63246a(m63249a());
    }

    /* renamed from: a */
    public void m63247a(InterfaceC18298a interfaceC18298a) {
        this.f45957c = interfaceC18298a;
    }

    /* renamed from: b */
    protected void mo63244b(boolean z) {
    }

    /* renamed from: a */
    private void m63246a(boolean z) {
        if (this.f45956b != z) {
            this.f45956b = z;
            if (this.f45955a) {
                mo63244b(z);
                InterfaceC18298a interfaceC18298a = this.f45957c;
                if (interfaceC18298a != null) {
                    interfaceC18298a.mo63204a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m63249a() {
        return (m63245b().importance == 100) || mo63242d();
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
