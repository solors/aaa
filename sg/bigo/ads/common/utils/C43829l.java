package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.common.utils.l */
/* loaded from: classes10.dex */
public final class C43829l {
    @Nullable
    /* renamed from: a */
    public static String m4868a(Map<?, ?> map) {
        if (C43828k.m4873a(map)) {
            return null;
        }
        try {
            return new JSONObject(map).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m4867a(@Nullable Map map, @Nullable Object obj) {
        Object obj2;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return null;
        }
        return obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
    }

    @NonNull
    /* renamed from: a */
    public static Map<String, String> m4869a(String str) {
        JSONObject jSONObject;
        String optString;
        HashMap hashMap = new HashMap();
        if (C43836q.m4837a((CharSequence) str)) {
            return hashMap;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null && (optString = jSONObject.optString(next)) != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }
}
