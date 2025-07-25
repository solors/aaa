package com.vungle.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.f0 */
/* loaded from: classes7.dex */
public interface BaseAdListener {
    void onAdClicked(@NotNull AbstractC29124e0 abstractC29124e0);

    void onAdEnd(@NotNull AbstractC29124e0 abstractC29124e0);

    void onAdFailedToLoad(@NotNull AbstractC29124e0 abstractC29124e0, @NotNull AbstractC29537l2 abstractC29537l2);

    void onAdFailedToPlay(@NotNull AbstractC29124e0 abstractC29124e0, @NotNull AbstractC29537l2 abstractC29537l2);

    void onAdImpression(@NotNull AbstractC29124e0 abstractC29124e0);

    void onAdLeftApplication(@NotNull AbstractC29124e0 abstractC29124e0);

    void onAdLoaded(@NotNull AbstractC29124e0 abstractC29124e0);

    void onAdStart(@NotNull AbstractC29124e0 abstractC29124e0);
}
