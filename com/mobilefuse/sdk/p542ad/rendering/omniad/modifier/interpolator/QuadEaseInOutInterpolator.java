package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.interpolator;

import android.view.animation.Interpolator;
import kotlin.Metadata;

/* compiled from: QuadEaseInOutInterpolator.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.interpolator.QuadEaseInOutInterpolator */
/* loaded from: classes7.dex */
public final class QuadEaseInOutInterpolator implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f < 0.5f) {
            return 2 * f * f;
        }
        return 1.0f - (((float) Math.pow(((-2) * f) + 2, 2)) / 2.0f);
    }
}
