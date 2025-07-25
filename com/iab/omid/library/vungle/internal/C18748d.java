package com.iab.omid.library.vungle.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.vungle.internal.d */
/* loaded from: classes6.dex */
public class C18748d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f46886a;

    /* renamed from: b */
    protected boolean f46887b;

    /* renamed from: c */
    private InterfaceC18749a f46888c;

    /* renamed from: com.iab.omid.library.vungle.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18749a {
        /* renamed from: a */
        void mo61470a(boolean z);
    }

    /* renamed from: a */
    public void m61514a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m61511b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m61509c() {
        return this.f46887b;
    }

    /* renamed from: d */
    protected boolean mo61508d() {
        return false;
    }

    /* renamed from: e */
    public void m61507e() {
        this.f46886a = true;
        boolean m61515a = m61515a();
        this.f46887b = m61515a;
        mo61510b(m61515a);
    }

    /* renamed from: f */
    public void m61506f() {
        this.f46886a = false;
        this.f46888c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m61512a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m61512a(m61515a());
    }

    /* renamed from: a */
    public void m61513a(InterfaceC18749a interfaceC18749a) {
        this.f46888c = interfaceC18749a;
    }

    /* renamed from: b */
    protected void mo61510b(boolean z) {
    }

    /* renamed from: a */
    private void m61512a(boolean z) {
        if (this.f46887b != z) {
            this.f46887b = z;
            if (this.f46886a) {
                mo61510b(z);
                InterfaceC18749a interfaceC18749a = this.f46888c;
                if (interfaceC18749a != null) {
                    interfaceC18749a.mo61470a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m61515a() {
        return (m61511b().importance == 100) || mo61508d();
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
