package io.appmetrica.analytics.adrevenue.fyber.p721v3.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.adrevenue.fyber.p721v3.impl.C33682b;
import io.appmetrica.analytics.adrevenue.fyber.p721v3.impl.C33683c;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint */
/* loaded from: classes9.dex */
public class FyberClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NonNull
    public String getIdentifier() {
        return "ad-revenue-fyber-v3";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NonNull ClientContext clientContext) {
        if (ReflectionUtils.detectClassExists("com.fyber.fairbid.ads.Interstitial")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new C33683c(new C33682b(), clientContext));
        }
    }
}
