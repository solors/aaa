package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class pr0 {
    @NotNull

    /* renamed from: c */
    private static final Object f84059c = new Object();
    @NotNull

    /* renamed from: a */
    private final qr0 f84060a;
    @NotNull

    /* renamed from: b */
    private final or0 f84061b;

    public pr0(@NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f84060a = new qr0(localStorage);
        this.f84061b = new or0();
    }

    @NotNull
    /* renamed from: a */
    public final String m30590a() {
        String m30244a;
        synchronized (f84059c) {
            m30244a = this.f84060a.m30244a();
            if (m30244a == null) {
                this.f84061b.getClass();
                m30244a = or0.m30939a();
                this.f84060a.m30243a(m30244a);
            }
        }
        return m30244a;
    }
}
