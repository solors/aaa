package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class ClearKeyUtil {
    private ClearKeyUtil() {
    }

    /* renamed from: a */
    private static String m74876a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        if (Util.SDK_INT >= 27) {
            return bArr;
        }
        return Util.getUtf8Bytes(m74876a(Util.fromUtf8Bytes(bArr)));
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        if (Util.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(Util.fromUtf8Bytes(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb2.append("{\"k\":\"");
                sb2.append(m74875b(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m74875b(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return Util.getUtf8Bytes(sb2.toString());
        } catch (JSONException e) {
            Log.m72605e("ClearKeyUtil", "Failed to adjust response data: " + Util.fromUtf8Bytes(bArr), e);
            return bArr;
        }
    }

    /* renamed from: b */
    private static String m74875b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
