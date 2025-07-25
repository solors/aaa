package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p222iR.C7113IL;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.core.zx */
/* loaded from: classes3.dex */
public class C7083zx {

    /* renamed from: IL */
    private JSONObject f15228IL;

    /* renamed from: bX */
    private String f15229bX;

    /* renamed from: bg */
    private JSONObject f15230bg;
    private JSONObject eqN;

    /* renamed from: iR */
    private boolean f15231iR;
    private JSONObject ldr;

    /* renamed from: zx */
    private String f15232zx;

    /* renamed from: com.bytedance.adsdk.ugeno.core.zx$bg */
    /* loaded from: classes3.dex */
    public static class C7084bg {

        /* renamed from: IL */
        private String f15233IL;

        /* renamed from: Kg */
        private String f15234Kg;

        /* renamed from: bX */
        private JSONObject f15235bX;

        /* renamed from: bg */
        private String f15236bg;
        private JSONObject eqN;

        /* renamed from: iR */
        private String f15237iR;
        private C7084bg ldr;

        /* renamed from: zx */
        private List<C7084bg> f15238zx;

        public JSONObject ldr() {
            return this.eqN;
        }

        public String toString() {
            return "UGNode{id='" + this.f15236bg + "', name='" + this.f15233IL + "'}";
        }

        /* renamed from: zx */
        public List<C7084bg> m90064zx() {
            return this.f15238zx;
        }

        /* renamed from: bX */
        public String m90071bX() {
            return this.f15233IL;
        }

        public JSONObject eqN() {
            return this.f15235bX;
        }

        /* renamed from: IL */
        public String m90075IL() {
            return this.f15237iR;
        }

        /* renamed from: bg */
        public String m90069bg() {
            return this.f15236bg;
        }

        /* renamed from: bg */
        public void m90068bg(C7084bg c7084bg) {
            if (this.f15238zx == null) {
                this.f15238zx = new ArrayList();
            }
            this.f15238zx.add(c7084bg);
        }
    }

