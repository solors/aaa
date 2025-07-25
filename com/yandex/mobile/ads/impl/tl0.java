package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class tl0 {
    @NotNull

    /* renamed from: a */
    private final C31835xr f85753a;
    @NotNull

    /* renamed from: b */
    private final sl0 f85754b;

    public tl0(@NotNull C31835xr instreamAdBinder) {
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        this.f85753a = instreamAdBinder;
        this.f85754b = sl0.f85301c.m29586a();
    }

    /* renamed from: a */
    public final void m29108a(@NotNull InterfaceC30192dt player) {
        Intrinsics.checkNotNullParameter(player, "player");
        C31835xr m29590a = this.f85754b.m29590a(player);
        if (!Intrinsics.m17075f(this.f85753a, m29590a)) {
            if (m29590a != null) {
                m29590a.m27430a();
            }
            this.f85754b.m29589a(player, this.f85753a);
        }
    }

    /* renamed from: b */
    public final void m29107b(@NotNull InterfaceC30192dt player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.f85754b.m29587b(player);
    }
}
