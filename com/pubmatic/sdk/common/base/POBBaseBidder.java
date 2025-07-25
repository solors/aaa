package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public abstract class POBBaseBidder<T extends POBAdDescriptor> implements POBBidding<T> {
    @Nullable

    /* renamed from: a */
    private String f70044a;
    @Nullable
    protected POBBidderListener<T> bidderListener;

    /* loaded from: classes7.dex */
    public interface CountryFilterConfig {
        @Nullable
        String getCountryFilteringMode();

        @Nullable
        Set<String> getFilteringCountries();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public abstract /* synthetic */ void destroy();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public abstract /* synthetic */ POBAdResponse<T> getAdResponse();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public abstract /* synthetic */ Map<String, POBBidderResult<T>> getBidderResults();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public String getIdentifier() {
        return this.f70044a;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public abstract /* synthetic */ void requestBid();

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public void setBidderListener(@Nullable POBBidderListener<T> pOBBidderListener) {
        this.bidderListener = pOBBidderListener;
    }

    public void setIdentifier(@Nullable String str) {
        this.f70044a = str;
    }

    public void setCountryFilterConfig(@Nullable CountryFilterConfig countryFilterConfig) {
    }
}
