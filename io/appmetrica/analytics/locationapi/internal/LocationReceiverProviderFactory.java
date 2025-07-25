package io.appmetrica.analytics.locationapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface LocationReceiverProviderFactory {
    @NotNull
    LocationReceiverProvider getPassiveLocationReceiverProvider();
}
