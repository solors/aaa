package com.ironsource.mediationsdk.ads.nativead.internal;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public interface InternalNativeAdListener {
    void onNativeAdClicked(@Nullable AdInfo adInfo);

    void onNativeAdImpression(@Nullable AdInfo adInfo);

    void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError);

    void onNativeAdLoaded(@Nullable AdInfo adInfo, @NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder);
}
