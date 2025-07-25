package com.taurusx.tax.api;

/* loaded from: classes7.dex */
public interface OnTaurusXBannerListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(TaurusXAdError taurusXAdError);

    void onAdLoaded();

    void onAdShown();
}
