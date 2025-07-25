package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.rn */
/* loaded from: classes8.dex */
public final class C31300rn {
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f84828a = new LinkedHashMap();

    /* renamed from: a */
    public final void m29981a(int i, @NotNull C31223qn clickConnector) {
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        this.f84828a.put(Integer.valueOf(i), clickConnector);
    }

    @NotNull
    /* renamed from: a */
    public final LinkedHashMap m29982a() {
        return this.f84828a;
    }
}
