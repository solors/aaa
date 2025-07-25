package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.Jb */
/* loaded from: classes9.dex */
public final class C33990Jb extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C33990Jb f93061a = new C33990Jb();

    public C33990Jb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return Unit.f99208a;
    }
}
