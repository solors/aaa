package com.iab.omid.library.ironsrc.utils;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.utils.b */
/* loaded from: classes6.dex */
public final class C18256b {
    /* renamed from: a */
    public static String m63403a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m63402b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m63401c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m63400d() {
        JSONObject jSONObject = new JSONObject();
        C18257c.m63389a(jSONObject, "deviceType", m63403a());
        C18257c.m63389a(jSONObject, "osVersion", m63401c());
        C18257c.m63389a(jSONObject, "os", m63402b());
        return jSONObject;
    }
}
