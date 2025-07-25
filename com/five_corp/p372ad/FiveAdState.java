package com.five_corp.p372ad;

/* renamed from: com.five_corp.ad.FiveAdState */
/* loaded from: classes4.dex */
public enum FiveAdState {
    NOT_LOADED,
    LOADING,
    LOADED,
    CLOSED,
    ERROR;

    public int toInt() {
        int i = AbstractC14168o.f26842a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 5;
                    }
                    if (i != 5) {
                        return 0;
                    }
                    return 6;
                }
            }
        }
        return i2;
    }
}
