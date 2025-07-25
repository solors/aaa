package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public enum POBNativeImageAssetType {
    ICON(1),
    MAIN(3);
    

    /* renamed from: b */
    final int f70724b;

    POBNativeImageAssetType(int i) {
        this.f70724b = i;
    }

    @Nullable
    public static POBNativeImageAssetType getImageAssetType(int i) {
        if (i != 1) {
            if (i != 3) {
                return null;
            }
            return MAIN;
        }
        return ICON;
    }

    public int getImageAssetTypeValue() {
        return this.f70724b;
    }
}
