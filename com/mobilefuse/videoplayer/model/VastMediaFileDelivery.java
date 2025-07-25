package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: enums.kt */
@Metadata
/* loaded from: classes7.dex */
public enum VastMediaFileDelivery {
    PROGRESSIVE("progressive"),
    STREAMING("streaming");
    
    @NotNull
    private final String value;

    VastMediaFileDelivery(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
