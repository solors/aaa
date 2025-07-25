package io.bidmachine.ads.networks.adaptiverendering;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.explorestack.iab.mraid.C10473d;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class AdaptiveRenderingAdapter extends HeaderBiddingAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "0.13.0";
    public static final String ADAPTER_VERSION_NAME = "3.1.1.1";
    public static final String KEY = "adaptive_rendering";

    public AdaptiveRenderingAdapter() {
        super(KEY, "0.13.0", "3.1.1.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static BMError mapError(@NonNull BMError bMError, @NonNull Error error) {
        return new BMError(bMError, -1, error.getMessage());
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedBannerAd createBanner() {
        return new AdaptiveRenderingBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        return new AdaptiveRenderingFullscreenAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        return new AdaptiveRenderingFullscreenAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return false;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        HashMap hashMap = new HashMap();
        hashMap.put("features", TextUtils.join(",", C10473d.m79521a(contextProvider.getApplicationContext())));
        headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        Rendering.initialize(contextProvider.getApplicationContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z) throws Throwable {
        Rendering.setLoggingEnabled(z);
    }
}
