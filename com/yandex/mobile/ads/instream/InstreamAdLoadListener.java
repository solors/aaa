package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface InstreamAdLoadListener {
    void onInstreamAdFailedToLoad(@NotNull String str);

    void onInstreamAdLoaded(@NotNull InstreamAd instreamAd);
}
