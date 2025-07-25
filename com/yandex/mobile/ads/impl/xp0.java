package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class xp0 {
    @NotNull

    /* renamed from: a */
    private final vp0 f87773a = new vp0();

    @NotNull
    /* renamed from: a */
    public final String m27437a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Locale locale = context.getResources().getConfiguration().locale;
        vp0 vp0Var = this.f87773a;
        Intrinsics.m17074g(locale);
        vp0Var.getClass();
        return vp0.m28246a(locale);
    }
}
