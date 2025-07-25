package com.monetization.ads.quality.base;

import com.monetization.ads.quality.base.model.AdQualityVerifierAdapterInfo;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.monetization.ads.quality.base.status.AdQualityVerificationResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public abstract class AdQualityVerifierAdapter implements AdQualityVerifierAdEventListener {
    @NotNull
    public AdQualityVerifierAdapterInfo getAdapterInfo() {
        return new AdQualityVerifierAdapterInfo.Builder().build();
    }

    @Nullable
    public abstract Object verifyAd(@NotNull AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, @NotNull AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, @NotNull Continuation<? super AdQualityVerificationResult> continuation);
}
