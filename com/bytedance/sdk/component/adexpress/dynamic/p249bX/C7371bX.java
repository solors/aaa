package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.ldr.C7559zx;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bX */
/* loaded from: classes3.dex */
public class C7371bX implements InterfaceC7385iR {

    /* renamed from: bg */
    C7559zx f15925bg;

    public C7371bX(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        this.f15925bg = new C7559zx(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(abstractC7449zx.getDynamicHeight(), abstractC7449zx.getDynamicHeight());
        layoutParams.gravity = 17;
        this.f15925bg.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15925bg.m88559IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15925bg.m88557bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: eqN */
    public C7559zx mo89072bX() {
        return this.f15925bg;
    }
}
