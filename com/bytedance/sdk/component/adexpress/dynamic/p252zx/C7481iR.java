package com.bytedance.sdk.component.adexpress.dynamic.p252zx;

import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg;
import com.bytedance.sdk.component.adexpress.dynamic.ldr.InterfaceC7467IL;
import com.bytedance.sdk.component.adexpress.eqN.C7495eqN;
import com.bytedance.sdk.component.adexpress.p241IL.C7282Ta;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.iR */
/* loaded from: classes3.dex */
public class C7481iR implements InterfaceC7474Kg {

    /* renamed from: bg */
    private InterfaceC7467IL f16254bg;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m88706IL(C7282Ta c7282Ta) {
        try {
            JSONObject m89334bX = c7282Ta.m89334bX();
            JSONObject jSONObject = new JSONObject(m89334bX.optString("template_Plugin"));
            JSONObject optJSONObject = m89334bX.optJSONObject(Reporting.Key.CREATIVE);
            C7457Kg m88700bg = new C7483ldr(jSONObject, optJSONObject, m89334bX.optJSONObject("AdSize"), new JSONObject(m89334bX.optString("diff_template_Plugin"))).m88700bg(c7282Ta.m89342IL(), c7282Ta.m89332eo(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), c7282Ta);
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("dynamic_creative"));
                m88700bg.m88982bg(jSONObject2.optString("color"));
                m88700bg.m88979bg(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.f16254bg.mo88754bg(m88700bg);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p252zx.InterfaceC7474Kg
    /* renamed from: bg */
    public void mo88704bg(InterfaceC7467IL interfaceC7467IL) {
        this.f16254bg = interfaceC7467IL;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p252zx.InterfaceC7474Kg
    /* renamed from: bg */
    public void mo88705bg(final C7282Ta c7282Ta) {
        if (c7282Ta.m89338PX() == 1) {
            m88706IL(c7282Ta);
        } else {
            C7495eqN.m88665bg(new AbstractRunnableC7227Kg("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.zx.iR.1
                @Override // java.lang.Runnable
                public void run() {
                    C7481iR.this.m88706IL(c7282Ta);
                }
            }, 5);
        }
    }
}
