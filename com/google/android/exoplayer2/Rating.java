package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public abstract class Rating implements Bundleable {

    /* renamed from: b */
    static final String f31902b = Util.intToStringMaxRadix(0);
    public static final Bundleable.Creator<Rating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.q2
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            Rating m75566b;
            m75566b = Rating.m75566b(bundle);
            return m75566b;
        }
    };

    /* renamed from: b */
    public static Rating m75566b(Bundle bundle) {
        int i = bundle.getInt(f31902b, -1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return ThumbRating.CREATOR.fromBundle(bundle);
                    }
                    throw new IllegalArgumentException("Unknown RatingType: " + i);
                }
                return StarRating.CREATOR.fromBundle(bundle);
            }
            return PercentageRating.CREATOR.fromBundle(bundle);
        }
        return HeartRating.CREATOR.fromBundle(bundle);
    }

    public abstract boolean isRated();
}
