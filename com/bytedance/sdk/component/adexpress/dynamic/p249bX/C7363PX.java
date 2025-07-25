package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7556yDt;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.PX */
/* loaded from: classes3.dex */
public class C7363PX implements InterfaceC7385iR {

    /* renamed from: bg */
    private C7556yDt f15904bg;

    public C7363PX(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        this.f15904bg = new C7556yDt(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C7489Kg.m88675bg(context, 180.0f), (int) C7489Kg.m88675bg(context, 180.0f));
        layoutParams.gravity = 17;
        this.f15904bg.setLayoutParams(layoutParams);
        this.f15904bg.setGuideText(c7464iR.GvG());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15904bg.m88566IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bX */
    public ViewGroup mo89072bX() {
        return this.f15904bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15904bg.m88562bg();
    }
}
