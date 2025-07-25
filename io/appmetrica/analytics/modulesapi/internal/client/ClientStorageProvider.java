package io.appmetrica.analytics.modulesapi.internal.client;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ClientStorageProvider {
    @NotNull
    ModulePreferences modulePreferences(@NotNull String str);
}
