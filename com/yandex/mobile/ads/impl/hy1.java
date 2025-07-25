package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class hy1 implements InterfaceC31977zf<String> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC31977zf
    /* renamed from: a */
    public final String mo26248a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        String m27867a = wn0.m27867a(jsonAsset, "jsonAsset", "value", "jsonAttribute", "value");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            return m27867a;
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
