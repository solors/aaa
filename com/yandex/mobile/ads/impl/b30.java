package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b30 {
    @NotNull

    /* renamed from: a */
    private final ey1 f77075a = new ey1();

    @NotNull
    /* renamed from: a */
    public final String m35667a(@NotNull Context context, @NotNull String rawQuery) {
        String m34410a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rawQuery, "rawQuery");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && m35796a.m26775V() && (m34410a = this.f77075a.m34410a(context, rawQuery)) != null) {
            return m34410a;
        }
        return rawQuery;
    }
}
