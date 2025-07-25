package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.applovin.internal.d */
/* loaded from: classes6.dex */
public class C17810d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f44938a;

    /* renamed from: b */
    protected boolean f44939b;

    /* renamed from: c */
    private InterfaceC17811a f44940c;

    /* renamed from: com.iab.omid.library.applovin.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17811a {
        /* renamed from: a */
        void mo65092a(boolean z);
    }

    /* renamed from: a */
    public void m65135a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: b */
    protected void mo65131b(boolean z) {
    }

    /* renamed from: c */
    public boolean m65130c() {
        return this.f44939b;
    }

    /* renamed from: d */
    protected boolean mo65129d() {
        return false;
    }

    /* renamed from: e */
    public void m65128e() {
        this.f44938a = true;
        boolean m65136a = m65136a();
        this.f44939b = m65136a;
        mo65131b(m65136a);
    }

    /* renamed from: f */
    public void m65127f() {
        this.f44938a = false;
        this.f44940c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m65133a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m65133a(m65136a());
    }

    /* renamed from: a */
    public void m65134a(InterfaceC17811a interfaceC17811a) {
        this.f44940c = interfaceC17811a;
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m65132b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: a */
    private void m65133a(boolean z) {
        if (this.f44939b != z) {
            this.f44939b = z;
            if (this.f44938a) {
                mo65131b(z);
                InterfaceC17811a interfaceC17811a = this.f44940c;
                if (interfaceC17811a != null) {
                    interfaceC17811a.mo65092a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m65136a() {
        return m65132b().importance == 100 || mo65129d();
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
