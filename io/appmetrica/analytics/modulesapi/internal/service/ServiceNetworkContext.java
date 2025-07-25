package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.p724io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.p724io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ServiceNetworkContext {
    @NotNull
    IExecutionPolicy getExecutionPolicy();

    @NotNull
    SimpleNetworkApi getNetworkApi();

    @NotNull
    SslSocketFactoryProvider getSslSocketFactoryProvider();

    @NotNull
    String getUserAgent();
}
