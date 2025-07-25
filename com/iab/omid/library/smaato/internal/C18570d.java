package com.iab.omid.library.smaato.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.smaato.internal.d */
/* loaded from: classes6.dex */
public class C18570d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f46495a;

    /* renamed from: b */
    protected boolean f46496b;

    /* renamed from: c */
    private InterfaceC18571a f46497c;

    /* renamed from: com.iab.omid.library.smaato.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18571a {
        /* renamed from: a */
        void mo62192a(boolean z);
    }

    /* renamed from: a */
    public void m62236a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m62233b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m62231c() {
        return this.f46496b;
    }

    /* renamed from: d */
    protected boolean mo62230d() {
        return false;
    }

    /* renamed from: e */
    public void m62229e() {
        this.f46495a = true;
        boolean m62237a = m62237a();
        this.f46496b = m62237a;
        mo62232b(m62237a);
    }

    /* renamed from: f */
    public void m62228f() {
        this.f46495a = false;
        this.f46497c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m62234a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m62234a(m62237a());
    }

    /* renamed from: a */
    public void m62235a(InterfaceC18571a interfaceC18571a) {
        this.f46497c = interfaceC18571a;
    }

    /* renamed from: b */
    protected void mo62232b(boolean z) {
    }

    /* renamed from: a */
    private void m62234a(boolean z) {
        if (this.f46496b != z) {
            this.f46496b = z;
            if (this.f46495a) {
                mo62232b(z);
                InterfaceC18571a interfaceC18571a = this.f46497c;
                if (interfaceC18571a != null) {
                    interfaceC18571a.mo62192a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m62237a() {
        return (m62233b().importance == 100) || mo62230d();
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
