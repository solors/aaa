package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public abstract class RemoteConfigExtensionConfiguration<S> {
    @NotNull
    public abstract Map<String, Integer> getBlocks();

    @NotNull
    public abstract List<String> getFeatures();

    @NotNull
    public abstract JsonParser<S> getJsonParser();

    @NotNull
    public abstract Converter<S, byte[]> getProtobufConverter();

    @NotNull
    public abstract RemoteConfigUpdateListener<S> getRemoteConfigUpdateListener();
}
