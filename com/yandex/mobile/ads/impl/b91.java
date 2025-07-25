package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b91 {
    @NotNull
    /* renamed from: a */
    public static final dd2 m35564a(@NotNull C30359g3 adConfiguration, @NotNull gd2 volleyResponseBodyParser) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(volleyResponseBodyParser, "volleyResponseBodyParser");
        tm1 responseBodyParser = new tm1(volleyResponseBodyParser);
        ad2 ad2Var = new ad2();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        return new dd2(adConfiguration, volleyResponseBodyParser, responseBodyParser, ad2Var, new i91(adConfiguration, responseBodyParser, new f60(), new gw0(), new mn1(), new C30042br(), new wd0(), new wp0(), new C31570uc(), new C30224e8()));
    }

    @NotNull
    /* renamed from: a */
    public static final cd2 m35565a() {
        return new cd2(new ad2(), new f91());
    }
}
