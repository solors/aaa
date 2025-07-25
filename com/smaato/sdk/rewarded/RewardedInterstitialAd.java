package com.smaato.sdk.rewarded;

import com.smaato.sdk.interstitial.InterstitialAdBase;

/* loaded from: classes7.dex */
public abstract class RewardedInterstitialAd extends InterstitialAdBase {
    public final void showAd() {
        showAdInternal();
    }

    protected abstract void showAdInternal();
}
