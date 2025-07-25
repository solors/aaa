package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class zx0 {
    @NotNull

    /* renamed from: a */
    private final Object f89145a = new Object();
    @NotNull

    /* renamed from: b */
    private final ArrayList f89146b = new ArrayList();

    /* renamed from: a */
    public final void m25972a() {
        ArrayList arrayList;
        synchronized (this.f89145a) {
            arrayList = new ArrayList(this.f89146b);
            this.f89146b.clear();
            Unit unit = Unit.f99208a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ki0 ki0Var = (ki0) it.next();
            if (ki0Var != null) {
                ki0Var.m32558a();
            }
        }
    }

    /* renamed from: a */
    public final void m25971a(@NotNull ki0 initializationObserver) {
        Intrinsics.checkNotNullParameter(initializationObserver, "initializationObserver");
        synchronized (this.f89145a) {
            this.f89146b.add(initializationObserver);
        }
    }
}
