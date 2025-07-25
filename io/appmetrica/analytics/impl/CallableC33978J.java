package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.J */
/* loaded from: classes9.dex */
public final class CallableC33978J implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C34193S f93042a;

    public CallableC33978J(C34193S c34193s) {
        this.f93042a = c34193s;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AdTrackingInfoResult adTrackingInfoResult;
        C34193S c34193s = this.f93042a;
        AdTrackingInfoResult m22304a = C34193S.m22304a(c34193s, c34193s.f93468k);
        C34193S c34193s2 = this.f93042a;
        AdTrackingInfoResult m22302b = C34193S.m22302b(c34193s2, c34193s2.f93468k);
        C34193S c34193s3 = this.f93042a;
        Context context = c34193s3.f93468k;
        C34909td c34909td = new C34909td();
        if (c34193s3.f93464g.mo22345a(c34193s3.f93460c)) {
            adTrackingInfoResult = c34193s3.f93467j.mo22313a(context, c34909td);
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        c34193s.f93470m = new AdvertisingIdsHolder(m22304a, m22302b, adTrackingInfoResult);
        return null;
    }
}
