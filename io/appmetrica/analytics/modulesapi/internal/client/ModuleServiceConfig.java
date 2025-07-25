package io.appmetrica.analytics.modulesapi.internal.client;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleServiceConfig<T> {
    T getFeaturesConfig();

    @NotNull
    SdkIdentifiers getIdentifiers();
}
