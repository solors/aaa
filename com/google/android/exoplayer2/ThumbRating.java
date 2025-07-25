package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes4.dex */
public final class ThumbRating extends Rating {

    /* renamed from: c */
    private final boolean f31994c;

    /* renamed from: d */
    private final boolean f31995d;

    /* renamed from: f */
    private static final String f31992f = Util.intToStringMaxRadix(1);

    /* renamed from: g */
    private static final String f31993g = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<ThumbRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.a5
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            ThumbRating m75317d;
            m75317d = ThumbRating.m75317d(bundle);
            return m75317d;
        }
    };

    public ThumbRating() {
        this.f31994c = false;
        this.f31995d = false;
    }

    /* renamed from: d */
    public static ThumbRating m75317d(Bundle bundle) {
        boolean z;
        if (bundle.getInt(Rating.f31902b, -1) == 3) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (bundle.getBoolean(f31992f, false)) {
            return new ThumbRating(bundle.getBoolean(f31993g, false));
        }
        return new ThumbRating();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        if (this.f31995d != thumbRating.f31995d || this.f31994c != thumbRating.f31994c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f31994c), Boolean.valueOf(this.f31995d));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.f31994c;
    }

    public boolean isThumbsUp() {
        return this.f31995d;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.f31902b, 3);
        bundle.putBoolean(f31992f, this.f31994c);
        bundle.putBoolean(f31993g, this.f31995d);
        return bundle;
    }

    public ThumbRating(boolean z) {
        this.f31994c = true;
        this.f31995d = z;
    }
}
