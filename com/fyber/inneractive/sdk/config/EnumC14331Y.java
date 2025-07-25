package com.fyber.inneractive.sdk.config;

import net.pubnative.lite.sdk.models.Protocol;

/* renamed from: com.fyber.inneractive.sdk.config.Y */
/* loaded from: classes4.dex */
public enum EnumC14331Y {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO("3"),
    APP_INFO(Protocol.VAST_1_0_WRAPPER);
    
    String value;

    EnumC14331Y(String str) {
        this.value = str;
    }

    /* renamed from: a */
    public final String m77988a() {
        return this.value;
    }
}
