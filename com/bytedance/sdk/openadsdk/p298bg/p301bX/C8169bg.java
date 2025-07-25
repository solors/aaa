package com.bytedance.sdk.openadsdk.p298bg.p301bX;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.bg.bX.bg */
/* loaded from: classes3.dex */
public class C8169bg implements PAGInterstitialAdLoadListener {

    /* renamed from: bg */
    private final PAGInterstitialAdLoadListener f17887bg;

    public C8169bg(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.f17887bg = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    public void onError(final int i, final String str) {
        if (this.f17887bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.bX.bg.1
            @Override // java.lang.Runnable
            public void run() {
                if (C8169bg.this.f17887bg != null) {
                    C8169bg.this.f17887bg.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: bg */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.f17887bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.bX.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (C8169bg.this.f17887bg != null) {
                    C8169bg.this.f17887bg.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
