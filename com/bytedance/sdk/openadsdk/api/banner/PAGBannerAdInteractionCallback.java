package com.bytedance.sdk.openadsdk.api.banner;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* loaded from: classes3.dex */
public abstract class PAGBannerAdInteractionCallback implements PAGBannerAdInteractionListener {
    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
    }

    public void onAdShowFailed(@NonNull PAGErrorModel pAGErrorModel) {
    }
}
