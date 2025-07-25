package io.bidmachine.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.base.Objects;
import io.bidmachine.media3.common.Bundleable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

/* loaded from: classes9.dex */
public final class ThumbRating extends Rating {
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;
    private static final String FIELD_RATED = Util.intToStringMaxRadix(1);
    private static final String FIELD_IS_THUMBS_UP = Util.intToStringMaxRadix(2);
    @UnstableApi
    public static final Bundleable.Creator<ThumbRating> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.p2
        @Override // io.bidmachine.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            ThumbRating fromBundle;
            fromBundle = ThumbRating.fromBundle(bundle);
            return fromBundle;
        }
    };

    public ThumbRating() {
        this.rated = false;
        this.isThumbsUp = false;
    }

    public static ThumbRating fromBundle(Bundle bundle) {
        boolean z;
        if (bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 3) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (bundle.getBoolean(FIELD_RATED, false)) {
            return new ThumbRating(bundle.getBoolean(FIELD_IS_THUMBS_UP, false));
        }
        return new ThumbRating();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        if (this.isThumbsUp != thumbRating.isThumbsUp || this.rated != thumbRating.rated) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.rated), Boolean.valueOf(this.isThumbsUp));
    }

    @Override // io.bidmachine.media3.common.Rating
    public boolean isRated() {
        return this.rated;
    }

    public boolean isThumbsUp() {
        return this.isThumbsUp;
    }

    @Override // io.bidmachine.media3.common.Rating, io.bidmachine.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 3);
        bundle.putBoolean(FIELD_RATED, this.rated);
        bundle.putBoolean(FIELD_IS_THUMBS_UP, this.isThumbsUp);
        return bundle;
    }

    public ThumbRating(boolean z) {
        this.rated = true;
        this.isThumbsUp = z;
    }
}
