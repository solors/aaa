package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.p298bg.p303zx.InterfaceC8185bg;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.WR */
/* loaded from: classes3.dex */
public class C8350WR implements InterfaceC8185bg {

    /* renamed from: IL */
    private final PAGRewardedAdInteractionCallback f18279IL;

    /* renamed from: bg */
    private final PAGRewardedAdInteractionListener f18280bg;

    public C8350WR(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.f18280bg = pAGRewardedAdInteractionListener;
        this.f18279IL = null;
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p303zx.InterfaceC8185bg
    /* renamed from: IL */
    public void mo86473IL() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f18280bg;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f18279IL;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p303zx.InterfaceC8185bg
    /* renamed from: bg */
    public void mo86472bg() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f18280bg;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f18279IL;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f18280bg;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f18279IL;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    public C8350WR(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.f18279IL = pAGRewardedAdInteractionCallback;
        this.f18280bg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.p298bg.p303zx.InterfaceC8185bg
    /* renamed from: bg */
    public void mo86471bg(boolean z, int i, String str, int i2, String str2) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f18280bg;
        if (pAGRewardedAdInteractionListener != null) {
            if (z) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                return;
            }
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f18279IL;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
            }
        }
    }
}
