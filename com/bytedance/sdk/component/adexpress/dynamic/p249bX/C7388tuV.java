package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7521VB;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.tuV */
/* loaded from: classes3.dex */
public class C7388tuV implements InterfaceC7385iR<C7521VB> {

    /* renamed from: bg */
    private final C7521VB f15982bg;

    public C7388tuV(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        int i;
        C7521VB c7521vb = new C7521VB(context);
        this.f15982bg = c7521vb;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (c7464iR.m88909RJ() > 0) {
            i = c7464iR.m88909RJ();
        } else if (C7487eqN.m88685IL()) {
            i = 0;
        } else {
            i = 120;
        }
        layoutParams.bottomMargin = (int) C7489Kg.m88675bg(context, i);
        c7521vb.setLayoutParams(layoutParams);
        c7521vb.setClipChildren(false);
        c7521vb.setText(c7464iR.GvG());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        C7521VB c7521vb = this.f15982bg;
        if (c7521vb != null) {
            c7521vb.m88622IL();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        C7521VB c7521vb = this.f15982bg;
        if (c7521vb != null) {
            c7521vb.m88619bg();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: eqN */
    public C7521VB mo89072bX() {
        return this.f15982bg;
    }
}
