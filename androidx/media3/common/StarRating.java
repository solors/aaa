package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes.dex */
public final class StarRating extends Rating {
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    @IntRange(from = 1)
    private final int maxStars;
    private final float starRating;
    private static final String FIELD_MAX_STARS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STAR_RATING = Util.intToStringMaxRadix(2);
    @UnstableApi
    public static final Bundleable.Creator<StarRating> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.r2
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            StarRating fromBundle;
            fromBundle = StarRating.fromBundle(bundle);
            return fromBundle;
        }
    };

    public StarRating(@IntRange(from = 1) int i) {
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        this.maxStars = i;
        this.starRating = -1.0f;
    }

    public static StarRating fromBundle(Bundle bundle) {
        boolean z;
        if (bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        int i = bundle.getInt(FIELD_MAX_STARS, 5);
        float f = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        if (f == -1.0f) {
            return new StarRating(i);
        }
        return new StarRating(i, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        if (this.maxStars != starRating.maxStars || this.starRating != starRating.starRating) {
            return false;
        }
        return true;
    }

    @IntRange(from = 1)
    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        if (this.starRating != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public StarRating(@IntRange(from = 1) int i, @FloatRange(from = 0.0d) float f) {
        boolean z = true;
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        Assertions.checkArgument((f < 0.0f || f > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.maxStars = i;
        this.starRating = f;
    }
}
