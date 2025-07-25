package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.M1 */
/* loaded from: classes6.dex */
public final class C19015M1 implements InterfaceC18988K2, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final String f47456a;

    /* renamed from: b */
    public final InterfaceC18959I1 f47457b;

    /* renamed from: c */
    public final InterfaceC18855A9 f47458c;

    /* renamed from: d */
    public final String f47459d;

    /* renamed from: e */
    public final C19029N2 f47460e;

    /* renamed from: f */
    public final Context f47461f;

    public C19015M1(String urlToLoad, Context context, InterfaceC18959I1 interfaceC18959I1, InterfaceC18855A9 redirectionValidator, String api) {
        Intrinsics.checkNotNullParameter(urlToLoad, "urlToLoad");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        this.f47456a = urlToLoad;
        this.f47457b = interfaceC18959I1;
        this.f47458c = redirectionValidator;
        this.f47459d = api;
        C19029N2 c19029n2 = new C19029N2();
        this.f47460e = c19029n2;
        Intrinsics.checkNotNullParameter(this, "connectionCallback");
        c19029n2.f47551c = this;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f47461f = applicationContext;
        C18954Ha.m61082a(context, this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C19029N2 c19029n2 = this.f47460e;
        Context context = this.f47461f;
        c19029n2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        C19002L2 c19002l2 = c19029n2.f47550b;
        if (c19002l2 != null) {
            context.unbindService(c19002l2);
            c19029n2.f47549a = null;
        }
        c19029n2.f47550b = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
