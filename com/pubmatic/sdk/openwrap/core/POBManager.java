package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidderResult;
import com.pubmatic.sdk.common.base.POBCommunicator;
import com.pubmatic.sdk.common.base.POBRequestBuilding;
import com.pubmatic.sdk.common.base.POBResponseParsing;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.internal.POBBidsBuilder;
import com.pubmatic.sdk.openwrap.core.internal.POBResponseParser;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class POBManager extends POBBaseBidder<POBBid> {
    @NonNull

    /* renamed from: a */
    private final POBCommunicator<POBBid> f70630a;
    @Nullable

    /* renamed from: b */
    private POBBidderResult<POBBid> f70631b;
    @Nullable

    /* renamed from: c */
    private POBBaseBidder.CountryFilterConfig f70632c;
    @Nullable

    /* renamed from: d */
    private POBDeviceInfo f70633d;

    /* renamed from: com.pubmatic.sdk.openwrap.core.POBManager$b */
    /* loaded from: classes7.dex */
    private class C26793b implements POBCommunicator.POBCommunicatorListener<POBBid> {
        private C26793b() {
        }

        @Override // com.pubmatic.sdk.common.base.POBCommunicator.POBCommunicatorListener
        public void onError(@NonNull POBError pOBError) {
            POBManager.this.m40304a(pOBError);
        }

        @Override // com.pubmatic.sdk.common.base.POBCommunicator.POBCommunicatorListener
        public void onSuccess(@NonNull POBAdResponse<POBBid> pOBAdResponse) {
            POBLog.debug("POBManager", "Ready to share Wrapper bid", new Object[0]);
            if (POBManager.this.f70631b != null) {
                POBManager.this.f70631b.setAdResponse(pOBAdResponse);
            }
            if (((POBBaseBidder) POBManager.this).bidderListener != null) {
                ((POBBaseBidder) POBManager.this).bidderListener.onBidsFetched(POBManager.this, pOBAdResponse);
            }
        }
    }

    @Deprecated
    public POBManager(@NonNull POBCommunicator<POBBid> pOBCommunicator) {
        this.f70630a = pOBCommunicator;
        pOBCommunicator.setListener(new C26793b());
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void destroy() {
        this.bidderListener = null;
        this.f70630a.cancel();
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public POBAdResponse<POBBid> getAdResponse() {
        POBBidderResult<POBBid> pOBBidderResult = this.f70631b;
        if (pOBBidderResult != null) {
            return pOBBidderResult.getAdResponse();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public Map<String, POBBidderResult<POBBid>> getBidderResults() {
        HashMap hashMap = new HashMap();
        POBBidderResult<POBBid> pOBBidderResult = this.f70631b;
        if (pOBBidderResult != null) {
            pOBBidderResult.setNetworkResult(this.f70630a.getNetworkResult());
            hashMap.put(getIdentifier(), this.f70631b);
        }
        return hashMap;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void requestBid() {
        this.f70631b = new POBBidderResult<>();
        if (m40301b()) {
            this.f70630a.requestAd();
        } else {
            m40304a(new POBError(1012, "Ad request not allowed for device's current country"));
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder
    public void setCountryFilterConfig(@Nullable POBBaseBidder.CountryFilterConfig countryFilterConfig) {
        this.f70632c = countryFilterConfig;
    }

    /* renamed from: b */
    private POBRequestBuilding m40300b(@NonNull Context context, @NonNull POBRequest pOBRequest) {
        POBRequestBuilder pOBRequestBuilder = new POBRequestBuilder(pOBRequest, POBInstanceProvider.getSdkConfig().isRequestSecureCreative() ? "https://ow.pubmatic.com/openrtb/2.5" : "http://ow.pubmatic.com/openrtb/2.5", context);
        pOBRequestBuilder.setAppInfo(POBInstanceProvider.getAppInfo(context.getApplicationContext()));
        pOBRequestBuilder.setDeviceInfo(POBInstanceProvider.getDeviceInfo(context.getApplicationContext()));
        pOBRequestBuilder.setLocationDetector(POBInstanceProvider.getLocationDetector(context.getApplicationContext()));
        return pOBRequestBuilder;
    }

    /* renamed from: c */
    private POBResponseParsing<POBBid> m40298c() {
        return new POBResponseParser();
    }

    /* renamed from: a */
    private POBCommunicator<POBBid> m40305a(@NonNull Context context, @NonNull POBRequest pOBRequest) {
        return new POBCommunicator<>(m40300b(context, pOBRequest), m40298c(), m40307a(), m40306a(context));
    }

    public POBManager(@NonNull Context context, @NonNull POBCommunicator<POBBid> pOBCommunicator) {
        this.f70630a = pOBCommunicator;
        pOBCommunicator.setListener(new C26793b());
        this.f70633d = POBInstanceProvider.getDeviceInfo(context);
    }

    /* renamed from: a */
    private POBAdBuilding<POBBid> m40307a() {
        return new POBBidsBuilder();
    }

    public POBManager(@NonNull POBRequest pOBRequest, @NonNull Context context) {
        POBCommunicator<POBBid> m40305a = m40305a(context, pOBRequest);
        this.f70630a = m40305a;
        m40305a.setListener(new C26793b());
        this.f70633d = POBInstanceProvider.getDeviceInfo(context);
    }

    @NonNull
    /* renamed from: a */
    private POBNetworkHandler m40306a(@NonNull Context context) {
        return POBInstanceProvider.getNetworkHandler(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40304a(@NonNull POBError pOBError) {
        POBBidderResult<POBBid> pOBBidderResult = this.f70631b;
        if (pOBBidderResult != null) {
            pOBBidderResult.setError(pOBError);
        }
        POBBidderListener<T> pOBBidderListener = this.bidderListener;
        if (pOBBidderListener != 0) {
            pOBBidderListener.onBidsFailed(this, pOBError);
        }
    }

    /* renamed from: b */
    private boolean m40301b() {
        String str;
        if (this.f70632c != null) {
            POBDeviceInfo pOBDeviceInfo = this.f70633d;
            if (pOBDeviceInfo != null) {
                str = pOBDeviceInfo.getISOAlpha2CountryCode();
                POBLog.debug("POBManager", String.format(Locale.ENGLISH, "Device country code is %s", str), new Object[0]);
            } else {
                str = null;
            }
            if (!POBUtils.isNullOrEmpty(str)) {
                String countryFilteringMode = this.f70632c.getCountryFilteringMode();
                Set<String> filteringCountries = this.f70632c.getFilteringCountries();
                if (filteringCountries != null && filteringCountries.size() > 0) {
                    if (POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE.equals(countryFilteringMode)) {
                        return filteringCountries.contains(str);
                    }
                    if (POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE.equals(countryFilteringMode)) {
                        return !filteringCountries.contains(str);
                    }
                }
            }
        }
        return true;
    }
}
