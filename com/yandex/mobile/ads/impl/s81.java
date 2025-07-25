package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class s81 implements db1, my0 {
    @NotNull

    /* renamed from: a */
    private final CopyOnWriteArrayList<t81> f85146a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void m29679a(@NotNull t81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f85146a.add(listener);
    }

    /* renamed from: b */
    public final void m29677b(@NotNull t81 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f85146a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.my0
    /* renamed from: a */
    public final void mo28000a() {
        Iterator<t81> it = this.f85146a.iterator();
        while (it.hasNext()) {
            it.next().mo29259a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.db1
    /* renamed from: a */
    public final void mo29678a(boolean z) {
        Iterator<t81> it = this.f85146a.iterator();
        while (it.hasNext()) {
            it.next().mo29258a(z);
        }
    }

    @Override // com.yandex.mobile.ads.impl.db1
    /* renamed from: c */
    public final void mo29676c() {
    }
}
