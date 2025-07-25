package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes4.dex */
public final class HeartRating extends Rating {

    /* renamed from: c */
    private final boolean f31671c;

    /* renamed from: d */
    private final boolean f31672d;

    /* renamed from: f */
    private static final String f31669f = Util.intToStringMaxRadix(1);

    /* renamed from: g */
    private static final String f31670g = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<HeartRating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.r1
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            HeartRating m75743d;
            m75743d = HeartRating.m75743d(bundle);
            return m75743d;
        }
    };

    public HeartRating() {
        this.f31671c = false;
        this.f31672d = false;
    }

    /* renamed from: d */
    public static HeartRating m75743d(Bundle bundle) {
        boolean z;
        if (bundle.getInt(Rating.f31902b, -1) == 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (bundle.getBoolean(f31669f, false)) {
            return new HeartRating(bundle.getBoolean(f31670g, false));
        }
        return new HeartRating();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        if (this.f31672d != heartRating.f31672d || this.f31671c != heartRating.f31671c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f31671c), Boolean.valueOf(this.f31672d));
    }

    public boolean isHeart() {
        return this.f31672d;
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.f31671c;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.f31902b, 0);
        bundle.putBoolean(f31669f, this.f31671c);
        bundle.putBoolean(f31670g, this.f31672d);
        return bundle;
    }

    public HeartRating(boolean z) {
        this.f31671c = true;
        this.f31672d = z;
    }
}
