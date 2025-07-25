package com.smaato.sdk.video.vast.model;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public enum VideoAdType {
    VIDEO,
    AUDIO,
    HYBRID;

    @Nullable
    public static VideoAdType parse(@Nullable String str) {
        VideoAdType[] values;
        for (VideoAdType videoAdType : values()) {
            if (videoAdType.name().equalsIgnoreCase(str)) {
                return videoAdType;
            }
        }
        return null;
    }
}
