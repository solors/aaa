package com.smaato.sdk.rewarded.model.csm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.interstitial.model.csm.InterstitialCsmBaseDelegate;
import com.smaato.sdk.rewarded.csm.SMARewardedNetworkEvent;
import com.smaato.sdk.rewarded.csm.SMARewardedNetworkEventListener;

/* loaded from: classes7.dex */
public class RewardedCsmDelegate extends InterstitialCsmBaseDelegate implements SMARewardedNetworkEventListener {
    @Nullable
    private CsmRewardedListener delegateListener;
    @NonNull
    private final SMARewardedNetworkEvent networkEvent;

    /* loaded from: classes7.dex */
    public interface CsmRewardedListener extends InterstitialCsmBaseDelegate.CsmBaseDelegateListener {
        void onAdError();

        void onAdReward();

        void onAdStarted();
    }

    public RewardedCsmDelegate(@NonNull SMARewardedNetworkEvent sMARewardedNetworkEvent, @NonNull Consumer<InterstitialCsmBaseDelegate> consumer, @NonNull Runnable runnable, @NonNull Runnable runnable2, @NonNull Runnable runnable3) {
        super(consumer, runnable, runnable2, runnable3);
        this.networkEvent = sMARewardedNetworkEvent;
    }

    @Override // com.smaato.sdk.rewarded.csm.SMARewardedNetworkEventListener
    public void onAdError() {
        CsmRewardedListener csmRewardedListener = this.delegateListener;
        if (csmRewardedListener != null) {
            csmRewardedListener.onAdError();
        }
    }

    @Override // com.smaato.sdk.rewarded.csm.SMARewardedNetworkEventListener
    public void onAdReward() {
        CsmRewardedListener csmRewardedListener = this.delegateListener;
        if (csmRewardedListener != null) {
            csmRewardedListener.onAdReward();
        }
    }

    @Override // com.smaato.sdk.rewarded.csm.SMARewardedNetworkEventListener
    public void onAdStarted() {
        CsmRewardedListener csmRewardedListener = this.delegateListener;
        if (csmRewardedListener != null) {
            csmRewardedListener.onAdStarted();
            this.delegateListener.onAdImpressed();
        }
    }

    public void setDelegateListener(@Nullable CsmRewardedListener csmRewardedListener) {
        this.delegateListener = csmRewardedListener;
        super.delegateListener = csmRewardedListener;
    }

    @Override // com.smaato.sdk.interstitial.model.csm.InterstitialCsmBaseDelegate
    public void showAd() {
        this.networkEvent.showAd();
    }
}
