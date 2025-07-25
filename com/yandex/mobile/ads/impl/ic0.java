package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ic0 {
    @NotNull

    /* renamed from: a */
    private static final Object f80405a = new Object();
    @Nullable

    /* renamed from: b */
    private static volatile rb0 f80406b;

    @NotNull
    /* renamed from: a */
    public static final rb0 m33317a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f80406b == null) {
            synchronized (f80405a) {
                if (f80406b == null) {
                    f80406b = new rb0(context, "com.google.android.gms.location.LocationServices");
                }
                Unit unit = Unit.f99208a;
            }
        }
        rb0 rb0Var = f80406b;
        if (rb0Var != null) {
            return rb0Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
