package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dg0 {
    @NotNull

    /* renamed from: a */
    private final g30 f78123a;

    public dg0(@NotNull g30 environmentController) {
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        this.f78123a = environmentController;
    }

    @NotNull
    /* renamed from: a */
    public final bg0 m34946a() {
        fg0 m33940d = this.f78123a.m33940d();
        return new bg0(m33940d.mo34154b(), m33940d.mo34155a(), m33940d.mo34153c());
    }
}
