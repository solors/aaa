package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.p243bg.p244IL.C7302IL;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8515IL;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.bg */
/* loaded from: classes3.dex */
public class C8957bg {

    /* renamed from: IL */
    private int f19834IL;

    /* renamed from: Kg */
    private String f19835Kg;

    /* renamed from: PX */
    private int f19836PX;

    /* renamed from: Ta */
    private String f19837Ta;

    /* renamed from: WR */
    private long f19839WR;

    /* renamed from: bX */
    private String f19840bX;

    /* renamed from: bg */
    private String f19841bg;

    /* renamed from: eo */
    private boolean f19842eo;
    private C8958bg eqN;

    /* renamed from: zx */
    private boolean f19844zx;
    private List<AbstractC8967tuV> ldr = new ArrayList();

    /* renamed from: iR */
    private List<C8946Kg> f19843iR = new ArrayList();

    /* renamed from: VB */
    private volatile boolean f19838VB = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.model.bg$bg */
    /* loaded from: classes3.dex */
    public static class C8958bg extends AbstractC8967tuV.C8968bg {

        /* renamed from: bg */
        private int f19845bg;

        /* renamed from: IL */
        public JSONObject m84232IL() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", ldr());
                jSONObject.put("md5", m83954iR());
                jSONObject.put("url", m83972Kg());
                jSONObject.put("data", m83963WR());
                jSONObject.put("diff_data", m83956eo());
                jSONObject.put("version", m83951zx());
                jSONObject.put("dynamic_creative", m83965VB());
                jSONObject.put("count_down_time", m84231bg());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: bg */
        public void m84230bg(int i) {
            this.f19845bg = i;
        }

        /* renamed from: bg */
        public int m84231bg() {
            return this.f19845bg;
        }

        /* renamed from: bg */
        public static C8958bg m84228bg(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C8958bg c8958bg = new C8958bg();
            c8958bg.m83960bX(jSONObject.optString("id"));
            c8958bg.eqN(jSONObject.optString("md5"));
            c8958bg.m83950zx(jSONObject.optString("url"));
            c8958bg.ldr(jSONObject.optString("data"));
            c8958bg.m83953iR(jSONObject.optString("diff_data"));
            c8958bg.m83973IL(jSONObject.optString("version"));
            c8958bg.m83971Kg(jSONObject.optString("dynamic_creative"));
            c8958bg.m84230bg(jSONObject.optInt("count_down_time"));
            if (m84229bg(c8958bg)) {
                return c8958bg;
            }
            return null;
        }

        /* renamed from: bg */
        private static boolean m84229bg(C8958bg c8958bg) {
            return (c8958bg == null || TextUtils.isEmpty(c8958bg.ldr()) || TextUtils.isEmpty(c8958bg.m83972Kg())) ? false : true;
        }
    }

    /* renamed from: IL */
    public int m84257IL() {
        return this.f19834IL;
    }

    /* renamed from: Kg */
    public C8958bg m84253Kg() {
        return this.eqN;
    }

