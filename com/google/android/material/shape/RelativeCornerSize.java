package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class RelativeCornerSize implements CornerSize {

    /* renamed from: a */
    private final float f38192a;

    public RelativeCornerSize(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        this.f38192a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RelativeCornerSize) && this.f38192a == ((RelativeCornerSize) obj).f38192a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.f38192a * rectF.height();
    }

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float getRelativePercent() {
        return this.f38192a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38192a)});
    }
}
