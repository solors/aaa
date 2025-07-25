package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;

/* compiled from: GAMNetwork.java */
/* renamed from: io.bidmachine.ads.networks.gam_dynamic.o */
/* loaded from: classes9.dex */
interface InterfaceC35392o {
    void cache();

    void cache(@NonNull AdsFormat adsFormat);

    boolean cacheWaterfall(@NonNull AdsFormat adsFormat, boolean z);

    @Nullable
    String getVersion();

    void init(@NonNull Context context);

    boolean isInitialized();

    void loadBanner(@NonNull NetworkAdUnit networkAdUnit, @NonNull InternalBannerAdListener internalBannerAdListener);

    void loadInterstitial(@NonNull NetworkAdUnit networkAdUnit, @NonNull InternalInterstitialAdListener internalInterstitialAdListener);

    void loadRewarded(@NonNull NetworkAdUnit networkAdUnit, @NonNull InternalRewardedAdListener internalRewardedAdListener);

    @Nullable
    InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat);

    void unReserveAd(@NonNull NetworkAdUnit networkAdUnit);
}
