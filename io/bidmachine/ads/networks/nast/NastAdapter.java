package io.bidmachine.ads.networks.nast;

import androidx.annotation.NonNull;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedNativeAd;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class NastAdapter extends HeaderBiddingAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "1.0";
    public static final String ADAPTER_VERSION_NAME = "3.1.1.1";
    public static final String KEY = "nast";

    public NastAdapter() {
        super(KEY, "1.0", "3.1.1.1", 1, new AdsType[]{AdsType.Native});
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedNativeAd createNativeAd() {
        return new NastNative();
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
        headerBiddingCollectParamsCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        networkInitializationCallback.onSuccess();
    }
}
