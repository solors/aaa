package io.appmetrica.analytics.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;

/* renamed from: io.appmetrica.analytics.impl.Wj */
/* loaded from: classes9.dex */
public final class C34309Wj {

    /* renamed from: a */
    public final C34997wn f93660a;

    public C34309Wj(C34997wn c34997wn) {
        this.f93660a = c34997wn;
    }

    /* renamed from: a */
    public final long m22127a() {
        long optLong;
        C34997wn c34997wn = this.f93660a;
        synchronized (c34997wn) {
            optLong = c34997wn.f95576a.m20761a().optLong(SDKAnalyticsEvents.PARAMETER_SESSION_ID, -1L);
        }
        long j = 10000000000L;
        if (optLong >= 10000000000L) {
            j = 1 + optLong;
        }
        this.f93660a.m20799c(j);
        return j;
    }
}
