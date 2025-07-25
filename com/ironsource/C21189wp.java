package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.wp */
/* loaded from: classes6.dex */
public class C21189wp {

    /* renamed from: a */
    private JSONObject f54347a;

    public C21189wp() {
        this.f54347a = new JSONObject();
    }

    /* renamed from: b */
    public static Object m54313b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (obj instanceof Iterable) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Iterable) obj) {
                    jSONArray.put(obj2);
                }
                return jSONArray;
            }
            return obj;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            if (obj3 != null) {
                jSONObject.put(obj3.toString(), m54313b(map.get(obj3)));
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    private void m54306f(String str) {
        try {
            this.f54347a = new JSONObject(str);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            this.f54347a = new JSONObject();
        }
    }

    /* renamed from: a */
    public int m54318a(String str, int i) {
        return this.f54347a.optInt(str, i);
    }

    /* renamed from: c */
    public boolean m54309c(String str) {
        return this.f54347a.optBoolean(str);
    }

    /* renamed from: d */
    public String m54308d(String str) {
        return this.f54347a.optString(str, null);
    }

    /* renamed from: e */
    public boolean m54307e(String str) {
        return m54321a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f54347a;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public C21189wp(String str) {
        m54306f(str);
    }

    /* renamed from: a */
    private Object m54320a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m54310b((JSONObject) obj) : obj instanceof JSONArray ? m54315a((JSONArray) obj) : obj;
    }

    /* renamed from: b */
    public Object m54312b(String str) {
        try {
            return m54321a().get(str);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            return null;
        }
    }

    /* renamed from: b */
    private Map<String, Object> m54310b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m54320a(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public String m54317a(String str, String str2) {
        return this.f54347a.optString(str, str2);
    }

    /* renamed from: a */
    public List m54315a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m54320a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m54311b(String str, String str2) {
        try {
            this.f54347a.put(str, str2);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
    }

    /* renamed from: a */
    public JSONObject m54321a() {
        return this.f54347a;
    }

    /* renamed from: a */
    public void m54316a(String str, JSONObject jSONObject) {
        try {
            this.f54347a.put(str, jSONObject);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
    }

    /* renamed from: a */
    public boolean m54319a(String str) {
        return m54321a().has(str);
    }

    /* renamed from: a */
    public static boolean m54314a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }
}
