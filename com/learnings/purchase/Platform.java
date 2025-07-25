package com.learnings.purchase;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* loaded from: classes6.dex */
public enum Platform {
    GOOGLE(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE),
    AMAZON("amazon");
    
    private String value;

    Platform(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
