package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jb1 {
    @NotNull

    /* renamed from: a */
    private final sp0 f80860a;

    public /* synthetic */ jb1(Context context) {
        this(context, up0.m28714a(context));
    }

    /* renamed from: a */
    public final boolean m32948a() {
        return this.f80860a.mo29089a("OPT_OUT_ENABLED", false);
    }

    /* renamed from: b */
    public final void m32947b() {
        this.f80860a.mo29085b("OPT_OUT_ENABLED", true);
    }

    public jb1(@NotNull Context context, @NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f80860a = localStorage;
    }
}
