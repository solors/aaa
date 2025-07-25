package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.component.utils.C7741PX;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.zx */
/* loaded from: classes3.dex */
public class C8989zx {

    /* renamed from: IL */
    private int f20032IL;

    /* renamed from: bX */
    private List<Integer> f20033bX;

    /* renamed from: bg */
    private int f20034bg;
    private int eqN;

    /* renamed from: iR */
    private int f20035iR;
    private int ldr;

    /* renamed from: zx */
    private List<String> f20036zx;

    /* renamed from: IL */
    public int m83880IL() {
        int i = this.f20035iR;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    /* renamed from: Kg */
    public JSONObject m83877Kg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.f20034bg);
            jSONObject.put("interceptor_y", this.f20032IL);
            if (this.f20033bX != null) {
                JSONArray jSONArray = new JSONArray();
                for (Integer num : this.f20033bX) {
                    jSONArray.put(num.intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.eqN);
            if (this.f20036zx != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str : this.f20036zx) {
                    jSONArray2.put(str);
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.ldr);
            jSONObject.put("boc_index", this.f20035iR);
        } catch (Throwable th) {
            C7741PX.m87880IL(th.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: bX */
    public List<String> m83876bX() {
        return this.f20036zx;
    }

    /* renamed from: bg */
    public boolean m83874bg() {
        return this.ldr == 1;
    }

    public int eqN() {
        return this.f20034bg;
    }

    /* renamed from: iR */
    public int m83871iR() {
        return this.eqN;
    }

    public List<Integer> ldr() {
        return this.f20033bX;
    }

    /* renamed from: zx */
    public int m83870zx() {
        return this.f20032IL;
    }

    /* renamed from: IL */
    public void m83879IL(int i) {
        this.f20035iR = i;
    }

    /* renamed from: bX */
    public void m83875bX(int i) {
        this.f20034bg = i;
    }

    /* renamed from: bg */
    public void m83873bg(int i) {
        this.ldr = i;
    }

    public void eqN(int i) {
        this.f20032IL = i;
    }

    /* renamed from: zx */
    public void m83869zx(int i) {
        this.eqN = i;
    }

    /* renamed from: IL */
    public void m83878IL(List<Integer> list) {
        this.f20033bX = list;
    }

    /* renamed from: bg */
    public void m83872bg(List<String> list) {
        this.f20036zx = list;
    }
}
