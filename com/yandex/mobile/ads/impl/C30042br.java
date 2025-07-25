package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* renamed from: com.yandex.mobile.ads.impl.br */
/* loaded from: classes8.dex */
public final class C30042br {
    @NotNull

    /* renamed from: a */
    private static final Map<String, EnumC29958ar> f77386a;

    static {
        Map<String, EnumC29958ar> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a("html", EnumC29958ar.f76877b), C38513v.m14532a("native", EnumC29958ar.f76878c));
        f77386a = m17281m;
    }

    @Nullable
    /* renamed from: a */
    public static EnumC29958ar m35449a(@NotNull Map headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return f77386a.get(wc0.m27983a(headers, df0.f78105v));
    }
}
