package com.bytedance.sdk.openadsdk.p298bg.p302bg;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.bg.bg.bg */
/* loaded from: classes3.dex */
public class C8175bg implements PAGBannerAdLoadListener {

    /* renamed from: bg */
    private final PAGBannerAdLoadListener f17897bg;

    public C8175bg(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.f17897bg = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    public void onError(final int i, final String str) {
        if (this.f17897bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.bg.bg.1
            @Override // java.lang.Runnable
            public void run() {
                C8175bg.this.f17897bg.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: bg */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.f17897bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.bg.bg.2
            @Override // java.lang.Runnable
            public void run() {
                C8175bg.this.f17897bg.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
