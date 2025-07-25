package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.AbstractC10396z1;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.c1 */
/* loaded from: classes3.dex */
public class C9753c1 {

    /* renamed from: a */
    public final String f21761a;

    /* renamed from: b */
    public final String f21762b;

    /* renamed from: c */
    public final String f21763c;

    public C9753c1(String str, String str2, String str3) {
        this.f21761a = str;
        this.f21762b = str2;
        this.f21763c = str3;
    }

    /* renamed from: a */
    public static Map m81941a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            C9763c7.m81923a("deserializeAssets assetsJson is null", null);
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                hashMap.put(next2, new C9753c1(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Map m81938b(JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("templates".equals(next)) {
                    hashMap.putAll(m81940a(jSONObject2, i));
                } else {
                    hashMap.putAll(m81939a(jSONObject2, next));
                }
            }
        } catch (JSONException e) {
            C9763c7.m81920b("v2PrefetchToAssets: " + e, null);
        }
        return hashMap;
    }

    public String toString() {
        return "Asset{directory='" + this.f21761a + "', filename='" + this.f21762b + "', url='" + this.f21763c + "'}";
    }

    /* renamed from: a */
    public File m81943a(File file) {
        if (this.f21761a != null && this.f21762b != null) {
            String str = this.f21761a + RemoteSettings.FORWARD_SLASH_STRING + this.f21762b;
            try {
                return new File(file, str);
            } catch (Exception e) {
                C9763c7.m81923a("Cannot create file for path: " + str + ". Error: " + e, null);
                return null;
            }
        }
        C9763c7.m81923a("Cannot create file. Directory or filename is null.", null);
        return null;
    }

    /* renamed from: a */
    public String m81944a() {
        return this.f21763c;
    }

    /* renamed from: a */
    public static Map m81939a(JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("name");
                hashMap.put(string, new C9753c1(str, string, jSONObject2.getString("value")));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map m81940a(JSONObject jSONObject, int i) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int min = Math.min(i, optJSONArray.length());
            for (int i2 = 0; i2 < min; i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                for (Map.Entry entry : m81941a(jSONObject2 != null ? m81942a(jSONObject2.getJSONArray("elements")) : null).entrySet()) {
                    C9753c1 c9753c1 = (C9753c1) entry.getValue();
                    hashMap.put(c9753c1.f21762b, c9753c1);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m81942a(JSONArray jSONArray) {
        JSONObject m79814a = AbstractC10396z1.m79814a(new AbstractC10396z1.C10397a[0]);
        if (jSONArray == null) {
            return m79814a;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("type");
            String optString3 = jSONObject.optString("value");
            String optString4 = jSONObject.optString("param");
            if (!"param".equals(optString2) && optString4.isEmpty()) {
                JSONObject optJSONObject = m79814a.optJSONObject(optString2);
                if (optJSONObject == null) {
                    optJSONObject = AbstractC10396z1.m79814a(new AbstractC10396z1.C10397a[0]);
                    m79814a.put(optString2, optJSONObject);
                }
                optJSONObject.put("html".equals(optString2) ? "body" : optString, AbstractC10396z1.m79814a(AbstractC10396z1.m79817a("filename", optString), AbstractC10396z1.m79817a("url", optString3)));
            }
        }
        return m79814a;
    }
}
