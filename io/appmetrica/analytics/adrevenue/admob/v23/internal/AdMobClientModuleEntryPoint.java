package io.appmetrica.analytics.adrevenue.admob.v23.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.C33667a;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.C33668b;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* loaded from: classes9.dex */
public class AdMobClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NonNull
    public String getIdentifier() {
        return "ad-revenue-admob-v23";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NonNull ClientContext clientContext) {
        if (ReflectionUtils.detectClassExists("com.google.android.gms.ads.AdView")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new C33667a(new C33668b(), clientContext));
        }
    }
}
