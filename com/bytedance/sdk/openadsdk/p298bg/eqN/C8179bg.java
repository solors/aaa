package com.bytedance.sdk.openadsdk.p298bg.eqN;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.bg.eqN.bg */
/* loaded from: classes3.dex */
public class C8179bg implements PAGAppOpenAdLoadListener {

    /* renamed from: bg */
    private final PAGAppOpenAdLoadListener f17903bg;

    public C8179bg(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.f17903bg = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
    public void onError(final int i, final String str) {
        if (this.f17903bg == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.eqN.bg.1
            @Override // java.lang.Runnable
            public void run() {
                if (C8179bg.this.f17903bg != null) {
                    C8179bg.this.f17903bg.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: bg */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.f17903bg == null) {
            return;
        }
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.eqN.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (C8179bg.this.f17903bg != null) {
                    C8179bg.this.f17903bg.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
