package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.dynamic.ldr.InterfaceC7468bg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.ldr.C7499Fy;
import com.bytedance.sdk.component.adexpress.p242bX.C7300bg;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.Lq */
/* loaded from: classes3.dex */
public class C7361Lq implements InterfaceC7385iR<C7499Fy> {

    /* renamed from: IL */
    private Context f15895IL;

    /* renamed from: Kg */
    private int f15896Kg;

    /* renamed from: WR */
    private JSONObject f15897WR;

    /* renamed from: bX */
    private AbstractC7449zx f15898bX;

    /* renamed from: bg */
    private C7499Fy f15899bg;
    private C7464iR eqN;

    /* renamed from: iR */
    private int f15900iR;
    private int ldr;

    /* renamed from: zx */
    private String f15901zx;

    public C7361Lq(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.f15895IL = context;
        this.f15898bX = abstractC7449zx;
        this.eqN = c7464iR;
        this.f15901zx = str;
        this.ldr = i;
        this.f15900iR = i2;
        this.f15896Kg = i3;
        this.f15897WR = jSONObject;
        m89093zx();
    }

    /* renamed from: zx */
    private void m89093zx() {
        final InterfaceC7468bg dynamicClickListener = this.f15898bX.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.f15901zx)) {
            Context context = this.f15895IL;
            C7499Fy c7499Fy = new C7499Fy(context, C7300bg.m89248Kg(context), this.ldr, this.f15900iR, this.f15896Kg, this.f15897WR);
            this.f15899bg = c7499Fy;
            if (c7499Fy.getShakeLayout() != null) {
                this.f15899bg.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.f15895IL;
            this.f15899bg = new C7499Fy(context2, C7300bg.m89244iR(context2), this.ldr, this.f15900iR, this.f15896Kg, this.f15897WR);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f15899bg.setGravity(17);
        layoutParams.gravity = 17;
        this.f15899bg.setLayoutParams(layoutParams);
        this.f15899bg.setTranslationY(C7489Kg.m88675bg(this.f15895IL, this.eqN.m88894dS()));
        this.f15899bg.setShakeText(this.eqN.GvG());
        this.f15899bg.setClipChildren(false);
        this.f15899bg.setOnShakeViewListener(new C7499Fy.InterfaceC7505bg() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.Lq.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: IL */
    public void mo89071IL() {
        this.f15899bg.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: bg */
    public void mo89070bg() {
        this.f15899bg.m88654bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7385iR
    /* renamed from: eqN */
    public C7499Fy mo89072bX() {
        return this.f15899bg;
    }
}
