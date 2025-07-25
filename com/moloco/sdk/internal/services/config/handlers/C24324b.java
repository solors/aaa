package com.moloco.sdk.internal.services.config.handlers;

import com.moloco.sdk.C23907i;
import com.moloco.sdk.internal.configs.C23949a;
import com.moloco.sdk.internal.configs.C23950b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.config.handlers.b */
/* loaded from: classes7.dex */
public final class C24324b implements InterfaceC24323a {
    @Override // com.moloco.sdk.internal.services.config.handlers.InterfaceC24323a
    @NotNull
    /* renamed from: b */
    public C23949a mo46597a(@NotNull C23907i sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        if (sdkInitResponse.m47358l()) {
            C23907i.C23925h m47362h = sdkInitResponse.m47362h();
            boolean enabled = m47362h.getEnabled();
            String m47330d = m47362h.m47330d();
            Intrinsics.checkNotNullExpressionValue(m47330d, "operationalMetricsConfig.url");
            return new C23949a(enabled, m47330d, m47362h.m47331c());
        }
        return C23950b.m47289a();
    }

    @Override // com.moloco.sdk.internal.services.config.handlers.InterfaceC24323a
    @NotNull
    /* renamed from: a */
    public Class<C23949a> mo46598a() {
        return C23949a.class;
    }
}
