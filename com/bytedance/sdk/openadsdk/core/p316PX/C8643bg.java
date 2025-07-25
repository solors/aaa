package com.bytedance.sdk.openadsdk.core.p316PX;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bg */
/* loaded from: classes3.dex */
public class C8643bg {

    /* renamed from: IL */
    C8618IL f19063IL;

    /* renamed from: Kg */
    private double f19064Kg;

    /* renamed from: Lq */
    private String f19065Lq;

    /* renamed from: VB */
    private String f19068VB;

    /* renamed from: WR */
    private int f19069WR;

    /* renamed from: bX */
    C8633bX f19070bX;

    /* renamed from: eo */
    private int f19072eo;
    private String eqN;

    /* renamed from: iR */
    private String f19073iR;
    private String ldr;

    /* renamed from: zx */
    private String f19074zx;

    /* renamed from: bg */
    C8654eqN f19071bg = new C8654eqN(this);

    /* renamed from: PX */
    private final Set<C8653eo> f19066PX = new HashSet();

    /* renamed from: Ta */
    private String f19067Ta = "VAST_ACTION_BUTTON";
    private boolean yDt = false;

    /* renamed from: vb */
    private JSONArray m85451vb() {
        JSONArray jSONArray = new JSONArray();
        for (C8653eo c8653eo : this.f19066PX) {
            if (c8653eo != null) {
                jSONArray.put(c8653eo.eqN());
            }
        }
        return jSONArray;
    }

    /* renamed from: IL */
    public C8618IL m85474IL() {
        return this.f19063IL;
    }

    /* renamed from: Kg */
    public double m85471Kg() {
        return this.f19064Kg;
    }

    /* renamed from: Lq */
    public void m85470Lq() {
        this.yDt = true;
    }

    /* renamed from: PX */
    public int m85469PX() {
        return this.f19069WR;
    }

    /* renamed from: Ta */
    public int m85468Ta() {
        return this.f19072eo;
    }

    /* renamed from: VB */
    public String m85467VB() {
        return this.f19068VB;
    }

    /* renamed from: WR */
    public String m85466WR() {
        C8633bX c8633bX;
        String str = this.ldr;
        if (!TextUtils.isEmpty(this.f19065Lq)) {
            String str2 = this.f19065Lq;
            this.f19065Lq = null;
            return str2;
        }
        String str3 = this.f19067Ta;
        str3.hashCode();
        if (!str3.equals("VAST_ICON")) {
            if (str3.equals("VAST_END_CARD") && (c8633bX = this.f19070bX) != null && !TextUtils.isEmpty(c8633bX.f19038Kg)) {
                str = this.f19070bX.f19038Kg;
            }
        } else {
            C8618IL c8618il = this.f19063IL;
            if (c8618il != null && !TextUtils.isEmpty(c8618il.f19038Kg)) {
                str = this.f19063IL.f19038Kg;
            }
        }
        this.f19067Ta = "VAST_ACTION_BUTTON";
        return str;
    }

    /* renamed from: bX */
    public C8633bX m85465bX() {
        return this.f19070bX;
    }

    /* renamed from: bg */
    public C8654eqN m85463bg() {
        return this.f19071bg;
    }

