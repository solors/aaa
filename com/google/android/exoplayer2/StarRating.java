package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes4.dex */
public final class StarRating extends Rating {
    @IntRange(from = 1)

    /* renamed from: c */
    private final int f31981c;

    /* renamed from: d */
    private final float f31982d;

    /* renamed from: f */
    private static final String f31979f = Util.intToStringMaxRadix(1);

    /* renamed from: g */
    private static final String f31980g = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<StarRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.y4
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            StarRating m75326d;
            m75326d = StarRating.m75326d(bundle);
            return m75326d;
        }
    };

    public StarRating(@IntRange(from = 1) int i) {
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        this.f31981c = i;
        this.f31982d = -1.0f;
    }

    /* renamed from: d */
    public static StarRating m75326d(Bundle bundle) {
        boolean z;
        if (bundle.getInt(Rating.f31902b, -1) == 2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        int i = bundle.getInt(f31979f, 5);
        float f = bundle.getFloat(f31980g, -1.0f);
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
        if (this.f31981c != starRating.f31981c || this.f31982d != starRating.f31982d) {
            return false;
        }
        return true;
    }

    @IntRange(from = 1)
    public int getMaxStars() {
        return this.f31981c;
    }

    public float getStarRating() {
        return this.f31982d;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f31981c), Float.valueOf(this.f31982d));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        if (this.f31982d != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.f31902b, 2);
        bundle.putInt(f31979f, this.f31981c);
        bundle.putFloat(f31980g, this.f31982d);
        return bundle;
    }

    public StarRating(@IntRange(from = 1) int i, @FloatRange(from = 0.0d) float f) {
        boolean z = true;
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        Assertions.checkArgument((f < 0.0f || f > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.f31981c = i;
        this.f31982d = f;
    }
}
