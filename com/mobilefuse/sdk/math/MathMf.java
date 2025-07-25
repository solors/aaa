package com.mobilefuse.sdk.math;

import kotlin.Metadata;

/* compiled from: MathMf.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MathMf {
    public static final float minPreferPositive(float f, float f2) {
        float f3 = 0;
        int i = (f > f3 ? 1 : (f == f3 ? 0 : -1));
        if (i < 0 && f2 < f3) {
            return Math.min(f, f2);
        }
        if (i < 0) {
            return f2;
        }
        if (f2 >= f3) {
            return Math.min(f, f2);
        }
        return f;
    }
}
