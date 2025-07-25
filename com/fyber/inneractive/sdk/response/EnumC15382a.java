package com.fyber.inneractive.sdk.response;

/* renamed from: com.fyber.inneractive.sdk.response.a */
/* loaded from: classes4.dex */
public enum EnumC15382a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    RETURNED_ADTYPE_HTML5_VIDEO(9),
    RETURNED_ADTYPE_NATIVE(10),
    RETURNED_ADTYPE_PMN(11),
    RETURNED_ADTYPE_MOBILE_ADS(15);
    
    private int value;

    EnumC15382a(int i) {
        this.value = i;
    }

    /* renamed from: a */
    public static EnumC15382a m76585a(int i) {
        EnumC15382a[] values;
        for (EnumC15382a enumC15382a : values()) {
            if (enumC15382a.value == i) {
                return enumC15382a;
            }
        }
        return null;
    }
}