    /* renamed from: eo */
    public JSONObject m85454eo() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.f19071bg.m85399bg());
        C8618IL c8618il = this.f19063IL;
        if (c8618il != null) {
            jSONObject.put("vastIcon", c8618il.mo85492bg());
        }
        C8633bX c8633bX = this.f19070bX;
        if (c8633bX != null) {
            jSONObject.put("endCard", c8633bX.mo85492bg());
        }
        jSONObject.put("title", this.eqN);
        jSONObject.put("description", this.f19074zx);
        jSONObject.put("clickThroughUrl", this.ldr);
        jSONObject.put(UnifiedMediationParams.KEY_VIDEO_URL, this.f19073iR);
        jSONObject.put("videDuration", this.f19064Kg);
        jSONObject.put("tag", this.f19068VB);
        jSONObject.put("videoWidth", this.f19069WR);
        jSONObject.put("videoHeight", this.f19072eo);
        jSONObject.put("viewabilityVendor", m85451vb());
        return jSONObject;
    }

    public String eqN() {
        return this.eqN;
    }

    /* renamed from: iR */
    public String m85453iR() {
        return this.f19073iR;
    }

    public String ldr() {
        return this.ldr;
    }

    public Set<C8653eo> yDt() {
        return this.f19066PX;
    }

    /* renamed from: zx */
    public String m85450zx() {
        return this.f19074zx;
    }

    /* renamed from: IL */
    public void m85472IL(String str) {
        this.f19074zx = str;
    }

    /* renamed from: bX */
    public void m85464bX(String str) {
        this.ldr = str;
    }

    /* renamed from: bg */
    public void m85460bg(C8618IL c8618il) {
        if (c8618il != null) {
            c8618il.m85487bg(this.f19073iR);
        }
        this.f19063IL = c8618il;
    }

    public void eqN(String str) {
        this.f19073iR = str;
    }

    /* renamed from: iR */
    public void m85452iR(String str) {
        this.f19065Lq = str;
    }

    public void ldr(String str) {
        this.f19068VB = str;
        this.f19071bg.m85389bg(str);
    }

    /* renamed from: zx */
    public void m85449zx(String str) {
        this.f19067Ta = str;
    }

    /* renamed from: IL */
    public void m85473IL(int i) {
        this.f19072eo = i;
    }

    /* renamed from: bg */
    public void m85459bg(C8633bX c8633bX) {
        if (c8633bX != null) {
            c8633bX.m85487bg(this.f19073iR);
        }
        this.f19070bX = c8633bX;
    }

    /* renamed from: bg */
    public void m85457bg(String str) {
        this.eqN = str;
    }

    /* renamed from: bg */
    public void m85462bg(double d) {
        this.f19064Kg = d;
    }

    /* renamed from: bg */
    public static C8643bg m85455bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C8643bg c8643bg = new C8643bg();
        c8643bg.f19071bg.m85385bg(jSONObject.optJSONObject("videoTrackers"));
        c8643bg.f19063IL = C8618IL.m85529bg(jSONObject.optJSONObject("vastIcon"));
        c8643bg.f19070bX = C8633bX.m85494IL(jSONObject.optJSONObject("endCard"));
        c8643bg.eqN = jSONObject.optString("title");
        c8643bg.f19074zx = jSONObject.optString("description");
        c8643bg.ldr = jSONObject.optString("clickThroughUrl");
        c8643bg.f19073iR = jSONObject.optString(UnifiedMediationParams.KEY_VIDEO_URL);
        c8643bg.f19064Kg = jSONObject.optDouble("videDuration");
        c8643bg.f19068VB = jSONObject.optString("tag");
        c8643bg.f19069WR = jSONObject.optInt("videoWidth");
        c8643bg.f19069WR = jSONObject.optInt("videoHeight");
        c8643bg.f19066PX.addAll(C8653eo.m85414bg(jSONObject.optJSONArray("viewabilityVendor")));
        return c8643bg;
    }

    /* renamed from: bg */
    public void m85458bg(AbstractC8967tuV abstractC8967tuV) {
        this.f19071bg.m85390bg(abstractC8967tuV);
        C8618IL c8618il = this.f19063IL;
        if (c8618il != null) {
            c8618il.m85488bg(abstractC8967tuV);
        }
        C8633bX c8633bX = this.f19070bX;
        if (c8633bX != null) {
            c8633bX.m85488bg(abstractC8967tuV);
        }
    }

    /* renamed from: bg */
    public void m85461bg(int i) {
        this.f19069WR = i;
    }

    /* renamed from: bg */
    public void m85456bg(Set<C8653eo> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.f19066PX.addAll(set);
    }
}
