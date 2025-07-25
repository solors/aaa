package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.tC */
/* loaded from: classes3.dex */
public class C8966tC {

    /* renamed from: IL */
    private String f19942IL;

    /* renamed from: bX */
    private int f19943bX;

    /* renamed from: bg */
    private String f19944bg;
    private int eqN;

    /* renamed from: IL */
    public void m84145IL(String str) {
        this.f19942IL = str;
    }

    /* renamed from: bX */
    public JSONObject m84144bX() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f19944bg)) {
                jSONObject.put("market_dpl", this.f19944bg);
            }
            if (!TextUtils.isEmpty(this.f19942IL)) {
                jSONObject.put("market_dpl_auto", this.f19942IL);
            }
            jSONObject.put("exec_type", this.f19943bX);
            jSONObject.put("oem_vendor_type", this.eqN);
            return jSONObject;
        } catch (Throwable th) {
            C7741PX.m87873bg("OemModel", th.getMessage());
            return null;
        }
    }

    /* renamed from: bg */
    public void m84141bg(String str) {
        this.f19944bg = str;
    }

    /* renamed from: IL */
    public void m84146IL(int i) {
        this.eqN = i;
    }

    /* renamed from: bg */
    public void m84142bg(int i) {
        this.f19943bX = i;
    }

    /* renamed from: IL */
    public String m84147IL() {
        if (this.f19943bX == 2) {
            return this.f19942IL;
        }
        return this.f19944bg;
    }

    /* renamed from: bg */
    public boolean m84143bg() {
        return this.eqN == 1;
    }

    /* renamed from: bg */
    public static C8966tC m84140bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C8966tC c8966tC = new C8966tC();
        try {
            c8966tC.m84141bg(jSONObject.optString("market_dpl", ""));
            c8966tC.m84145IL(jSONObject.optString("market_dpl_auto", ""));
            c8966tC.m84142bg(jSONObject.optInt("exec_type", 0));
            c8966tC.m84146IL(jSONObject.optInt("oem_vendor_type", 0));
        } catch (Throwable th) {
            C7741PX.m87873bg("OemModel", th.getMessage());
        }
        return c8966tC;
    }
}
