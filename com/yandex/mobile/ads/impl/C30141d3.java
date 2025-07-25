package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.d3 */
/* loaded from: classes8.dex */
public final class C30141d3 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30355g1 f77863a;

    public C30141d3(@NotNull C31012o1 adActivityListener) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f77863a = adActivityListener;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC31251r1 m35113a(@NotNull C30149d8<?> adResponse, @NotNull ao1 closeVerificationController) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        if (adResponse.m35055n() == EnumC30803lr.f81896f) {
            InterfaceC30355g1 interfaceC30355g1 = this.f77863a;
            return new jn1(interfaceC30355g1, closeVerificationController, new kn1(interfaceC30355g1));
        }
        return new vm0();
    }
}
