package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fyber.inneractive.sdk.util.HandlerC15440c0;

/* renamed from: com.fyber.inneractive.sdk.network.d */
/* loaded from: classes4.dex */
public final class C14698d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C14702f f27858a;

    public C14698d(C14702f c14702f) {
        this.f27858a = c14702f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C14702f c14702f = this.f27858a;
        HandlerC15440c0 handlerC15440c0 = c14702f.f27868d;
        if (handlerC15440c0 != null) {
            handlerC15440c0.post(new RunnableC14696c(c14702f, 20150330, 3500L));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        HandlerC15440c0 handlerC15440c0 = this.f27858a.f27868d;
        if (handlerC15440c0 != null) {
            handlerC15440c0.removeMessages(20150330);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
