package com.smaato.sdk.banner.p567ad;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.p568ad.AdDimension;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.banner.ad.BannerAdSize */
/* loaded from: classes7.dex */
public enum BannerAdSize {
    XX_LARGE_320x50(AdDimension.XX_LARGE),
    MEDIUM_RECTANGLE_300x250(AdDimension.MEDIUM_RECTANGLE),
    LEADERBOARD_728x90(AdDimension.LEADERBOARD),
    SKYSCRAPER_120x600(AdDimension.SKYSCRAPER);
    
    @NonNull
    public final AdDimension adDimension;

    BannerAdSize(AdDimension adDimension) {
        this.adDimension = (AdDimension) Objects.requireNonNull(adDimension);
    }
}
