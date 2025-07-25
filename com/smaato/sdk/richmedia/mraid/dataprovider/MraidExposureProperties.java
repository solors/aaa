package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class MraidExposureProperties {
    public final float exposedPercentage;
    @NonNull
    public final Rect visibleRectangleInDp;

    private MraidExposureProperties() {
        this(-1.0f, new Rect());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static MraidExposureProperties empty() {
        return new MraidExposureProperties();
    }

    @NonNull
    public static MraidExposureProperties valueOf(float f, @NonNull Rect rect) {
        return new MraidExposureProperties(f, rect);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MraidExposureProperties.class != obj.getClass()) {
            return false;
        }
        MraidExposureProperties mraidExposureProperties = (MraidExposureProperties) obj;
        if (Float.compare(mraidExposureProperties.exposedPercentage, this.exposedPercentage) == 0 && Objects.equals(this.visibleRectangleInDp, mraidExposureProperties.visibleRectangleInDp)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.exposedPercentage), this.visibleRectangleInDp);
    }

    public boolean isEmpty() {
        if (this.exposedPercentage >= 0.0f && !this.visibleRectangleInDp.isEmpty()) {
            return false;
        }
        return true;
    }

    private MraidExposureProperties(float f, @NonNull Rect rect) {
        this.exposedPercentage = f;
        this.visibleRectangleInDp = rect;
    }
}
