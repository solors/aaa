package com.bytedance.sdk.openadsdk.p298bg.p299IL;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.bg.IL.zx */
/* loaded from: classes3.dex */
public class C8165zx implements PAGNativeAdLoadListener {

    /* renamed from: bg */
    private final PAGNativeAdLoadListener f17881bg;

    public C8165zx(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.f17881bg = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    public void onError(final int i, final String str) {
        if (this.f17881bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.zx.1
            @Override // java.lang.Runnable
            public void run() {
                C8165zx.this.f17881bg.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: bg */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.f17881bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.zx.2
            @Override // java.lang.Runnable
            public void run() {
                C8165zx.this.f17881bg.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
