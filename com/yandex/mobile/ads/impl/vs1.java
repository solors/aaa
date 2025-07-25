package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vs1 {
    /* renamed from: a */
    public static boolean m28231a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && m35796a.m26772Y()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m28230b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && m35796a.m26735r0() && !m28231a(context)) {
            return false;
        }
        return true;
    }
}
