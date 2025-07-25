package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ba1 implements InterfaceC31977zf<String> {
    @NotNull

    /* renamed from: a */
    private final in1 f77244a;

    public ba1(@NotNull in1 reviewCountFormatter) {
        Intrinsics.checkNotNullParameter(reviewCountFormatter, "reviewCountFormatter");
        this.f77244a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31977zf
    /* renamed from: a */
    public final String mo26248a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String m27867a = wn0.m27867a(jsonAsset, "jsonAsset", "name", "jsonAttribute", "name");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
            Intrinsics.checkNotNullParameter("value", "jsonAttribute");
            String string = jsonAsset.getString("value");
            if (string != null && string.length() != 0 && !Intrinsics.m17075f(string, "null")) {
                Intrinsics.m17074g(string);
                if (Intrinsics.m17075f("review_count", m27867a)) {
                    return this.f77244a.m33161a(string);
                }
                return string;
            }
            throw new i31("Native Ad json has not required attributes");
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
