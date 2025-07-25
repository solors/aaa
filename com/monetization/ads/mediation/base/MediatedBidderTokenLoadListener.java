package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.banner.MediatedBannerSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedBidderTokenLoadListener {
    void onBidderTokenFailedToLoad(@NotNull String str);

    void onBidderTokenLoaded(@NotNull String str, @Nullable MediatedBannerSize mediatedBannerSize);
}
