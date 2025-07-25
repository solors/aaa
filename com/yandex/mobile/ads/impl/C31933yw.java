package com.yandex.mobile.ads.impl;

import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text._Strings;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yw */
/* loaded from: classes8.dex */
public final class C31933yw {
    @NotNull

    /* renamed from: b */
    private static final String f88576b = DtbConstants.HTTPS + "mobile.yandexadexchange.net";
    @NotNull

    /* renamed from: a */
    private final f30 f88577a;

    public C31933yw(@NotNull f30 environmentConfiguration) {
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        this.f88577a = environmentConfiguration;
    }

    @NotNull
    /* renamed from: a */
    public final String m26559a() {
        Character m16535k1;
        StringBuilder sb2 = new StringBuilder();
        String m34379a = this.f88577a.m34379a();
        if (m34379a == null) {
            m34379a = f88576b;
        }
        sb2.append(m34379a);
        m16535k1 = _Strings.m16535k1(sb2);
        if (m16535k1 == null || m16535k1.charValue() != '/') {
            sb2.append('/');
        }
        sb2.append("v1/debugpanel");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
