package com.iab.omid.library.corpmailru.p393b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.adsession.C18045a;

/* renamed from: com.iab.omid.library.corpmailru.b.b */
/* loaded from: classes6.dex */
public class C18048b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C18048b f45438a = new C18048b();

    /* renamed from: b */
    private boolean f45439b;

    /* renamed from: c */
    private boolean f45440c;

    /* renamed from: d */
    private InterfaceC18049a f45441d;

    /* renamed from: com.iab.omid.library.corpmailru.b.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18049a {
        /* renamed from: a */
        void mo64164a(boolean z);
    }

    private C18048b() {
    }

    /* renamed from: a */
    public static C18048b m64199a() {
        return f45438a;
    }

    /* renamed from: e */
    private void m64192e() {
        boolean z = !this.f45440c;
        for (C18045a c18045a : C18047a.m64206a().m64204b()) {
            c18045a.getAdSessionStatePublisher().m64094a(z);
        }
    }

    /* renamed from: b */
    public void m64195b() {
        this.f45439b = true;
        this.f45440c = false;
        m64192e();
    }

    /* renamed from: c */
    public void m64194c() {
        this.f45439b = false;
        this.f45440c = false;
        this.f45441d = null;
    }

    @RequiresApi(api = 16)
    @VisibleForTesting
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo m64193d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m64196a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        boolean z;
        View m64221d;
        boolean z2 = true;
        if (m64193d().importance != 100) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        for (C18045a c18045a : C18047a.m64206a().m64202c()) {
            if (c18045a.m64219e() && (m64221d = c18045a.m64221d()) != null && m64221d.hasWindowFocus()) {
                z3 = false;
            }
        }
        m64196a((z && z3) ? false : false);
    }

    /* renamed from: a */
    public void m64198a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void m64197a(InterfaceC18049a interfaceC18049a) {
        this.f45441d = interfaceC18049a;
    }

    /* renamed from: a */
    private void m64196a(boolean z) {
        if (this.f45440c != z) {
            this.f45440c = z;
            if (this.f45439b) {
                m64192e();
                InterfaceC18049a interfaceC18049a = this.f45441d;
                if (interfaceC18049a != null) {
                    interfaceC18049a.mo64164a(!z);
                }
            }
        }
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
