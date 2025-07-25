package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.p298bg.eqN.InterfaceC8178IL;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.zx */
/* loaded from: classes3.dex */
public class C8509zx implements InterfaceC8178IL {

    /* renamed from: IL */
    private final AtomicBoolean f18704IL = new AtomicBoolean(false);

    /* renamed from: bg */
    private final PAGAppOpenAdInteractionListener f18705bg;

    public C8509zx(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.f18705bg = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.eqN.InterfaceC8178IL
    /* renamed from: IL */
    public void mo85929IL() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.f18705bg;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.eqN.InterfaceC8178IL
    /* renamed from: bX */
    public void mo85928bX() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (!this.f18704IL.getAndSet(true) && (pAGAppOpenAdInteractionListener = this.f18705bg) != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.eqN.InterfaceC8178IL
    /* renamed from: bg */
    public void mo85927bg() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.f18705bg;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.f18705bg;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }
}
