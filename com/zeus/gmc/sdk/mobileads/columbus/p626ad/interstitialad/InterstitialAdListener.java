package com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.InterstitialAdListener */
/* loaded from: classes8.dex */
public interface InterstitialAdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdError(InterstitialAdError interstitialAdError);

    void onAdLoaded();

    void onLoggingImpression();
}
