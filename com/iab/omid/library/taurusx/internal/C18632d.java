package com.iab.omid.library.taurusx.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.taurusx.internal.d */
/* loaded from: classes6.dex */
public class C18632d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f46631a;

    /* renamed from: b */
    protected boolean f46632b;

    /* renamed from: c */
    private InterfaceC18633a f46633c;

    /* renamed from: com.iab.omid.library.taurusx.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18633a {
        /* renamed from: a */
        void mo61943a(boolean z);
    }

    /* renamed from: a */
    public void m61980a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m61977b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m61975c() {
        return this.f46632b;
    }

    /* renamed from: d */
    protected boolean mo61974d() {
        return false;
    }

    /* renamed from: e */
    public void m61973e() {
        this.f46631a = true;
        boolean m61981a = m61981a();
        this.f46632b = m61981a;
        mo61976b(m61981a);
    }

    /* renamed from: f */
    public void m61972f() {
        this.f46631a = false;
        this.f46633c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m61978a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m61978a(m61981a());
    }

    /* renamed from: a */
    public void m61979a(InterfaceC18633a interfaceC18633a) {
        this.f46633c = interfaceC18633a;
    }

    /* renamed from: b */
    protected void mo61976b(boolean z) {
    }

    /* renamed from: a */
    private void m61978a(boolean z) {
        if (this.f46632b != z) {
            this.f46632b = z;
            if (this.f46631a) {
                mo61976b(z);
                InterfaceC18633a interfaceC18633a = this.f46633c;
                if (interfaceC18633a != null) {
                    interfaceC18633a.mo61943a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m61981a() {
        return (m61977b().importance == 100) || mo61974d();
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
