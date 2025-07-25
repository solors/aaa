package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public enum POBNativeEventTrackingMethod {
    IMAGE(1),
    JAVASCRIPT(2);
    

    /* renamed from: b */
    final int f70720b;

    POBNativeEventTrackingMethod(int i) {
        this.f70720b = i;
    }

    @Nullable
    public static POBNativeEventTrackingMethod getEventTrackingMethod(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return JAVASCRIPT;
        }
        return IMAGE;
    }

    public int getEventEventTrackingMethodValue() {
        return this.f70720b;
    }
}
