package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public class AbstractAdListener implements InterstitialAdExtendedListener, RewardedVideoAdExtendedListener, RewardedInterstitialAdExtendedListener {
    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdExtendedListener
    public void onRewardedInterstitialActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdListener
    public void onRewardedInterstitialClosed() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdListener
    public void onRewardedInterstitialCompleted() {
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(InterfaceC10846Ad interfaceC10846Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(InterfaceC10846Ad interfaceC10846Ad) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(InterfaceC10846Ad interfaceC10846Ad) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(InterfaceC10846Ad interfaceC10846Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(InterfaceC10846Ad interfaceC10846Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public void onError(InterfaceC10846Ad interfaceC10846Ad, AdError adError) {
    }
}
