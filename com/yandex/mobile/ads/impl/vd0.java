package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vd0 implements InterfaceC30699k4 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<String> f86702a;

    public vd0(@NotNull C30149d8<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f86702a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30699k4
    @Nullable
    /* renamed from: a */
    public final String mo28365a() {
        return this.f86702a.m35065d();
    }
}
