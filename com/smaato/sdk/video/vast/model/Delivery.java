package com.smaato.sdk.video.vast.model;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public enum Delivery {
    PROGRESSIVE,
    STREAMING;

    @Nullable
    public static Delivery parse(@Nullable String str) {
        Delivery[] values;
        for (Delivery delivery : values()) {
            if (delivery.name().equalsIgnoreCase(str)) {
                return delivery;
            }
        }
        return null;
    }
}
