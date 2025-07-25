package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.P5 */
/* loaded from: classes9.dex */
public final class C34128P5 implements InterfaceC34104O5 {

    /* renamed from: a */
    public final ModuleAdRevenueReporter f93326a;

    /* renamed from: b */
    public final C34823q5 f93327b;

    public C34128P5(@NotNull ModuleAdRevenueReporter moduleAdRevenueReporter, @NotNull C34823q5 c34823q5) {
        this.f93326a = moduleAdRevenueReporter;
        this.f93327b = c34823q5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34104O5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final C34823q5 getAdRevenueProcessorsHolder() {
        return this.f93327b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34104O5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final ModuleAdRevenueReporter getAdRevenueReporter() {
        return this.f93326a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f93327b;
    }
}
