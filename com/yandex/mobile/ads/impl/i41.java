package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class i41 {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f80317a;

    public i41(@NotNull C30359g3 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f80317a = adConfiguration;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m33370a() {
        Map<String, Object> m17284j;
        List m17553Z0;
        Map<String, Object> m17291g;
        List<String> m33953m = this.f80317a.m33953m();
        if (!(!m33953m.isEmpty())) {
            m33953m = null;
        }
        if (m33953m != null) {
            m17553Z0 = _Collections.m17553Z0(m33953m);
            m17291g = MapsJVM.m17291g(C38513v.m14532a("image_sizes", m17553Z0));
            if (m17291g != null) {
                return m17291g;
            }
        }
        m17284j = C37559r0.m17284j();
        return m17284j;
    }
}
