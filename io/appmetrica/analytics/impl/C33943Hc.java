package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Hc */
/* loaded from: classes9.dex */
public final class C33943Hc implements ModuleEventServiceHandlerContext {

    /* renamed from: a */
    public final ModulePreferences f92959a;

    /* renamed from: b */
    public final ModulePreferences f92960b;

    /* renamed from: c */
    public final ModuleEventServiceHandlerReporter f92961c;

    public C33943Hc(@NotNull ModulePreferences modulePreferences, @NotNull ModulePreferences modulePreferences2, @NotNull ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f92959a = modulePreferences;
        this.f92960b = modulePreferences2;
        this.f92961c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f92961c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f92960b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getModulePreferences() {
        return this.f92959a;
    }
}
