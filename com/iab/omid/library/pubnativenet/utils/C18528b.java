package com.iab.omid.library.pubnativenet.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.utils.b */
/* loaded from: classes6.dex */
public final class C18528b {
    /* renamed from: a */
    public static String m62398a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m62397b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m62396c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m62395d() {
        JSONObject jSONObject = new JSONObject();
        C18529c.m62384a(jSONObject, "deviceType", m62398a());
        C18529c.m62384a(jSONObject, "osVersion", m62396c());
        C18529c.m62384a(jSONObject, "os", m62397b());
        return jSONObject;
    }
}
