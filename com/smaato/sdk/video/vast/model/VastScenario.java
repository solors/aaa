package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastScenario {
    @Nullable
    public final String adServingId;
    @Nullable
    public final AdSystem adSystem;
    @Nullable
    public final String adTitle;
    @NonNull
    public final List<Verification> adVerifications;
    @Nullable
    public final Advertiser advertiser;
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
    @Nullable
    public final VastCompanionScenario vastCompanionScenario;
    @NonNull
    public final List<VastCompanionScenario> vastCompanionScenarioList;
    @NonNull
    public final VastMediaFileScenario vastMediaFileScenario;
    @Nullable
    public final ViewableImpression viewableImpression;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String adServingId;
        @Nullable
        private AdSystem adSystem;
        @Nullable
        private String adTitle;
        @Nullable
        private List<Verification> adVerifications;
        @Nullable
        private Advertiser advertiser;
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
        private VastCompanionScenario vastCompanionScenario;
        @Nullable
        public List<VastCompanionScenario> vastCompanionScenarioList;
        @Nullable
        private VastMediaFileScenario vastMediaFileScenario;
        @Nullable
        private ViewableImpression viewableImpression;

        public Builder() {
        }

        @NonNull
        public VastScenario build() {
            return new VastScenario(VastModels.toImmutableList(this.impressions), VastModels.toImmutableList(this.adVerifications), VastModels.toImmutableList(this.categories), VastModels.toImmutableList(this.errors), VastModels.toImmutableList(this.blockedAdCategories), VastModels.toImmutableList(this.vastCompanionScenarioList), (VastMediaFileScenario) Objects.requireNonNull(this.vastMediaFileScenario), this.vastCompanionScenario, this.adSystem, this.adTitle, this.description, this.advertiser, this.viewableImpression, this.adServingId);
        }

        @NonNull
        public Builder setAdServingId(@Nullable String str) {
            this.adServingId = str;
            return this;
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
        public Builder setAdvertiser(@Nullable Advertiser advertiser) {
            this.advertiser = advertiser;
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
        public Builder setVastCompanionScenario(@Nullable VastCompanionScenario vastCompanionScenario) {
            this.vastCompanionScenario = vastCompanionScenario;
            return this;
        }

        @NonNull
        public Builder setVastCompanionScenarioList(@Nullable List<VastCompanionScenario> list) {
            this.vastCompanionScenarioList = list;
            return this;
        }

        @NonNull
        public Builder setVastMediaFileScenario(@Nullable VastMediaFileScenario vastMediaFileScenario) {
            this.vastMediaFileScenario = vastMediaFileScenario;
            return this;
        }

        @NonNull
        public Builder setViewableImpression(@Nullable ViewableImpression viewableImpression) {
            this.viewableImpression = viewableImpression;
            return this;
        }

        public Builder(@NonNull VastScenario vastScenario) {
            this.impressions = vastScenario.impressions;
            this.adVerifications = vastScenario.adVerifications;
            this.categories = vastScenario.categories;
            this.errors = vastScenario.errors;
            this.adSystem = vastScenario.adSystem;
            this.adTitle = vastScenario.adTitle;
            this.description = vastScenario.description;
            this.advertiser = vastScenario.advertiser;
            this.viewableImpression = vastScenario.viewableImpression;
            this.vastMediaFileScenario = vastScenario.vastMediaFileScenario;
            this.vastCompanionScenario = vastScenario.vastCompanionScenario;
            this.blockedAdCategories = vastScenario.blockedAdCategories;
            this.adServingId = vastScenario.adServingId;
            this.vastCompanionScenarioList = vastScenario.vastCompanionScenarioList;
        }
    }

    @NonNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    private VastScenario(@NonNull List<VastBeacon> list, @NonNull List<Verification> list2, @NonNull List<Category> list3, @NonNull List<String> list4, @NonNull List<String> list5, @NonNull List<VastCompanionScenario> list6, @NonNull VastMediaFileScenario vastMediaFileScenario, @Nullable VastCompanionScenario vastCompanionScenario, @Nullable AdSystem adSystem, @Nullable String str, @Nullable String str2, @Nullable Advertiser advertiser, @Nullable ViewableImpression viewableImpression, @Nullable String str3) {
        this.impressions = (List) Objects.requireNonNull(list);
        this.adVerifications = (List) Objects.requireNonNull(list2);
        this.categories = (List) Objects.requireNonNull(list3);
        this.errors = (List) Objects.requireNonNull(list4);
        this.vastMediaFileScenario = (VastMediaFileScenario) Objects.requireNonNull(vastMediaFileScenario);
        this.blockedAdCategories = (List) Objects.requireNonNull(list5);
        this.vastCompanionScenario = vastCompanionScenario;
        this.adSystem = adSystem;
        this.adTitle = str;
        this.description = str2;
        this.advertiser = advertiser;
        this.viewableImpression = viewableImpression;
        this.adServingId = str3;
        this.vastCompanionScenarioList = (List) Objects.requireNonNull(list6);
    }
}
