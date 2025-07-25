package com.taurusx.tax.api;

/* loaded from: classes7.dex */
public interface OnTaurusXAppOpenAdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded();

    void onAdShowFailed(TaurusXAdError taurusXAdError);

    void onAdShown();
}
