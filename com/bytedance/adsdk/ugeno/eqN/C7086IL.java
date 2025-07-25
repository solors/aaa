package com.bytedance.adsdk.ugeno.eqN;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.IL */
/* loaded from: classes3.dex */
public class C7086IL {

    /* renamed from: IL */
    private List<C7087bg> f15243IL;

    /* renamed from: bg */
    private C7087bg f15244bg;

    /* renamed from: com.bytedance.adsdk.ugeno.eqN.IL$bg */
    /* loaded from: classes3.dex */
    public static class C7087bg {

        /* renamed from: IL */
        private String f15245IL;

        /* renamed from: bX */
        private Map<String, String> f15246bX;

        /* renamed from: bg */
        private String f15247bg = "global";

        /* renamed from: IL */
        public String m90053IL() {
            return this.f15245IL;
        }

        /* renamed from: bX */
        public Map<String, String> m90050bX() {
            return this.f15246bX;
        }

        /* renamed from: bg */
        public String m90049bg() {
            return this.f15247bg;
        }

        public String toString() {
            return "Action{scheme='" + this.f15247bg + "', name='" + this.f15245IL + "', params=" + this.f15246bX + '}';
        }

        /* renamed from: IL */
        public void m90051IL(String str) {
            this.f15245IL = str;
        }

        /* renamed from: bg */
        public void m90048bg(String str) {
            this.f15247bg = str;
        }

        /* renamed from: bg */
        public void m90047bg(Map<String, String> map) {
            this.f15246bX = map;
        }
    }

    /* renamed from: IL */
    public List<C7087bg> m90056IL() {
        return this.f15243IL;
    }

    /* renamed from: bg */
    public C7087bg m90055bg() {
        return this.f15244bg;
    }

    /* renamed from: bg */
    public static C7086IL m90054bg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        C7086IL c7086il = new C7086IL();
        String optString = jSONObject.optString("on");
        JSONArray optJSONArray = jSONObject.optJSONArray("handlers");
        c7086il.f15244bg = C7093Kg.m90043bg(optString, jSONObject2);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C7087bg m90043bg = C7093Kg.m90043bg(optJSONArray.optString(i), jSONObject2);
            if (m90043bg != null) {
                arrayList.add(m90043bg);
            }
        }
        c7086il.f15243IL = arrayList;
        return c7086il;
    }
}
