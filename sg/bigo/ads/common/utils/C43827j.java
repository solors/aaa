package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.common.utils.j */
/* loaded from: classes10.dex */
public final class C43827j {
    @Nullable
    /* renamed from: a */
    public static Integer m4881a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((int) Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static Float m4878b(Object obj) {
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            try {
                return Float.valueOf((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Map<String, String> m4880a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m4879a(@NonNull JSONObject jSONObject, @Nullable String str, @Nullable Object obj) {
        try {
            jSONObject.putOpt(str, obj);
        } catch (JSONException unused) {
        }
    }
}
