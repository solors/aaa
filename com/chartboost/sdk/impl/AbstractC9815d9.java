package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.d9 */
/* loaded from: classes3.dex */
public abstract class AbstractC9815d9 {
    /* renamed from: a */
    public static final int m81779a(float f) {
        if (f == 0.0f) {
            return 0;
        }
        double d = f;
        if (d < 0.25d) {
            return 1;
        }
        if (d < 0.5d) {
            return 2;
        }
        if (d < 0.75d) {
            return 3;
        }
        if (f < 1.0f) {
            return 4;
        }
        return 5;
    }
}
