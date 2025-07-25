package io.appmetrica.analytics.adrevenue.applovin.v12.internal;

import io.appmetrica.analytics.adrevenue.applovin.v12.impl.C33677a;
import io.appmetrica.analytics.adrevenue.applovin.v12.impl.C33678b;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class AppLovinClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a */
    private final String f92258a = "ad-revenue-applovin-v12";

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.f92258a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NotNull ClientContext clientContext) {
        if (ReflectionUtils.detectClassExists("com.applovin.sdk.AppLovinSdk")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new C33678b(new C33677a(), clientContext));
        }
    }
}
