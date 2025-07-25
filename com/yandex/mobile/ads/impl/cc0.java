package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cc0 {
    @NotNull

    /* renamed from: b */
    private static final Object f77591b = new Object();
    @NotNull

    /* renamed from: a */
    private final sp0 f77592a;

    public cc0(@NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f77592a = localStorage;
    }

    /* renamed from: a */
    public final boolean m35302a(@Nullable C31967zb c31967zb) {
        String m26290a;
        boolean z = false;
        if (c31967zb == null || (m26290a = c31967zb.m26290a()) == null) {
            return false;
        }
        synchronized (f77591b) {
            String mo29082d = this.f77592a.mo29082d("google_advertising_id_key");
            if (mo29082d != null) {
                if (!Intrinsics.m17075f(m26290a, mo29082d)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void m35301b(@Nullable C31967zb c31967zb) {
        String str;
        String mo29082d = this.f77592a.mo29082d("google_advertising_id_key");
        if (c31967zb != null) {
            str = c31967zb.m26290a();
        } else {
            str = null;
        }
        if (mo29082d == null && str != null) {
            this.f77592a.mo29092a("google_advertising_id_key", str);
        }
    }
}
