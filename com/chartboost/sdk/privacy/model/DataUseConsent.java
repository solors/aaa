package com.chartboost.sdk.privacy.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface DataUseConsent {
    @NotNull
    Object getConsent();

    @NotNull
    String getPrivacyStandard();
}
