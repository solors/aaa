package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class Creative {
    public static final String AD_ID = "adId";
    public static final String API_FRAMEWORK = "apiFramework";
    public static final String COMPANION_ADS = "CompanionAds";
    public static final String CREATIVE_EXTENSIONS = "CreativeExtensions";

    /* renamed from: ID */
    public static final String f72479ID = "id";
    public static final String LINEAR = "Linear";
    public static final String NAME = "Creative";
    public static final String SEQUENCE = "sequence";
    public static final String UNIVERSAL_AD_ID = "UniversalAdId";
    @Nullable
    public final String adId;
    @Nullable
    public final String apiFramework;
    @Nullable
    public final CompanionAds companionAds;
    @Nullable

    /* renamed from: id */
    public final String f72480id;
    @Nullable
    public final Linear linear;
    @Nullable
    public final Integer sequence;
    @NonNull
    public final UniversalAdId universalAdId;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String adId;
        @Nullable
        private String apiFramework;
        @Nullable
        private CompanionAds companionAds;
        @Nullable

        /* renamed from: id */
        private String f72481id;
        @Nullable
        private Linear linear;
        @Nullable
        private Integer sequence;
        @Nullable
        private UniversalAdId universalAdId;

        @NonNull
        public Creative build() {
            if (this.universalAdId == null) {
                this.universalAdId = UniversalAdId.DEFAULT;
            }
            return new Creative(this.universalAdId, this.f72481id, this.adId, this.sequence, this.apiFramework, this.linear, this.companionAds);
        }

        @NonNull
        public Builder setAdId(@Nullable String str) {
            this.adId = str;
            return this;
        }

        @NonNull
        public Builder setApiFramework(@Nullable String str) {
            this.apiFramework = str;
            return this;
        }

        @NonNull
        public Builder setCompanionAds(@Nullable CompanionAds companionAds) {
            this.companionAds = companionAds;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72481id = str;
            return this;
        }

        @NonNull
        public Builder setLinear(@Nullable Linear linear) {
            this.linear = linear;
            return this;
        }

        @NonNull
        public Builder setSequence(@Nullable Integer num) {
            this.sequence = num;
            return this;
        }

        @NonNull
        public Builder setUniversalAdId(@Nullable UniversalAdId universalAdId) {
            this.universalAdId = universalAdId;
            return this;
        }
    }

    Creative(@NonNull UniversalAdId universalAdId, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Linear linear, @Nullable CompanionAds companionAds) {
        this.f72480id = str;
        this.adId = str2;
        this.sequence = num;
        this.apiFramework = str3;
        this.universalAdId = universalAdId;
        this.linear = linear;
        this.companionAds = companionAds;
    }

    public boolean hasCompanions() {
        CompanionAds companionAds = this.companionAds;
        if (companionAds != null && !companionAds.companions.isEmpty()) {
            return true;
        }
        return false;
    }
}
