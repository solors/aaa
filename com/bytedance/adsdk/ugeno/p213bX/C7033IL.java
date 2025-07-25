package com.bytedance.adsdk.ugeno.p213bX;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.C7085eqN;
import com.bytedance.adsdk.ugeno.p213bX.InterfaceC7034bg;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.bX.IL */
/* loaded from: classes3.dex */
public class C7033IL {
    /* renamed from: bg */
    public static String m90221bg(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}")) {
                    InterfaceC7034bg m90062bX = C7085eqN.m90061bg().m90062bX();
                    if (m90062bX == null) {
                        return str;
                    }
                    InterfaceC7034bg.InterfaceC7035bg mo90220bg = m90062bX.mo90220bg(str.substring(2, str.length() - 1));
                    if (mo90220bg == null) {
                        return str;
                    }
                    return (String) mo90220bg.mo90219bg(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
