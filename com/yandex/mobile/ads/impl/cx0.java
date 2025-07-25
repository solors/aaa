package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cx0 {
    @NotNull

    /* renamed from: a */
    private static final List<String> f77793a;

    static {
        List<String> m17166m;
        m17166m = C37563v.m17166m();
        f77793a = m17166m;
    }

    /* renamed from: a */
    public static boolean m35140a(@NotNull Context context, @NotNull String adapterName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        if (f77793a.contains(adapterName) && !k60.m32668a(context, j60.f80762d)) {
            return false;
        }
        return true;
    }
}
