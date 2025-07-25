package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i51 implements l21 {
    @NotNull

    /* renamed from: a */
    private final CopyOnWriteArrayList f80322a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private boolean f80323b;

    /* renamed from: a */
    public final void m33363a(@NotNull h51 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80322a.add(listener);
        if (this.f80323b) {
            listener.mo32363b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.l21
    /* renamed from: b */
    public final void mo32363b() {
        this.f80323b = true;
        Iterator it = this.f80322a.iterator();
        while (it.hasNext()) {
            ((l21) it.next()).mo32363b();
        }
    }

    /* renamed from: b */
    public final void m33362b(@NotNull h51 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80322a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.l21
    /* renamed from: a */
    public final void mo32364a() {
        this.f80323b = false;
        Iterator it = this.f80322a.iterator();
        while (it.hasNext()) {
            ((l21) it.next()).mo32364a();
        }
    }
}
