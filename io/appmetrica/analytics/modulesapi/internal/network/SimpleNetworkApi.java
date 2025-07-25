package io.appmetrica.analytics.modulesapi.internal.network;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface SimpleNetworkApi {
    void performRequestWithCacheControl(@NotNull String str, @NotNull NetworkClientWithCacheControl networkClientWithCacheControl);
}
