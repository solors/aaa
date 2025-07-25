package com.iab.omid.library.pubmatic.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.pubmatic.internal.d */
/* loaded from: classes6.dex */
public class C18437d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f46225a;

    /* renamed from: b */
    protected boolean f46226b;

    /* renamed from: c */
    private InterfaceC18438a f46227c;

    /* renamed from: com.iab.omid.library.pubmatic.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18438a {
        /* renamed from: a */
        void mo62698a(boolean z);
    }

    /* renamed from: a */
    public void m62742a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m62739b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m62737c() {
        return this.f46226b;
    }

    /* renamed from: d */
    protected boolean mo62736d() {
        return false;
    }

    /* renamed from: e */
    public void m62735e() {
        this.f46225a = true;
        boolean m62743a = m62743a();
        this.f46226b = m62743a;
        mo62738b(m62743a);
    }

    /* renamed from: f */
    public void m62734f() {
        this.f46225a = false;
        this.f46227c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m62740a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m62740a(m62743a());
    }

    /* renamed from: a */
    public void m62741a(InterfaceC18438a interfaceC18438a) {
        this.f46227c = interfaceC18438a;
    }

    /* renamed from: b */
    protected void mo62738b(boolean z) {
    }

    /* renamed from: a */
    private void m62740a(boolean z) {
        if (this.f46226b != z) {
            this.f46226b = z;
            if (this.f46225a) {
                mo62738b(z);
                InterfaceC18438a interfaceC18438a = this.f46227c;
                if (interfaceC18438a != null) {
                    interfaceC18438a.mo62698a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m62743a() {
        return (m62739b().importance == 100) || mo62736d();
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
