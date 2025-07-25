package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class Companion implements Sized {
    public static final String AD_PARAMETERS = "AdParameters";
    public static final String AD_SLOT_ID = "adSlotID";
    public static final String ALT_TEXT = "AltText";
    public static final String API_FRAMEWORK = "apiFramework";
    public static final String ASSET_HEIGHT = "assetHeight";
    public static final String ASSET_WIDTH = "assetWidth";
    public static final String COMPANION_CLICK_THROUGH = "CompanionClickThrough";
    public static final String COMPANION_CLICK_TRACKING = "CompanionClickTracking";
    public static final String EXPANDED_HEIGHT = "expandedHeight";
    public static final String EXPANDED_WIDTH = "expandedWidth";
    public static final String HEIGHT = "height";
    public static final String HTML_RESOURCE = "HTMLResource";

    /* renamed from: ID */
    public static final String f72476ID = "id";
    public static final String IFRAME_RESOURCE = "IFrameResource";
    public static final String NAME = "Companion";
    public static final String PX_RATIO = "pxratio";
    public static final String RENDERING_MODE = "renderingMode";
    public static final String STATIC_RESOURCE = "StaticResource";
    public static final String TRACKING_EVENTS = "TrackingEvents";
    public static final String WIDTH = "width";
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
    @NonNull
    public final List<String> htmlResources;
    @NonNull
    public final List<String> iFrameResources;
    @Nullable

    /* renamed from: id */
    public final String f72477id;
    @Nullable
    public final Float pxRatio;
    @Nullable
    public final String renderingMode;
    @NonNull
    public final List<StaticResource> staticResources;
    @NonNull
    public final List<Tracking> trackingEvents;
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
        private List<String> htmlResources;
        @Nullable
        private List<String> iFrameResources;
        @Nullable

        /* renamed from: id */
        private String f72478id;
        @Nullable
        private Float pxRatio;
        @NonNull
        private String renderingMode = "end-card";
        @Nullable
        private List<StaticResource> staticResources;
        @Nullable
        private List<Tracking> trackingEvents;
        @Nullable
        private Float width;

        @NonNull
        public Companion build() {
            this.companionClickTrackings = VastModels.toImmutableList(this.companionClickTrackings);
            this.trackingEvents = VastModels.toImmutableList(this.trackingEvents);
            this.staticResources = VastModels.toImmutableList(this.staticResources);
            this.iFrameResources = VastModels.toImmutableList(this.iFrameResources);
            List<String> immutableList = VastModels.toImmutableList(this.htmlResources);
            this.htmlResources = immutableList;
            return new Companion(this.companionClickTrackings, this.trackingEvents, this.staticResources, this.iFrameResources, immutableList, this.f72478id, this.width, this.height, this.assetWidth, this.assetHeight, this.expandedWidth, this.expandedHeight, this.apiFramework, this.adSlotID, this.pxRatio, this.altText, this.companionClickThrough, this.adParameters, this.renderingMode);
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
        public Builder setHtmlResources(@Nullable List<String> list) {
            this.htmlResources = list;
            return this;
        }

        @NonNull
        public Builder setIFrameResources(@Nullable List<String> list) {
            this.iFrameResources = list;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72478id = str;
            return this;
        }

        @NonNull
        public Builder setPxRatio(@Nullable Float f) {
            this.pxRatio = f;
            return this;
        }

        @NonNull
        public Builder setRenderingMode(String str) {
            this.renderingMode = str;
            return this;
        }

        @NonNull
        public Builder setStaticResources(@Nullable List<StaticResource> list) {
            this.staticResources = list;
            return this;
        }

        @NonNull
        public Builder setTrackingEvents(@Nullable List<Tracking> list) {
            this.trackingEvents = list;
            return this;
        }

        @NonNull
        public Builder setWidth(@Nullable Float f) {
            this.width = f;
            return this;
        }
    }

    Companion(@NonNull List<VastBeacon> list, @NonNull List<Tracking> list2, @NonNull List<StaticResource> list3, @NonNull List<String> list4, @NonNull List<String> list5, @Nullable String str, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable String str2, @Nullable String str3, @Nullable Float f7, @Nullable String str4, @Nullable String str5, @Nullable AdParameters adParameters, @Nullable String str6) {
        this.f72477id = str;
        this.width = f;
        this.height = f2;
        this.assetWidth = f3;
        this.assetHeight = f4;
        this.expandedWidth = f5;
        this.expandedHeight = f6;
        this.apiFramework = str2;
        this.adSlotID = str3;
        this.pxRatio = f7;
        this.altText = str4;
        this.companionClickThrough = str5;
        this.adParameters = adParameters;
        this.staticResources = list3;
        this.iFrameResources = list4;
        this.htmlResources = list5;
        this.companionClickTrackings = list;
        this.trackingEvents = list2;
        this.renderingMode = str6;
    }

    @Override // com.smaato.sdk.video.vast.model.Sized
    @Nullable
    public Float getHeight() {
        float floatValue;
        Float f = this.height;
        if (f == null) {
            floatValue = 480.0f;
        } else {
            floatValue = f.floatValue();
        }
        return Float.valueOf(floatValue);
    }

    @Override // com.smaato.sdk.video.vast.model.Sized
    @Nullable
    public Float getWidth() {
        float floatValue;
        Float f = this.width;
        if (f == null) {
            floatValue = 320.0f;
        } else {
            floatValue = f.floatValue();
        }
        return Float.valueOf(floatValue);
    }

    public boolean isResourcesEmpty() {
        if (this.staticResources.isEmpty() && this.iFrameResources.isEmpty() && this.htmlResources.isEmpty()) {
            return true;
        }
        return false;
    }
}
