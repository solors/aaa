package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.z8 */
/* loaded from: classes6.dex */
public class C21300z8 {

    /* renamed from: a */
    public static final String f54731a = "SSA_CORE.SDKController.runFunction";

    /* renamed from: a */
    public static String m53863a(C19573a9 c19573a9) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f54731a, c19573a9.m59459b(), m53862a(c19573a9.m59458c()), m53861b(c19573a9));
    }

    /* renamed from: b */
    private static String m53861b(C19573a9 c19573a9) {
        if (c19573a9.m59457d() != null && c19573a9.m59460a() != null) {
            return String.format(", '%1$s', '%2$s'", c19573a9.m59457d(), c19573a9.m59460a());
        }
        return "";
    }

    /* renamed from: a */
    private static String m53862a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? "" : jSONObject.toString();
    }
}
