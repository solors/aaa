package io.appmetrica.analytics.locationapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface LastKnownLocationExtractorProviderFactory {
    @NotNull
    LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider();

    @NotNull
    LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider();

    @NotNull
    LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider();

    @NotNull
    LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider();
}
