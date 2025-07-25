package com.inmobi.ads.listeners;

import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class InterstitialAdEventListener extends AdEventListener<InMobiInterstitial> {
    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(@NonNull InMobiInterstitial inMobiInterstitial, Map map) {
        super.onAdClicked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdImpression(@NonNull InMobiInterstitial inMobiInterstitial) {
        super.onAdImpression(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdLoadFailed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    public void onAdDismissed(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayFailed(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdWillDisplay(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onUserLeftApplication(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onAdFetchFailed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onRewardsUnlocked(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }
}
