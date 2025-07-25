package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.VB */
/* loaded from: classes3.dex */
public class C8952VB {

    /* renamed from: IL */
    private String f19818IL;

    /* renamed from: bX */
    private int f19819bX;

    /* renamed from: bg */
    private String f19820bg;

    /* renamed from: IL */
    public String m84284IL() {
        return this.f19818IL;
    }

    /* renamed from: bX */
    public int m84282bX() {
        return this.f19819bX;
    }

    /* renamed from: bg */
    public String m84281bg() {
        return this.f19820bg;
    }

    @Nullable
    public JSONObject eqN() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, this.f19820bg);
            jSONObject.put("ft", this.f19819bX);
            jSONObject.put("fu", this.f19818IL);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: IL */
    public void m84283IL(String str) {
        this.f19818IL = str;
    }

    /* renamed from: bg */
    public void m84279bg(String str) {
        this.f19820bg = str;
    }

    /* renamed from: bg */
    public void m84280bg(int i) {
        this.f19819bX = i;
    }
}
