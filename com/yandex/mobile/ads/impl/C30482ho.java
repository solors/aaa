package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ho */
/* loaded from: classes8.dex */
public final class C30482ho implements InterfaceC29979b0<InterfaceC31780x> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC29979b0
    @NotNull
    /* renamed from: a */
    public final InterfaceC31780x mo26293a(@NotNull JSONObject jsonObject) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            return new C30329fo(m27867a);
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
