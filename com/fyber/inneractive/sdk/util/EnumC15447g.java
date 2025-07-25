package com.fyber.inneractive.sdk.util;

import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.util.g */
/* loaded from: classes4.dex */
public enum EnumC15447g {
    DISPLAY("DISPLAY"),
    VIDEO_CTA("VIDEO_CTA"),
    VIDEO_CLICK("VIDEO_CLICK"),
    VAST_ENDCARD("VAST_ENDCARD"),
    DEFAULT_ENDCARD("DEFAULT_ENDCARD"),
    VIDEO_APP_INFO("VIDEO_APP_INFO"),
    FMP_ENDCARD("FMP_ENDCARD");
    
    private final String key;
    private String mVersion = "";
    private int mOrderShown = 0;

    EnumC15447g(String str) {
        this.key = str;
    }

    /* renamed from: a */
    public final void m76504a(String str) {
        this.mVersion = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        if ((this == FMP_ENDCARD && this.mOrderShown == 1) || this.mOrderShown == 2) {
            Locale locale = Locale.US;
            String str = this.key;
            int i = this.mOrderShown;
            return str + "_" + i;
        }
        return this.key;
    }

    /* renamed from: a */
    public final String m76506a() {
        return this.mVersion;
    }

    /* renamed from: a */
    public final void m76505a(int i) {
        this.mOrderShown = i;
    }
}
