package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7541rri;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ */
/* loaded from: classes3.dex */
public class C7366VzQ<E extends C7541rri> implements InterfaceC7385iR<E> {

    /* renamed from: IL */
    protected Context f15908IL;

    /* renamed from: bX */
    protected AbstractC7449zx f15909bX;

    /* renamed from: bg */
    protected C7541rri f15910bg;
    protected C7464iR eqN;

    /* renamed from: zx */
    protected int f15911zx;

    public C7366VzQ(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR, int i) {
        this.f15911zx = i;
        this.f15908IL = context;
        this.f15909bX = abstractC7449zx;
        this.eqN = c7464iR;
        eqN();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15910bg.mo88590IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15910bg.mo88587bg();
    }

    protected void eqN() {
        this.f15910bg = new C7541rri(this.f15908IL, this.eqN.Dxa());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C7489Kg.m88675bg(this.f15908IL, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C7489Kg.m88675bg(this.f15908IL, 100 - this.f15911zx);
        this.f15910bg.setLayoutParams(layoutParams);
        try {
            this.f15910bg.setGuideText(this.eqN.GvG());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: zx */
    public E mo89072bX() {
        return (E) this.f15910bg;
    }

    public C7366VzQ(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        this(context, abstractC7449zx, c7464iR, 0);
    }
}
