package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mf0 extends AbstractC31047oj {
    @NotNull

    /* renamed from: a */
    private final AbstractC31047oj f82167a;
    @NotNull

    /* renamed from: b */
    private final v32 f82168b;

    public mf0(@NotNull AbstractC31047oj httpStackDelegate, @NotNull v32 userAgentProvider) {
        Intrinsics.checkNotNullParameter(httpStackDelegate, "httpStackDelegate");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.f82167a = httpStackDelegate;
        this.f82168b = userAgentProvider;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31047oj
    @NotNull
    /* renamed from: a */
    public final jf0 mo27164a(@NotNull ml1<?> request, @NotNull Map<String, String> additionalHeaders) throws IOException, C30313fh {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
        HashMap hashMap = new HashMap();
        hashMap.putAll(additionalHeaders);
        hashMap.put(df0.f78075U.m34950a(), this.f82168b.mo28049a());
        jf0 mo27164a = this.f82167a.mo27164a(request, hashMap);
        Intrinsics.checkNotNullExpressionValue(mo27164a, "executeRequest(...)");
        return mo27164a;
    }
}
