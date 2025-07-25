package com.iab.omid.library.pubnativenet.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.pubnativenet.internal.d */
/* loaded from: classes6.dex */
public class C18507d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f46360a;

    /* renamed from: b */
    protected boolean f46361b;

    /* renamed from: c */
    private InterfaceC18508a f46362c;

    /* renamed from: com.iab.omid.library.pubnativenet.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18508a {
        /* renamed from: a */
        void mo62445a(boolean z);
    }

    /* renamed from: a */
    public void m62489a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m62486b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m62484c() {
        return this.f46361b;
    }

    /* renamed from: d */
    protected boolean mo62483d() {
        return false;
    }

    /* renamed from: e */
    public void m62482e() {
        this.f46360a = true;
        boolean m62490a = m62490a();
        this.f46361b = m62490a;
        mo62485b(m62490a);
    }

    /* renamed from: f */
    public void m62481f() {
        this.f46360a = false;
        this.f46362c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m62487a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m62487a(m62490a());
    }

    /* renamed from: a */
    public void m62488a(InterfaceC18508a interfaceC18508a) {
        this.f46362c = interfaceC18508a;
    }

    /* renamed from: b */
    protected void mo62485b(boolean z) {
    }

    /* renamed from: a */
    private void m62487a(boolean z) {
        if (this.f46361b != z) {
            this.f46361b = z;
            if (this.f46360a) {
                mo62485b(z);
                InterfaceC18508a interfaceC18508a = this.f46362c;
                if (interfaceC18508a != null) {
                    interfaceC18508a.mo62445a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m62490a() {
        return (m62486b().importance == 100) || mo62483d();
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
