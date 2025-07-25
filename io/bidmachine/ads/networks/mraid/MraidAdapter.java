package io.bidmachine.ads.networks.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.explorestack.iab.mraid.C10472c;
import com.explorestack.iab.mraid.EnumC10482j;
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
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p691h1.C33459a;
import p691h1.C33460b;

/* loaded from: classes9.dex */
public class MraidAdapter extends HeaderBiddingAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "1.11.1";
    public static final String ADAPTER_VERSION_NAME = "3.1.1.1";
    @NonNull
    private static final AtomicBoolean IS_JS_BRIDGE_ADDED = new AtomicBoolean(false);
    public static final String KEY = "mraid";

    public MraidAdapter() {
        super("mraid", "1.11.1", "3.1.1.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedBannerAd createBanner() {
        return new MraidBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        return new MraidFullScreenAd(EnumC10482j.Static);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        return new MraidFullScreenAd(EnumC10482j.Rewarded);
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
        if (IS_JS_BRIDGE_ADDED.compareAndSet(false, true)) {
            C33459a.m23841d(new C33460b());
        }
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
        C10472c.m79522h(enumC10510a);
    }
}
