package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class AdjustedCornerSize implements CornerSize {

    /* renamed from: a */
    private final CornerSize f38151a;

    /* renamed from: b */
    private final float f38152b;

    public AdjustedCornerSize(float f, @NonNull CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f38151a;
            f += ((AdjustedCornerSize) cornerSize).f38152b;
        }
        this.f38151a = cornerSize;
        this.f38152b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        if (this.f38151a.equals(adjustedCornerSize.f38151a) && this.f38152b == adjustedCornerSize.f38152b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f38151a.getCornerSize(rectF) + this.f38152b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38151a, Float.valueOf(this.f38152b)});
    }
}
