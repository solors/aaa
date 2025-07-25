package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dc0 {
    @Nullable

    /* renamed from: a */
    private static volatile cc0 f78037a;
    @NotNull

    /* renamed from: b */
    private static final Object f78038b = new Object();

    @NotNull
    /* renamed from: a */
    public static final cc0 m34973a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f78037a == null) {
            synchronized (f78038b) {
                if (f78037a == null) {
                    int i = up0.f86348b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    f78037a = new cc0(up0.m28713a(context, "YadPreferenceFile"));
                }
                Unit unit = Unit.f99208a;
            }
        }
        cc0 cc0Var = f78037a;
        if (cc0Var != null) {
            return cc0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
