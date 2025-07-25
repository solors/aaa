package com.monetization.ads.mediation.nativeads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedNativeAd {
    void bindNativeAd(@NotNull MediatedNativeAdViewProvider mediatedNativeAdViewProvider);

    void destroy();

    @NotNull
    MediatedNativeAdAssets getMediatedNativeAdAssets();

    void unbindNativeAd(@NotNull MediatedNativeAdViewProvider mediatedNativeAdViewProvider);
}
