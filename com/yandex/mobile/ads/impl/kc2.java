package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g42;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class kc2 {
    @NotNull

    /* renamed from: a */
    private static final Map<g42.EnumC30362a, String> f81379a;

    static {
        Map<g42.EnumC30362a, String> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(g42.EnumC30362a.f79484d, "Screen is locked"), C38513v.m14532a(g42.EnumC30362a.f79485e, "Asset value %s doesn't match view value"), C38513v.m14532a(g42.EnumC30362a.f79486f, "No ad view"), C38513v.m14532a(g42.EnumC30362a.f79487g, "No valid ads in ad unit"), C38513v.m14532a(g42.EnumC30362a.f79488h, "No visible required assets"), C38513v.m14532a(g42.EnumC30362a.f79489i, "Ad view is not added to hierarchy"), C38513v.m14532a(g42.EnumC30362a.f79490j, "Ad is not visible for percent"), C38513v.m14532a(g42.EnumC30362a.f79491k, "Required asset %s is not visible in ad view"), C38513v.m14532a(g42.EnumC30362a.f79492l, "Required asset %s is not subview of ad view"), C38513v.m14532a(g42.EnumC30362a.f79483c, "Unknown error, that shouldn't happen"), C38513v.m14532a(g42.EnumC30362a.f79493m, "Ad view is hidden"), C38513v.m14532a(g42.EnumC30362a.f79494n, "View is too small"), C38513v.m14532a(g42.EnumC30362a.f79495o, "Visible area of an ad view is too small"));
        f81379a = m17281m;
    }

    @NotNull
    /* renamed from: a */
    public static String m32593a(@NotNull g42 validationResult) {
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        String m33931a = validationResult.m33931a();
        String str = f81379a.get(validationResult.m33929b());
        if (str != null) {
            C37612s0 c37612s0 = C37612s0.f99333a;
            return C31714w0.m28089a(new Object[]{m33931a}, 1, str, "format(...)");
        }
        return "Visibility error";
    }
}
