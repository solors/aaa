package com.iab.omid.library.bytedance2.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.bytedance2.internal.d */
/* loaded from: classes6.dex */
public class C17992d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f45323a;

    /* renamed from: b */
    protected boolean f45324b;

    /* renamed from: c */
    private InterfaceC17993a f45325c;

    /* renamed from: com.iab.omid.library.bytedance2.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17993a {
        /* renamed from: a */
        void mo64384a(boolean z);
    }

    /* renamed from: a */
    public void m64427a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m64424b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m64422c() {
        return this.f45324b;
    }

    /* renamed from: d */
    protected boolean mo64421d() {
        return false;
    }

    /* renamed from: e */
    public void m64420e() {
        this.f45323a = true;
        boolean m64428a = m64428a();
        this.f45324b = m64428a;
        mo64423b(m64428a);
    }

    /* renamed from: f */
    public void m64419f() {
        this.f45323a = false;
        this.f45325c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m64425a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m64425a(m64428a());
    }

    /* renamed from: a */
    public void m64426a(InterfaceC17993a interfaceC17993a) {
        this.f45325c = interfaceC17993a;
    }

    /* renamed from: b */
    protected void mo64423b(boolean z) {
    }

    /* renamed from: a */
    private void m64425a(boolean z) {
        if (this.f45324b != z) {
            this.f45324b = z;
            if (this.f45323a) {
                mo64423b(z);
                InterfaceC17993a interfaceC17993a = this.f45325c;
                if (interfaceC17993a != null) {
                    interfaceC17993a.mo64384a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m64428a() {
        return (m64424b().importance == 100) || mo64421d();
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
