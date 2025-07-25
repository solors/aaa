package p993u4;

import android.os.Bundle;
import com.ironsource.C21114v8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonUtil.java */
/* renamed from: u4.k */
/* loaded from: classes6.dex */
public class C44432k {

    /* renamed from: a */
    public static final String f116607a = System.getProperty("line.separator");

    /* renamed from: a */
    public static JSONObject m3000a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !bundle.isEmpty()) {
            try {
                for (String str : bundle.keySet()) {
                    if (str != null) {
                        jSONObject.put(str, bundle.get(str));
                    }
                }
            } catch (JSONException e) {
                C44433l.m2992f(e);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m2999b(String str, String str2, String str3) {
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith(C21114v8.C21123i.f54137d)) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        m2998c(str, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        String str4 = f116607a;
        sb2.append(str4);
        sb2.append(str2);
        for (String str5 : sb2.toString().split(str4)) {
            C44433l.m2997a(str, "║ " + str5);
        }
        m2998c(str, false);
    }

    /* renamed from: c */
    private static void m2998c(String str, boolean z) {
        if (z) {
            C44433l.m2997a(str, "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            C44433l.m2997a(str, "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }
}
