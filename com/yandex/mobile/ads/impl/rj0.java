package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class rj0 {
    @NotNull

    /* renamed from: a */
    private final c32 f84777a;
    @NotNull

    /* renamed from: b */
    private final oj0 f84778b;

    public rj0(@NotNull c32 unifiedInstreamAdBinder) {
        Intrinsics.checkNotNullParameter(unifiedInstreamAdBinder, "unifiedInstreamAdBinder");
        this.f84777a = unifiedInstreamAdBinder;
        this.f84778b = oj0.f83536c.m30975a();
    }

    /* renamed from: a */
    public final void m30035a(@NotNull InterfaceC30043bs player) {
        Intrinsics.checkNotNullParameter(player, "player");
        c32 m30979a = this.f84778b.m30979a(player);
        if (!Intrinsics.m17075f(this.f84777a, m30979a)) {
            if (m30979a != null) {
                m30979a.invalidateAdPlayer();
            }
            this.f84778b.m30978a(player, this.f84777a);
        }
    }

    /* renamed from: b */
    public final void m30034b(@NotNull InterfaceC30043bs player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.f84778b.m30976b(player);
    }
}
