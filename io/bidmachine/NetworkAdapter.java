package io.bidmachine;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.core.Logger;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedNativeAd;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public abstract class NetworkAdapter {
    private final int adapterMinDeviceApiVersion;
    @NonNull
    private final String adapterVersion;
    @NonNull
    private final String compiledNetworkSdkVersion;
    @NonNull
    private final String key;
    @Nullable
    private String networkSdkVersion;
    @NonNull
    private final AdsType[] supportedTypes;
    @NonNull
    private final AtomicBoolean isInitializing = new AtomicBoolean(false);
    @NonNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    @NonNull
    private final Set<InternalNetworkInitializationCallback> initializeCallbackSet = new CopyOnWriteArraySet();

    /* renamed from: io.bidmachine.NetworkAdapter$a */
    /* loaded from: classes9.dex */
    class C35192a implements NetworkInitializationCallback {
        C35192a() {
        }

        @Override // io.bidmachine.NetworkInitializationCallback
        public void onFail(@NonNull String str) {
            NetworkAdapter.this.isInitialized.set(false);
            NetworkAdapter.this.isInitializing.set(false);
            for (InternalNetworkInitializationCallback internalNetworkInitializationCallback : NetworkAdapter.this.initializeCallbackSet) {
                internalNetworkInitializationCallback.onFail(NetworkAdapter.this, str);
            }
            NetworkAdapter.this.initializeCallbackSet.clear();
        }

        @Override // io.bidmachine.NetworkInitializationCallback
        public void onSuccess() {
            NetworkAdapter.this.isInitialized.set(true);
            NetworkAdapter.this.isInitializing.set(false);
            for (InternalNetworkInitializationCallback internalNetworkInitializationCallback : NetworkAdapter.this.initializeCallbackSet) {
                internalNetworkInitializationCallback.onSuccess(NetworkAdapter.this);
            }
            NetworkAdapter.this.initializeCallbackSet.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NetworkAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i, @NonNull AdsType[] adsTypeArr) {
        this.key = str;
        this.compiledNetworkSdkVersion = str2;
        this.adapterVersion = str3;
        this.adapterMinDeviceApiVersion = i;
        this.supportedTypes = adsTypeArr;
    }

    public static boolean isSkipInitialization(@NonNull NetworkConfigParams networkConfigParams) {
        return Boolean.parseBoolean(networkConfigParams.getFromNetworkParams("skip_initialization"));
    }

    public UnifiedBannerAd createBanner() {
        throw new IllegalArgumentException(getKey() + " adapter does not support banner");
    }

    public UnifiedFullscreenAd createInterstitial() {
        throw new IllegalArgumentException(getKey() + " adapter does not support static interstitial");
    }

    public UnifiedNativeAd createNativeAd() {
        throw new IllegalArgumentException(getKey() + " adapter does not support native ads");
    }

    public UnifiedFullscreenAd createRewarded() {
        throw new IllegalArgumentException(getKey() + " adapter does not support rewarded interstitial");
    }

    public int getAdapterMinDeviceApiVersion() {
        return this.adapterMinDeviceApiVersion;
    }

    @NonNull
    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NonNull
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        return null;
    }

    @NonNull
    public AdsType[] getSupportedTypes() {
        return this.supportedTypes;
    }

    @WorkerThread
    public final void initialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull InternalNetworkInitializationCallback internalNetworkInitializationCallback) throws Throwable {
        if (Build.VERSION.SDK_INT < this.adapterMinDeviceApiVersion) {
            internalNetworkInitializationCallback.onFail(this, "minSdkVersion is " + this.adapterMinDeviceApiVersion);
        } else if (isInitialized(contextProvider)) {
            internalNetworkInitializationCallback.onSuccess(this);
        } else if (isSkipInitialization(networkConfigParams)) {
            if (!isNetworkInitializationStatusCheckSupported()) {
                Logger.m20094d(getKey(), "Network initialization status check is not supported, force initialization to true");
                this.isInitialized.set(true);
            }
            Logger.m20094d(getKey(), "Network initialization is skipped");
            internalNetworkInitializationCallback.onSuccess(this);
        } else {
            this.initializeCallbackSet.add(internalNetworkInitializationCallback);
            if (!this.isInitializing.compareAndSet(false, true)) {
                return;
            }
            onNetworkInitialize(contextProvider, initializationParams, networkConfigParams, new C35192a());
        }
    }

    public boolean isAdsTypeSupported(@NonNull AdsType adsType) {
        for (AdsType adsType2 : this.supportedTypes) {
            if (adsType2 == adsType) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInitialized(@NonNull Context context) {
        return isInitialized(new SimpleContextProvider(context));
    }

    public final boolean isInitializing() {
        return this.isInitializing.get();
    }

    @AnyThread
    protected abstract boolean isNetworkInitializationStatusCheckSupported();

    @WorkerThread
    protected abstract boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable;

    @NonNull
    public final String obtainNetworkSdkVersion() {
        if (!TextUtils.isEmpty(this.networkSdkVersion)) {
            return this.networkSdkVersion;
        }
        try {
            String networkSdkVersion = getNetworkSdkVersion();
            this.networkSdkVersion = networkSdkVersion;
            if (!TextUtils.isEmpty(networkSdkVersion)) {
                return this.networkSdkVersion;
            }
        } catch (Throwable unused) {
        }
        return this.compiledNetworkSdkVersion;
    }

    @WorkerThread
    protected abstract void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable;

    public final boolean isInitialized(@NonNull ContextProvider contextProvider) {
        if (this.isInitialized.get()) {
            return true;
        }
        try {
            boolean isNetworkInitialized = isNetworkInitialized(contextProvider);
            this.isInitialized.compareAndSet(false, isNetworkInitialized);
            return isNetworkInitialized;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void onWinAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void setLogging(boolean z) throws Throwable {
    }
}
