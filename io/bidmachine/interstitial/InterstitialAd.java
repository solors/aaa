package io.bidmachine.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedFullscreenAd;

/* loaded from: classes9.dex */
public final class InterstitialAd extends FullScreenAd<InterstitialAd, InterstitialRequest, FullScreenAdObject<InterstitialRequest>, InterstitialListener> {
    public InterstitialAd(@NonNull Context context) {
        super(context, AdsType.Interstitial);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    public FullScreenAdObject<InterstitialRequest> createAdObject(@NonNull ContextProvider contextProvider, @NonNull InterstitialRequest interstitialRequest, @NonNull NetworkAdapter networkAdapter, @NonNull AdObjectParams adObjectParams, @NonNull AdProcessCallback adProcessCallback) {
        UnifiedFullscreenAd createInterstitial = networkAdapter.createInterstitial();
        if (createInterstitial == null) {
            return null;
        }
        return new FullScreenAdObject<>(contextProvider, adProcessCallback, interstitialRequest, adObjectParams, createInterstitial);
    }
}
