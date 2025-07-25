package com.bytedance.sdk.openadsdk.p298bg.p299IL;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;

/* renamed from: com.bytedance.sdk.openadsdk.bg.IL.iR */
/* loaded from: classes3.dex */
public class C8160iR implements InterfaceC8164ldr {

    /* renamed from: bg */
    private final PAGNativeAdInteractionListener f17877bg;

    public C8160iR(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.f17877bg = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p299IL.InterfaceC8164ldr
    /* renamed from: IL */
    public boolean mo86873IL() {
        if (this.f17877bg != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.iR.1
            @Override // java.lang.Runnable
            public void run() {
                if (C8160iR.this.f17877bg != null) {
                    C8160iR.this.f17877bg.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p299IL.InterfaceC8164ldr
    /* renamed from: bg */
    public void mo86871bg(PAGNativeAd pAGNativeAd) {
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.iR.2
            @Override // java.lang.Runnable
            public void run() {
                if (C8160iR.this.f17877bg != null) {
                    C8160iR.this.f17877bg.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p299IL.InterfaceC8164ldr
    /* renamed from: bg */
    public void mo86872bg() {
        C9519VJ.m82573bg(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bg.IL.iR.3
            @Override // java.lang.Runnable
            public void run() {
                if (C8160iR.this.f17877bg != null) {
                    C8160iR.this.f17877bg.onAdDismissed();
                }
            }
        });
    }
}
