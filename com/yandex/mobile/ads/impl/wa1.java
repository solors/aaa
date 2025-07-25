package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class wa1 {
    @Nullable

    /* renamed from: a */
    private static volatile va1 f87191a;
    @NotNull

    /* renamed from: b */
    private static final Object f87192b = new Object();

    @NotNull
    /* renamed from: a */
    public static final va1 m27997a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f87191a == null) {
            synchronized (f87192b) {
                if (f87191a == null) {
                    int i = up0.f86348b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    f87191a = new va1(up0.m28713a(context, "YadPreferenceFile"));
                }
                Unit unit = Unit.f99208a;
            }
        }
        va1 va1Var = f87191a;
        if (va1Var != null) {
            return va1Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
