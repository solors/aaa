package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class cm0 implements cm1 {
    @NotNull

    /* renamed from: a */
    private final uc2 f77672a;

    public cm0(@NotNull uc2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.f77672a = requestConfig;
    }

    @Override // com.yandex.mobile.ads.impl.cm1
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo31653a() {
        Map<String, Object> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a("ad_type", EnumC30803lr.f81899i.m32212a()), C38513v.m14532a("page_id", this.f77672a.mo28824a()), C38513v.m14532a(Reporting.Key.CATEGORY_ID, this.f77672a.mo28823b()));
        return m17281m;
    }
}
