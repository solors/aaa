package com.smaato.sdk.interstitial.model.csm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public abstract class InterstitialCsmBaseDelegate {
    @Nullable
    protected CsmBaseDelegateListener delegateListener;
    @NonNull
    protected final Runnable onAdFailedToLoad;
    @NonNull
    protected final Consumer<InterstitialCsmBaseDelegate> onAdLoaded;
    @NonNull
    protected final Runnable onCsmAdClicked;
    @NonNull
    protected final Runnable onCsmAdTtlExpired;

    /* loaded from: classes7.dex */
    public interface CsmBaseDelegateListener {
        void onAdClosed();

        void onAdImpressed();
    }

    public InterstitialCsmBaseDelegate(@NonNull Consumer<InterstitialCsmBaseDelegate> consumer, @NonNull Runnable runnable, @NonNull Runnable runnable2, @NonNull Runnable runnable3) {
        this.onAdLoaded = consumer;
        this.onAdFailedToLoad = runnable;
        this.onCsmAdClicked = runnable2;
        this.onCsmAdTtlExpired = runnable3;
    }

    public void onAdClicked() {
        this.onCsmAdClicked.run();
    }

    public void onAdClosed() {
        CsmBaseDelegateListener csmBaseDelegateListener = this.delegateListener;
        if (csmBaseDelegateListener != null) {
            csmBaseDelegateListener.onAdClosed();
        }
    }

    public void onAdFailedToLoad() {
        this.onAdFailedToLoad.run();
    }

    public void onAdLoaded() {
        this.onAdLoaded.accept(this);
    }

    public void onAdTTLExpired() {
        this.onCsmAdTtlExpired.run();
    }

    public abstract void showAd();
}
