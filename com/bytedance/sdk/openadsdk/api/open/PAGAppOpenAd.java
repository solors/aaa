package com.bytedance.sdk.openadsdk.api.open;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.C8237zx;

/* loaded from: classes3.dex */
public abstract class PAGAppOpenAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String str, @NonNull PAGAppOpenRequest pAGAppOpenRequest, @NonNull PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        ISDKTypeFactory m86729bg = C8237zx.m86729bg(pAGAppOpenAdLoadListener);
        if (m86729bg != null) {
            m86729bg.createADTypeLoaderFactory(str).createOpenAdLoader().loadAd(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener);
        }
    }

    public abstract void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener);

    @MainThread
    public abstract void show(@Nullable Activity activity);

    public static void loadAd(@NonNull String str, @NonNull PAGAppOpenRequest pAGAppOpenRequest, @NonNull final PAGAppOpenAdLoadCallback pAGAppOpenAdLoadCallback) {
        loadAd(str, pAGAppOpenRequest, new PAGAppOpenAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr
            public void onError(int i, String str2) {
                PAGAppOpenAdLoadCallback.this.onError(new PAGErrorModel(i, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
                PAGAppOpenAdLoadCallback.this.onAdLoaded(pAGAppOpenAd);
            }
        });
    }
}
