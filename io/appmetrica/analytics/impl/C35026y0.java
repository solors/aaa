package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.y0 */
/* loaded from: classes9.dex */
public final class C35026y0 implements ModuleAdRevenueReporter {

    /* renamed from: a */
    public final C33768Ac f95628a = new C33768Ac();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter
    public final void reportAutoAdRevenue(@NotNull ModuleAdRevenue moduleAdRevenue) {
        int i;
        AdType adType;
        this.f95628a.getClass();
        AdRevenue.Builder newBuilder = AdRevenue.newBuilder(moduleAdRevenue.getAdRevenue(), moduleAdRevenue.getCurrency());
        ModuleAdType adType2 = moduleAdRevenue.getAdType();
        if (adType2 == null) {
            i = -1;
        } else {
            i = AbstractC35064zc.f95691a[adType2.ordinal()];
        }
        switch (i) {
            case -1:
                adType = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                adType = AdType.NATIVE;
                break;
            case 2:
                adType = AdType.BANNER;
                break;
            case 3:
                adType = AdType.REWARDED;
                break;
            case 4:
                adType = AdType.INTERSTITIAL;
                break;
            case 5:
                adType = AdType.MREC;
                break;
            case 6:
                adType = AdType.OTHER;
                break;
        }
        ModulesFacade.reportAdRevenue(newBuilder.withAdType(adType).withAdNetwork(moduleAdRevenue.getAdNetwork()).withAdUnitId(moduleAdRevenue.getAdUnitId()).withAdUnitName(moduleAdRevenue.getAdUnitName()).withAdPlacementId(moduleAdRevenue.getAdPlacementId()).withAdPlacementName(moduleAdRevenue.getAdPlacementName()).withPrecision(moduleAdRevenue.getPrecision()).withPayload(moduleAdRevenue.getPayload()).build(), Boolean.valueOf(moduleAdRevenue.getAutoCollected()));
    }
}
