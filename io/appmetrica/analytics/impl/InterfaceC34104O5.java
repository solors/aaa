package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.O5 */
/* loaded from: classes9.dex */
public interface InterfaceC34104O5 extends ModuleAdRevenueContext {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    C34823q5 getAdRevenueProcessorsHolder();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    ModuleAdRevenueReporter getAdRevenueReporter();
}
