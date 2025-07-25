package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class AdQualityControl {
    @Nullable
    private String beacon;
    private boolean enableSdkAdQuality;
    private float screenshotDelayInSeconds;
    private boolean takeScreenshot;

    @Nullable
    public final String getBeacon() {
        return this.beacon;
    }

    public final boolean getEnableSdkAdQuality() {
        return this.enableSdkAdQuality;
    }

    public final float getScreenshotDelayInSeconds() {
        return this.screenshotDelayInSeconds;
    }

    public final boolean getTakeScreenshot() {
        return this.takeScreenshot;
    }

    public final void setBeacon(@Nullable String str) {
        this.beacon = str;
    }

    public final void setEnableSdkAdQuality(boolean z) {
        this.enableSdkAdQuality = z;
    }

    public final void setScreenshotDelayInSeconds(float f) {
        this.screenshotDelayInSeconds = f;
    }

    public final void setTakeScreenshot(boolean z) {
        this.takeScreenshot = z;
    }
}
