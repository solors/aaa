package com.ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.dd */
/* loaded from: classes6.dex */
public class C19765dd {

    /* renamed from: a */
    private static C19765dd f49745a = new C19765dd();

    /* renamed from: a */
    public static C19765dd m58952a() {
        return f49745a;
    }

    /* renamed from: b */
    public static JSONObject m58947b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static HashMap<String, Object> m58950a(ConcurrentHashMap<String, Object> concurrentHashMap) throws JSONException {
        Object m58948a;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                m58948a = m58948a((JSONObject) entry.getValue());
            } else if (entry.getValue() instanceof JSONArray) {
                m58948a = m58949a((JSONArray) entry.getValue());
            } else if (entry.getValue() instanceof Map) {
                m58948a = m58951a((Map) entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put(entry.getKey(), m58948a);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, Object> m58951a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, map.get(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONArray m58949a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m58948a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }
}
