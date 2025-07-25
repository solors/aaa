package com.iab.omid.library.fyber.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.utils.b */
/* loaded from: classes6.dex */
public final class C18131b {
    /* renamed from: a */
    public static String m63886a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m63885b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m63884c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m63883d() {
        JSONObject jSONObject = new JSONObject();
        C18132c.m63872a(jSONObject, "deviceType", m63886a());
        C18132c.m63872a(jSONObject, "osVersion", m63884c());
        C18132c.m63872a(jSONObject, "os", m63885b());
        return jSONObject;
    }
}
