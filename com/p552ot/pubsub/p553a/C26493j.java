package com.p552ot.pubsub.p553a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p552ot.pubsub.util.C26586j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.j */
/* loaded from: classes7.dex */
public class C26493j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C26487d f69275a;

    /* renamed from: b */
    private int f69276b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C26493j(C26487d c26487d) {
        this.f69275a = c26487d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        InterfaceC26486c interfaceC26486c;
        if (this.f69276b == 0) {
            interfaceC26486c = this.f69275a.f69251d;
            interfaceC26486c.mo41453a(1);
        }
        this.f69276b++;
        C26586j.m41080a("PubSubTrackImp", "onActivityStarted: " + activity.getLocalClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        InterfaceC26486c interfaceC26486c;
        int i = this.f69276b - 1;
        this.f69276b = i;
        if (i == 0) {
            interfaceC26486c = this.f69275a.f69251d;
            interfaceC26486c.mo41453a(2);
        }
        C26586j.m41080a("PubSubTrackImp", "onActivityStopped: " + activity.getLocalClassName());
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
