package com.p552ot.pubsub.util;

import android.text.TextUtils;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.p555c.C26524d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.util.m */
/* loaded from: classes7.dex */
public class C26591m {

    /* renamed from: a */
    public static final String f69793a = "onetrack_";

    /* renamed from: b */
    public static final String f69794b = "ot_";

    /* renamed from: c */
    private static final String f69795c = "ParamUtil";

    /* renamed from: com.ot.pubsub.util.m$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26592a {
        /* renamed from: a */
        boolean mo41021a(Object obj);
    }

    /* renamed from: a */
    public static JSONObject m41028a(Map<String, Object> map, boolean z) {
        return m41029a(map, new C26593n(z));
    }

    /* renamed from: b */
    private static boolean m41025b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m41022d(Object obj) {
        if (obj instanceof Number) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static JSONObject m41030a(Map<String, Object> map) {
        return m41029a(map, new C26594o());
    }

    /* renamed from: c */
    private static boolean m41023c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (i == 0 && Character.isDigit(c)) {
                return false;
            }
            if (c != '_' && !Character.isDigit(c) && ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static JSONObject m41029a(Map<String, Object> map, InterfaceC26592a interfaceC26592a) {
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!interfaceC26592a.mo41021a(value)) {
                    if (C26586j.f69734a) {
                        m41032a(f69795c, entry.getKey());
                    }
                } else if (m41026b(value)) {
                    jSONObject.put(key, value);
                } else if (value instanceof List) {
                    jSONObject.put(key, m41031a((List) value));
                }
            }
        } catch (Exception e) {
            C26586j.m41074b(f69795c, "checkParam error:" + e.toString());
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static boolean m41026b(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String);
    }

    /* renamed from: a */
    public static JSONArray m41031a(List list) throws JSONException {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (m41026b(obj)) {
                jSONArray.put(obj);
            } else if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                boolean z = false;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof String) && m41026b(value)) {
                        jSONObject.put((String) key, value);
                        z = true;
                    }
                }
                if (z) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m41032a(String str, String str2) {
        C26586j.m41074b(str, "key is " + str2 + ", the param value is invalid，please change the parameter type to string ,numeric, boolean！");
    }

    /* renamed from: a */
    public static JSONObject m41027a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject != null || jSONObject2 == null) {
            if (jSONObject == null || jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                    return jSONObject2;
                } catch (Exception e) {
                    C26586j.m41074b(f69795c, "merge error：" + e.toString());
                    return jSONObject;
                }
            }
            return jSONObject;
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static boolean m41034a(Object obj) {
        return m41026b(obj) || (obj instanceof List);
    }

    /* renamed from: a */
    public static boolean m41033a(String str) {
        if (m41023c(str)) {
            String lowerCase = str.toLowerCase();
            return (lowerCase.startsWith(f69793a) || lowerCase.startsWith(f69794b)) ? false : true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m41035a(Configuration configuration) {
        StringBuilder sb2 = new StringBuilder();
        String appId = configuration.getAppId();
        if (!TextUtils.isEmpty(appId)) {
            sb2.append(appId);
        }
        return C26524d.m41329h(sb2.toString());
    }
}