    public C7083zx(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    /* renamed from: IL */
    public String m90081IL() {
        return this.f15229bX;
    }

    /* renamed from: bX */
    public List<C7084bg> m90080bX() {
        if (this.f15228IL == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.f15228IL.keys();
        while (keys.hasNext()) {
            C7084bg m90077bg = m90077bg(this.f15228IL.optJSONObject(keys.next()), (C7084bg) null);
            if (m90077bg != null) {
                arrayList.add(m90077bg);
            }
        }
        return arrayList;
    }

    /* renamed from: bg */
    public C7084bg m90079bg() {
        return m90077bg(this.f15230bg, (C7084bg) null);
    }

    public boolean eqN() {
        return this.f15231iR;
    }

    public C7083zx(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.f15230bg = jSONObject.optJSONObject("body");
            } else {
                this.f15230bg = jSONObject.optJSONObject("main_template");
            }
            this.f15228IL = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has("meta")) {
                optJSONObject = jSONObject.optJSONObject("meta");
            } else {
                optJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (optJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.f15231iR = true;
                    String optString = optJSONObject.optString("version");
                    this.f15229bX = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.f15229bX = MraidEnvironmentProperties.VERSION;
                    }
                } else {
                    this.f15229bX = optJSONObject.optString("sdk_version");
                }
                if (optJSONObject.has("adType")) {
                    this.f15232zx = optJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.f15229bX = MraidEnvironmentProperties.VERSION;
                this.f15231iR = true;
            }
            this.eqN = jSONObject2;
            this.ldr = jSONObject3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9 A[SYNTHETIC] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg m90077bg(org.json.JSONObject r11, com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "type"
            boolean r2 = r11.has(r1)
            java.lang.String r3 = "name"
            if (r2 == 0) goto L13
            java.lang.String r2 = r11.optString(r1)
            goto L17
        L13:
            java.lang.String r2 = r11.optString(r3)
        L17:
            java.lang.String r4 = "id"
            java.lang.String r5 = r11.optString(r4)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.util.Iterator r7 = r11.keys()
        L26:
            boolean r8 = r7.hasNext()
            java.lang.String r9 = "children"
            if (r8 == 0) goto L42
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = android.text.TextUtils.equals(r8, r9)
            if (r9 != 0) goto L26
            java.lang.Object r9 = r11.opt(r8)     // Catch: org.json.JSONException -> L26
            r6.put(r8, r9)     // Catch: org.json.JSONException -> L26
            goto L26
        L42:
            com.bytedance.adsdk.ugeno.core.zx$bg r7 = new com.bytedance.adsdk.ugeno.core.zx$bg
            r7.<init>()
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90066bg(r7, r5)
            boolean r5 = r10.f15231iR
            if (r5 == 0) goto L6b
            java.lang.String r5 = "Video"
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 == 0) goto L6b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r8 = "V3"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90073IL(r7, r5)
            goto L6e
        L6b:
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90073IL(r7, r2)
        L6e:
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90065bg(r7, r6)
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90067bg(r7, r12)
            java.lang.String r12 = r10.f15229bX
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90070bX(r7, r12)
            java.lang.String r12 = r10.f15232zx
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.eqN(r7, r12)
            java.lang.String r12 = "i18n"
            boolean r5 = r6.has(r12)
            if (r5 == 0) goto L8d
            org.json.JSONObject r12 = r6.optJSONObject(r12)
            com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90072IL(r7, r12)
        L8d:
            java.lang.String r12 = "CustomComponent"
            boolean r12 = android.text.TextUtils.equals(r2, r12)
            if (r12 == 0) goto L9c
            org.json.JSONObject r12 = com.bytedance.adsdk.ugeno.core.C7083zx.C7084bg.m90074IL(r7)
            r10.m90076bg(r11, r12)
        L9c:
            org.json.JSONArray r12 = r11.optJSONArray(r9)
            if (r12 == 0) goto Lec
            int r2 = r12.length()
            if (r2 > 0) goto La9
            goto Lec
        La9:
            r2 = 0
        Laa:
            int r5 = r12.length()
            if (r2 >= r5) goto Lec
            org.json.JSONObject r5 = r12.optJSONObject(r2)
            boolean r6 = r11.has(r1)
            if (r6 == 0) goto Lbf
            java.lang.String r6 = r11.optString(r1)
            goto Lc3
        Lbf:
            java.lang.String r6 = r11.optString(r3)
        Lc3:
            java.lang.String r8 = r5.optString(r4)
            org.json.JSONObject r9 = r10.eqN
            java.lang.String r8 = com.bytedance.adsdk.ugeno.p213bX.C7033IL.m90221bg(r8, r9)
            java.lang.String r9 = "Template"
            boolean r6 = android.text.TextUtils.equals(r6, r9)
            if (r6 == 0) goto Le0
            org.json.JSONObject r5 = r10.f15228IL
            if (r5 == 0) goto Lde
            org.json.JSONObject r5 = r5.optJSONObject(r8)
            goto Le0
        Lde:
            r5 = r0
            goto Le4
        Le0:
            com.bytedance.adsdk.ugeno.core.zx$bg r5 = r10.m90077bg(r5, r7)
        Le4:
            if (r5 == 0) goto Le9
            r7.m90068bg(r5)
        Le9:
            int r2 = r2 + 1
            goto Laa
        Lec:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.C7083zx.m90077bg(org.json.JSONObject, com.bytedance.adsdk.ugeno.core.zx$bg):com.bytedance.adsdk.ugeno.core.zx$bg");
    }

    /* renamed from: bg */
    private void m90076bg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.ldr == null || jSONObject2 == null) {
            return;
        }
        try {
            String optString = this.ldr.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(optString);
            JSONObject optJSONObject = jSONObject2.optJSONObject("targetProps");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = optJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (opt instanceof JSONArray) {
                            C7113IL.m90013bg(jSONObject3.optJSONArray("events"), (JSONArray) opt);
                        }
                    } else {
                        jSONObject3.put(next, opt);
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("children");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                optJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", optJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: bg */
    public static boolean m90078bg(C7084bg c7084bg) {
        return (c7084bg == null || c7084bg.f15235bX == null) ? false : true;
    }
}
