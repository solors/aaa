package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ha0 {

    /* renamed from: a */
    private final Context f80013a;

    public ha0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80013a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean m33587a() {
        int i = as1.f76895l;
        as1 m35776a = as1.C29962a.m35776a();
        Context context = this.f80013a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        yp1 m35796a = m35776a.m35796a(context);
        if (m35796a != null && m35796a.m26774W()) {
            return true;
        }
        return false;
    }
}
