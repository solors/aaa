package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class ii2 implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static ii2 f80474d = new ii2();

    /* renamed from: a */
    private boolean f80475a;

    /* renamed from: b */
    private boolean f80476b;

    /* renamed from: c */
    private InterfaceC30557a f80477c;

    /* renamed from: com.yandex.mobile.ads.impl.ii2$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30557a {
    }

    private ii2() {
    }

    /* renamed from: a */
    public static ii2 m33265a() {
        return f80474d;
    }

    /* renamed from: b */
    public final void m33262b() {
        this.f80475a = true;
        this.f80476b = false;
        for (xh2 xh2Var : yh2.m26905a().m26903b()) {
            xh2Var.m27481j().m28498a(true);
        }
    }

    /* renamed from: c */
    public final void m33261c() {
        this.f80475a = false;
        this.f80476b = false;
        this.f80477c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f80476b) {
            this.f80476b = false;
            if (this.f80475a) {
                for (xh2 xh2Var : yh2.m26905a().m26903b()) {
                    xh2Var.m27481j().m28498a(true);
                }
                if (this.f80477c != null) {
                    b22.m35671g().getClass();
                    b22.m35680a();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z;
        View m27485f;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z2 = false;
        if (runningAppProcessInfo.importance != 100) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        for (xh2 xh2Var : yh2.m26905a().m26901c()) {
            if (xh2Var.m27484g() && (m27485f = xh2Var.m27485f()) != null && m27485f.hasWindowFocus()) {
                z3 = false;
            }
        }
        if (z && z3) {
            z2 = true;
        }
        if (this.f80476b != z2) {
            this.f80476b = z2;
            if (this.f80475a) {
                boolean z4 = !z2;
                for (xh2 xh2Var2 : yh2.m26905a().m26903b()) {
                    xh2Var2.m27481j().m28498a(z4);
                }
                if (this.f80477c != null) {
                    if (z4) {
                        b22.m35671g().getClass();
                        b22.m35680a();
                        return;
                    }
                    b22.m35671g().getClass();
                    b22.m35675c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m33264a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public final void m33263a(InterfaceC30557a interfaceC30557a) {
        this.f80477c = interfaceC30557a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
