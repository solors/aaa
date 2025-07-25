package com.smaato.sdk.interstitial.model.csm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.interstitial.csm.SMAInterstitialNetworkEvent;
import com.smaato.sdk.interstitial.csm.SMAInterstitialNetworkEventListener;
import com.smaato.sdk.interstitial.model.csm.InterstitialCsmBaseDelegate;

/* loaded from: classes7.dex */
public class InterstitialCsmDelegate extends InterstitialCsmBaseDelegate implements SMAInterstitialNetworkEventListener {
    @Nullable
    CsmInterstitialDelegateListener delegateListener;
    @NonNull
    private final SMAInterstitialNetworkEvent networkEvent;

    /* loaded from: classes7.dex */
    public interface CsmInterstitialDelegateListener extends InterstitialCsmBaseDelegate.CsmBaseDelegateListener {
        void onAdOpened();
    }

    public InterstitialCsmDelegate(@NonNull SMAInterstitialNetworkEvent sMAInterstitialNetworkEvent, @NonNull Consumer<InterstitialCsmBaseDelegate> consumer, @NonNull Runnable runnable, @NonNull Runnable runnable2, @NonNull Runnable runnable3) {
        super(consumer, runnable, runnable2, runnable3);
        this.networkEvent = sMAInterstitialNetworkEvent;
    }

    @Override // com.smaato.sdk.interstitial.csm.SMAInterstitialNetworkEventListener
    public void onAdOpened() {
        CsmInterstitialDelegateListener csmInterstitialDelegateListener = this.delegateListener;
        if (csmInterstitialDelegateListener != null) {
            csmInterstitialDelegateListener.onAdOpened();
            this.delegateListener.onAdImpressed();
        }
    }

    public void setDelegateListener(@Nullable CsmInterstitialDelegateListener csmInterstitialDelegateListener) {
        this.delegateListener = csmInterstitialDelegateListener;
        super.delegateListener = csmInterstitialDelegateListener;
    }

    @Override // com.smaato.sdk.interstitial.model.csm.InterstitialCsmBaseDelegate
    public void showAd() {
        this.networkEvent.showAd();
    }
}
