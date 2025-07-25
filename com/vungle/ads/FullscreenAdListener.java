package com.vungle.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.u0 */
/* loaded from: classes7.dex */
public interface FullscreenAdListener extends BaseAdListener {
    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdClicked(@NotNull AbstractC29124e0 abstractC29124e0);

    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdEnd(@NotNull AbstractC29124e0 abstractC29124e0);

    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdFailedToLoad(@NotNull AbstractC29124e0 abstractC29124e0, @NotNull AbstractC29537l2 abstractC29537l2);

    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdFailedToPlay(@NotNull AbstractC29124e0 abstractC29124e0, @NotNull AbstractC29537l2 abstractC29537l2);

    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdImpression(@NotNull AbstractC29124e0 abstractC29124e0);

    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdLeftApplication(@NotNull AbstractC29124e0 abstractC29124e0);

    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdLoaded(@NotNull AbstractC29124e0 abstractC29124e0);

    @Override // com.vungle.ads.BaseAdListener
    /* synthetic */ void onAdStart(@NotNull AbstractC29124e0 abstractC29124e0);
}
