package com.bytedance.sdk.openadsdk.component.p307bX;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.component.bX.IL */
/* loaded from: classes3.dex */
public class C8269IL implements PAGInterstitialAdLoadListener {

    /* renamed from: bg */
    final PAGInterstitialAdLoadListener f18108bg;

    public C8269IL(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.f18108bg = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: bg */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.f18108bg != null) {
            C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.bX.IL.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = C8269IL.this.f18108bg;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    public void onError(final int i, final String str) {
        if (this.f18108bg != null) {
            C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.bX.IL.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = C8269IL.this.f18108bg;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }
}
