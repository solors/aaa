package com.mobilefuse.sdk.device;

import kotlin.Metadata;

/* compiled from: DeviceType.kt */
@Metadata
/* loaded from: classes7.dex */
public enum DeviceType {
    MOBILE_OR_TABLET(1),
    PC(2),
    CONNECTED_TV(3),
    PHONE(4),
    TABLET(5),
    CONNECTED_DEVICE(6),
    SET_TOP_BOX(7);
    
    private final int value;

    DeviceType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
