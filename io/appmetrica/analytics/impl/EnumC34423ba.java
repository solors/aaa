package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ba */
/* loaded from: classes9.dex */
public enum EnumC34423ba {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);
    

    /* renamed from: a */
    public final int f94026a;

    EnumC34423ba(int i) {
        this.f94026a = i;
    }

    /* renamed from: a */
    public static EnumC34423ba m21936a(Integer num) {
        EnumC34423ba[] values;
        if (num != null) {
            for (EnumC34423ba enumC34423ba : values()) {
                if (enumC34423ba.f94026a == num.intValue()) {
                    return enumC34423ba;
                }
            }
        }
        return UNKNOWN;
    }
}
