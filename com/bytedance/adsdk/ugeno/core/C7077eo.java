package com.bytedance.adsdk.ugeno.core;

import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.core.eo */
/* loaded from: classes3.dex */
public class C7077eo {

    /* renamed from: IL */
    private int f15214IL;

    /* renamed from: bX */
    private JSONObject f15215bX;

    /* renamed from: bg */
    private AbstractView$OnTouchListenerC6981bX f15216bg;
    private C7077eo eqN;

    /* renamed from: zx */
    private C7077eo f15217zx;

    /* renamed from: IL */
    public int m90101IL() {
        return this.f15214IL;
    }

    /* renamed from: bX */
    public JSONObject m90099bX() {
        return this.f15215bX;
    }

    /* renamed from: bg */
    public AbstractView$OnTouchListenerC6981bX m90098bg() {
        return this.f15216bg;
    }

    public C7077eo eqN() {
        return this.eqN;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.f15216bg + ", mEventType=" + this.f15214IL + ", mEvent=" + this.f15215bX + '}';
    }

    /* renamed from: IL */
    public void m90100IL(C7077eo c7077eo) {
        this.f15217zx = c7077eo;
    }

    /* renamed from: bg */
    public void m90096bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        this.f15216bg = abstractView$OnTouchListenerC6981bX;
    }

    /* renamed from: bg */
    public void m90097bg(int i) {
        this.f15214IL = i;
    }

    /* renamed from: bg */
    public void m90094bg(JSONObject jSONObject) {
        this.f15215bX = jSONObject;
    }

    /* renamed from: bg */
    public void m90095bg(C7077eo c7077eo) {
        this.eqN = c7077eo;
    }
}
