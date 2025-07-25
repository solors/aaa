package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zr0 {
    @NotNull

    /* renamed from: a */
    private final C30578is f89084a;

    public zr0(@NotNull C30578is nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f89084a = nativeAdAssets;
    }

    @Nullable
    /* renamed from: a */
    public final Float m26010a() {
        C31062os m33138i = this.f89084a.m33138i();
        C30745ks m33139h = this.f89084a.m33139h();
        if (m33138i != null) {
            return Float.valueOf(m33138i.m30932a());
        }
        if (m33139h != null && m33139h.m32447d() > 0 && m33139h.m32449b() > 0) {
            return Float.valueOf(m33139h.m32447d() / m33139h.m32449b());
        }
        return null;
    }
}
