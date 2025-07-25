package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class w42 implements bd1 {
    @NotNull

    /* renamed from: a */
    private final String f87122a;
    @Nullable

    /* renamed from: b */
    private final f62 f87123b;

    public w42(@NotNull String responseStatus, @Nullable f62 f62Var) {
        Intrinsics.checkNotNullParameter(responseStatus, "responseStatus");
        this.f87122a = responseStatus;
        this.f87123b = f62Var;
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo28030a(long j) {
        Map<String, Object> m17279o;
        m17279o = C37559r0.m17279o(C38513v.m14532a("duration", Long.valueOf(j)), C38513v.m14532a("status", this.f87122a));
        f62 f62Var = this.f87123b;
        if (f62Var != null) {
            m17279o.put("failure_reason", f62Var.m34211a());
        }
        return m17279o;
    }
}
