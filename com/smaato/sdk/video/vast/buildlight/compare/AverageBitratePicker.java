package com.smaato.sdk.video.vast.buildlight.compare;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.buildlight.VastConfigurationSettings;

/* loaded from: classes7.dex */
public class AverageBitratePicker {
    @NonNull
    private final VastConfigurationSettings configurationSettings;

    public AverageBitratePicker(@NonNull VastConfigurationSettings vastConfigurationSettings) {
        this.configurationSettings = (VastConfigurationSettings) Objects.requireNonNull(vastConfigurationSettings, "configurationSettings can not be null in AverageBitratePicker");
    }

    public int getAverageBitrate() {
        VastConfigurationSettings vastConfigurationSettings = this.configurationSettings;
        int max = Math.max(vastConfigurationSettings.displayHeight, vastConfigurationSettings.displayWidth);
        VideoQuality videoQuality = VideoQuality.LOW;
        if (max <= videoQuality.f72449b) {
            return videoQuality.f72450c;
        }
        VideoQuality videoQuality2 = VideoQuality.MEDIUM;
        if (max <= videoQuality2.f72449b) {
            return videoQuality2.f72450c;
        }
        VideoQuality videoQuality3 = VideoQuality.HIGH;
        if (max <= videoQuality3.f72449b) {
            return videoQuality3.f72450c;
        }
        return 3000;
    }
}
