package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.Kb */
/* loaded from: classes9.dex */
public final class C34014Kb extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C34014Kb f93127a = new C34014Kb();

    public C34014Kb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return Unit.f99208a;
    }
}
