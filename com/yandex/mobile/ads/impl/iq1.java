package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class iq1 implements zl1<yp1> {
    @NotNull

    /* renamed from: a */
    private final bq1 f80582a;
    @NotNull

    /* renamed from: b */
    private final is1 f80583b;
    @NotNull

    /* renamed from: c */
    private final zm1<yp1> f80584c;
    @NotNull

    /* renamed from: d */
    private final Context f80585d;
    @NotNull

    /* renamed from: e */
    private final C30801lq f80586e;

    public /* synthetic */ iq1(Context context, jl1 jl1Var) {
        this(context, jl1Var, new bq1(), new is1(), new lq1(jl1Var));
    }

    @Override // com.yandex.mobile.ads.impl.zl1
    /* renamed from: a */
    public final yp1 mo26142a(c91 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f80584c.mo26085a(networkResponse);
    }

    @Override // com.yandex.mobile.ads.impl.zl1
    /* renamed from: a */
    public final boolean mo26143a() {
        int i = as1.f76895l;
        yp1 sdkConfiguration = as1.C29962a.m35776a().m35796a(this.f80585d);
        if (sdkConfiguration == null || this.f80582a.m35450a(sdkConfiguration)) {
            return true;
        }
        this.f80583b.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (!Intrinsics.m17075f("7.9.0", sdkConfiguration.m26790G())) {
            return true;
        }
        this.f80586e.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (!Intrinsics.m17075f(as1.C29962a.m35776a().m35778j(), sdkConfiguration.m26729u0())) {
            return true;
        }
        this.f80586e.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (as1.C29962a.m35776a().m35787d() != sdkConfiguration.m26757g0()) {
            return true;
        }
        this.f80586e.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        return Intrinsics.m17075f(as1.C29962a.m35776a().m35783f(), sdkConfiguration.m26783N()) ^ true;
    }

    public iq1(@NotNull Context context, @NotNull jl1 reporter, @NotNull bq1 sdkConfigurationExpiredDateValidator, @NotNull is1 sdkVersionUpdateValidator, @NotNull zm1<yp1> sdkConfigurationResponseParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sdkConfigurationExpiredDateValidator, "sdkConfigurationExpiredDateValidator");
        Intrinsics.checkNotNullParameter(sdkVersionUpdateValidator, "sdkVersionUpdateValidator");
        Intrinsics.checkNotNullParameter(sdkConfigurationResponseParser, "sdkConfigurationResponseParser");
        this.f80582a = sdkConfigurationExpiredDateValidator;
        this.f80583b = sdkVersionUpdateValidator;
        this.f80584c = sdkConfigurationResponseParser;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f80585d = applicationContext;
        this.f80586e = new C30801lq();
    }
}
