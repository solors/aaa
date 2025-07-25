package com.smaato.sdk.interstitial.csm;

/* loaded from: classes7.dex */
public interface SMAInterstitialNetworkEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad();

    void onAdLoaded();

    void onAdOpened();

    void onAdTTLExpired();
}
