package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7506IL;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg */
/* loaded from: classes3.dex */
public class C7372bg implements InterfaceC7385iR {

    /* renamed from: bg */
    private C7506IL f15926bg;

    public C7372bg(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        double zCS = c7464iR.zCS();
        zCS = zCS == 0.0d ? 1.0d : zCS;
        double m88901Ys = c7464iR.m88901Ys();
        double d = m88901Ys != 0.0d ? m88901Ys : 1.0d;
        int dynamicWidth = (int) (abstractC7449zx.getDynamicWidth() * 0.32d * zCS);
        int dynamicWidth2 = (int) (abstractC7449zx.getDynamicWidth() * 0.32d * d);
        this.f15926bg = new C7506IL(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) C7489Kg.m88675bg(context, c7464iR.m88882wS() - 7);
        layoutParams.leftMargin = (int) C7489Kg.m88675bg(context, c7464iR.cZH() - 3);
        this.f15926bg.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15926bg.m88652IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bX */
    public ViewGroup mo89072bX() {
        return this.f15926bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15926bg.m88648bg();
    }
}
