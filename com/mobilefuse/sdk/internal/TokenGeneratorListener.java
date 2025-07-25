package com.mobilefuse.sdk.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TokenGeneratorListener {
    void onTokenGenerated(@NotNull String str);

    void onTokenGenerationFailed(@NotNull String str);
}
