package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;

/* compiled from: enums.kt */
@Metadata
/* loaded from: classes7.dex */
public enum VastClickType {
    NOT_CLICKABLE(0),
    FULL_VIDEO_AREA(1),
    BUTTON_OR_LINK(2),
    BUTTON_CONFIRMATION_DIALOG(3);
    
    private final int value;

    VastClickType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
