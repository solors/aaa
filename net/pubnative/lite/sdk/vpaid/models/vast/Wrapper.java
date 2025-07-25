package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.Collections;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class Wrapper implements VastAdSource {
    @Tag
    private AdSystem adSystem;
    @Tag
    private AdVerifications adVerifications;
    @Attribute
    private String allowMultipleAds;
    @Tag(com.smaato.sdk.video.vast.model.Wrapper.BLOCKED_AD_CATEGORIES)
    private List<BlockedAdCategories> blockedAdCategories;
    @Tag
    private Creatives creatives;
    @Tag("Error")
    private List<Error> errors;
    @Tag
    private Extensions extensions;
    @Attribute
    private String fallbackOnNoAd;
    @Attribute
    private String followAdditionalWrappers;
    @Tag("Impression")
    private List<Impression> impressions;
    @Tag
    private Pricing pricing;
    @Tag
    private VASTAdTagURI vastAdTagURI;
    @Tag
    private ViewableImpression viewableImpression;

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public AdServingId getAdServingId() {
        return null;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public AdSystem getAdSystem() {
        return this.adSystem;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    public List<BlockedAdCategories> getBlockedAdCategories() {
        return this.blockedAdCategories;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public List<Category> getCategories() {
        return Collections.emptyList();
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public Creatives getCreatives() {
        return this.creatives;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public List<Error> getErrors() {
        return this.errors;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public Extensions getExtensions() {
        return this.extensions;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public List<Impression> getImpressions() {
        return this.impressions;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public Pricing getPricing() {
        return this.pricing;
    }

    public VASTAdTagURI getVastAdTagURI() {
        return this.vastAdTagURI;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public ViewableImpression getViewableImpression() {
        return this.viewableImpression;
    }

    public String isAllowMultipleAds() {
        return this.allowMultipleAds;
    }

    public String isFallbackOnNoAd() {
        return this.fallbackOnNoAd;
    }

    public String isFollowAdditionalWrappers() {
        return this.followAdditionalWrappers;
    }
}
