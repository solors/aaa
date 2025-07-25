package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleAdRevenueProcessor {
    @NotNull
    String getDescription();

    boolean process(@NotNull Object... objArr);
}
