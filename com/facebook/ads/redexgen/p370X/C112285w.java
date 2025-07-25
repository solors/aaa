package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.ads.RewardedInterstitialAdExtendedListener;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedInterstitialAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;

/* renamed from: com.facebook.ads.redexgen.X.5w */
/* loaded from: assets/audience_network.dex */
public class C112285w implements RewardedVideoAdExtendedListener, S2SRewardedVideoAdListener, S2SRewardedVideoAdExtendedListener {
    public final RewardedInterstitialAdListener A00;

    public C112285w(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC10846Ad interfaceC10846Ad) {
        this.A00.onAdClicked(interfaceC10846Ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC10846Ad interfaceC10846Ad) {
        this.A00.onAdLoaded(interfaceC10846Ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC10846Ad interfaceC10846Ad, AdError adError) {
        this.A00.onError(interfaceC10846Ad, adError);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC10846Ad interfaceC10846Ad) {
        this.A00.onLoggingImpression(interfaceC10846Ad);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        if (this.A00 instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) this.A00).onRewardServerFailed();
        }
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        if (this.A00 instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) this.A00).onRewardServerSuccess();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        if (this.A00 instanceof RewardedInterstitialAdExtendedListener) {
            ((RewardedInterstitialAdExtendedListener) this.A00).onRewardedInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
