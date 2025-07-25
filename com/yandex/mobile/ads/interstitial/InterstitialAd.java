package com.yandex.mobile.ads.interstitial;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface InterstitialAd {
    @NotNull
    AdInfo getInfo();

    void setAdEventListener(@Nullable InterstitialAdEventListener interstitialAdEventListener);

    void show(@NotNull Activity activity);
}
