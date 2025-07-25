package com.bytedance.adsdk.ugeno.yoga;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.eo */
/* loaded from: classes3.dex */
public enum EnumC7151eo {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    
    private final int eqN;

    EnumC7151eo(int i) {
        this.eqN = i;
    }

    /* renamed from: bg */
    public static EnumC7151eo m89857bg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return AT_MOST;
                }
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
            }
            return EXACTLY;
        }
        return UNDEFINED;
    }
}
