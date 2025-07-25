package com.taurusx.tax.utils;

import android.content.Context;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.p580d.C28218b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* loaded from: classes7.dex */
public class TaurusXHelper {

    /* renamed from: a */
    public static InterfaceC28596a f74286a;

    /* renamed from: com.taurusx.tax.utils.TaurusXHelper$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28596a {
        /* renamed from: a */
        default boolean m37817a() {
            return false;
        }
    }

    static {
        C28162a.f73047a.m23824a(new byte[]{-4, -11, -35, -26, -35, -25, -16, -36, -51, -8, -40, -15, -38}, new byte[]{-88, -108});
    }

    public static boolean isDebugMode() {
        InterfaceC28596a interfaceC28596a = f74286a;
        if (interfaceC28596a != null) {
            return interfaceC28596a.m37817a();
        }
        return false;
    }

    public static void reportCustomEvent(Context context, String str, String str2) {
        boolean z;
        String str3;
        JSONArray m38395v = C28218b.m38395v();
        int i = 0;
        while (true) {
            if (i < m38395v.length()) {
                try {
                    if (str.equalsIgnoreCase(m38395v.getString(i))) {
                        z = true;
                        break;
                    }
                    i++;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            try {
                String m23824a = C28162a.f73047a.m23824a(new byte[]{-45, -40, -62, -34, -41, -38, -63, -63, -35, -58}, new byte[]{-78, -88});
                try {
                    str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str3 = "";
                }
                jSONObject.put(m23824a, str3);
                StringFogImpl stringFogImpl = C28162a.f73047a;
                jSONObject.put(stringFogImpl.m23824a(new byte[]{-57, -34, -45}, new byte[]{-73, -73}), str2);
                jSONObject.put(stringFogImpl.m23824a(new byte[]{-115, 71, -115, 95, -100, 110, -122, 80, -123, 84}, new byte[]{-24, 49}), str);
                jSONObject.put(stringFogImpl.m23824a(new byte[]{-21, -45, -21, -53, -6, -6, -6, -52, -29, -64}, new byte[]{-114, -91}), System.currentTimeMillis());
                C28206a.m38470e().f73193i.m38312a(jSONObject);
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public static void setOnTaurusXHelperListener(InterfaceC28596a interfaceC28596a) {
        f74286a = interfaceC28596a;
    }
}
