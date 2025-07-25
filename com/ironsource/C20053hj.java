package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.hj */
/* loaded from: classes6.dex */
public class C20053hj {
    /* renamed from: a */
    private static Object m58128a(Object obj) {
        return obj instanceof JSONObject ? m58124a((JSONObject) obj) : obj instanceof JSONArray ? m58125a((JSONArray) obj) : obj;
    }

    /* renamed from: b */
    public static Object m58122b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray((Collection) Arrays.asList(obj));
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                return ((obj instanceof Enum) || obj.getClass().getPackage().getName().startsWith("java.")) ? obj.toString() : obj;
            }
            return obj;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static List<Object> m58125a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m58128a(jSONArray.get(i)));
            } catch (JSONException e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e.getMessage()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m58121b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static Map<String, Object> m58124a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, m58128a(jSONObject.get(next)));
            } catch (JSONException e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e.getMessage()));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m58126a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), m58122b(entry.getValue()));
                } catch (JSONException e) {
                    C20086i9.m57997d().m58003a(e);
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m58123a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            jSONObject.put(next, jSONObject2.get(next));
                        } catch (JSONException e) {
                            C20086i9.m57997d().m58003a(e);
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m58127a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
