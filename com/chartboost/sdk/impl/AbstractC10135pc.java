package com.chartboost.sdk.impl;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.pc */
/* loaded from: classes3.dex */
public abstract class AbstractC10135pc {
    /* renamed from: a */
    public static String m80800a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m80799b() {
        return "Android";
    }

    /* renamed from: c */
    public static String m80798c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m80797d() {
        JSONObject jSONObject = new JSONObject();
        AbstractC10359xc.m80049a(jSONObject, "deviceType", m80800a());
        AbstractC10359xc.m80049a(jSONObject, "osVersion", m80798c());
        AbstractC10359xc.m80049a(jSONObject, "os", m80799b());
        return jSONObject;
    }
}
