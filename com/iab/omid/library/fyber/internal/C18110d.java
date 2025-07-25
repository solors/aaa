package com.iab.omid.library.fyber.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.fyber.internal.d */
/* loaded from: classes6.dex */
public class C18110d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f45566a;

    /* renamed from: b */
    protected boolean f45567b;

    /* renamed from: c */
    private InterfaceC18111a f45568c;

    /* renamed from: com.iab.omid.library.fyber.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18111a {
        /* renamed from: a */
        void mo63933a(boolean z);
    }

    /* renamed from: a */
    public void m63977a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m63974b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m63972c() {
        return this.f45567b;
    }

    /* renamed from: d */
    protected boolean mo63971d() {
        return false;
    }

    /* renamed from: e */
    public void m63970e() {
        this.f45566a = true;
        boolean m63978a = m63978a();
        this.f45567b = m63978a;
        mo63973b(m63978a);
    }

    /* renamed from: f */
    public void m63969f() {
        this.f45566a = false;
        this.f45568c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m63975a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m63975a(m63978a());
    }

    /* renamed from: a */
    public void m63976a(InterfaceC18111a interfaceC18111a) {
        this.f45568c = interfaceC18111a;
    }

    /* renamed from: b */
    protected void mo63973b(boolean z) {
    }

    /* renamed from: a */
    private void m63975a(boolean z) {
        if (this.f45567b != z) {
            this.f45567b = z;
            if (this.f45566a) {
                mo63973b(z);
                InterfaceC18111a interfaceC18111a = this.f45568c;
                if (interfaceC18111a != null) {
                    interfaceC18111a.mo63933a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m63978a() {
        return (m63974b().importance == 100) || mo63971d();
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
