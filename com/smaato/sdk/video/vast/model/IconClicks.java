package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class IconClicks {
    public static final String ICON_CLICK_THROUGH = "IconClickThrough";
    public static final String ICON_CLICK_TRACKING = "IconClickTracking";
    public static final String NAME = "IconClicks";
    @Nullable
    public final String iconClickThrough;
    @NonNull
    public final List<VastBeacon> iconClickTrackings;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String iconClickThrough;
        @Nullable
        private List<VastBeacon> iconClickTrackings;

        @NonNull
        public IconClicks build() {
            return new IconClicks(VastModels.toImmutableList(this.iconClickTrackings), this.iconClickThrough);
        }

        @NonNull
        public Builder setIconClickThrough(@Nullable String str) {
            this.iconClickThrough = str;
            return this;
        }

        @NonNull
        public Builder setIconClickTrackings(@Nullable List<VastBeacon> list) {
            this.iconClickTrackings = list;
            return this;
        }
    }

    IconClicks(@NonNull List<VastBeacon> list, @Nullable String str) {
        this.iconClickTrackings = list;
        this.iconClickThrough = str;
    }
}
