package com.iab.omid.library.ironsrc.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.ironsrc.internal.d */
/* loaded from: classes6.dex */
public class C18239d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f45831a;

    /* renamed from: b */
    protected boolean f45832b;

    /* renamed from: c */
    private InterfaceC18240a f45833c;

    /* renamed from: com.iab.omid.library.ironsrc.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18240a {
        /* renamed from: a */
        void mo63443a(boolean z);
    }

    /* renamed from: a */
    public void m63480a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m63477b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m63475c() {
        return this.f45832b;
    }

    /* renamed from: d */
    protected boolean mo63474d() {
        return false;
    }

    /* renamed from: e */
    public void m63473e() {
        this.f45831a = true;
        boolean m63481a = m63481a();
        this.f45832b = m63481a;
        mo63476b(m63481a);
    }

    /* renamed from: f */
    public void m63472f() {
        this.f45831a = false;
        this.f45833c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m63478a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m63478a(m63481a());
    }

    /* renamed from: a */
    public void m63479a(InterfaceC18240a interfaceC18240a) {
        this.f45833c = interfaceC18240a;
    }

    /* renamed from: b */
    protected void mo63476b(boolean z) {
    }

    /* renamed from: a */
    private void m63478a(boolean z) {
        if (this.f45832b != z) {
            this.f45832b = z;
            if (this.f45831a) {
                mo63476b(z);
                InterfaceC18240a interfaceC18240a = this.f45833c;
                if (interfaceC18240a != null) {
                    interfaceC18240a.mo63443a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m63481a() {
        return (m63477b().importance == 100) || mo63474d();
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
