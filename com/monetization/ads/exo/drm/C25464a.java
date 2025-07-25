package com.monetization.ads.exo.drm;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.yandex.mobile.ads.impl.gq0;
import com.yandex.mobile.ads.impl.y32;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.monetization.ads.exo.drm.a */
/* loaded from: classes7.dex */
final class C25464a {
    /* renamed from: a */
    public static byte[] m44517a(byte[] bArr) {
        if (y32.f88010a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(y32.m27071a(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb2.append("{\"k\":\"");
                sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                sb2.append("\",\"kid\":\"");
                sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return y32.m27052c(sb2.toString());
        } catch (JSONException e) {
            gq0.m33797a("ClearKeyUtil", "Failed to adjust response data: ".concat(y32.m27071a(bArr)), e);
            return bArr;
        }
    }
}
