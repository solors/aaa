package com.bytedance.sdk.component.adexpress.dynamic.p252zx;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7465ldr;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7466zx;
import com.bytedance.sdk.component.adexpress.p241IL.C7282Ta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.IL */
/* loaded from: classes3.dex */
public class C7470IL {

    /* renamed from: Kg */
    private String f16237Kg;

    /* renamed from: WR */
    private C7282Ta f16238WR;

    /* renamed from: iR */
    private double f16241iR;
    private int ldr;

    /* renamed from: zx */
    private double f16242zx;

    /* renamed from: bg */
    public Map<String, C7472bX> f16240bg = new HashMap();

    /* renamed from: IL */
    public Map<String, C7472bX> f16236IL = new HashMap();

    /* renamed from: bX */
    public Map<String, C7472bX> f16239bX = new HashMap();
    private double eqN = Math.random();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.IL$IL */
    /* loaded from: classes3.dex */
    public static class C7471IL {

        /* renamed from: IL */
        int f16243IL;

        /* renamed from: bX */
        int f16244bX;

        /* renamed from: bg */
        float f16245bg;
        double eqN;

        /* renamed from: zx */
        float f16246zx;

        C7471IL() {
        }

        /* renamed from: bg */
        static JSONObject m88732bg(C7471IL c7471il) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c7471il.f16245bg);
                jSONObject.put("letterSpacing", c7471il.f16243IL);
                jSONObject.put("lineHeight", c7471il.eqN);
                jSONObject.put("maxWidth", c7471il.f16246zx);
                jSONObject.put("fontWeight", c7471il.f16244bX);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX */
    /* loaded from: classes3.dex */
    public static class C7472bX {

        /* renamed from: IL */
        float f16247IL;

        /* renamed from: bg */
        float f16248bg;

        public C7472bX() {
        }

