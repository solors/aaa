package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7529bX;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.IL */
/* loaded from: classes3.dex */
public class C7359IL implements InterfaceC7385iR {

    /* renamed from: bg */
    private C7529bX f15894bg;

    public C7359IL(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        this.f15894bg = new C7529bX(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(context, 180.0f), (int) C7489Kg.m88675bg(context, 180.0f));
        layoutParams.gravity = 17;
        this.f15894bg.setLayoutParams(layoutParams);
        this.f15894bg.setGuideText(c7464iR.GvG());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15894bg.m88611IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15894bg.m88609bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: eqN */
    public C7529bX mo89072bX() {
        return this.f15894bg;
    }
}
