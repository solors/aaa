package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ih */
/* loaded from: classes8.dex */
public final class C30555ih {
    @NotNull

    /* renamed from: a */
    private final vs1 f80458a;

    public C30555ih(@NotNull vs1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f80458a = sensitiveModeChecker;
    }

    /* renamed from: a */
    public final boolean m33275a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80458a.getClass();
        boolean m28230b = vs1.m28230b(context);
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (!m28230b && m35796a != null && m35796a.m26780Q()) {
            return true;
        }
        return false;
    }
}
