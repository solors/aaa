package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface SliderAdLoadListener {
    void onSliderAdFailedToLoad(@NotNull AdRequestError adRequestError);

    void onSliderAdLoaded(@NotNull SliderAd sliderAd);
}
