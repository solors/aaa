package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.K */
/* loaded from: classes9.dex */
public final class CallableC34002K implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f93090a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC34355Yh f93091b;

    /* renamed from: c */
    public final /* synthetic */ C34193S f93092c;

    public CallableC34002K(C34193S c34193s, Context context, InterfaceC34355Yh interfaceC34355Yh) {
        this.f93092c = c34193s;
        this.f93090a = context;
        this.f93091b = interfaceC34355Yh;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AdTrackingInfoResult adTrackingInfoResult;
        AdvertisingIdsHolder advertisingIdsHolder = this.f93092c.f93470m;
        C34193S c34193s = this.f93092c;
        AdTrackingInfoResult m22304a = C34193S.m22304a(c34193s, this.f93090a);
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = m22304a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.OK;
        if (identifierStatus != identifierStatus2) {
            m22304a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, m22304a.mErrorExplanation);
        }
        AdTrackingInfoResult m22302b = C34193S.m22302b(this.f93092c, this.f93090a);
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = m22302b.mStatus;
        if (identifierStatus3 != identifierStatus2) {
            m22302b = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, m22302b.mErrorExplanation);
        }
        C34193S c34193s2 = this.f93092c;
        Context context = this.f93090a;
        InterfaceC34355Yh interfaceC34355Yh = this.f93091b;
        if (c34193s2.f93464g.mo22345a(c34193s2.f93460c)) {
            adTrackingInfoResult = c34193s2.f93467j.mo22313a(context, interfaceC34355Yh);
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResult.mStatus;
        if (identifierStatus4 != identifierStatus2) {
            adTrackingInfoResult = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResult.mErrorExplanation);
        }
        c34193s.f93470m = new AdvertisingIdsHolder(m22304a, m22302b, adTrackingInfoResult);
        return null;
    }
}
