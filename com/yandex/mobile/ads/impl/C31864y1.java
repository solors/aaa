package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.y1 */
/* loaded from: classes8.dex */
public final class C31864y1 {
    @NotNull

    /* renamed from: a */
    private final Object f87991a = new Object();
    @NotNull

    /* renamed from: b */
    private final WeakHashMap<InterfaceC31786x1, Object> f87992b = new WeakHashMap<>();

    /* renamed from: a */
    public final void m27122a() {
        HashSet<InterfaceC31786x1> hashSet;
        synchronized (this.f87991a) {
            hashSet = new HashSet(this.f87992b.keySet());
            this.f87992b.clear();
            Unit unit = Unit.f99208a;
        }
        for (InterfaceC31786x1 interfaceC31786x1 : hashSet) {
            interfaceC31786x1.mo27707a();
        }
    }

    /* renamed from: b */
    public final void m27120b(@NotNull InterfaceC31786x1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f87991a) {
            this.f87992b.remove(listener);
        }
    }

    /* renamed from: a */
    public final void m27121a(@NotNull InterfaceC31786x1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f87991a) {
            this.f87992b.put(listener, null);
        }
    }
}
