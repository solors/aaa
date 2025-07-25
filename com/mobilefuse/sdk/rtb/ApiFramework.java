package com.mobilefuse.sdk.rtb;

/* loaded from: classes7.dex */
public enum ApiFramework {
    VPAID1(1),
    VPAID2(2),
    MRAID1(3),
    ORMMA(4),
    MRAID2(5),
    MRAID3(6),
    OMID1(7);
    
    private int value;

    ApiFramework(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
