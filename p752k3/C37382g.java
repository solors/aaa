package p752k3;

import com.helpshift.log.HSLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonUtils.java */
/* renamed from: k3.g */
/* loaded from: classes5.dex */
public class C37382g {
    /* renamed from: a */
    private static Object m18257a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return m18247k((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return m18248j((JSONArray) obj);
        }
        return obj;
    }

    /* renamed from: b */
    public static boolean m18256b(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m18255c(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m18254d(String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (Exception unused) {
                new JSONArray(str);
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: e */
    public static Map<String, Object> m18253e(String str) {
        if (!C37383m.m18236d(str) && m18254d(str)) {
            try {
                return m18247k(new JSONObject(str));
            } catch (JSONException e) {
                HSLogger.m65438e("JsonUtils", "Error in creating map from string json", e);
                return new HashMap();
            }
        }
        return new HashMap();
    }

    /* renamed from: f */
    public static Map<String, String> m18252f(String str) {
        if (!C37383m.m18236d(str) && m18254d(str)) {
            try {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
                return hashMap;
            } catch (Exception e) {
                HSLogger.m65438e("JsonUtils", "Error in creating map from string json", e);
                return new HashMap();
            }
        }
        return new HashMap();
    }

    /* renamed from: g */
    public static JSONArray m18251g(List<JSONObject> list) {
        if (list != null && list.size() != 0) {
            return new JSONArray((Collection) list);
        }
        return new JSONArray();
    }

    /* renamed from: h */
    public static String m18250h(Map<String, Object> map) {
        if (map != null) {
            return new JSONObject(map).toString();
        }
        return "";
    }

    /* renamed from: i */
    public static Map<String, Object> m18249i(String str) throws JSONException {
        return m18247k(new JSONObject(str));
    }

    /* renamed from: j */
    public static List m18248j(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m18257a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static HashMap<String, Object> m18247k(JSONObject jSONObject) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m18257a(jSONObject.get(next)));
        }
        return hashMap;
    }
}
