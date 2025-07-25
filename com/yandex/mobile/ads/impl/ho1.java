package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ho1 {
    @NotNull

    /* renamed from: c */
    private static final Object f80137c = new Object();
    @Nullable

    /* renamed from: d */
    private static ho1 f80138d;

    /* renamed from: e */
    public static final /* synthetic */ int f80139e = 0;
    @NotNull

    /* renamed from: a */
    private final vg1<hb0, InterfaceC31838xs> f80140a;
    @NotNull

    /* renamed from: b */
    private final ib0 f80141b;

    /* renamed from: com.yandex.mobile.ads.impl.ho1$a */
    /* loaded from: classes8.dex */
    public static final class C30483a {
        @NotNull
        /* renamed from: a */
        public static ho1 m33496a() {
            if (ho1.f80138d == null) {
                synchronized (ho1.f80137c) {
                    if (ho1.f80138d == null) {
                        ho1.f80138d = new ho1(new vg1(), new ib0());
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            ho1 ho1Var = ho1.f80138d;
            if (ho1Var != null) {
                return ho1Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @VisibleForTesting
    public ho1(@NotNull vg1<hb0, InterfaceC31838xs> preloadingCache, @NotNull ib0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f80140a = preloadingCache;
        this.f80141b = cacheParamsMapper;
    }

    /* renamed from: c */
    public final synchronized boolean m33497c() {
        return this.f80140a.m28315b();
    }

    /* renamed from: a */
    public final synchronized void m33499a(@NotNull C30705k7 adRequestData, @NotNull InterfaceC31838xs item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        vg1<hb0, InterfaceC31838xs> vg1Var = this.f80140a;
        this.f80141b.getClass();
        vg1Var.m28316a(ib0.m33321a(adRequestData), item);
    }

    @Nullable
    /* renamed from: a */
    public final synchronized InterfaceC31838xs m33500a(@NotNull C30705k7 adRequestData) {
        vg1<hb0, InterfaceC31838xs> vg1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        vg1Var = this.f80140a;
        this.f80141b.getClass();
        return (InterfaceC31838xs) vg1Var.m28317a(ib0.m33321a(adRequestData));
    }
}
