package io.appmetrica.analytics.adrevenue.ironsource.p722v7.internal;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.IronSource;
import io.appmetrica.analytics.adrevenue.ironsource.p722v7.impl.C33686b;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* renamed from: io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint */
/* loaded from: classes9.dex */
public class IronSourceClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a */
    private ClientContext f92264a = null;

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NonNull
    public String getIdentifier() {
        return "ad-revenue-ironsource-v7";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NonNull ClientContext clientContext) {
        this.f92264a = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        ClientContext clientContext;
        if (ReflectionUtils.detectClassExists("com.ironsource.mediationsdk.IronSource") && (clientContext = this.f92264a) != null) {
            IronSource.addImpressionDataListener(new C33686b(clientContext));
        }
    }
}
