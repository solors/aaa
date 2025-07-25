package com.applovin.impl;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.i3 */
/* loaded from: classes2.dex */
abstract class AbstractC4563i3 {
    /* renamed from: a */
    private static String m98554a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: b */
    private static String m98552b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    /* renamed from: a */
    public static byte[] m98553a(byte[] bArr) {
        return AbstractC5863xp.f12151a >= 27 ? bArr : AbstractC5863xp.m92971c(m98554a(AbstractC5863xp.m93007a(bArr)));
    }

    /* renamed from: b */
    public static byte[] m98551b(byte[] bArr) {
        if (AbstractC5863xp.f12151a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(AbstractC5863xp.m93007a(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb2.append("{\"k\":\"");
                sb2.append(m98552b(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m98552b(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return AbstractC5863xp.m92971c(sb2.toString());
        } catch (JSONException e) {
            AbstractC5063oc.m96808a("ClearKeyUtil", "Failed to adjust response data: " + AbstractC5863xp.m93007a(bArr), e);
            return bArr;
        }
    }
}
