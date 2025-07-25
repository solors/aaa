package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public interface BidderTokenLoadListener {
    @MainThread
    void onBidderTokenFailedToLoad(@NotNull String str);

    @MainThread
    void onBidderTokenLoaded(@NotNull String str);
}
