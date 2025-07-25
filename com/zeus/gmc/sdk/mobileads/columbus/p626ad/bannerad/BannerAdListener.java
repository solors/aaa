package com.zeus.gmc.sdk.mobileads.columbus.p626ad.bannerad;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.BannerAdListener */
/* loaded from: classes8.dex */
public interface BannerAdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdError(BannerAdError bannerAdError);

    void onAdLoaded(int i, int i2);

    void onLoggingImpression();
}
