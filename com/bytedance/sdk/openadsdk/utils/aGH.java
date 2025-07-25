package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class aGH {

    /* renamed from: bg */
    private static final Map<String, aGH> f21279bg = new HashMap();

    /* renamed from: IL */
    private SharedPreferences f21280IL;

    private aGH(String str, Context context) {
        if (context != null) {
            this.f21280IL = context.getSharedPreferences(str, 0);
        }
    }

    /* renamed from: bg */
    public static aGH m82504bg(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, aGH> map = f21279bg;
        aGH agh = map.get(str);
        if (agh == null) {
            aGH agh2 = new aGH(str, context);
            map.put(str, agh2);
            return agh2;
        }
        return agh;
    }

    /* renamed from: bg */
    public String m82503bg(String str, String str2) {
        try {
            return this.f21280IL.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: bg */
    public void m82505bg(String str) {
        try {
            this.f21280IL.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
