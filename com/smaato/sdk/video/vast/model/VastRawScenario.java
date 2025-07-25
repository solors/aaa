package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastRawScenario {
    @Nullable
    public final AdSystem adSystem;
    @Nullable
    public final String adTitle;
    @NonNull
    public final List<Verification> adVerifications;
    @Nullable
    public final String advertiser;
    @NonNull
    public final List<String> blockedAdCategories;
    @NonNull
    public final List<Category> categories;
    @Nullable
    public final String description;
    @NonNull
    public final List<String> errors;
    @NonNull
    public final List<VastBeacon> impressions;
    @NonNull
    public final List<VastCompanionScenario> vastCompanionScenarios;
    @NonNull
    public final List<VastRawMediaFileScenario> vastRawMediaFileScenarios;
    @Nullable
    public final ViewableImpression viewableImpression;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private AdSystem adSystem;
        @Nullable
        private String adTitle;
        @Nullable
        private List<Verification> adVerifications;
        @Nullable
        private String advertiser;
        @Nullable
        private List<String> blockedAdCategories;
        @Nullable
        private List<Category> categories;
        @Nullable
        private String description;
        @Nullable
        private List<String> errors;
        @Nullable
        private List<VastBeacon> impressions;
        @Nullable
        private List<VastCompanionScenario> vastCompanionScenarios;
        @Nullable
        private List<VastRawMediaFileScenario> vastRawMediaFileScenarios;
        @Nullable
        private ViewableImpression viewableImpression;

        public Builder() {
        }

        @NonNull
        public VastRawScenario build() {
            return new VastRawScenario(VastModels.toImmutableList(this.impressions), VastModels.toImmutableList(this.adVerifications), VastModels.toImmutableList(this.categories), VastModels.toImmutableList(this.errors), VastModels.toImmutableList(this.vastRawMediaFileScenarios), VastModels.toImmutableList(this.vastCompanionScenarios), VastModels.toImmutableList(this.blockedAdCategories), this.adSystem, this.adTitle, this.description, this.advertiser, this.viewableImpression);
        }

        @NonNull
        public Builder setAdSystem(@Nullable AdSystem adSystem) {
            this.adSystem = adSystem;
            return this;
        }

        @NonNull
        public Builder setAdTitle(@Nullable String str) {
            this.adTitle = str;
            return this;
        }

        @NonNull
        public Builder setAdVerifications(@NonNull List<Verification> list) {
            this.adVerifications = list;
            return this;
        }

        @NonNull
        public Builder setAdvertiser(@Nullable String str) {
            this.advertiser = str;
            return this;
        }

        @NonNull
        public Builder setBlockedAdCategories(@Nullable List<String> list) {
            this.blockedAdCategories = list;
            return this;
        }

        @NonNull
        public Builder setCategories(@Nullable List<Category> list) {
            this.categories = list;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.description = str;
            return this;
        }

        @NonNull
        public Builder setErrors(@Nullable List<String> list) {
            this.errors = list;
            return this;
        }

        @NonNull
        public Builder setImpressions(@Nullable List<VastBeacon> list) {
            this.impressions = list;
            return this;
        }

        @NonNull
        public Builder setVastCompanionScenarios(@Nullable List<VastCompanionScenario> list) {
            this.vastCompanionScenarios = list;
            return this;
        }

        @NonNull
        public Builder setVastMediaFileScenarios(@Nullable List<VastRawMediaFileScenario> list) {
            this.vastRawMediaFileScenarios = list;
            return this;
        }

        @NonNull
        public Builder setViewableImpression(@Nullable ViewableImpression viewableImpression) {
            this.viewableImpression = viewableImpression;
            return this;
        }

        public Builder(@NonNull VastRawScenario vastRawScenario) {
            this.impressions = vastRawScenario.impressions;
            this.adVerifications = vastRawScenario.adVerifications;
            this.categories = vastRawScenario.categories;
            this.errors = vastRawScenario.errors;
            this.adSystem = vastRawScenario.adSystem;
            this.adTitle = vastRawScenario.adTitle;
            this.description = vastRawScenario.description;
            this.advertiser = vastRawScenario.advertiser;
            this.viewableImpression = vastRawScenario.viewableImpression;
            this.vastRawMediaFileScenarios = vastRawScenario.vastRawMediaFileScenarios;
            this.vastCompanionScenarios = vastRawScenario.vastCompanionScenarios;
            this.blockedAdCategories = vastRawScenario.blockedAdCategories;
        }
    }

    @NonNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    private VastRawScenario(@NonNull List<VastBeacon> list, @NonNull List<Verification> list2, @NonNull List<Category> list3, @NonNull List<String> list4, @NonNull List<VastRawMediaFileScenario> list5, @NonNull List<VastCompanionScenario> list6, @NonNull List<String> list7, @Nullable AdSystem adSystem, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ViewableImpression viewableImpression) {
        this.impressions = (List) Objects.requireNonNull(list);
        this.adVerifications = (List) Objects.requireNonNull(list2);
        this.categories = (List) Objects.requireNonNull(list3);
        this.errors = (List) Objects.requireNonNull(list4);
        this.vastRawMediaFileScenarios = (List) Objects.requireNonNull(list5);
        this.vastCompanionScenarios = (List) Objects.requireNonNull(list6);
        this.blockedAdCategories = (List) Objects.requireNonNull(list7);
        this.adSystem = adSystem;
        this.adTitle = str;
        this.description = str2;
        this.advertiser = str3;
        this.viewableImpression = viewableImpression;
    }
}
