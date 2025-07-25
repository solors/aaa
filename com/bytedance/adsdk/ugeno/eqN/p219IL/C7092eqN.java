package com.bytedance.adsdk.ugeno.eqN.p219IL;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.eqN.C7086IL;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.IL.eqN */
/* loaded from: classes3.dex */
public class C7092eqN extends AbstractC7090bg {
    public C7092eqN(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, C7086IL.C7087bg c7087bg) {
        super(abstractView$OnTouchListenerC6981bX, str, c7087bg);
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.p219IL.AbstractC7090bg
    /* renamed from: bg */
    public void mo90045bg() {
        Map<String, String> map = this.ldr;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.ldr.get("id");
        if (TextUtils.isEmpty(str)) {
            m90044bg(this.f15252bX);
            return;
        }
        AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX = this.f15252bX;
        AbstractView$OnTouchListenerC6981bX m90386IL = abstractView$OnTouchListenerC6981bX.m90386IL(abstractView$OnTouchListenerC6981bX);
        if (m90386IL == null) {
            return;
        }
        m90044bg(m90386IL.m90367bX(str));
    }

    /* renamed from: bg */
    private void m90044bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        if (abstractView$OnTouchListenerC6981bX == null) {
            return;
        }
        for (String str : this.ldr.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                abstractView$OnTouchListenerC6981bX.mo84929bg(str, this.ldr.get(str));
            }
        }
        abstractView$OnTouchListenerC6981bX.m90383Ja();
        abstractView$OnTouchListenerC6981bX.mo84928IL();
    }
}
