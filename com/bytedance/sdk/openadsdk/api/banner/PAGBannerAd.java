package com.bytedance.sdk.openadsdk.api.banner;

import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.C8237zx;

/* loaded from: classes3.dex */
public abstract class PAGBannerAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String str, @NonNull PAGBannerRequest pAGBannerRequest, @NonNull PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        ISDKTypeFactory m86729bg = C8237zx.m86729bg(pAGBannerAdLoadListener);
        if (m86729bg != null) {
            m86729bg.createADTypeLoaderFactory(str).createBannerAdLoader().loadAd(str, pAGBannerRequest, pAGBannerAdLoadListener);
        }
    }

    public abstract void destroy();

    public abstract View getBannerView();

    public abstract void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener);

    public static void loadAd(@NonNull String str, @NonNull PAGBannerRequest pAGBannerRequest, @NonNull final PAGBannerAdLoadCallback pAGBannerAdLoadCallback) {
        loadAd(str, pAGBannerRequest, new PAGBannerAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
            public void onError(int i, String str2) {
                PAGBannerAdLoadCallback.this.onError(new PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                PAGBannerAdLoadCallback.this.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
