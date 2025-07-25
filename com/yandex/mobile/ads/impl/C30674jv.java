package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.jv */
/* loaded from: classes8.dex */
public final class C30674jv {
    @NotNull

    /* renamed from: a */
    private final List<C30503hv> f81163a;

    public C30674jv(@NotNull ArrayList adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f81163a = adapters;
    }

    @NotNull
    /* renamed from: a */
    public final List<C30503hv> m32725a() {
        return this.f81163a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C30674jv) && Intrinsics.m17075f(this.f81163a, ((C30674jv) obj).f81163a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81163a.hashCode();
    }

    @NotNull
    public final String toString() {
        List<C30503hv> list = this.f81163a;
        return "DebugPanelAdaptersData(adapters=" + list + ")";
    }
}
