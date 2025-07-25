package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.za */
/* loaded from: classes8.dex */
public final class C31966za implements InterfaceC29979b0<InterfaceC31780x> {
    @NotNull

    /* renamed from: a */
    private final l32 f88797a;
    @NotNull

    /* renamed from: b */
    private final C31625v12 f88798b;

    public C31966za(@NotNull l32 urlJsonParser, @NotNull C31625v12 trackingUrlsParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(trackingUrlsParser, "trackingUrlsParser");
        this.f88797a = urlJsonParser;
        this.f88798b = trackingUrlsParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29979b0
    @NotNull
    /* renamed from: a */
    public final InterfaceC31780x mo26293a(@NotNull JSONObject jsonObject) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            this.f88797a.getClass();
            String m32360a = l32.m32360a("url", jsonObject);
            String m26827a = yn0.m26827a("optOutUrl", jsonObject);
            if (m26827a == null) {
                m26827a = "";
            }
            this.f88798b.getClass();
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONArray jSONArray = jsonObject.getJSONArray("trackingUrls");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                Intrinsics.m17074g(string);
                arrayList.add(string);
            }
            return new C31806xa(m27867a, m32360a, m26827a, arrayList);
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
