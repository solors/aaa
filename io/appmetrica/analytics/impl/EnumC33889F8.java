package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.F8 */
/* loaded from: classes9.dex */
public enum EnumC33889F8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);
    

    /* renamed from: a */
    public final int f92822a;

    EnumC33889F8(int i) {
        this.f92822a = i;
    }

    /* renamed from: a */
    public static EnumC33889F8 m22662a(Integer num) {
        EnumC33889F8[] values;
        if (num != null) {
            for (EnumC33889F8 enumC33889F8 : values()) {
                if (enumC33889F8.f92822a == num.intValue()) {
                    return enumC33889F8;
                }
            }
        }
        return NONE;
    }
}
