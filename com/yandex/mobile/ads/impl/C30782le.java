package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.le */
/* loaded from: classes8.dex */
public final class C30782le {
    @NotNull

    /* renamed from: a */
    private final Object f81780a = new Object();
    @NotNull

    /* renamed from: b */
    private final ArrayList f81781b = new ArrayList();

    /* renamed from: a */
    public final void m32283a(@NotNull C30723ke appMetricaIdentifiers) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (this.f81780a) {
            arrayList = new ArrayList(this.f81781b);
            this.f81781b.clear();
            Unit unit = Unit.f99208a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((eg0) it.next()).m34593a(appMetricaIdentifiers);
        }
    }

    /* renamed from: a */
    public final void m32285a() {
        synchronized (this.f81780a) {
            this.f81781b.clear();
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    public final void m32284a(@NotNull eg0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f81780a) {
            this.f81781b.add(observer);
        }
    }
}
