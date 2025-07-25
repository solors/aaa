package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastCompanionScenario implements Sized {
    @Nullable
    public final AdParameters adParameters;
    @Nullable
    public final String adSlotID;
    @Nullable
    public final String altText;
    @Nullable
    public final String apiFramework;
    @Nullable
    public final Float assetHeight;
    @Nullable
    public final Float assetWidth;
    @Nullable
    public final String companionClickThrough;
    @NonNull
    public final List<VastBeacon> companionClickTrackings;
    @Nullable
    public final Float expandedHeight;
    @Nullable
    public final Float expandedWidth;
    @Nullable
    public final Float height;
    @Nullable

    /* renamed from: id */
    public final String f72489id;
    @Nullable
    public final Float pxRatio;
    @NonNull
    public final VastScenarioResourceData resourceData;
    @NonNull
    public final List<Tracking> trackingEvents;
    @NonNull
    public final VastScenarioCreativeData vastScenarioCreativeData;
    @Nullable
    public final Float width;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private AdParameters adParameters;
        @Nullable
        private String adSlotID;
        @Nullable
        private String altText;
        @Nullable
        private String apiFramework;
        @Nullable
        private Float assetHeight;
        @Nullable
        private Float assetWidth;
        @Nullable
        private String companionClickThrough;
        @Nullable
        private List<VastBeacon> companionClickTrackings;
        @Nullable
        private Float expandedHeight;
        @Nullable
        private Float expandedWidth;
        @Nullable
        private Float height;
        @Nullable

        /* renamed from: id */
        private String f72490id;
        @Nullable
        private Float pxRatio;
        @Nullable
        private VastScenarioResourceData resourceData;
        @Nullable
        private List<Tracking> trackingEvents;
        @Nullable
        private VastScenarioCreativeData vastScenarioCreativeData;
        @Nullable
        private Float width;

        public Builder() {
        }

        @NonNull
        public VastCompanionScenario build() {
            Objects.requireNonNull(this.resourceData, "Cannot build VastCompanionScenario: resourceData is missing");
            Objects.requireNonNull(this.vastScenarioCreativeData, "Cannot build VastMediaFileScenario: vastScenarioCreativeData is missing");
            return new VastCompanionScenario(this.resourceData, this.vastScenarioCreativeData, VastModels.toImmutableList(this.companionClickTrackings), VastModels.toImmutableList(this.trackingEvents), this.companionClickThrough, this.f72490id, this.width, this.height, this.assetWidth, this.assetHeight, this.expandedWidth, this.expandedHeight, this.pxRatio, this.apiFramework, this.adSlotID, this.altText, this.adParameters);
        }

        @NonNull
        public Builder setAdParameters(@Nullable AdParameters adParameters) {
            this.adParameters = adParameters;
            return this;
        }

        @NonNull
        public Builder setAdSlotID(@Nullable String str) {
            this.adSlotID = str;
            return this;
        }

        @NonNull
        public Builder setAltText(@Nullable String str) {
            this.altText = str;
            return this;
        }

        @NonNull
        public Builder setApiFramework(@Nullable String str) {
            this.apiFramework = str;
            return this;
        }

        @NonNull
        public Builder setAssetHeight(@Nullable Float f) {
            this.assetHeight = f;
            return this;
        }

        @NonNull
        public Builder setAssetWidth(@Nullable Float f) {
            this.assetWidth = f;
            return this;
        }

        @NonNull
        public Builder setCompanionClickThrough(@Nullable String str) {
            this.companionClickThrough = str;
            return this;
        }

        @NonNull
        public Builder setCompanionClickTrackings(@Nullable List<VastBeacon> list) {
            this.companionClickTrackings = list;
            return this;
        }

        @NonNull
        public Builder setExpandedHeight(@Nullable Float f) {
            this.expandedHeight = f;
            return this;
        }

        @NonNull
        public Builder setExpandedWidth(@Nullable Float f) {
            this.expandedWidth = f;
            return this;
        }

        @NonNull
        public Builder setHeight(@Nullable Float f) {
            this.height = f;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72490id = str;
            return this;
        }

        @NonNull
        public Builder setPxRatio(@Nullable Float f) {
            this.pxRatio = f;
            return this;
        }

        @NonNull
        public Builder setTrackingEvents(@Nullable List<Tracking> list) {
            this.trackingEvents = list;
            return this;
        }

        @NonNull
        public Builder setVastScenarioCreativeData(@Nullable VastScenarioCreativeData vastScenarioCreativeData) {
            this.vastScenarioCreativeData = vastScenarioCreativeData;
            return this;
        }

        @NonNull
        public Builder setVastScenarioResourceData(@Nullable VastScenarioResourceData vastScenarioResourceData) {
            this.resourceData = vastScenarioResourceData;
            return this;
        }

        @NonNull
        public Builder setWidth(@Nullable Float f) {
            this.width = f;
            return this;
        }

        public Builder(@NonNull VastCompanionScenario vastCompanionScenario) {
            this.resourceData = vastCompanionScenario.resourceData;
            this.companionClickTrackings = vastCompanionScenario.companionClickTrackings;
            this.companionClickThrough = vastCompanionScenario.companionClickThrough;
            this.trackingEvents = vastCompanionScenario.trackingEvents;
            this.f72490id = vastCompanionScenario.f72489id;
            this.width = vastCompanionScenario.width;
            this.height = vastCompanionScenario.height;
            this.assetWidth = vastCompanionScenario.assetWidth;
            this.assetHeight = vastCompanionScenario.assetHeight;
            this.expandedWidth = vastCompanionScenario.expandedWidth;
            this.expandedHeight = vastCompanionScenario.expandedHeight;
            this.pxRatio = vastCompanionScenario.pxRatio;
            this.apiFramework = vastCompanionScenario.apiFramework;
            this.adSlotID = vastCompanionScenario.adSlotID;
            this.altText = vastCompanionScenario.altText;
            this.adParameters = vastCompanionScenario.adParameters;
            this.vastScenarioCreativeData = vastCompanionScenario.vastScenarioCreativeData;
        }
    }

    @Override // com.smaato.sdk.video.vast.model.Sized
    @Nullable
    public Float getHeight() {
        return this.height;
    }

    @Override // com.smaato.sdk.video.vast.model.Sized
    @Nullable
    public Float getWidth() {
        return this.width;
    }

    @NonNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    private VastCompanionScenario(@NonNull VastScenarioResourceData vastScenarioResourceData, @NonNull VastScenarioCreativeData vastScenarioCreativeData, @NonNull List<VastBeacon> list, @NonNull List<Tracking> list2, @Nullable String str, @Nullable String str2, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable Float f7, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable AdParameters adParameters) {
        this.resourceData = vastScenarioResourceData;
        this.vastScenarioCreativeData = vastScenarioCreativeData;
        this.companionClickTrackings = new ArrayList(list);
        this.companionClickThrough = str;
        this.trackingEvents = list2;
        this.f72489id = str2;
        this.width = f;
        this.height = f2;
        this.assetWidth = f3;
        this.assetHeight = f4;
        this.expandedWidth = f5;
        this.expandedHeight = f6;
        this.pxRatio = f7;
        this.apiFramework = str3;
        this.adSlotID = str4;
        this.altText = str5;
        this.adParameters = adParameters;
    }
}
