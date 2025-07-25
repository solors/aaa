package com.iab.omid.library.corpmailru.p395d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.d.a */
/* loaded from: classes6.dex */
public final class C18061a {
    /* renamed from: a */
    public static String m64146a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m64145b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m64144c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m64143d() {
        JSONObject jSONObject = new JSONObject();
        C18062b.m64135a(jSONObject, "deviceType", m64146a());
        C18062b.m64135a(jSONObject, "osVersion", m64145b());
        C18062b.m64135a(jSONObject, "os", m64144c());
        return jSONObject;
    }
}
