package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ll1 {
    @NotNull

    /* renamed from: a */
    private final vs1 f81850a;

    public ll1(@NotNull vs1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f81850a = sensitiveModeChecker;
    }

    /* renamed from: a */
    public final boolean m32236a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81850a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return !vs1.m28230b(context);
    }
}
