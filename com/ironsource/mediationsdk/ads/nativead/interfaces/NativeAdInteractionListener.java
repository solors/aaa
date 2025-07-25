package com.ironsource.mediationsdk.ads.nativead.interfaces;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public interface NativeAdInteractionListener {
    void onAdClicked(@Nullable LevelPlayNativeAd levelPlayNativeAd, @Nullable AdInfo adInfo);

    void onAdImpression(@Nullable LevelPlayNativeAd levelPlayNativeAd, @Nullable AdInfo adInfo);
}
