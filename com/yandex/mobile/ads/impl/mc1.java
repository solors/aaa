package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.MediationData;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class mc1 {
    @Nullable

    /* renamed from: a */
    private final String f82140a;
    @NotNull

    /* renamed from: b */
    private final MediationData f82141b;

    public mc1(@Nullable String str, @NotNull MediationData mediationData) {
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f82140a = str;
        this.f82141b = mediationData;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m32047a() {
        Map m17291g;
        Map<String, String> m17276r;
        String str = this.f82140a;
        if (str != null && str.length() != 0) {
            Map<String, String> m44559d = this.f82141b.m44559d();
            m17291g = MapsJVM.m17291g(C38513v.m14532a("adf-resp_time", this.f82140a));
            m17276r = C37559r0.m17276r(m44559d, m17291g);
            return m17276r;
        }
        return this.f82141b.m44559d();
    }
}
