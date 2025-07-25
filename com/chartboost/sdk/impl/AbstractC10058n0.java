package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.n0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10058n0 {
    /* renamed from: b */
    public static final String m81047b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "UNKNOWN";
                    }
                    return "STATE_ENDED";
                }
                return "STATE_READY";
            }
            return "STATE_BUFFERING";
        }
        return "STATE_IDLE";
    }
}
