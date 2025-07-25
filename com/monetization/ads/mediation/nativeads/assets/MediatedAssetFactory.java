package com.monetization.ads.mediation.nativeads.assets;

import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedAssetFactory {
    @NotNull
    MediatedNativeAdImage makeFeedback(int i);

    @NotNull
    String makeSponsored(int i);
}
