package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qi1 implements InterfaceC30068c3 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31251r1 f84375a;

    public qi1(@NotNull InterfaceC31251r1 adBlockCompleteListener) {
        Intrinsics.checkNotNullParameter(adBlockCompleteListener, "adBlockCompleteListener");
        this.f84375a = adBlockCompleteListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30068c3
    /* renamed from: b */
    public final void mo30350b() {
        this.f84375a.mo28257b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30068c3
    /* renamed from: a */
    public final void mo30351a() {
    }
}
