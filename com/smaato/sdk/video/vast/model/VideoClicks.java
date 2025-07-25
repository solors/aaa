package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class VideoClicks {
    public static final String CLICK_THROUGH = "ClickThrough";
    public static final String CLICK_TRACKING = "ClickTracking";
    public static final String CUSTOM_CLICK = "CustomClick";
    public static final String NAME = "VideoClicks";
    @Nullable
    public final VastBeacon clickThrough;
    @NonNull
    public final List<VastBeacon> clickTrackings;
    @NonNull
    public final List<VastBeacon> customClicks;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private VastBeacon clickThrough;
        @Nullable
        private List<VastBeacon> clickTrackings;
        @Nullable
        private List<VastBeacon> customClicks;

        public VideoClicks build() {
            this.clickTrackings = VastModels.toImmutableList(this.clickTrackings);
            List<VastBeacon> immutableList = VastModels.toImmutableList(this.customClicks);
            this.customClicks = immutableList;
            return new VideoClicks(this.clickTrackings, immutableList, this.clickThrough);
        }

        @NonNull
        public Builder setClickThrough(@Nullable VastBeacon vastBeacon) {
            this.clickThrough = vastBeacon;
            return this;
        }

        @NonNull
        public Builder setClickTrackings(@Nullable List<VastBeacon> list) {
            this.clickTrackings = list;
            return this;
        }

        @NonNull
        public Builder setCustomClicks(@Nullable List<VastBeacon> list) {
            this.customClicks = list;
            return this;
        }
    }

    VideoClicks(@NonNull List<VastBeacon> list, @NonNull List<VastBeacon> list2, @Nullable VastBeacon vastBeacon) {
        this.clickThrough = vastBeacon;
        this.clickTrackings = list;
        this.customClicks = list2;
    }
}
