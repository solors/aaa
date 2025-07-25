package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes.dex */
public final class PercentageRating extends Rating {
    private static final int TYPE = 1;
    private final float percent;
    private static final String FIELD_PERCENT = Util.intToStringMaxRadix(1);
    @UnstableApi
    public static final Bundleable.Creator<PercentageRating> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.w
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            PercentageRating fromBundle;
            fromBundle = PercentageRating.fromBundle(bundle);
            return fromBundle;
        }
    };

    public PercentageRating() {
        this.percent = -1.0f;
    }

    public static PercentageRating fromBundle(Bundle bundle) {
        boolean z = true;
        if (bundle.getInt(Rating.FIELD_RATING_TYPE, -1) != 1) {
            z = false;
        }
        Assertions.checkArgument(z);
        float f = bundle.getFloat(FIELD_PERCENT, -1.0f);
        if (f == -1.0f) {
            return new PercentageRating();
        }
        return new PercentageRating(f);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PercentageRating) || this.percent != ((PercentageRating) obj).percent) {
            return false;
        }
        return true;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.percent));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        if (this.percent != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    public PercentageRating(@FloatRange(from = 0.0d, m105511to = 100.0d) float f) {
        Assertions.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f;
    }
}
