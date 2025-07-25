package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* renamed from: a */
    private final float f38150a;

    public AbsoluteCornerSize(float f) {
        this.f38150a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AbsoluteCornerSize) && this.f38150a == ((AbsoluteCornerSize) obj).f38150a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.f38150a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38150a)});
    }

    public float getCornerSize() {
        return this.f38150a;
    }
}
