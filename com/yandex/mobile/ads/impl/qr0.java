package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class qr0 {
    @NotNull

    /* renamed from: a */
    private final sp0 f84473a;
    @NotNull

    /* renamed from: b */
    private final Object f84474b;
    @Nullable

    /* renamed from: c */
    private String f84475c;

    public qr0(@NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f84473a = localStorage;
        this.f84474b = new Object();
    }

    @Nullable
    /* renamed from: a */
    public final String m30244a() {
        String str;
        synchronized (this.f84474b) {
            if (this.f84475c == null) {
                this.f84475c = this.f84473a.mo29082d("YmadMauid");
            }
            str = this.f84475c;
        }
        return str;
    }

    /* renamed from: a */
    public final void m30243a(@NotNull String mauid) {
        Intrinsics.checkNotNullParameter(mauid, "mauid");
        synchronized (this.f84474b) {
            this.f84475c = mauid;
            this.f84473a.mo29092a("YmadMauid", mauid);
            Unit unit = Unit.f99208a;
        }
    }
}
