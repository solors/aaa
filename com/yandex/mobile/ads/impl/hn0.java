package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class hn0 {
    @NotNull

    /* renamed from: c */
    private static final Object f80125c = new Object();
    @Nullable

    /* renamed from: d */
    private static hn0 f80126d;

    /* renamed from: e */
    public static final /* synthetic */ int f80127e = 0;
    @NotNull

    /* renamed from: a */
    private final vg1<hb0, InterfaceC30268es> f80128a;
    @NotNull

    /* renamed from: b */
    private final ib0 f80129b;

    /* renamed from: com.yandex.mobile.ads.impl.hn0$a */
    /* loaded from: classes8.dex */
    public static final class C30481a {
        @NotNull
        /* renamed from: a */
        public static hn0 m33507a() {
            if (hn0.f80126d == null) {
                synchronized (hn0.f80125c) {
                    if (hn0.f80126d == null) {
                        hn0.f80126d = new hn0(new vg1(), new ib0());
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            hn0 hn0Var = hn0.f80126d;
            if (hn0Var != null) {
                return hn0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @VisibleForTesting
    public hn0(@NotNull vg1<hb0, InterfaceC30268es> preloadingCache, @NotNull ib0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f80128a = preloadingCache;
        this.f80129b = cacheParamsMapper;
    }

    /* renamed from: c */
    public final synchronized boolean m33508c() {
        return this.f80128a.m28315b();
    }

    /* renamed from: a */
    public final synchronized void m33510a(@NotNull C30705k7 adRequestData, @NotNull InterfaceC30268es item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        vg1<hb0, InterfaceC30268es> vg1Var = this.f80128a;
        this.f80129b.getClass();
        vg1Var.m28316a(ib0.m33321a(adRequestData), item);
    }

    @Nullable
    /* renamed from: a */
    public final synchronized InterfaceC30268es m33511a(@NotNull C30705k7 adRequestData) {
        vg1<hb0, InterfaceC30268es> vg1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        vg1Var = this.f80128a;
        this.f80129b.getClass();
        return (InterfaceC30268es) vg1Var.m28317a(ib0.m33321a(adRequestData));
    }
}
