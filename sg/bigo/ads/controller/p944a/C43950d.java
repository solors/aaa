package sg.bigo.ads.controller.p944a;

import android.text.TextUtils;
import android.util.Patterns;
import androidx.annotation.Nullable;
import com.p552ot.pubsub.p553a.C26484a;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.controller.a.d */
/* loaded from: classes10.dex */
public final class C43950d {
    /* renamed from: a */
    public static String m4527a(String str, String str2) {
        try {
            URL url = new URL(str);
            StringBuilder sb2 = new StringBuilder(str);
            String authority = url.getAuthority();
            int lastIndexOf = str.lastIndexOf(authority);
            if (lastIndexOf >= 0) {
                sb2.replace(lastIndexOf, authority.length() + lastIndexOf, str2);
            }
            return sb2.toString();
        } catch (Exception e) {
            C43782a.m5009a(0, "AntiBanUtils", "replaceHost error： " + e.getMessage());
            return str;
        }
    }

    @Nullable
    /* renamed from: b */
    public static Map<String, String> m4526b(String str) {
        JSONArray jSONArray;
        HashMap hashMap = new HashMap();
        if (C43836q.m4837a((CharSequence) str)) {
            return hashMap;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return hashMap;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("country", "all");
                String optString2 = optJSONObject.optString(C26484a.f69188E, "");
                if (m4528a(optString2)) {
                    hashMap.put(optString, optString2);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m4528a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            return Patterns.DOMAIN_NAME.matcher(str).matches();
        }
        C43782a.m5010a(0, 3, "AntiBanUtils", "\"" + str + "\" is invalid host");
        return false;
    }
}
