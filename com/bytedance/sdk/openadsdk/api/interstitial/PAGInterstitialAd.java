package com.bytedance.sdk.openadsdk.api.interstitial;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.C8237zx;

/* loaded from: classes3.dex */
public abstract class PAGInterstitialAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String str, @NonNull PAGInterstitialRequest pAGInterstitialRequest, @NonNull PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        ISDKTypeFactory m86729bg = C8237zx.m86729bg(pAGInterstitialAdLoadListener);
        if (m86729bg != null) {
            m86729bg.createADTypeLoaderFactory(str).createInterstitialAdLoader().loadAd(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener);
        }
    }

    public abstract void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener);

    @MainThread
    public abstract void show(@Nullable Activity activity);

    public static void loadAd(@NonNull String str, @NonNull PAGInterstitialRequest pAGInterstitialRequest, @NonNull final PAGInterstitialAdLoadCallback pAGInterstitialAdLoadCallback) {
        loadAd(str, pAGInterstitialRequest, new PAGInterstitialAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
            public void onError(int i, String str2) {
                PAGInterstitialAdLoadCallback.this.onError(new PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                PAGInterstitialAdLoadCallback.this.onAdLoaded(pAGInterstitialAd);
            }
        });
    }
}
