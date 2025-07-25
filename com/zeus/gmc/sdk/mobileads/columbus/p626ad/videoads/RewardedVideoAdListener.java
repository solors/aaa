package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads;

import com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead.NativeAdError;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.RewardedVideoAdListener */
/* loaded from: classes8.dex */
public interface RewardedVideoAdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdLoaded();

    void onError(NativeAdError nativeAdError);

    void onLoggingImpression();

    void onRewardedVideoCompleted();
}
