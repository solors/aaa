package com.bytedance.sdk.openadsdk.core.p316PX.p319bg;

import androidx.annotation.NonNull;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bg.bg */
/* loaded from: classes3.dex */
public enum EnumC8646bg {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);
    

    /* renamed from: Kg */
    private final int f19088Kg;

    EnumC8646bg(int i) {
        this.f19088Kg = i;
    }

    @NonNull
    /* renamed from: bg */
    public String m85445bg() {
        return String.valueOf(this.f19088Kg);
    }
}
