package com.iab.omid.library.amazon.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.amazon.internal.d */
/* loaded from: classes6.dex */
public class C17749d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f44809a;

    /* renamed from: b */
    protected boolean f44810b;

    /* renamed from: c */
    private InterfaceC17750a f44811c;

    /* renamed from: com.iab.omid.library.amazon.internal.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17750a {
        /* renamed from: a */
        void mo65333a(boolean z);
    }

    /* renamed from: a */
    public void m65376a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    ActivityManager.RunningAppProcessInfo m65373b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m65371c() {
        return this.f44810b;
    }

    /* renamed from: d */
    protected boolean mo65370d() {
        return false;
    }

    /* renamed from: e */
    public void m65369e() {
        this.f44809a = true;
        boolean m65377a = m65377a();
        this.f44810b = m65377a;
        mo65372b(m65377a);
    }

    /* renamed from: f */
    public void m65368f() {
        this.f44809a = false;
        this.f44811c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m65374a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m65374a(m65377a());
    }

    /* renamed from: a */
    public void m65375a(InterfaceC17750a interfaceC17750a) {
        this.f44811c = interfaceC17750a;
    }

    /* renamed from: b */
    protected void mo65372b(boolean z) {
    }

    /* renamed from: a */
    private void m65374a(boolean z) {
        if (this.f44810b != z) {
            this.f44810b = z;
            if (this.f44809a) {
                mo65372b(z);
                InterfaceC17750a interfaceC17750a = this.f44811c;
                if (interfaceC17750a != null) {
                    interfaceC17750a.mo65333a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m65377a() {
        return (m65373b().importance == 100) || mo65370d();
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
