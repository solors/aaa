package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7545tC;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.xxp */
/* loaded from: classes3.dex */
public class C7389xxp implements InterfaceC7385iR {

    /* renamed from: IL */
    private Context f15983IL;

    /* renamed from: bX */
    private AbstractC7449zx f15984bX;

    /* renamed from: bg */
    private C7545tC f15985bg;
    private C7464iR eqN;

    public C7389xxp(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        this.f15983IL = context;
        this.f15984bX = abstractC7449zx;
        this.eqN = c7464iR;
        eqN();
    }

    private void eqN() {
        this.f15985bg = new C7545tC(this.f15983IL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) C7489Kg.m88675bg(this.f15983IL, 120.0f));
        layoutParams.gravity = 17;
        this.f15985bg.setLayoutParams(layoutParams);
        this.f15985bg.setClipChildren(false);
        this.f15985bg.setGuideText(this.eqN.GvG());
        AbstractC7449zx abstractC7449zx = this.f15984bX;
        if (abstractC7449zx != null) {
            this.f15985bg.setOnClickListener((View.OnClickListener) abstractC7449zx.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        C7545tC c7545tC = this.f15985bg;
        if (c7545tC != null) {
            c7545tC.m88584IL();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bX */
    public ViewGroup mo89072bX() {
        return this.f15985bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        C7545tC c7545tC = this.f15985bg;
        if (c7545tC != null) {
            c7545tC.m88580bg();
        }
    }
}
