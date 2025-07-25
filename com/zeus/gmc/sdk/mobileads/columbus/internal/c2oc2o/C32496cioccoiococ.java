package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.cioccoiococ */
/* loaded from: classes8.dex */
public class C32496cioccoiococ implements Application.ActivityLifecycleCallbacks {
    private InterfaceC32497coo2iico c2oc2i;
    protected boolean coi222o222;
    private boolean coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.cioccoiococ$coo2iico */
    /* loaded from: classes8.dex */
    public interface InterfaceC32497coo2iico {
        void coo2iico(boolean z);
    }

    public boolean c2oc2i() {
        return this.coi222o222;
    }

    public void c2oc2o() {
        this.coo2iico = true;
        boolean coo2iico = coo2iico();
        this.coi222o222 = coo2iico;
        coi222o222(coo2iico);
    }

    public void cco22() {
        this.coo2iico = false;
        this.c2oc2i = null;
    }

    protected boolean cioccoiococ() {
        return false;
    }

    @VisibleForTesting
    ActivityManager.RunningAppProcessInfo coi222o222() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void coo2iico(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        coo2iico(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        coo2iico(coo2iico());
    }

    protected void coi222o222(boolean z) {
    }

    public void coo2iico(InterfaceC32497coo2iico interfaceC32497coo2iico) {
        this.c2oc2i = interfaceC32497coo2iico;
    }

    private void coo2iico(boolean z) {
        if (this.coi222o222 != z) {
            this.coi222o222 = z;
            if (this.coo2iico) {
                coi222o222(z);
                InterfaceC32497coo2iico interfaceC32497coo2iico = this.c2oc2i;
                if (interfaceC32497coo2iico != null) {
                    interfaceC32497coo2iico.coo2iico(z);
                }
            }
        }
    }

    private boolean coo2iico() {
        return (coi222o222().importance == 100) || cioccoiococ();
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
