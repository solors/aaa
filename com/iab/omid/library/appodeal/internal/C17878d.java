package com.iab.omid.library.appodeal.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.appodeal.internal.d */
/* loaded from: classes6.dex */
public class C17878d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f45067a;

    /* renamed from: b */
    protected boolean f45068b;

    /* renamed from: c */
    private InterfaceC17879a f45069c;

    /* renamed from: com.iab.omid.library.appodeal.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17879a {
        /* renamed from: a */
        void mo64850a(boolean z);
    }

    /* renamed from: a */
    public void m64894a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m64891b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m64889c() {
        return this.f45068b;
    }

    /* renamed from: d */
    protected boolean mo64888d() {
        return false;
    }

    /* renamed from: e */
    public void m64887e() {
        this.f45067a = true;
        boolean m64895a = m64895a();
        this.f45068b = m64895a;
        mo64890b(m64895a);
    }

    /* renamed from: f */
    public void m64886f() {
        this.f45067a = false;
        this.f45069c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m64892a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m64892a(m64895a());
    }

    /* renamed from: a */
    public void m64893a(InterfaceC17879a interfaceC17879a) {
        this.f45069c = interfaceC17879a;
    }

    /* renamed from: b */
    protected void mo64890b(boolean z) {
    }

    /* renamed from: a */
    private void m64892a(boolean z) {
        if (this.f45068b != z) {
            this.f45068b = z;
            if (this.f45067a) {
                mo64890b(z);
                InterfaceC17879a interfaceC17879a = this.f45069c;
                if (interfaceC17879a != null) {
                    interfaceC17879a.mo64850a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m64895a() {
        return (m64891b().importance == 100) || mo64888d();
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
