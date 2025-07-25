package com.smaato.sdk.core;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes7.dex */
public enum AdContentRating {
    MAX_AD_CONTENT_RATING_UNDEFINED(""),
    MAX_AD_CONTENT_RATING_G(RequestConfiguration.MAX_AD_CONTENT_RATING_G),
    MAX_AD_CONTENT_RATING_PG(RequestConfiguration.MAX_AD_CONTENT_RATING_PG),
    MAX_AD_CONTENT_RATING_T("T"),
    MAX_AD_CONTENT_RATING_MA(RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
    
    private final String rating;

    AdContentRating(String str) {
        this.rating = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.rating;
    }
}
