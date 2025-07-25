package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class Wrapper {
    public static final String AD_SYSTEM = "AdSystem";
    public static final String AD_VERIFICATIONS = "AdVerifications";
    public static final String ALLOW_MULTIPLE_ADS = "allowMultipleAds";
    public static final String BLOCKED_AD_CATEGORIES = "BlockedAdCategories";
    public static final String CREATIVES = "Creatives";
    public static final String ERROR = "Error";
    public static final String EXTENSIONS = "Extensions";
    public static final String FALLBACK_ON_NO_AD = "fallbackOnNoAd";
    public static final String FOLLOW_ADDITIONAL_WRAPPERS = "followAdditionalWrappers";
    public static final String IMPRESSION = "Impression";
    public static final String NAME = "Wrapper";
    public static final String VAST_AD_TAG_URI = "VastAdTagURI";
    public static final String VIEWABLE_IMPRESSION = "ViewableImpression";
    @Nullable
    public final AdSystem adSystem;
    @NonNull
    public final List<Verification> adVerifications;
    @Nullable
    public final Boolean allowMultipleAds;
    @Nullable
    public final String blockedAdCategories;
    @NonNull
    public final List<Creative> creatives;
    @NonNull
    public final List<String> errors;
    @NonNull
    public final List<Extension> extensions;
    @Nullable
    public final Boolean fallbackOnNoAd;
    public final boolean followAdditionalWrappers;
    @NonNull
    public final List<VastBeacon> impressions;
    @Nullable
    public final String vastAdTagUri;
    @Nullable
    public final VastTree vastTree;
    @Nullable
    public final ViewableImpression viewableImpression;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private AdSystem adSystem;
        @Nullable
        private List<Verification> adVerifications;
        @Nullable
        private Boolean allowMultipleAds;
        @Nullable
        private String blockedAdCategories;
        @Nullable
        private List<Creative> creatives;
        @Nullable
        private List<String> errors;
        @Nullable
        private List<Extension> extensions;
        @Nullable
        private Boolean fallbackOnNoAd;
        @Nullable
        private Boolean followAdditionalWrappers;
        @Nullable
        private List<VastBeacon> impressions;
        @Nullable
        private String vastAdTagUri;
        @Nullable
        private VastTree vastTree;
        @Nullable
        private ViewableImpression viewableImpression;

        public Builder() {
        }

        @NonNull
        public Wrapper build() {
            boolean z;
            Boolean bool = this.followAdditionalWrappers;
            if (bool != null && !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            this.followAdditionalWrappers = Boolean.valueOf(z);
            this.impressions = VastModels.toImmutableList(this.impressions);
            this.adVerifications = VastModels.toImmutableList(this.adVerifications);
            this.creatives = VastModels.toImmutableList(this.creatives);
            this.errors = VastModels.toImmutableList(this.errors);
            this.extensions = VastModels.toImmutableList(this.extensions);
            return new Wrapper(this.followAdditionalWrappers.booleanValue(), this.impressions, this.adVerifications, this.creatives, this.errors, this.adSystem, this.viewableImpression, this.allowMultipleAds, this.fallbackOnNoAd, this.vastAdTagUri, this.blockedAdCategories, this.vastTree, this.extensions);
        }

        @NonNull
        public Builder setAdSystem(@Nullable AdSystem adSystem) {
            this.adSystem = adSystem;
            return this;
        }

        @NonNull
        public Builder setAdVerifications(@Nullable List<Verification> list) {
            this.adVerifications = list;
            return this;
        }

        @NonNull
        public Builder setAllowMultipleAds(@Nullable Boolean bool) {
            this.allowMultipleAds = bool;
            return this;
        }

        @NonNull
        public Builder setBlockedAdCategories(@Nullable String str) {
            this.blockedAdCategories = str;
            return this;
        }

        @NonNull
        public Builder setCreatives(@Nullable List<Creative> list) {
            this.creatives = list;
            return this;
        }

        @NonNull
        public Builder setErrors(@Nullable List<String> list) {
            this.errors = list;
            return this;
        }

        public Builder setExtensions(@Nullable List<Extension> list) {
            this.extensions = list;
            return this;
        }

        @NonNull
        public Builder setFallbackOnNoAd(@Nullable Boolean bool) {
            this.fallbackOnNoAd = bool;
            return this;
        }

        @NonNull
        public Builder setFollowAdditionalWrappers(@Nullable Boolean bool) {
            this.followAdditionalWrappers = bool;
            return this;
        }

        @NonNull
        public Builder setImpressions(@Nullable List<VastBeacon> list) {
            this.impressions = list;
            return this;
        }

        @NonNull
        public Builder setVastAdTagUri(@Nullable String str) {
            this.vastAdTagUri = str;
            return this;
        }

        @NonNull
        public Builder setVastTree(@Nullable VastTree vastTree) {
            this.vastTree = vastTree;
            return this;
        }

        @NonNull
        public Builder setViewableImpression(@Nullable ViewableImpression viewableImpression) {
            this.viewableImpression = viewableImpression;
            return this;
        }

        public Builder(@NonNull Wrapper wrapper) {
            this.followAdditionalWrappers = Boolean.valueOf(wrapper.followAdditionalWrappers);
            this.adSystem = wrapper.adSystem;
            this.impressions = wrapper.impressions;
            this.errors = wrapper.errors;
            this.viewableImpression = wrapper.viewableImpression;
            this.allowMultipleAds = wrapper.allowMultipleAds;
            this.fallbackOnNoAd = wrapper.fallbackOnNoAd;
            this.vastAdTagUri = wrapper.vastAdTagUri;
            this.adVerifications = wrapper.adVerifications;
            this.blockedAdCategories = wrapper.blockedAdCategories;
            this.creatives = wrapper.creatives;
            this.vastTree = wrapper.vastTree;
            this.extensions = wrapper.extensions;
        }
    }

    Wrapper(boolean z, @NonNull List<VastBeacon> list, @NonNull List<Verification> list2, @NonNull List<Creative> list3, @NonNull List<String> list4, @Nullable AdSystem adSystem, @Nullable ViewableImpression viewableImpression, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable VastTree vastTree, @NonNull List<Extension> list5) {
        this.followAdditionalWrappers = z;
        this.adSystem = adSystem;
        this.impressions = list;
        this.errors = list4;
        this.viewableImpression = viewableImpression;
        this.allowMultipleAds = bool;
        this.fallbackOnNoAd = bool2;
        this.vastAdTagUri = str;
        this.adVerifications = list2;
        this.creatives = list3;
        this.blockedAdCategories = str2;
        this.vastTree = vastTree;
        this.extensions = list5;
    }

    @NonNull
    public Builder newBuilder() {
        return new Builder(this);
    }
}
