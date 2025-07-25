package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.e */
/* loaded from: classes9.dex */
public abstract class AbstractC33671e implements ModuleAdRevenueProcessor {
    @NonNull

    /* renamed from: a */
    protected final C33668b f92254a;

    /* renamed from: b */
    public final ClientContext f92255b;

    public AbstractC33671e(@NonNull C33668b c33668b, @NonNull ClientContext clientContext) {
        this.f92254a = c33668b;
        this.f92255b = clientContext;
    }

    /* renamed from: a */
    public final void m22816a(@NonNull ModuleAdRevenue moduleAdRevenue) {
        this.f92255b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }
}
