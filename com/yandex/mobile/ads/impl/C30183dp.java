package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dp */
/* loaded from: classes8.dex */
public final class C30183dp {
    @NotNull
    /* renamed from: a */
    public static C30262ep m34876a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C30330fp c30330fp = new C30330fp();
        C30407gp c30407gp = new C30407gp();
        String packageName = context.getPackageName();
        return new C30262ep(c30330fp, c30407gp, up0.m28713a(context, packageName + "_preferences"));
    }
}
