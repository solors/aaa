package com.iab.omid.library.mobilefuse.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.mobilefuse.internal.d */
/* loaded from: classes6.dex */
public class C18367d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f46090a;

    /* renamed from: b */
    protected boolean f46091b;

    /* renamed from: c */
    private InterfaceC18368a f46092c;

    /* renamed from: com.iab.omid.library.mobilefuse.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18368a {
        /* renamed from: a */
        void mo62951a(boolean z);
    }

    /* renamed from: a */
    public void m62995a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m62992b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m62990c() {
        return this.f46091b;
    }

    /* renamed from: d */
    protected boolean mo62989d() {
        return false;
    }

    /* renamed from: e */
    public void m62988e() {
        this.f46090a = true;
        boolean m62996a = m62996a();
        this.f46091b = m62996a;
        mo62991b(m62996a);
    }

    /* renamed from: f */
    public void m62987f() {
        this.f46090a = false;
        this.f46092c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m62993a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m62993a(m62996a());
    }

    /* renamed from: a */
    public void m62994a(InterfaceC18368a interfaceC18368a) {
        this.f46092c = interfaceC18368a;
    }

    /* renamed from: b */
    protected void mo62991b(boolean z) {
    }

    /* renamed from: a */
    private void m62993a(boolean z) {
        if (this.f46091b != z) {
            this.f46091b = z;
            if (this.f46090a) {
                mo62991b(z);
                InterfaceC18368a interfaceC18368a = this.f46092c;
                if (interfaceC18368a != null) {
                    interfaceC18368a.mo62951a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m62996a() {
        return (m62992b().importance == 100) || mo62989d();
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
