package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fv */
/* loaded from: classes8.dex */
public final class C30340fv {
    @NotNull

    /* renamed from: a */
    private final List<C32017zu> f79323a;

    public C30340fv(@NotNull ArrayList adUnits) {
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        this.f79323a = adUnits;
    }

    @NotNull
    /* renamed from: a */
    public final List<C32017zu> m34079a() {
        return this.f79323a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C30340fv) && Intrinsics.m17075f(this.f79323a, ((C30340fv) obj).f79323a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f79323a.hashCode();
    }

    @NotNull
    public final String toString() {
        List<C32017zu> list = this.f79323a;
        return "DebugPanelAdUnitsData(adUnits=" + list + ")";
    }
}
