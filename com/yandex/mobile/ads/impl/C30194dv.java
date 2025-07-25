package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dv */
/* loaded from: classes8.dex */
public final class C30194dv {
    @NotNull

    /* renamed from: a */
    private final List<C30122cv> f78250a;

    public C30194dv(@NotNull List<C30122cv> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f78250a = adapters;
    }

    @NotNull
    /* renamed from: a */
    public final List<C30122cv> m34847a() {
        return this.f78250a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C30194dv) && Intrinsics.m17075f(this.f78250a, ((C30194dv) obj).f78250a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f78250a.hashCode();
    }

    @NotNull
    public final String toString() {
        List<C30122cv> list = this.f78250a;
        return "DebugPanelAdUnitMediationData(adapters=" + list + ")";
    }
}
