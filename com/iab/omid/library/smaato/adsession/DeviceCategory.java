package com.iab.omid.library.smaato.adsession;

import com.amazon.device.ads.DTBMetricsConfiguration;

/* loaded from: classes6.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY),
    OTHER("other");
    
    private final String deviceCategory;

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.deviceCategory;
    }
}
