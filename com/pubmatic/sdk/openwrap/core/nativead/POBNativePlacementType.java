package com.pubmatic.sdk.openwrap.core.nativead;

/* loaded from: classes7.dex */
public enum POBNativePlacementType {
    FEED(1),
    ATOMIC(2),
    OUTSIDE_CORE_CONTENT(3),
    BELOW_ARTICLE(4),
    EXCHANGE(500);
    

    /* renamed from: b */
    private final int f70726b;

    POBNativePlacementType(int i) {
        this.f70726b = i;
    }

    public int getValue() {
        return this.f70726b;
    }
}
