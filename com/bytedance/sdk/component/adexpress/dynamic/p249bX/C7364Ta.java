package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.ldr.C7511Lq;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.Ta */
/* loaded from: classes3.dex */
public class C7364Ta implements InterfaceC7385iR {

    /* renamed from: bg */
    private C7511Lq f15905bg;

    public C7364Ta(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        this.f15905bg = new C7511Lq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(abstractC7449zx.getDynamicHeight(), abstractC7449zx.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.f15905bg.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15905bg.m88640IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15905bg.m88636bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: eqN */
    public C7511Lq mo89072bX() {
        return this.f15905bg;
    }
}
