package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.VideoClicks;

/* loaded from: classes7.dex */
public class VideoClicksMerger {
    @Nullable
    public VideoClicks merge(@Nullable VideoClicks videoClicks, @Nullable VideoClicks videoClicks2) {
        if (videoClicks == null) {
            return videoClicks2;
        }
        if (videoClicks2 == null) {
            return videoClicks;
        }
        return new VideoClicks.Builder().setClickThrough(videoClicks.clickThrough).setClickTrackings(VastScenarioMergeUtils.merge(videoClicks.clickTrackings, videoClicks2.clickTrackings)).setCustomClicks(VastScenarioMergeUtils.merge(videoClicks.customClicks, videoClicks2.customClicks)).build();
    }
}
