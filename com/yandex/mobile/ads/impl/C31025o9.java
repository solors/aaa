package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.o9 */
/* loaded from: classes8.dex */
public final class C31025o9 {
    @NotNull

    /* renamed from: a */
    private final h12 f83369a;

    public /* synthetic */ C31025o9() {
        this(new h12());
    }

    @NotNull
    /* renamed from: a */
    public final p81 m31134a(@NotNull z01 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        h12 h12Var = this.f83369a;
        List<ot1> m26486h = nativeAd.m26486h();
        h12Var.getClass();
        ArrayList m33723a = h12.m33723a(m26486h, null);
        h12 h12Var2 = this.f83369a;
        List<String> m26488f = nativeAd.m26488f();
        h12Var2.getClass();
        return new p81(nativeAd.m26492b(), m33723a, h12.m33723a(m26488f, null), nativeAd.m26494a(), nativeAd.m26491c());
    }

    public C31025o9(@NotNull h12 trackingDataCreator) {
        Intrinsics.checkNotNullParameter(trackingDataCreator, "trackingDataCreator");
        this.f83369a = trackingDataCreator;
    }
}
