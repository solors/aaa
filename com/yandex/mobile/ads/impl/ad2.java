package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ad2 {
    @NotNull
    /* renamed from: a */
    public static nm1 m35916a(@NotNull c91 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        int i = response.f77556a;
        rm1 rm1Var = new rm1(response.f77557b);
        Map<String, String> map = response.f77558c;
        if (map == null) {
            map = C37559r0.m17284j();
        }
        return new nm1(i, rm1Var, map);
    }
}
