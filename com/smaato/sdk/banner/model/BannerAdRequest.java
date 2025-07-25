package com.smaato.sdk.banner.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.banner.p567ad.BannerAdSize;
import com.smaato.sdk.core.mvvm.model.AdRequest;
import com.smaato.sdk.core.mvvm.model.soma.SomaAdRequest;

/* loaded from: classes7.dex */
public class BannerAdRequest extends SomaAdRequest {
    private final BannerAdSize bannerAdSize;

    public BannerAdRequest(@NonNull AdRequest adRequest, @Nullable BannerAdSize bannerAdSize) {
        super(adRequest);
        this.bannerAdSize = bannerAdSize;
    }

    @Nullable
    public BannerAdSize getBannerAdSize() {
        return this.bannerAdSize;
    }
}
