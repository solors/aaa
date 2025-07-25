package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
@UiThread
/* loaded from: classes3.dex */
public interface RewardedVideoAdApi extends FullScreenAd {
    @Override // com.facebook.ads.FullScreenAd
    RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    RewardedVideoAd.RewardedVideoAdShowConfigBuilder buildShowAdConfig();

    @Override // com.facebook.ads.InterfaceC10846Ad
    void destroy();

    @Override // com.facebook.ads.InterfaceC10846Ad
    String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    @Override // com.facebook.ads.InterfaceC10846Ad
    void loadAd();

    void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig);

    @Override // com.facebook.ads.InterfaceC10846Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    @Override // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig);
}
