package com.bytedance.sdk.openadsdk.component.p307bX;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.p298bg.p301bX.InterfaceC8168IL;

/* renamed from: com.bytedance.sdk.openadsdk.component.bX.bg */
/* loaded from: classes3.dex */
public class C8272bg implements InterfaceC8168IL {

    /* renamed from: bg */
    private final PAGInterstitialAdInteractionListener f18114bg;

    public C8272bg(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.f18114bg = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p301bX.InterfaceC8168IL
    /* renamed from: IL */
    public void mo86669IL() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.f18114bg;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p301bX.InterfaceC8168IL
    /* renamed from: bg */
    public void mo86668bg() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.f18114bg;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.f18114bg;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
