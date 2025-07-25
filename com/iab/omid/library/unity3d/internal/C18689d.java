package com.iab.omid.library.unity3d.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.unity3d.internal.d */
/* loaded from: classes6.dex */
public class C18689d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f46759a;

    /* renamed from: b */
    protected boolean f46760b;

    /* renamed from: c */
    private InterfaceC18690a f46761c;

    /* renamed from: com.iab.omid.library.unity3d.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18690a {
        /* renamed from: a */
        void mo61709a(boolean z);
    }

    /* renamed from: a */
    public void m61745a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m61742b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m61740c() {
        return this.f46760b;
    }

    /* renamed from: d */
    protected boolean mo61739d() {
        return false;
    }

    /* renamed from: e */
    public void m61738e() {
        this.f46759a = true;
        boolean m61746a = m61746a();
        this.f46760b = m61746a;
        mo61741b(m61746a);
    }

    /* renamed from: f */
    public void m61737f() {
        this.f46759a = false;
        this.f46761c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m61743a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m61743a(m61746a());
    }

    /* renamed from: a */
    public void m61744a(InterfaceC18690a interfaceC18690a) {
        this.f46761c = interfaceC18690a;
    }

    /* renamed from: b */
    protected void mo61741b(boolean z) {
    }

    /* renamed from: a */
    private void m61743a(boolean z) {
        if (this.f46760b != z) {
            this.f46760b = z;
            if (this.f46759a) {
                mo61741b(z);
                InterfaceC18690a interfaceC18690a = this.f46761c;
                if (interfaceC18690a != null) {
                    interfaceC18690a.mo61709a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m61746a() {
        return (m61742b().importance == 100) || mo61739d();
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
