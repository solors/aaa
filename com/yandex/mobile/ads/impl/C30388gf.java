package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gf */
/* loaded from: classes8.dex */
public final class C30388gf {
    @NotNull

    /* renamed from: c */
    private static final Object f79643c = new Object();
    @Nullable

    /* renamed from: d */
    private static C30388gf f79644d;

    /* renamed from: e */
    public static final /* synthetic */ int f79645e = 0;
    @NotNull

    /* renamed from: a */
    private final vg1<hb0, InterfaceC30878mr> f79646a;
    @NotNull

    /* renamed from: b */
    private final ib0 f79647b;

    /* renamed from: com.yandex.mobile.ads.impl.gf$a */
    /* loaded from: classes8.dex */
    public static final class C30389a {
        @NotNull
        /* renamed from: a */
        public static C30388gf m33839a() {
            if (C30388gf.f79644d == null) {
                synchronized (C30388gf.f79643c) {
                    if (C30388gf.f79644d == null) {
                        C30388gf.f79644d = new C30388gf(new vg1(), new ib0());
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            C30388gf c30388gf = C30388gf.f79644d;
            if (c30388gf != null) {
                return c30388gf;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @VisibleForTesting
    public C30388gf(@NotNull vg1<hb0, InterfaceC30878mr> preloadingCache, @NotNull ib0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f79646a = preloadingCache;
        this.f79647b = cacheParamsMapper;
    }

    /* renamed from: c */
    public final synchronized boolean m33840c() {
        return this.f79646a.m28315b();
    }

    /* renamed from: a */
    public final synchronized void m33842a(@NotNull C30705k7 adRequestData, @NotNull InterfaceC30878mr item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        vg1<hb0, InterfaceC30878mr> vg1Var = this.f79646a;
        this.f79647b.getClass();
        vg1Var.m28316a(ib0.m33321a(adRequestData), item);
    }

    @Nullable
    /* renamed from: a */
    public final synchronized InterfaceC30878mr m33843a(@NotNull C30705k7 adRequestData) {
        vg1<hb0, InterfaceC30878mr> vg1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        vg1Var = this.f79646a;
        this.f79647b.getClass();
        return (InterfaceC30878mr) vg1Var.m28317a(ib0.m33321a(adRequestData));
    }
}
