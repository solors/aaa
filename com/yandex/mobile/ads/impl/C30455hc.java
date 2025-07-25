package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hc */
/* loaded from: classes8.dex */
public final class C30455hc {
    @NotNull

    /* renamed from: a */
    private final Object f80029a = new Object();
    @NotNull

    /* renamed from: b */
    private final WeakHashMap<InterfaceC30617jc, Object> f80030b = new WeakHashMap<>();

    /* renamed from: a */
    private final void m33582a(C30011bc c30011bc) {
        ArrayList<InterfaceC30617jc> arrayList;
        synchronized (this.f80029a) {
            arrayList = new ArrayList(this.f80030b.keySet());
            this.f80030b.clear();
            Unit unit = Unit.f99208a;
        }
        for (InterfaceC30617jc interfaceC30617jc : arrayList) {
            if (interfaceC30617jc != null) {
                interfaceC30617jc.mo32946a(c30011bc);
            }
        }
    }

    /* renamed from: b */
    public final void m33580b(@NotNull C30011bc advertisingInfoHolder) {
        Intrinsics.checkNotNullParameter(advertisingInfoHolder, "advertisingInfoHolder");
        m33582a(advertisingInfoHolder);
    }

    /* renamed from: b */
    public final void m33579b(@NotNull InterfaceC30617jc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f80029a) {
            this.f80030b.remove(listener);
        }
    }

    /* renamed from: a */
    public final void m33583a() {
        m33582a((C30011bc) null);
    }

    /* renamed from: a */
    public final void m33581a(@NotNull InterfaceC30617jc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f80029a) {
            this.f80030b.put(listener, null);
            Unit unit = Unit.f99208a;
        }
    }
}
