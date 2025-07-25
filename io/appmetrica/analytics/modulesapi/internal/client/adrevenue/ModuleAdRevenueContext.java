package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleAdRevenueContext {
    @NotNull
    ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder();

    @NotNull
    ModuleAdRevenueReporter getAdRevenueReporter();
}
