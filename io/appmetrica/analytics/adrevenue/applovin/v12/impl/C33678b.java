package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* renamed from: io.appmetrica.analytics.adrevenue.applovin.v12.impl.b */
/* loaded from: classes9.dex */
public final class C33678b implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final C33677a f92256a;

    /* renamed from: b */
    public final ClientContext f92257b;

    public C33678b(@NotNull C33677a c33677a, @NotNull ClientContext clientContext) {
        this.f92256a = c33677a;
        this.f92257b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NotNull
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@NotNull Object... objArr) {
        Object m17324b0;
        Object m17324b02;
        ModuleAdType moduleAdType;
        Map m17279o;
        if (ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            m17324b0 = _Arrays.m17324b0(objArr, 0);
            if (m17324b0 != null) {
                MaxAd maxAd = (MaxAd) m17324b0;
                m17324b02 = _Arrays.m17324b0(objArr, 1);
                if (m17324b02 != null) {
                    AppLovinSdk appLovinSdk = (AppLovinSdk) m17324b02;
                    this.f92256a.getClass();
                    MaxAdFormat format = maxAd.getFormat();
                    if (format == null) {
                        moduleAdType = null;
                    } else if (Intrinsics.m17075f(format, MaxAdFormat.NATIVE)) {
                        moduleAdType = ModuleAdType.NATIVE;
                    } else if (Intrinsics.m17075f(format, MaxAdFormat.BANNER)) {
                        moduleAdType = ModuleAdType.BANNER;
                    } else if (Intrinsics.m17075f(format, MaxAdFormat.REWARDED)) {
                        moduleAdType = ModuleAdType.REWARDED;
                    } else if (Intrinsics.m17075f(format, MaxAdFormat.INTERSTITIAL)) {
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                    } else if (Intrinsics.m17075f(format, MaxAdFormat.MREC)) {
                        moduleAdType = ModuleAdType.MREC;
                    } else {
                        moduleAdType = ModuleAdType.OTHER;
                    }
                    ModuleAdType moduleAdType2 = moduleAdType;
                    m17279o = C37559r0.m17279o(C38513v.m14532a(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, appLovinSdk.getConfiguration().getCountryCode()));
                    if (moduleAdType2 == ModuleAdType.OTHER) {
                        m17279o.put("adType", maxAd.getFormat().getLabel());
                    }
                    this.f92257b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType2, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), m17279o, false, 32, null));
                    PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
                    mainPublicOrAnonymousLogger.info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
                    return true;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        return false;
    }
}
