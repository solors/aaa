package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.Ta */
/* loaded from: classes3.dex */
public class C8950Ta {

    /* renamed from: IL */
    private final int f19812IL;

    /* renamed from: bX */
    private final int f19813bX;

    /* renamed from: bg */
    private final int f19814bg;
    private final int eqN;

    public C8950Ta(JSONObject jSONObject) {
        this.f19814bg = jSONObject.optInt("auto_click", 0);
        this.f19812IL = jSONObject.optInt("close_jump_probability", 0);
        this.f19813bX = jSONObject.optInt("skip_jump_probability", 0);
        this.eqN = jSONObject.optInt("hidden_bar", 0);
    }

    /* renamed from: IL */
    public int m84295IL() {
        int i = this.f19812IL;
        if (i >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    /* renamed from: bX */
    public int m84294bX() {
        int i = this.f19813bX;
        if (i >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    /* renamed from: bg */
    public int m84293bg() {
        return this.f19814bg;
    }

    public boolean eqN() {
        if (this.eqN == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: zx */
    public JSONObject m84291zx() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.f19814bg;
            if (i == 1) {
                jSONObject.put("auto_click", i);
            }
            int i2 = this.f19812IL;
            if (i2 > 0 && i2 <= 100) {
                jSONObject.put("close_jump_probability", i2);
            }
            int i3 = this.f19813bX;
            if (i3 > 0 && i3 <= 100) {
                jSONObject.put("skip_jump_probability", i3);
            }
            if (this.eqN == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static boolean m84292bg(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null || !abstractC8967tuV.HXG() || abstractC8967tuV.JlG() == null) {
            return false;
        }
        return abstractC8967tuV.JlG().eqN();
    }
}
