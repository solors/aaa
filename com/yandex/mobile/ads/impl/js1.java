package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class js1 {
    @NotNull

    /* renamed from: a */
    private final b42 f81075a;
    @NotNull

    /* renamed from: b */
    private final d42 f81076b;

    public /* synthetic */ js1(Context context) {
        this(context, new b42(context), new d42(context));
    }

    /* renamed from: a */
    public final void m32781a() {
        this.f81076b.m35102a();
        this.f81075a.m35645a();
    }

    public js1(@NotNull Context context, @NotNull b42 indicatorController, @NotNull d42 logController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indicatorController, "indicatorController");
        Intrinsics.checkNotNullParameter(logController, "logController");
        this.f81075a = indicatorController;
        this.f81076b = logController;
    }
}