        public C7472bX(float f, float f2) {
            this.f16248bg = f;
            this.f16247IL = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.f16248bg + ", height=" + this.f16247IL + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bg */
    /* loaded from: classes3.dex */
    public static class C7473bg implements Cloneable {

        /* renamed from: IL */
        boolean f16249IL;

        /* renamed from: bX */
        float f16250bX;

        /* renamed from: bg */
        float f16251bg;

        C7473bg() {
        }

        public Object clone() {
            try {
                return (C7473bg) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public C7470IL(double d, int i, double d2, String str, C7282Ta c7282Ta) {
        this.f16242zx = d;
        this.ldr = i;
        this.f16241iR = d2;
        this.f16237Kg = str;
        this.f16238WR = c7282Ta;
    }

    private C7472bX ldr(C7457Kg c7457Kg, float f, float f2) {
        new C7472bX();
        C7465ldr m88755zx = c7457Kg.m88977eo().m88755zx();
        c7457Kg.m88977eo().m88761bX();
        m88755zx.m88787lM();
        float VzQ = m88755zx.VzQ();
        int GvG = m88755zx.GvG();
        double ApA = m88755zx.ApA();
        int gXn = m88755zx.gXn();
        boolean m88822bN = m88755zx.m88822bN();
        boolean m88875GZ = m88755zx.m88875GZ();
        int m88789jz = m88755zx.m88789jz();
        C7471IL c7471il = new C7471IL();
        c7471il.f16245bg = VzQ;
        c7471il.f16243IL = GvG;
        c7471il.f16244bX = gXn;
        c7471il.eqN = ApA;
        c7471il.f16246zx = f;
        return m88740bg(c7457Kg.m88977eo().m88761bX(), c7471il, m88822bN, m88875GZ, m88789jz, c7457Kg);
    }

    /* renamed from: zx */
    private C7472bX m88733zx(C7457Kg c7457Kg, float f, float f2) {
        String str = c7457Kg.m88990bX() + "_" + f + "_" + f2;
        if (this.f16239bX.containsKey(str)) {
            return this.f16239bX.get(str);
        }
        C7472bX ldr = ldr(c7457Kg, f, f2);
        this.f16239bX.put(str, ldr);
        return ldr;
    }

    /* renamed from: IL */
    public C7472bX m88751IL(C7457Kg c7457Kg, float f, float f2) {
        C7472bX c7472bX = new C7472bX();
        if (c7457Kg.m88977eo().m88755zx() == null) {
            return c7472bX;
        }
        C7472bX m88733zx = m88733zx(c7457Kg, f, f2);
        float f3 = m88733zx.f16248bg;
        float f4 = m88733zx.f16247IL;
        c7472bX.f16248bg = Math.min(f3, f);
        c7472bX.f16247IL = Math.min(f4, f2);
        return c7472bX;
    }

    /* renamed from: bX */
    public C7472bX m88747bX(C7457Kg c7457Kg, float f, float f2) {
        if (c7457Kg == null) {
            return null;
        }
        C7472bX m88743bg = m88743bg(c7457Kg);
        if (m88743bg == null || (m88743bg.f16248bg == 0.0f && m88743bg.f16247IL == 0.0f)) {
            C7472bX eqN = eqN(c7457Kg, f, f2);
            m88741bg(c7457Kg, eqN);
            return eqN;
        }
        return m88743bg;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7470IL.C7472bX m88742bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.eqN.zx r0 = r13.m88977eo()
            java.lang.String r0 = r0.m88761bX()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.eqN.zx r0 = r13.m88977eo()
            com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr r0 = r0.m88755zx()
            java.lang.String r0 = r0.m88803dS()
            if (r0 != 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX r13 = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX
            r13.<init>(r1, r1)
            return r13
        L23:
            com.bytedance.sdk.component.adexpress.dynamic.eqN.zx r0 = r13.m88977eo()
            java.lang.String r0 = r0.m88764IL()
            java.lang.String r2 = "creative-playable-bait"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L39
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX r13 = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX
            r13.<init>(r1, r1)
            return r13
        L39:
            float r0 = r13.m88997Kg()
            float r1 = r13.m88991WR()
            com.bytedance.sdk.component.adexpress.dynamic.eqN.zx r2 = r13.m88977eo()
            com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr r2 = r2.m88755zx()
            java.lang.String r3 = r2.DDQ()
            java.lang.String r2 = r2.m88839Uw()
            int r4 = r13.m88993Ta()
            float r4 = (float) r4
            int r5 = r13.yDt()
            float r5 = (float) r5
            float r6 = r13.m88995Lq()
            float r7 = r13.m88973vb()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L86
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX r13 = r12.m88751IL(r13, r0, r1)
            float r13 = r13.f16247IL
        L83:
            float r1 = r13 + r7
            goto Lb7
        L86:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L9f
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX r13 = r12.m88751IL(r13, r14, r0)
            float r14 = r13.f16248bg
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r13 = r13.f16247IL
            goto L83
        L9f:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto Lb6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX r13 = r12.m88751IL(r13, r0, r1)
            float r13 = r13.f16247IL
            goto L83
        Lb6:
            r14 = r0
        Lb7:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto Ld9
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto Ld7
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto Led
        Ld7:
            r15 = r13
            goto Led
        Ld9:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto Le5
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto Led
        Le5:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto Lec
            goto Led
        Lec:
            r15 = r1
        Led:
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX r13 = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX
            r13.<init>()
            r13.f16248bg = r14
            r13.f16247IL = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7470IL.m88742bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg, float, float):com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7470IL.C7472bX eqN(com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7470IL.eqN(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg, float, float):com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX");
    }

    /* renamed from: bX */
    private C7472bX m88745bX(List<C7457Kg> list, float f, float f2) {
        float f3;
        eqN(list);
        C7472bX c7472bX = new C7472bX();
        ArrayList<C7457Kg> arrayList = new ArrayList();
        ArrayList<C7457Kg> arrayList2 = new ArrayList();
        for (C7457Kg c7457Kg : list) {
            C7465ldr m88755zx = c7457Kg.m88977eo().m88755zx();
            if (m88755zx.bCU() == 1 || m88755zx.bCU() == 2) {
                arrayList.add(c7457Kg);
            }
            if (m88755zx.bCU() != 1 && m88755zx.bCU() != 2) {
                arrayList2.add(c7457Kg);
            }
        }
        for (C7457Kg c7457Kg2 : arrayList) {
            m88747bX(c7457Kg2, f, f2);
        }
        if (arrayList2.size() <= 0) {
            return c7472bX;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C7457Kg c7457Kg3 : arrayList2) {
            arrayList3.add(Float.valueOf(m88747bX(c7457Kg3, f, f2).f16248bg));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= arrayList2.size()) {
                break;
            }
            C7457Kg c7457Kg4 = arrayList2.get(i);
            String DDQ = c7457Kg4.m88977eo().m88755zx().DDQ();
            float m88997Kg = c7457Kg4.m88997Kg();
            boolean equals = TextUtils.equals(DDQ, "flex");
            if (TextUtils.equals(DDQ, "auto")) {
                List<List<C7457Kg>> xxp = c7457Kg4.xxp();
                if (xxp != null && xxp.size() > 0) {
                    for (List<C7457Kg> list2 : xxp) {
                        if (m88750IL(list2)) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            C7473bg c7473bg = new C7473bg();
            if (!equals) {
                m88997Kg = ((Float) arrayList3.get(i)).floatValue();
            }
            c7473bg.f16251bg = m88997Kg;
            c7473bg.f16249IL = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            c7473bg.f16250bX = f3;
            arrayList4.add(c7473bg);
            i++;
        }
        m88737bg(arrayList4, f, arrayList2);
        List<C7473bg> m88709bg = C7479eo.m88709bg(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += m88709bg.get(i2).f16251bg;
            if (((Float) arrayList3.get(i2)).floatValue() != m88709bg.get(i2).f16251bg) {
                eqN(arrayList2.get(i2));
            }
        }
        Iterator<C7457Kg> it = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i3++;
            if (!m88752IL(it.next())) {
                z = false;
                break;
            } else if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        f3 = z ? f2 : 0.0f;
        ArrayList<C7472bX> arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            C7457Kg c7457Kg5 = arrayList2.get(i4);
            C7472bX m88747bX = m88747bX(c7457Kg5, m88709bg.get(i4).f16251bg, f2);
            if (!m88752IL(c7457Kg5)) {
                f3 = Math.max(f3, m88747bX.f16247IL);
            }
            arrayList5.add(m88747bX);
        }
        ArrayList arrayList6 = new ArrayList();
        for (C7472bX c7472bX2 : arrayList5) {
            arrayList6.add(Float.valueOf(c7472bX2.f16247IL));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                C7457Kg c7457Kg6 = arrayList2.get(i5);
                if (m88752IL(c7457Kg6) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    eqN(c7457Kg6);
                    m88747bX(c7457Kg6, m88709bg.get(i5).f16251bg, f3);
                }
            }
        }
        c7472bX.f16248bg = f4;
        c7472bX.f16247IL = f3;
        return c7472bX;
    }

    /* renamed from: IL */
    private boolean m88750IL(List<C7457Kg> list) {
        boolean z;
        List<List<C7457Kg>> xxp;
        Iterator<C7457Kg> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().m88977eo().m88755zx().DDQ(), "flex")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        while (true) {
            boolean z2 = false;
            for (C7457Kg c7457Kg : list) {
                if (TextUtils.equals(c7457Kg.m88977eo().m88755zx().DDQ(), "auto") && (xxp = c7457Kg.xxp()) != null) {
                    int i = 0;
                    for (List<C7457Kg> list2 : xxp) {
                        i++;
                        if (!m88750IL(list2)) {
                            break;
                        } else if (i == list2.size()) {
                            z2 = true;
                        }
                    }
                    continue;
                }
            }
            return z2;
        }
    }

    /* renamed from: zx */
    private String m88734zx(C7457Kg c7457Kg) {
        return c7457Kg.m88990bX();
    }

    /* renamed from: IL */
    private C7472bX m88749IL(List<C7457Kg> list, float f, float f2) {
        C7472bX m88739bg = m88739bg(list);
        if (m88739bg == null || (m88739bg.f16248bg == 0.0f && m88739bg.f16247IL == 0.0f)) {
            C7472bX m88745bX = m88745bX(list, f, f2);
            m88736bg(list, m88745bX);
            return m88745bX;
        }
        return m88739bg;
    }

    /* renamed from: IL */
    private boolean m88752IL(C7457Kg c7457Kg) {
        if (c7457Kg == null) {
            return false;
        }
        if (TextUtils.equals(c7457Kg.m88977eo().m88755zx().m88839Uw(), "flex")) {
            return true;
        }
        return m88748bX(c7457Kg);
    }

    /* renamed from: bg */
    private C7472bX m88740bg(String str, C7471IL c7471il, boolean z, boolean z2, int i, C7457Kg c7457Kg) {
        return C7475VB.m88723bg(str, c7457Kg.m88977eo().m88764IL(), C7471IL.m88732bg(c7471il).toString(), z, z2, i, c7457Kg, this.f16242zx, this.ldr, this.f16241iR, this.f16237Kg, this.f16238WR);
    }

    /* renamed from: bg */
    private void m88738bg(List<List<C7457Kg>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        boolean z = false;
        for (List<C7457Kg> list2 : list) {
            if (m88735bg(list2, false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<C7457Kg> list3 : list) {
            C7473bg c7473bg = new C7473bg();
            boolean m88735bg = m88735bg(list3, !z);
            c7473bg.f16251bg = m88735bg ? 1.0f : m88749IL(list3, f, f2).f16247IL;
            c7473bg.f16249IL = !m88735bg;
            arrayList.add(c7473bg);
        }
        List<C7473bg> m88709bg = C7479eo.m88709bg(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((C7473bg) arrayList.get(i)).f16251bg != m88709bg.get(i).f16251bg) {
                List<C7457Kg> list4 = list.get(i);
                m88746bX(list4);
                m88749IL(list4, f, m88709bg.get(i).f16251bg);
            }
        }
    }

    private void eqN(C7457Kg c7457Kg) {
        this.f16240bg.remove(m88734zx(c7457Kg));
        List<List<C7457Kg>> xxp = c7457Kg.xxp();
        if (xxp == null || xxp.size() <= 0) {
            return;
        }
        for (List<C7457Kg> list : xxp) {
            m88746bX(list);
        }
    }

    private String eqN(List<C7457Kg> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String m88990bX = list.get(i).m88990bX();
            if (i < list.size() - 1) {
                sb2.append(m88990bX);
                sb2.append("-");
            } else {
                sb2.append(m88990bX);
            }
        }
        return sb2.toString();
    }

    /* renamed from: bg */
    private boolean m88735bg(List<C7457Kg> list, boolean z) {
        boolean z2;
        for (C7457Kg c7457Kg : list) {
            C7465ldr m88755zx = c7457Kg.m88977eo().m88755zx();
            String m88839Uw = m88755zx.m88839Uw();
            if (TextUtils.equals(m88839Uw, "flex") || (z && ((TextUtils.equals(m88755zx.DDQ(), "flex") && TextUtils.equals(m88755zx.m88839Uw(), "scale") && C7466zx.f16232bg.get(c7457Kg.m88977eo().m88764IL()).intValue() == 7) || TextUtils.equals(m88839Uw, "flex")))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (z2) {
            return true;
        }
        for (C7457Kg c7457Kg2 : list) {
            if (m88748bX(c7457Kg2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bX */
    private boolean m88748bX(C7457Kg c7457Kg) {
        List<List<C7457Kg>> xxp;
        if (!c7457Kg.VzQ() && TextUtils.equals(c7457Kg.m88977eo().m88755zx().m88839Uw(), "auto") && (xxp = c7457Kg.xxp()) != null && xxp.size() > 0) {
            if (xxp.size() == 1) {
                for (C7457Kg c7457Kg2 : xxp.get(0)) {
                    if (!m88752IL(c7457Kg2)) {
                        return false;
                    }
                }
                return true;
            }
            for (List<C7457Kg> list : xxp) {
                if (m88735bg(list, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: bg */
    private void m88737bg(List<C7473bg> list, float f, List<C7457Kg> list2) {
        float f2 = 0.0f;
        for (C7473bg c7473bg : list) {
            if (c7473bg.f16249IL) {
                f2 += c7473bg.f16251bg;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).f16249IL && list2.get(i2).m88974tC()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    C7473bg c7473bg2 = list.get(i3);
                    if (c7473bg2.f16249IL && list2.get(i3).m88974tC()) {
                        c7473bg2.f16251bg -= ceil;
                    }
                }
            }
        }
    }

    /* renamed from: bX */
    private void m88746bX(List<C7457Kg> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f16236IL.remove(eqN(list));
        for (C7457Kg c7457Kg : list) {
            eqN(c7457Kg);
        }
    }

    /* renamed from: bg */
    public void m88744bg() {
        this.f16239bX.clear();
        this.f16240bg.clear();
        this.f16236IL.clear();
    }

    /* renamed from: bg */
    public C7472bX m88743bg(C7457Kg c7457Kg) {
        return this.f16240bg.get(m88734zx(c7457Kg));
    }

    /* renamed from: bg */
    public C7472bX m88739bg(List<C7457Kg> list) {
        return this.f16236IL.get(eqN(list));
    }

    /* renamed from: bg */
    private void m88741bg(C7457Kg c7457Kg, C7472bX c7472bX) {
        this.f16240bg.put(m88734zx(c7457Kg), c7472bX);
    }

    /* renamed from: bg */
    private void m88736bg(List<C7457Kg> list, C7472bX c7472bX) {
        this.f16236IL.put(eqN(list), c7472bX);
    }
}
