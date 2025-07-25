package io.appmetrica.analytics.modulesapi.internal.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public abstract class ModuleClientEntryPoint<T> {
    @NotNull
    public abstract String getIdentifier();

    @Nullable
    public ServiceConfigExtensionConfiguration<T> getServiceConfigExtensionConfiguration() {
        return null;
    }

    public void onActivated() {
    }

    public void initClientSide(@NotNull ClientContext clientContext) {
    }
}
