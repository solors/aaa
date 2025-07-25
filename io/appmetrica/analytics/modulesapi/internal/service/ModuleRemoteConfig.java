package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleRemoteConfig<T> {
    T getFeaturesConfig();

    @NotNull
    SdkIdentifiers getIdentifiers();

    @NotNull
    RemoteConfigMetaInfo getRemoteConfigMetaInfo();
}
