package com.taurusx.tax.api;

/* loaded from: classes7.dex */
public interface OnTaurusXInterstitialListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded();

    void onAdShowFailed(TaurusXAdError taurusXAdError);

    void onAdShown();
}
