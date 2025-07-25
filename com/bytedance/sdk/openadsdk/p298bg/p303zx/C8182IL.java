package com.bytedance.sdk.openadsdk.p298bg.p303zx;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.bg.zx.IL */
/* loaded from: classes3.dex */
public class C8182IL implements PAGRewardedAdLoadListener {

    /* renamed from: bg */
    private final PAGRewardedAdLoadListener f17909bg;

    public C8182IL(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.f17909bg = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    public void onError(final int i, final String str) {
        if (this.f17909bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.zx.IL.1
            @Override // java.lang.Runnable
            public void run() {
                if (C8182IL.this.f17909bg != null) {
                    C8182IL.this.f17909bg.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: bg */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.f17909bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.zx.IL.2
            @Override // java.lang.Runnable
            public void run() {
                if (C8182IL.this.f17909bg != null) {
                    C8182IL.this.f17909bg.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
