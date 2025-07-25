package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface AdShowListener {
    void onAdClicked(@NotNull MolocoAd molocoAd);

    void onAdHidden(@NotNull MolocoAd molocoAd);

    void onAdShowFailed(@NotNull MolocoAdError molocoAdError);

    void onAdShowSuccess(@NotNull MolocoAd molocoAd);
}
