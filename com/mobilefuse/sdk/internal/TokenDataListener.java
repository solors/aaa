package com.mobilefuse.sdk.internal;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseBiddingTokenProvider_getTokenData.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TokenDataListener {
    void onDataGenerated(@NotNull Map<String, String> map);

    void onDataGenerationFailed(@NotNull String str);
}
