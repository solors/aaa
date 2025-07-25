package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* loaded from: classes9.dex */
public enum ChargeType {
    UNKNOWN(-1),
    NONE(0),
    USB(1),
    WIRELESS(2),
    AC(3);
    

    /* renamed from: a */
    private final int f92376a;

    ChargeType(int i) {
        this.f92376a = i;
    }

    public static ChargeType fromId(Integer num) {
        ChargeType[] values;
        if (num != null) {
            for (ChargeType chargeType : values()) {
                if (chargeType.getId() == num.intValue()) {
                    return chargeType;
                }
            }
        }
        return UNKNOWN;
    }

    public int getId() {
        return this.f92376a;
    }
}
