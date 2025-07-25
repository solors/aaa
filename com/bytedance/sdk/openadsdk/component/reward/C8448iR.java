package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.iR */
/* loaded from: classes3.dex */
public class C8448iR implements PAGRewardedAdLoadListener {

    /* renamed from: bg */
    final PAGRewardedAdLoadListener f18568bg;

    public C8448iR(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.f18568bg = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: bg */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.f18568bg != null) {
            C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.iR.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = C8448iR.this.f18568bg;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    public void onError(final int i, final String str) {
        if (this.f18568bg != null) {
            C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.iR.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = C8448iR.this.f18568bg;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }
}
