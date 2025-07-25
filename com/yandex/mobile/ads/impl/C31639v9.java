package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.v9 */
/* loaded from: classes8.dex */
public final class C31639v9 {
    @NotNull

    /* renamed from: a */
    private final h12 f86602a;

    public /* synthetic */ C31639v9() {
        this(new h12());
    }

    @NotNull
    /* renamed from: a */
    public final p81 m28487a(@NotNull l11 nativeAdBlock) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        n31 m32373c = nativeAdBlock.m32373c();
        List<C31034of<?>> m31675b = m32373c.m31675b();
        h12 h12Var = this.f86602a;
        List<ot1> m31668i = m32373c.m31668i();
        h12Var.getClass();
        ArrayList m33723a = h12.m33723a(null, m31668i);
        h12 h12Var2 = this.f86602a;
        List<String> m31670g = m32373c.m31670g();
        h12Var2.getClass();
        return new p81(m31675b, m33723a, h12.m33723a(null, m31670g), "ad_unit", m32373c.m31673d());
    }

    public C31639v9(@NotNull h12 trackingDataCreator) {
        Intrinsics.checkNotNullParameter(trackingDataCreator, "trackingDataCreator");
        this.f86602a = trackingDataCreator;
    }
}
