package io.appmetrica.analytics.modulesapi.internal.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public abstract class ServiceConfigExtensionConfiguration<T> {
    @NotNull
    public abstract BundleToServiceConfigConverter<T> getBundleConverter();

    @NotNull
    public abstract ServiceConfigUpdateListener<T> getServiceConfigUpdateListener();
}
