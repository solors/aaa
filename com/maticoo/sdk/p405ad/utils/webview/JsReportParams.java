package com.maticoo.sdk.p405ad.utils.webview;

import com.maticoo.sdk.utils.JSONUtil;
import org.json.JSONObject;

/* renamed from: com.maticoo.sdk.ad.utils.webview.JsReportParams */
/* loaded from: classes6.dex */
public class JsReportParams {
    public static JSONObject buildEventParams(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.put(jSONObject, "type", str);
        return jSONObject;
    }
}
