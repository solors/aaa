package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import java.util.Set;

/* loaded from: classes7.dex */
public class POBOWPartnerHelper {

    /* renamed from: com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper$a */
    /* loaded from: classes7.dex */
    private static class C26794a implements POBBaseBidder.CountryFilterConfig {
        @NonNull

        /* renamed from: a */
        private final POBProfileInfo f70635a;

        C26794a(@NonNull POBProfileInfo pOBProfileInfo) {
            this.f70635a = pOBProfileInfo;
        }

        @Override // com.pubmatic.sdk.common.base.POBBaseBidder.CountryFilterConfig
        @Nullable
        public String getCountryFilteringMode() {
            return this.f70635a.getCountryFilteringMode();
        }

        @Override // com.pubmatic.sdk.common.base.POBBaseBidder.CountryFilterConfig
        @Nullable
        public Set<String> getFilteringCountries() {
            return this.f70635a.getFilteringCountries();
        }
    }

    @NonNull
    public static POBManager createPOBManager(@NonNull Context context, @NonNull POBRequest pOBRequest, @Nullable POBProfileInfo pOBProfileInfo) {
        POBManager pOBManager = new POBManager(pOBRequest, context);
        pOBManager.setIdentifier("OpenWrap");
        if (pOBProfileInfo != null) {
            pOBManager.setCountryFilterConfig(new C26794a(pOBProfileInfo));
        }
        return pOBManager;
    }
}
