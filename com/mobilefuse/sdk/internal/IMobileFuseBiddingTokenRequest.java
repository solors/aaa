package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public interface IMobileFuseBiddingTokenRequest {
    @NotNull
    MobileFusePrivacyPreferences getPrivacyPreferences();

    boolean isTestMode();
}
