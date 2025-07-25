package com.iab.omid.library.inmobi.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.inmobi.internal.d */
/* loaded from: classes6.dex */
public class C18180d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f45701a;

    /* renamed from: b */
    protected boolean f45702b;

    /* renamed from: c */
    private InterfaceC18181a f45703c;

    /* renamed from: com.iab.omid.library.inmobi.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18181a {
        /* renamed from: a */
        void mo63681a(boolean z);
    }

    /* renamed from: a */
    public void m63724a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m63721b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m63719c() {
        return this.f45702b;
    }

    /* renamed from: d */
    protected boolean mo63718d() {
        return false;
    }

    /* renamed from: e */
    public void m63717e() {
        this.f45701a = true;
        boolean m63725a = m63725a();
        this.f45702b = m63725a;
        mo63720b(m63725a);
    }

    /* renamed from: f */
    public void m63716f() {
        this.f45701a = false;
        this.f45703c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m63722a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m63722a(m63725a());
    }

    /* renamed from: a */
    public void m63723a(InterfaceC18181a interfaceC18181a) {
        this.f45703c = interfaceC18181a;
    }

    /* renamed from: b */
    protected void mo63720b(boolean z) {
    }

    /* renamed from: a */
    private void m63722a(boolean z) {
        if (this.f45702b != z) {
            this.f45702b = z;
            if (this.f45701a) {
                mo63720b(z);
                InterfaceC18181a interfaceC18181a = this.f45703c;
                if (interfaceC18181a != null) {
                    interfaceC18181a.mo63681a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m63725a() {
        return (m63721b().importance == 100) || mo63718d();
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
