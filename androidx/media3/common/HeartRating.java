package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes.dex */
public final class HeartRating extends Rating {
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;
    private static final String FIELD_RATED = Util.intToStringMaxRadix(1);
    private static final String FIELD_IS_HEART = Util.intToStringMaxRadix(2);
    @UnstableApi
    public static final Bundleable.Creator<HeartRating> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.k
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            HeartRating fromBundle;
            fromBundle = HeartRating.fromBundle(bundle);
            return fromBundle;
        }
    };

    public HeartRating() {
        this.rated = false;
        this.isHeart = false;
    }

    public static HeartRating fromBundle(Bundle bundle) {
        boolean z;
        if (bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (bundle.getBoolean(FIELD_RATED, false)) {
            return new HeartRating(bundle.getBoolean(FIELD_IS_HEART, false));
        }
        return new HeartRating();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        if (this.isHeart != heartRating.isHeart || this.rated != heartRating.rated) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.rated), Boolean.valueOf(this.isHeart));
    }

    public boolean isHeart() {
        return this.isHeart;
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.rated;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 0);
        bundle.putBoolean(FIELD_RATED, this.rated);
        bundle.putBoolean(FIELD_IS_HEART, this.isHeart);
        return bundle;
    }

    public HeartRating(boolean z) {
        this.rated = true;
        this.isHeart = z;
    }
}
