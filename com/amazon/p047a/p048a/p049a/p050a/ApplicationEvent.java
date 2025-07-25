package com.amazon.p047a.p048a.p049a.p050a;

import android.app.Application;
import com.amazon.p047a.p048a.p054c.Event;

/* renamed from: com.amazon.a.a.a.a.c */
/* loaded from: classes2.dex */
public class ApplicationEvent implements Event {

    /* renamed from: a */
    private final ApplicationEventIdentity f2293a;

    /* renamed from: b */
    private final Application f2294b;

    public ApplicationEvent(ApplicationEventIdentity applicationEventIdentity, Application application) {
        this.f2293a = applicationEventIdentity;
        this.f2294b = application;
    }

    /* renamed from: b */
    public Application m103209b() {
        return this.f2294b;
    }

    @Override // com.amazon.p047a.p048a.p054c.Event
    /* renamed from: c */
    public ApplicationEventIdentity mo103147a() {
        return this.f2293a;
    }
}
