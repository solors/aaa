package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.ga */
/* loaded from: classes3.dex */
public abstract class AbstractC9870ga {
    /* renamed from: a */
    public static final InterfaceC9844f3 m81606a(String adType, String location, Mediation mediation, InterfaceC10062n4 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        return new C9861g3(adType, location, mediation, eventTracker);
    }

    /* renamed from: a */
    public static final InterfaceC10062n4 m81607a() {
        return C10374y2.f23595b.m79908m().mo81500a();
    }
}
