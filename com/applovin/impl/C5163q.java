package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.q */
/* loaded from: classes2.dex */
public class C5163q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final List f9103a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private WeakReference f9104b;

    /* renamed from: c */
    private WeakReference f9105c;

    public C5163q(Context context) {
        this.f9104b = new WeakReference(null);
        this.f9105c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f9104b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f9105c = this.f9104b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity m96477a() {
        return (Activity) this.f9105c.get();
    }

    /* renamed from: b */
    public Activity m96475b() {
        return (Activity) this.f9104b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (AbstractC5096p abstractC5096p : new ArrayList(this.f9103a)) {
            abstractC5096p.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        for (AbstractC5096p abstractC5096p : new ArrayList(this.f9103a)) {
            abstractC5096p.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f9105c = new WeakReference(null);
        for (AbstractC5096p abstractC5096p : new ArrayList(this.f9103a)) {
            abstractC5096p.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f9104b = weakReference;
        this.f9105c = weakReference;
        for (AbstractC5096p abstractC5096p : new ArrayList(this.f9103a)) {
            abstractC5096p.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (AbstractC5096p abstractC5096p : new ArrayList(this.f9103a)) {
            abstractC5096p.onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        for (AbstractC5096p abstractC5096p : new ArrayList(this.f9103a)) {
            abstractC5096p.onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        for (AbstractC5096p abstractC5096p : new ArrayList(this.f9103a)) {
            abstractC5096p.onActivityStopped(activity);
        }
    }

    /* renamed from: a */
    public void m96476a(AbstractC5096p abstractC5096p) {
        this.f9103a.add(abstractC5096p);
    }

    /* renamed from: b */
    public void m96474b(AbstractC5096p abstractC5096p) {
        this.f9103a.remove(abstractC5096p);
    }
}
