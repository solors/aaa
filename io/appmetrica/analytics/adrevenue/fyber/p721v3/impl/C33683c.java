package io.appmetrica.analytics.adrevenue.fyber.p721v3.impl;

import androidx.annotation.NonNull;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.impl.c */
/* loaded from: classes9.dex */
public final class C33683c implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final C33682b f92260a;

    /* renamed from: b */
    public final ClientContext f92261b;

    public C33683c(@NonNull C33682b c33682b, @NonNull ClientContext clientContext) {
        this.f92260a = c33682b;
        this.f92261b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "Fyber";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ModuleAdType moduleAdType;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, ImpressionData.class)) {
            return false;
        }
        ImpressionData impressionData = (ImpressionData) objArr[0];
        ModuleAdRevenueReporter adRevenueReporter = this.f92261b.getModuleAdRevenueContext().getAdRevenueReporter();
        this.f92260a.getClass();
        BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getNetPayout(), 0.0d));
        Currency currency = Currency.getInstance(impressionData.getCurrency());
        PlacementType placementType = impressionData.getPlacementType();
        if (placementType == null) {
            moduleAdType = null;
        } else {
            int i = AbstractC33681a.f92259a[placementType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        moduleAdType = ModuleAdType.OTHER;
                    } else {
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                    }
                } else {
                    moduleAdType = ModuleAdType.REWARDED;
                }
            } else {
                moduleAdType = ModuleAdType.BANNER;
            }
        }
        adRevenueReporter.reportAutoAdRevenue(new ModuleAdRevenue(valueOf, currency, moduleAdType, impressionData.getDemandSource(), impressionData.getCreativeId(), null, null, null, impressionData.getPriceAccuracy().toString(), null, true));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new Object[0]);
        return true;
    }
}
