package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e51 {
    /* renamed from: a */
    public static long m34664a(@NotNull C30149d8 adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        EnumC30803lr m35055n = adResponse.m35055n();
        Long m35048u = adResponse.m35048u();
        if (m35048u == null) {
            if (m35055n == EnumC30803lr.f81896f) {
                m35048u = 5000L;
            } else {
                m35048u = 0L;
            }
        }
        return m35048u.longValue();
    }
}
