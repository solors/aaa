package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jn1 implements InterfaceC31251r1 {
    @NotNull

    /* renamed from: a */
    private final ao1 f81020a;
    @NotNull

    /* renamed from: b */
    private final kn1 f81021b;

    public jn1(@NotNull InterfaceC30355g1 adActivityListener, @NotNull ao1 closeVerificationController, @NotNull kn1 rewardController) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(rewardController, "rewardController");
        this.f81020a = closeVerificationController;
        this.f81021b = rewardController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31251r1
    /* renamed from: b */
    public final void mo28257b() {
        this.f81020a.m35815a();
        this.f81021b.m32475a();
    }
}
