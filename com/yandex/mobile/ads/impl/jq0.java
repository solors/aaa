package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jq0 {
    @NotNull

    /* renamed from: a */
    private final kq0 f81055a = new kq0();
    @NotNull

    /* renamed from: b */
    private final yz1 f81056b = new yz1();

    /* renamed from: a */
    public final void m32795a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f81056b.getClass();
        if (yz1.m26511a()) {
            runnable.run();
        } else {
            this.f81055a.m32464a(runnable);
        }
    }

    /* renamed from: a */
    public final void m32796a() {
        this.f81055a.m32466a();
    }
}
