package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class VastConfigurationSettings {
    @Nullable
    public final String connectionType;
    public final int displayHeight;
    public final int displayWidth;

    public VastConfigurationSettings(int i, int i2, @Nullable String str) {
        this.displayWidth = i;
        this.displayHeight = i2;
        this.connectionType = str;
    }
}
