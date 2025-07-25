package com.bytedance.sdk.component.adexpress.dynamic.eqN;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg */
/* loaded from: classes3.dex */
public class C7457Kg {

    /* renamed from: IL */
    private float f16136IL;

    /* renamed from: Kg */
    private float f16137Kg;

    /* renamed from: PX */
    private List<List<C7457Kg>> f16139PX;

    /* renamed from: Ta */
    private String f16140Ta;

    /* renamed from: VB */
    private C7457Kg f16141VB;

    /* renamed from: WR */
    private C7466zx f16142WR;

    /* renamed from: bX */
    private float f16143bX;

    /* renamed from: bg */
    private String f16144bg;

    /* renamed from: eo */
    private List<C7457Kg> f16145eo;
    private float eqN;

    /* renamed from: iR */
    private float f16146iR;
    private float ldr;
    private boolean yDt;

    /* renamed from: zx */
    private float f16148zx;

    /* renamed from: Lq */
    private Map<String, String> f16138Lq = new HashMap();

    /* renamed from: vb */
    private Map<Integer, String> f16147vb = new HashMap();

    /* renamed from: Fy */
    public Map<String, String> m89002Fy() {
        return this.f16138Lq;
    }

    /* renamed from: IL */
    public Map<Integer, String> m89001IL() {
        return this.f16147vb;
    }

    /* renamed from: Kg */
    public float m88997Kg() {
        return this.ldr;
    }

    /* renamed from: LZ */
    public void m88996LZ() {
        List<List<C7457Kg>> list = this.f16139PX;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List<C7457Kg> list2 : this.f16139PX) {
                if (list2 != null && list2.size() > 0) {
                    arrayList.add(list2);
                }
            }
            this.f16139PX = arrayList;
        }
    }

    /* renamed from: Lq */
    public float m88995Lq() {
        C7465ldr m88755zx = this.f16142WR.m88755zx();
        return m88993Ta() + m88755zx.m88855Lq() + m88755zx.m88778vb() + (m88755zx.m88850PX() * 2.0f);
    }

    /* renamed from: PX */
    public C7457Kg m88994PX() {
        return this.f16141VB;
    }

    /* renamed from: Ta */
    public int m88993Ta() {
        C7465ldr m88755zx = this.f16142WR.m88755zx();
        return m88755zx.txA() + m88755zx.sVc();
    }

    /* renamed from: VB */
    public List<C7457Kg> m88992VB() {
        return this.f16145eo;
    }

    public boolean VzQ() {
        List<C7457Kg> list = this.f16145eo;
        if (list != null && list.size() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: WR */
    public float m88991WR() {
        return this.f16146iR;
    }

    /* renamed from: bX */
    public String m88990bX() {
        return this.f16144bg;
    }

    /* renamed from: bg */
    public String m88987bg() {
        return this.f16140Ta;
    }

    /* renamed from: eo */
    public C7466zx m88977eo() {
        return this.f16142WR;
    }

    public float eqN() {
        return this.eqN;
    }

    /* renamed from: iR */
    public float m88976iR() {
        return this.f16143bX;
    }

    public boolean kMt() {
        if (this.f16142WR.m88755zx().RFq() >= 0 && this.f16142WR.m88755zx().m88791jA() >= 0 && this.f16142WR.m88755zx().m88785qp() >= 0 && this.f16142WR.m88755zx().eDa() >= 0) {
            return false;
        }
        return true;
    }

    public float ldr() {
        return this.f16136IL;
    }

    public String rri() {
        return this.f16142WR.m88755zx().rri();
    }

    /* renamed from: tC */
    public boolean m88974tC() {
        return TextUtils.equals(this.f16142WR.m88755zx().DDQ(), "flex");
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.f16144bg + "', x=" + this.f16136IL + ", y=" + this.f16143bX + ", width=" + this.ldr + ", height=" + this.f16146iR + ", remainWidth=" + this.f16137Kg + ", rootBrick=" + this.f16142WR + ", childrenBrickUnits=" + this.f16145eo + '}';
    }

    public boolean tuV() {
        return this.yDt;
    }

    /* renamed from: vb */
    public float m88973vb() {
        C7465ldr m88755zx = this.f16142WR.m88755zx();
        return yDt() + m88755zx.xxp() + m88755zx.yDt() + (m88755zx.m88850PX() * 2.0f);
    }

    public List<List<C7457Kg>> xxp() {
        return this.f16139PX;
    }

    public int yDt() {
        C7465ldr m88755zx = this.f16142WR.m88755zx();
        return m88755zx.Pae() + m88755zx.m88846RJ();
    }

    /* renamed from: zx */
    public float m88972zx() {
        return this.f16148zx;
    }

    /* renamed from: IL */
    public void m88999IL(String str) {
        this.f16144bg = str;
    }

    /* renamed from: bX */
    public void m88989bX(float f) {
        this.f16136IL = f;
    }

    /* renamed from: bg */
    public void m88982bg(String str) {
        this.f16140Ta = str;
    }

    public void eqN(float f) {
        this.f16143bX = f;
    }

    /* renamed from: iR */
    public void m88975iR(float f) {
        this.f16137Kg = f;
    }

    public void ldr(float f) {
        this.f16146iR = f;
    }

    /* renamed from: zx */
    public void m88971zx(float f) {
        this.ldr = f;
    }

    /* renamed from: IL */
    public void m89000IL(float f) {
        this.f16148zx = f;
    }

    /* renamed from: bX */
    public void m88988bX(String str) {
        this.f16142WR.m88755zx().ldr(str);
    }

    /* renamed from: bg */
    public void m88979bg(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    this.f16147vb.put(Integer.valueOf(optJSONObject.optInt("id")), optJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: IL */
    public void m88998IL(List<List<C7457Kg>> list) {
        this.f16139PX = list;
    }

    /* renamed from: bg */
    public void m88986bg(float f) {
        this.eqN = f;
    }

    /* renamed from: bg */
    public void m88983bg(C7466zx c7466zx) {
        this.f16142WR = c7466zx;
    }

    /* renamed from: bg */
    public void m88980bg(List<C7457Kg> list) {
        this.f16145eo = list;
    }

    /* renamed from: bg */
    public void m88984bg(C7457Kg c7457Kg) {
        this.f16141VB = c7457Kg;
    }

    /* renamed from: bg */
    public void m88978bg(boolean z) {
        this.yDt = z;
    }

    /* renamed from: bg */
    public void m88981bg(String str, String str2) {
        this.f16138Lq.put(str, str2);
    }

    /* renamed from: bg */
    public String m88985bg(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16142WR.m88764IL());
        sb2.append(":");
        sb2.append(this.f16144bg);
        if (this.f16142WR.m88755zx() != null) {
            sb2.append(":");
            sb2.append(this.f16142WR.m88755zx().ovC());
        }
        sb2.append(":");
        sb2.append(i);
        return sb2.toString();
    }
}
