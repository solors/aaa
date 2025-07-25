package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;

/* loaded from: classes7.dex */
public class LoadOperationState extends OperationState {
    public IUnityAdsLoadListener listener;
    public UnityAdsLoadOptions loadOptions;

    public LoadOperationState(String str, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsLoadListener;
        this.loadOptions = unityAdsLoadOptions;
    }

    /* renamed from: a */
    public static /* synthetic */ void m37560a(LoadOperationState loadOperationState) {
        loadOperationState.lambda$onUnityAdsAdLoaded$1();
    }

    public /* synthetic */ void lambda$onUnityAdsAdLoaded$1() {
        this.listener.onUnityAdsAdLoaded(this.placementId);
    }

    public /* synthetic */ void lambda$onUnityAdsFailedToLoad$0(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        this.listener.onUnityAdsFailedToLoad(this.placementId, unityAdsLoadError, str);
    }

    public boolean isBanner() {
        return this instanceof LoadBannerOperationState;
    }

    public boolean isHeaderBidding() {
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions != null && unityAdsLoadOptions.getData() != null) {
            return this.loadOptions.getData().has("adMarkup");
        }
        return false;
    }

    public void onUnityAdsAdLoaded() {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.ads.operation.load.b
                @Override // java.lang.Runnable
                public final void run() {
                    LoadOperationState.m37560a(LoadOperationState.this);
                }
            });
        }
    }

    public void onUnityAdsFailedToLoad(final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.ads.operation.load.c
                @Override // java.lang.Runnable
                public final void run() {
                    LoadOperationState.this.lambda$onUnityAdsFailedToLoad$0(unityAdsLoadError, str);
                }
            });
        }
    }
}
