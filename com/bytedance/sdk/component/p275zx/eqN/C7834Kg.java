package com.bytedance.sdk.component.p275zx.eqN;

import com.bytedance.sdk.component.p275zx.InterfaceC7851xxp;
import com.bytedance.sdk.component.p275zx.p277bX.C7788bX;
import com.bytedance.sdk.component.p275zx.p277bX.C7798bg;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.zx.eqN.Kg */
/* loaded from: classes3.dex */
public class C7834Kg extends AbstractC7841bg {

    /* renamed from: IL */
    private int f17107IL;

    /* renamed from: bX */
    private String f17108bX;

    /* renamed from: bg */
    private Throwable f17109bg;

    public C7834Kg(int i, String str, Throwable th) {
        this.f17107IL = i;
        this.f17108bX = str;
        this.f17109bg = th;
    }

    /* renamed from: IL */
    private void m87564IL(C7788bX c7788bX) {
        InterfaceC7851xxp m87760WR = c7788bX.m87760WR();
        if (m87760WR != null) {
            m87760WR.mo82308bg(this.f17107IL, this.f17108bX, this.f17109bg);
        }
    }

    @Override // com.bytedance.sdk.component.p275zx.eqN.InterfaceC7839WR
    /* renamed from: bg */
    public String mo87556bg() {
        return "failed";
    }

    @Override // com.bytedance.sdk.component.p275zx.eqN.InterfaceC7839WR
    /* renamed from: bg */
    public void mo87554bg(C7788bX c7788bX) {
        c7788bX.m87750bg(new C7798bg(this.f17107IL, this.f17108bX, this.f17109bg));
        String rri = c7788bX.rri();
        Map<String, List<C7788bX>> m87608iR = c7788bX.tuV().m87608iR();
        List<C7788bX> list = m87608iR.get(rri);
        if (list == null) {
            m87564IL(c7788bX);
            return;
        }
        synchronized (list) {
            for (C7788bX c7788bX2 : list) {
                m87564IL(c7788bX2);
            }
            list.clear();
            m87608iR.remove(rri);
        }
    }
}
