package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.core.Kg */
/* loaded from: classes3.dex */
public class C7063Kg {

    /* renamed from: IL */
    private JSONObject f15164IL;

    /* renamed from: bX */
    private JSONObject f15165bX;

    /* renamed from: bg */
    private Context f15166bg;
    private Map<String, Object> eqN;

    /* renamed from: IL */
    public void m90162IL(JSONObject jSONObject) {
        this.f15165bX = jSONObject;
    }

    /* renamed from: bg */
    public void m90160bg(Context context) {
        this.f15166bg = context;
    }

    /* renamed from: IL */
    public Map<String, Object> m90163IL() {
        return this.eqN;
    }

    /* renamed from: bg */
    public void m90158bg(JSONObject jSONObject) {
        this.f15164IL = jSONObject;
    }

    /* renamed from: bg */
    public JSONObject m90161bg() {
        return this.f15165bX;
    }

    /* renamed from: bg */
    public void m90159bg(Map<String, Object> map) {
        this.eqN = map;
    }
}
