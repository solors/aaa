package com.iab.omid.library.taurusx.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.utils.b */
/* loaded from: classes6.dex */
public final class C18650b {
    /* renamed from: a */
    public static String m61903a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m61902b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m61901c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m61900d() {
        JSONObject jSONObject = new JSONObject();
        C18651c.m61889a(jSONObject, "deviceType", m61903a());
        C18651c.m61889a(jSONObject, "osVersion", m61901c());
        C18651c.m61889a(jSONObject, "os", m61902b());
        return jSONObject;
    }
}
