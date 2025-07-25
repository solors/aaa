package com.bytedance.sdk.openadsdk.tuV;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.C20747r8;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.eqN */
/* loaded from: classes3.dex */
public enum EnumC9422eqN {
    TYPE_2G("2g"),
    TYPE_3G(C20747r8.f52729a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(C20747r8.f52730b),
    TYPE_MOBILE(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY),
    TYPE_UNKNOWN("unknown");
    

    /* renamed from: Kg */
    private String f21047Kg;

    EnumC9422eqN(String str) {
        this.f21047Kg = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21047Kg;
    }
}
