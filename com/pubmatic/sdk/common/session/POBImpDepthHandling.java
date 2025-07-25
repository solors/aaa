package com.pubmatic.sdk.common.session;

import com.pubmatic.sdk.common.POBAdFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBImpDepthHandling.kt */
@Metadata
/* loaded from: classes7.dex */
public interface POBImpDepthHandling {
    int getImpressions(@NotNull POBAdFormat pOBAdFormat);

    void initiate();

    void recordImpression(@NotNull POBAdFormat pOBAdFormat);
}
