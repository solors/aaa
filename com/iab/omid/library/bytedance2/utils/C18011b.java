package com.iab.omid.library.bytedance2.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.utils.b */
/* loaded from: classes6.dex */
public final class C18011b {
    /* renamed from: a */
    public static String m64344a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m64343b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m64342c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m64341d() {
        JSONObject jSONObject = new JSONObject();
        C18012c.m64330a(jSONObject, "deviceType", m64344a());
        C18012c.m64330a(jSONObject, "osVersion", m64342c());
        C18012c.m64330a(jSONObject, "os", m64343b());
        return jSONObject;
    }
}
