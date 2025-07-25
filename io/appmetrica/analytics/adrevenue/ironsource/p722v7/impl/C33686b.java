package io.appmetrica.analytics.adrevenue.ironsource.p722v7.impl;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: io.appmetrica.analytics.adrevenue.ironsource.v7.impl.b */
/* loaded from: classes9.dex */
public final class C33686b implements ImpressionDataListener {

    /* renamed from: a */
    public final ClientContext f92262a;

    /* renamed from: b */
    public final C33685a f92263b = new C33685a();

    public C33686b(ClientContext clientContext) {
        this.f92262a = clientContext;
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public final void onImpressionSuccess(ImpressionData impressionData) {
        ModuleAdType moduleAdType;
        if (impressionData != null) {
            ModuleAdRevenueReporter adRevenueReporter = this.f92262a.getModuleAdRevenueContext().getAdRevenueReporter();
            this.f92263b.getClass();
            BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getRevenue().doubleValue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            String adUnit = impressionData.getAdUnit();
            if (adUnit == null) {
                moduleAdType = null;
            } else {
                char c = 65535;
                switch (adUnit.hashCode()) {
                    case 95784425:
                        if (adUnit.equals(IronSourceConstants.REWARDED_VIDEO_AD_UNIT)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 769047372:
                        if (adUnit.equals("Interstitial")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1982491468:
                        if (adUnit.equals("Banner")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case 1:
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    case 2:
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            }
            adRevenueReporter.reportAutoAdRevenue(new ModuleAdRevenue(valueOf, currency, moduleAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), null, true));
        }
    }
}
