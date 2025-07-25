package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public abstract class ModuleServiceEntryPoint<T> {
    @Nullable
    public ClientConfigProvider getClientConfigProvider() {
        return null;
    }

    @NotNull
    public abstract String getIdentifier();

    @Nullable
    public LocationServiceExtension getLocationServiceExtension() {
        return null;
    }

    @Nullable
    public ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return null;
    }

    @Nullable
    public ModuleServicesDatabase getModuleServicesDatabase() {
        return null;
    }

    @Nullable
    public RemoteConfigExtensionConfiguration<T> getRemoteConfigExtensionConfiguration() {
        return null;
    }

    public void initServiceSide(@NotNull ServiceContext serviceContext, @NotNull ModuleRemoteConfig<T> moduleRemoteConfig) {
    }
}
