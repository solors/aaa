package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ju */
/* loaded from: classes6.dex */
public class C20170ju {

    /* renamed from: a */
    public static final String f50761a = "errMsg";

    /* renamed from: a */
    public static JSONObject m57779a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
