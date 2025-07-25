package com.bytedance.sdk.openadsdk.tuV.p356IL;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.IL.bg */
/* loaded from: classes3.dex */
public class C9378bg {

    /* renamed from: IL */
    private List<C9379bg> f20907IL;

    /* renamed from: bX */
    private List<C9379bg> f20908bX;

    /* renamed from: bg */
    private String f20909bg;

    /* renamed from: com.bytedance.sdk.openadsdk.tuV.IL.bg$bg */
    /* loaded from: classes3.dex */
    public static class C9379bg {

        /* renamed from: IL */
        private String f20910IL;

        /* renamed from: bX */
        private int f20911bX;

        /* renamed from: bg */
        private String f20912bg;

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C9379bg) {
                String str2 = this.f20912bg;
                if (str2 != null) {
                    C9379bg c9379bg = (C9379bg) obj;
                    if (str2.equals(c9379bg.f20912bg) && (str = this.f20910IL) != null && str.equals(c9379bg.f20910IL)) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        /* renamed from: bg */
        public static C9379bg m82891bg(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C9379bg c9379bg = new C9379bg();
            c9379bg.f20912bg = jSONObject.optString("url");
            c9379bg.f20910IL = jSONObject.optString("md5");
            c9379bg.f20911bX = jSONObject.optInt("type");
            return c9379bg;
        }

        /* renamed from: bg */
        public String m82893bg() {
            return this.f20912bg;
        }
    }

    /* renamed from: IL */
    public void m82898IL(List<C9379bg> list) {
        this.f20908bX = list;
    }

    /* renamed from: bX */
    public List<C9379bg> m82897bX() {
        return this.f20908bX;
    }

    /* renamed from: bg */
    public void m82895bg(String str) {
        this.f20909bg = str;
    }

    /* renamed from: IL */
    public List<C9379bg> m82900IL() {
        return this.f20907IL;
    }

    /* renamed from: bg */
    public void m82894bg(List<C9379bg> list) {
        this.f20907IL = list;
    }

    /* renamed from: IL */
    public static C9378bg m82899IL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C9378bg c9378bg = new C9378bg();
            c9378bg.m82895bg(jSONObject.optString("version"));
            JSONArray optJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C9379bg m82891bg = C9379bg.m82891bg(optJSONArray.optJSONObject(i));
                    if (m82891bg != null) {
                        if (m82891bg.f20911bX != 1) {
                            if (m82891bg.f20911bX == 2 && arrayList2.size() < 10) {
                                arrayList2.add(m82891bg);
                            }
                        } else {
                            arrayList.add(m82891bg);
                        }
                    }
                }
            }
            c9378bg.m82894bg(arrayList);
            c9378bg.m82898IL(arrayList2);
            return c9378bg;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public String m82896bg() {
        return this.f20909bg;
    }
}
