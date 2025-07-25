package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ed0 {
    @NotNull

    /* renamed from: a */
    private static final Object f78506a = new Object();
    @Nullable

    /* renamed from: b */
    private static volatile rb0 f78507b;

    @NotNull
    /* renamed from: a */
    public static final rb0 m34636a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f78507b == null) {
            synchronized (f78506a) {
                if (f78507b == null) {
                    f78507b = new rb0(context, "com.huawei.hms.location.LocationServices");
                }
                Unit unit = Unit.f99208a;
            }
        }
        rb0 rb0Var = f78507b;
        if (rb0Var != null) {
            return rb0Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
