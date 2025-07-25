package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.nd */
/* loaded from: classes8.dex */
public final class C30929nd implements InterfaceC30840md {
    @NotNull

    /* renamed from: a */
    private final as1 f82696a;
    @NotNull

    /* renamed from: b */
    private final bq1 f82697b;
    @NotNull

    /* renamed from: c */
    private final C30139d2 f82698c;

    /* renamed from: d */
    private final Context f82699d;

    public C30929nd(@NotNull Context context, @NotNull as1 sdkSettings, @NotNull bq1 sdkConfigurationExpiredDateValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(sdkConfigurationExpiredDateValidator, "sdkConfigurationExpiredDateValidator");
        this.f82696a = sdkSettings;
        this.f82697b = sdkConfigurationExpiredDateValidator;
        this.f82698c = new C30139d2(context);
        this.f82699d = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30840md
    /* renamed from: a */
    public final boolean mo31597a() {
        if (this.f82698c.m35122a().m35681d()) {
            as1 as1Var = this.f82696a;
            Context context = this.f82699d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            yp1 m35796a = as1Var.m35796a(context);
            if (m35796a == null || !m35796a.m26782O() || this.f82697b.m35450a(m35796a)) {
                return true;
            }
        }
        return false;
    }
}
