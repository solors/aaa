package com.monetization.ads.quality.base;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import ge.StateFlow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface AdQualityVerificationStateFlow {
    @NotNull
    AdQualityVerificationMode getVerificationMode();

    @NotNull
    StateFlow<AdQualityVerificationState> getVerificationResultStateFlow();
}
