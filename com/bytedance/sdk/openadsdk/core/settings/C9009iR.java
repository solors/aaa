package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.iR */
/* loaded from: classes3.dex */
public class C9009iR {

    /* renamed from: bX */
    public String f20103bX;
    public boolean eqN;
    public boolean ldr;

    /* renamed from: zx */
    public boolean f20104zx;

    /* renamed from: bg */
    public static final C9009iR f20102bg = new C9009iR(null);

    /* renamed from: IL */
    public static String f20101IL = "";

    public C9009iR(String str) {
        this.f20103bX = "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js";
        this.eqN = true;
        this.f20104zx = true;
        this.ldr = true;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String optString = optJSONObject.optString("url", "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(optString)) {
                this.f20103bX = optString;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            this.eqN = arrayList.contains("load_finish");
            this.ldr = arrayList.contains(Reporting.EventType.LOAD_FAIL);
            this.f20104zx = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
