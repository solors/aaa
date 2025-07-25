package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes4.dex */
public final class PercentageRating extends Rating {

    /* renamed from: c */
    private final float f31859c;

    /* renamed from: d */
    private static final String f31858d = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<PercentageRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.l2
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            PercentageRating m75579d;
            m75579d = PercentageRating.m75579d(bundle);
            return m75579d;
        }
    };

    public PercentageRating() {
        this.f31859c = -1.0f;
    }

    /* renamed from: d */
    public static PercentageRating m75579d(Bundle bundle) {
        boolean z = true;
        if (bundle.getInt(Rating.f31902b, -1) != 1) {
            z = false;
        }
        Assertions.checkArgument(z);
        float f = bundle.getFloat(f31858d, -1.0f);
        if (f == -1.0f) {
            return new PercentageRating();
        }
        return new PercentageRating(f);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PercentageRating) || this.f31859c != ((PercentageRating) obj).f31859c) {
            return false;
        }
        return true;
    }

    public float getPercent() {
        return this.f31859c;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f31859c));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        if (this.f31859c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.f31902b, 1);
        bundle.putFloat(f31858d, this.f31859c);
        return bundle;
    }

    public PercentageRating(@FloatRange(from = 0.0d, m105511to = 100.0d) float f) {
        Assertions.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f31859c = f;
    }
}
