package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface SliderAd {
    void bindSliderAd(@NotNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    @NotNull
    List<NativeAd> getNativeAds();
}