    @Nullable
    /* renamed from: PX */
    public JSONObject m84252PX() {
        try {
            JSONObject jSONObject = new JSONObject();
            C8958bg m84253Kg = m84253Kg();
            if (m84253Kg != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject m84232IL = m84253Kg.m84232IL();
                if (m84232IL != null) {
                    jSONObject2.put("tpl_info", m84232IL);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<AbstractC8967tuV> list = this.ldr;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.ldr.size(); i++) {
                    jSONArray.put(this.ldr.get(i).ZTq());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.f19842eo);
            jSONObject.put("multi_ad_style", this.f19836PX);
            jSONObject.put("request_id", this.f19841bg);
            return jSONObject;
        } catch (Throwable th) {
            C7741PX.m87871bg("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    /* renamed from: Ta */
    public String m84251Ta() {
        return this.f19837Ta;
    }

    /* renamed from: VB */
    public boolean m84250VB() {
        if (this.f19836PX == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: WR */
    public boolean m84249WR() {
        return this.f19838VB;
    }

    /* renamed from: bX */
    public List<AbstractC8967tuV> m84248bX() {
        return this.ldr;
    }

    /* renamed from: bg */
    public String m84246bg() {
        AbstractC8967tuV m84233zx = m84233zx();
        return m84233zx != null ? m84233zx.waE() : "";
    }

    /* renamed from: eo */
    public void m84235eo() {
        this.f19838VB = false;
    }

    public boolean eqN() {
        List<AbstractC8967tuV> list = this.ldr;
        return list != null && list.size() > 0;
    }

    /* renamed from: iR */
    public boolean m84234iR() {
        return this.f19842eo;
    }

    public boolean ldr() {
        if (m84253Kg() != null && m84248bX() != null && m84248bX().size() > 1) {
            this.f19844zx = true;
        } else {
            this.f19844zx = false;
            m84242bg((C8958bg) null);
        }
        return this.f19844zx;
    }

    /* renamed from: zx */
    public AbstractC8967tuV m84233zx() {
        if (this.ldr.size() > 0) {
            return this.ldr.get(0);
        }
        return null;
    }

    /* renamed from: IL */
    public void m84255IL(String str) {
        this.f19840bX = str;
    }

    /* renamed from: bX */
    public void m84247bX(String str) {
        this.f19835Kg = str;
    }

    public void eqN(String str) {
        this.f19837Ta = str;
    }

    /* renamed from: IL */
    public void m84256IL(int i) {
        this.f19836PX = i;
    }

    /* renamed from: bg */
    public void m84239bg(String str) {
        this.f19841bg = str;
    }

    /* renamed from: IL */
    public static C8957bg m84254IL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C8957bg c8957bg = new C8957bg();
            JSONObject optJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (optJSONObject != null) {
                c8957bg.m84237bg(optJSONObject);
            }
            c8957bg.m84256IL(jSONObject.optInt("multi_ad_style", 0));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    AbstractC8967tuV m85895bg = C8515IL.m85895bg(optJSONArray.optJSONObject(i));
                    if (m85895bg != null) {
                        m85895bg.mo84071WR(c8957bg.m84250VB());
                        arrayList.add(m85895bg);
                    }
                }
                c8957bg.m84238bg(arrayList);
            }
            c8957bg.m84236bg(jSONObject.optBoolean("is_choose_ad_original", false));
            c8957bg.m84239bg(jSONObject.optString("request_id", ""));
            return c8957bg;
        } catch (Throwable th) {
            C7741PX.m87871bg("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    /* renamed from: bg */
    public void m84245bg(int i) {
        this.f19834IL = i;
    }

    /* renamed from: bg */
    public void m84240bg(AbstractC8967tuV abstractC8967tuV) {
        this.ldr.add(abstractC8967tuV);
    }

    /* renamed from: bg */
    public void m84238bg(List<AbstractC8967tuV> list) {
        this.ldr = list;
    }

    /* renamed from: bg */
    public void m84243bg(C8946Kg c8946Kg) {
        this.f19843iR.add(c8946Kg);
    }

    /* renamed from: bg */
    public void m84244bg(long j) {
        this.f19839WR = j;
    }

    /* renamed from: bg */
    public static Map<String, AbstractC8967tuV> m84241bg(C8957bg c8957bg) {
        if (c8957bg == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (AbstractC8967tuV abstractC8967tuV : c8957bg.m84248bX()) {
            if (!TextUtils.isEmpty(abstractC8967tuV.mo83997qp())) {
                hashMap.put(abstractC8967tuV.mo83997qp(), abstractC8967tuV);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    /* renamed from: bg */
    public void m84236bg(boolean z) {
        this.f19842eo = z;
    }

    /* renamed from: bg */
    public void m84242bg(C8958bg c8958bg) {
        this.eqN = c8958bg;
        if (c8958bg == null) {
            return;
        }
        C7302IL.m89233bg(AbstractC8967tuV.C8968bg.m83959bg(c8958bg, ""));
    }

    /* renamed from: bg */
    public void m84237bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        m84242bg(C8958bg.m84228bg(jSONObject.optJSONObject("tpl_info")));
    }
}
