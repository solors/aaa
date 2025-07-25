package com.amazon.p047a.p048a.p049a.p050a;

import android.app.Activity;
import com.amazon.p047a.p048a.p054c.Event;
import com.amazon.p047a.p048a.p054c.EventIdentity;

/* renamed from: com.amazon.a.a.a.a.a */
/* loaded from: classes2.dex */
public class ActivityLifeCycleEvent implements Event {

    /* renamed from: a */
    private final ActivityLifeCycleEventIdentity f2284a;

    /* renamed from: b */
    private final Activity f2285b;

    public ActivityLifeCycleEvent(ActivityLifeCycleEventIdentity activityLifeCycleEventIdentity, Activity activity) {
        this.f2284a = activityLifeCycleEventIdentity;
        this.f2285b = activity;
    }

    @Override // com.amazon.p047a.p048a.p054c.Event
    /* renamed from: a */
    public EventIdentity mo103147a() {
        return this.f2284a;
    }

    /* renamed from: b */
    public Activity m103210b() {
        return this.f2285b;
    }
}
