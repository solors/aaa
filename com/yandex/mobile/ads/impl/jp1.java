package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jp1 implements InterfaceC31256r4 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f81044a;

    public jp1(@NotNull C30149d8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f81044a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31256r4
    /* renamed from: a */
    public final InterfaceC31080p1 mo28217a() {
        return new lp1();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31256r4
    /* renamed from: b */
    public final InterfaceC30449h8 mo28216b() {
        return new kp1(this.f81044a);
    }
}
