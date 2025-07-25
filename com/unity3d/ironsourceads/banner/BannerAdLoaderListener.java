package com.unity3d.ironsourceads.banner;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface BannerAdLoaderListener {
    void onBannerAdLoadFailed(@NotNull IronSourceError ironSourceError);

    void onBannerAdLoaded(@NotNull BannerAdView bannerAdView);
}
