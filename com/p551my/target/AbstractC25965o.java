package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p551my.target.C26084s5;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.o */
/* loaded from: classes7.dex */
public abstract class AbstractC25965o {
    /* renamed from: a */
    public static boolean m43304a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("version");
            AbstractC25846ja.m43680a("AdResponseParser: JSON version " + string);
            int indexOf = string.indexOf(".");
            if (indexOf > 0) {
                if (Integer.parseInt(string.substring(0, indexOf), 10) == 2) {
                    return true;
                }
            }
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("AdResponseParser Error: Check version failed - " + th.getMessage());
        }
        return false;
    }

    /* renamed from: b */
    public static void m43303b(JSONObject jSONObject) {
        if (!AbstractC25846ja.f67064a && jSONObject.optBoolean("sdk_debug_mode", false)) {
            AbstractC25846ja.f67064a = true;
        }
    }

    public static boolean isVast(@NonNull String str) {
        String trim = str.trim();
        if (!trim.startsWith("<VAST") && !trim.startsWith("<?xml")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public abstract AbstractC26019q mo42557a(String str, C26073s c26073s, AbstractC26019q abstractC26019q, C25832j c25832j, C26084s5.C26085a c26085a, C26084s5 c26084s5, List list, C25923n c25923n, Context context);

    /* renamed from: a */
    public static JSONObject m43306a(String str, C26084s5.C26085a c26085a, C26084s5 c26084s5, List list, C25923n c25923n) {
        C25902m c25902m;
        String trim = str != null ? str.trim() : null;
        if (trim == null || "".equals(trim)) {
            AbstractC25846ja.m43680a("AdResponseParser: Parsing ad response: empty data");
            c25902m = C25902m.f67228j;
        } else {
            AbstractC25846ja.m43680a("AdResponseParser: Converting to JSON...");
            try {
                JSONObject jSONObject = new JSONObject(trim);
                m43303b(jSONObject);
                if (!m43304a(jSONObject)) {
                    AbstractC25846ja.m43680a("AdResponseParser: Invalid json version");
                    c25923n.m43428a(C25902m.f67229k);
                    return null;
                }
                m43305a(list, jSONObject);
                boolean optBoolean = jSONObject.optBoolean("sdk_ms", false);
                c26085a.m42904a(optBoolean);
                c26084s5.m42910a(optBoolean);
                AbstractC25846ja.m43680a("AdResponseParser: Done");
                return jSONObject;
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("AdResponseParser: Parsing ad response error: " + th.getMessage());
                c25902m = C25902m.f67229k;
            }
        }
        c25923n.m43428a(c25902m);
        return null;
    }

    /* renamed from: a */
    public static void m43305a(List list, JSONObject jSONObject) {
        if (list == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("hosts");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i, null);
                    if (TextUtils.isEmpty(optString)) {
                        AbstractC25846ja.m43680a("AdResponseParser: Invalid host-string at position " + i);
                    } else {
                        list.add(optString);
                    }
                }
            }
        } catch (Throwable unused) {
            AbstractC25846ja.m43680a("AdResponseParser Error: Exception while handling hosts");
        }
    }

    /* renamed from: a */
    public static boolean m43307a(String str) {
        String str2;
        String str3;
        if (str == null) {
            str2 = "AdResponseParser: Null data";
        } else {
            String trim = str.trim();
            if (trim.length() != 0) {
                if (isVast(trim)) {
                    str3 = "AdResponseParser: Vast is received";
                } else if (trim.startsWith("{") && trim.endsWith("}")) {
                    str3 = "AdResponseParser: JSON is received";
                } else {
                    str2 = "AdResponseParser: Unsupported data is received";
                }
                AbstractC25846ja.m43680a(str3);
                return true;
            }
            str2 = "AdResponseParser: Empty data";
        }
        AbstractC25846ja.m43680a(str2);
        return false;
    }
}
