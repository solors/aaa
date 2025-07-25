package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class hk0 {

    /* renamed from: c */
    static final /* synthetic */ KProperty<Object>[] f80088c = {C30452ha.m33588a(hk0.class, "view", "getView()Lcom/monetization/ads/instream/view/ExtendedInstreamAdView;", 0)};
    @NotNull

    /* renamed from: a */
    private final List<k62> f80089a;
    @NotNull

    /* renamed from: b */
    private final xj1 f80090b;

    public hk0(@NotNull h50 instreamAdView, @NotNull List<k62> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f80089a = friendlyOverlays;
        this.f80090b = yj1.m26872a(instreamAdView);
    }

    @NotNull
    /* renamed from: a */
    public final List<k62> m33541a() {
        return this.f80089a;
    }

    @Nullable
    /* renamed from: b */
    public final h50 m33540b() {
        return (h50) this.f80090b.getValue(this, f80088c[0]);
    }
}
