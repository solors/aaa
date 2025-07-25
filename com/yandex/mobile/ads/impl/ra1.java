package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ra1 {
    @NotNull

    /* renamed from: a */
    private final Object f84691a = new Object();
    @NotNull

    /* renamed from: b */
    private final WeakHashMap<p52, Object> f84692b = new WeakHashMap<>();

    /* renamed from: a */
    public final boolean m30092a() {
        boolean z;
        synchronized (this.f84691a) {
            z = !this.f84692b.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public final void m30090b() {
        ArrayList<p52> arrayList;
        synchronized (this.f84691a) {
            arrayList = new ArrayList(this.f84692b.keySet());
            this.f84692b.clear();
            Unit unit = Unit.f99208a;
        }
        for (p52 p52Var : arrayList) {
            if (p52Var != null) {
                p52Var.mo28830b();
            }
        }
    }

    /* renamed from: a */
    public final void m30091a(@NotNull p52 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f84691a) {
            this.f84692b.put(listener, null);
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: b */
    public final void m30089b(@NotNull p52 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f84691a) {
            this.f84692b.remove(listener);
        }
    }
}
