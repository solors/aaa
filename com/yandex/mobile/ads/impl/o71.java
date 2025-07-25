package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o71 implements t71 {
    @NotNull

    /* renamed from: a */
    private final CopyOnWriteArrayList<t71> f83356a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void m31139a(@NotNull t71 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83356a.add(listener);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: b */
    public final void mo29262b() {
        Iterator<t71> it = this.f83356a.iterator();
        while (it.hasNext()) {
            it.next().mo29262b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29263a(long j, long j2) {
        Iterator<t71> it = this.f83356a.iterator();
        while (it.hasNext()) {
            it.next().mo29263a(j, j2);
        }
    }

    /* renamed from: b */
    public final void m31138b(@NotNull t71 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83356a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29264a() {
        Iterator<t71> it = this.f83356a.iterator();
        while (it.hasNext()) {
            it.next().mo29264a();
        }
    }
}
