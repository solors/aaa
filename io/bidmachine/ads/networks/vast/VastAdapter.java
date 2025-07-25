package io.bidmachine.ads.networks.vast;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.explorestack.iab.utils.C10509f;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.measurer.OMSDKSettings;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import java.util.HashMap;
import p734j1.C37248c;
import p734j1.EnumC37268j;

/* loaded from: classes9.dex */
public class VastAdapter extends HeaderBiddingAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "1.11.1";
    public static final String ADAPTER_VERSION_NAME = "3.1.1.1";
    public static final String KEY = "vast";

    public VastAdapter() {
        super("vast", "1.11.1", "3.1.1.1", 1, new AdsType[]{AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        return new VastFullScreenAd(EnumC37268j.NonRewarded);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        return new VastFullScreenAd(EnumC37268j.Rewarded);
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
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        OMSDKSettings.initialize(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z) throws Throwable {
        C10509f.EnumC10510a enumC10510a;
        if (z) {
            enumC10510a = C10509f.EnumC10510a.debug;
        } else {
            enumC10510a = C10509f.EnumC10510a.none;
        }
        C37248c.m18678d(enumC10510a);
    }
}
