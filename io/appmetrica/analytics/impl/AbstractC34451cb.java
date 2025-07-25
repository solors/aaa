package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.cb */
/* loaded from: classes9.dex */
public abstract class AbstractC34451cb {
    /* renamed from: a */
    public static String m21882a(HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        return hashMap.isEmpty() ? "" : m21877b(hashMap);
    }

    /* renamed from: b */
    public static String m21877b(Map map) {
        if (AbstractC34679kn.m21469a(map)) {
            return null;
        }
        return new JSONObject(map).toString();
    }

    /* renamed from: c */
    public static HashMap m21876c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                HashMap hashMap = new HashMap();
                if (!JSONObject.NULL.equals(jSONObject)) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject.optString(next));
                    }
                }
                return hashMap;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static HashMap m21875d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        if (!JSONObject.NULL.equals(jSONObject)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static ScreenInfo m21874e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new ScreenInfo(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", 0.0d));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static HashMap m21883a(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new HashMap();
        }
        return m21876c(str);
    }

    /* renamed from: b */
    public static ArrayList m21878b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(jSONArray.getString(i));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Integer m21879a(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return num;
        }
    }

    /* renamed from: a */
    public static ArrayList m21880a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m21884a(ScreenInfo screenInfo) {
        JSONObject jSONObject;
        if (screenInfo == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", screenInfo.getWidth()).put("height", screenInfo.getHeight()).put("dpi", screenInfo.getDpi()).put("scaleFactor", screenInfo.getScaleFactor());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m21881a(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                JSONArray jSONArray = AbstractC34679kn.m21470a((Collection) list) ? null : new JSONArray((Collection) list);
                if (jSONArray != null) {
                    jSONObject.put((String) entry.getKey(), jSONArray.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
