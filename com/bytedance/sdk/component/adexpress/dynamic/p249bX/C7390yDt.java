package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7553xxp;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.yDt */
/* loaded from: classes3.dex */
public class C7390yDt implements InterfaceC7385iR<C7553xxp> {

    /* renamed from: bg */
    private C7553xxp f15986bg;

    public C7390yDt(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        this.f15986bg = new C7553xxp(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(context, 180.0f), (int) C7489Kg.m88675bg(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) C7489Kg.m88675bg(context, 20.0f);
        this.f15986bg.setLayoutParams(layoutParams);
        this.f15986bg.setGuideText(c7464iR.GvG());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15986bg.m88573IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15986bg.m88569bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: eqN */
    public C7553xxp mo89072bX() {
        return this.f15986bg;
    }
}
