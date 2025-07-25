package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nu1 {
    @NotNull

    /* renamed from: a */
    private final Object f83138a = new Object();

    /* renamed from: b */
    private boolean f83139b;

    /* renamed from: a */
    public final void m31279a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        synchronized (this.f83138a) {
            if (this.f83139b) {
                return;
            }
            this.f83139b = true;
            Unit unit = Unit.f99208a;
            runnable.run();
        }
    }
}
