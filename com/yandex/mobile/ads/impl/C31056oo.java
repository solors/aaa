package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C30958no;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.oo */
/* loaded from: classes8.dex */
public final class C31056oo implements InterfaceC31977zf<C30958no> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC31977zf
    /* renamed from: a */
    public final C30958no mo26248a(JSONObject jsonAsset) {
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        if (jsonAsset.has("value") && jsonAsset.isNull("value")) {
            return new C30958no(C30958no.EnumC30959a.f82841c, null);
        }
        C30958no.EnumC30959a enumC30959a = C30958no.EnumC30959a.f82840b;
        String m27867a = wn0.m27867a(jsonAsset, "jsonAsset", "value", "jsonAttribute", "value");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            return new C30958no(enumC30959a, m27867a);
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
