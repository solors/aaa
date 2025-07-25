package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.ResponseInfo;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.b */
/* loaded from: classes9.dex */
public final class C33668b {
    /* renamed from: a */
    public static ModuleAdRevenue m22817a(AdValue adValue, ModuleAdType moduleAdType, ResponseInfo responseInfo, String str) {
        String str2;
        AdapterResponseInfo loadedAdapterResponseInfo;
        String str3;
        double finiteDoubleOrDefault = WrapUtils.getFiniteDoubleOrDefault(adValue.getValueMicros() / 1000000.0d, 0.0d);
        if (responseInfo != null && (loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo()) != null) {
            BigDecimal valueOf = BigDecimal.valueOf(finiteDoubleOrDefault);
            Currency currency = Currency.getInstance(adValue.getCurrencyCode());
            String adapterClassName = loadedAdapterResponseInfo.getAdapterClassName();
            String adSourceInstanceId = loadedAdapterResponseInfo.getAdSourceInstanceId();
            String adSourceInstanceName = loadedAdapterResponseInfo.getAdSourceInstanceName();
            int precisionType = adValue.getPrecisionType();
            if (precisionType == 0) {
                str3 = "UNKNOWN";
            } else if (precisionType == 1) {
                str3 = "ESTIMATED";
            } else if (precisionType == 2) {
                str3 = "PUBLISHER_PROVIDED";
            } else if (precisionType == 3) {
                str3 = "PRECISE";
            } else {
                str3 = "";
            }
            return new ModuleAdRevenue(valueOf, currency, moduleAdType, adapterClassName, str, null, adSourceInstanceId, adSourceInstanceName, str3, null, false);
        }
        BigDecimal valueOf2 = BigDecimal.valueOf(finiteDoubleOrDefault);
        Currency currency2 = Currency.getInstance(adValue.getCurrencyCode());
        int precisionType2 = adValue.getPrecisionType();
        if (precisionType2 == 0) {
            str2 = "UNKNOWN";
        } else if (precisionType2 == 1) {
            str2 = "ESTIMATED";
        } else if (precisionType2 == 2) {
            str2 = "PUBLISHER_PROVIDED";
        } else if (precisionType2 == 3) {
            str2 = "PRECISE";
        } else {
            str2 = "";
        }
        return new ModuleAdRevenue(valueOf2, currency2, moduleAdType, null, str, null, null, null, str2, null, false);
    }
}
