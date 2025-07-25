package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class Linear {
    public static final String AD_PARAMETERS = "AdParameters";
    public static final String DURATION = "Duration";
    public static final String ICONS = "Icons";
    public static final String MEDIA_FILES = "MediaFiles";
    public static final String NAME = "Linear";
    public static final String SKIPOFFSET = "skipoffset";
    public static final String TRACKING_EVENTS = "TrackingEvents";
    public static final String VIDEO_CLICKS = "VideoClicks";
    @Nullable
    public final AdParameters adParameters;
    @Nullable
    public final String duration;
    @NonNull
    public final List<Icon> icons;
    @NonNull
    public final List<MediaFile> mediaFiles;
    @Nullable
    public final String skipOffset;
    @NonNull
    public final List<Tracking> trackingEvents;
    @Nullable
    public final VideoClicks videoClicks;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private AdParameters adParameters;
        @Nullable
        private String duration;
        @Nullable
        private List<Icon> icons;
        @Nullable
        private List<MediaFile> mediaFiles;
        @Nullable
        private String skipOffset;
        @Nullable
        private List<Tracking> trackingEvents;
        @Nullable
        private VideoClicks videoClicks;

        @NonNull
        public Linear build() {
            return new Linear(VastModels.toImmutableList(this.mediaFiles), VastModels.toImmutableList(this.trackingEvents), VastModels.toImmutableList(this.icons), this.adParameters, this.duration, this.skipOffset, this.videoClicks);
        }

        @NonNull
        public Builder setAdParameters(@Nullable AdParameters adParameters) {
            this.adParameters = adParameters;
            return this;
        }

        @NonNull
        public Builder setDuration(@Nullable String str) {
            this.duration = str;
            return this;
        }

        @NonNull
        public Builder setIcons(@Nullable List<Icon> list) {
            this.icons = list;
            return this;
        }

        @NonNull
        public Builder setMediaFiles(@Nullable List<MediaFile> list) {
            List<MediaFile> list2 = this.mediaFiles;
            if (list2 == null || list2.isEmpty()) {
                this.mediaFiles = list;
            }
            return this;
        }

        @NonNull
        public Builder setSkipOffset(@Nullable String str) {
            this.skipOffset = str;
            return this;
        }

        @NonNull
        public Builder setTrackingEvents(@Nullable List<Tracking> list) {
            this.trackingEvents = list;
            return this;
        }

        @NonNull
        public Builder setVideoClicks(@Nullable VideoClicks videoClicks) {
            this.videoClicks = videoClicks;
            return this;
        }
    }

    Linear(@NonNull List<MediaFile> list, @NonNull List<Tracking> list2, @NonNull List<Icon> list3, @Nullable AdParameters adParameters, @Nullable String str, @Nullable String str2, @Nullable VideoClicks videoClicks) {
        this.adParameters = adParameters;
        this.duration = str;
        this.skipOffset = str2;
        this.mediaFiles = list;
        this.videoClicks = videoClicks;
        this.trackingEvents = list2;
        this.icons = list3;
    }
}
