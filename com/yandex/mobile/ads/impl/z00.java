package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class z00 implements InterfaceC29979b0<InterfaceC31780x> {
    @NotNull

    /* renamed from: a */
    private final C31246qz f88641a;
    @NotNull

    /* renamed from: b */
    private final m10 f88642b;
    @NotNull

    /* renamed from: c */
    private final C31625v12 f88643c;

    public z00(@NotNull C31246qz designJsonParser, @NotNull m10 divKitDesignParser, @NotNull C31625v12 trackingUrlsParser) {
        Intrinsics.checkNotNullParameter(designJsonParser, "designJsonParser");
        Intrinsics.checkNotNullParameter(divKitDesignParser, "divKitDesignParser");
        Intrinsics.checkNotNullParameter(trackingUrlsParser, "trackingUrlsParser");
        this.f88641a = designJsonParser;
        this.f88642b = divKitDesignParser;
        this.f88643c = trackingUrlsParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29979b0
    @NotNull
    /* renamed from: a */
    public final InterfaceC31780x mo26293a(@NotNull JSONObject jsonObject) throws JSONException, i31 {
        C30815lz c30815lz;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            this.f88643c.getClass();
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONArray jSONArray = jsonObject.getJSONArray("trackingUrls");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                Intrinsics.m17074g(string);
                arrayList.add(string);
            }
            JSONObject optJSONObject = jsonObject.optJSONObject("design");
            h10 h10Var = null;
            if (optJSONObject != null) {
                c30815lz = this.f88641a.m30183a(optJSONObject);
            } else {
                c30815lz = null;
            }
            if (c30815lz != null) {
                h10Var = this.f88642b.m32159a(c30815lz);
            }
            if (h10Var != null) {
                return new x00(m27867a, h10Var, arrayList);
            }
            throw new i31("Native Ad json has not required attributes");
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
