package com.bytedance.sdk.component.adexpress.p241IL;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo;

/* renamed from: com.bytedance.sdk.component.adexpress.IL.ldr */
/* loaded from: classes3.dex */
public class C7292ldr implements InterfaceC7288eo {

    /* renamed from: IL */
    private AbstractC7287bg f15775IL;

    /* renamed from: bX */
    private C7282Ta f15776bX;

    /* renamed from: bg */
    private Context f15777bg;

    public C7292ldr(Context context, C7282Ta c7282Ta, AbstractC7287bg abstractC7287bg) {
        this.f15777bg = context;
        this.f15775IL = abstractC7287bg;
        this.f15776bX = c7282Ta;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo
    /* renamed from: bg */
    public void mo84923bg() {
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo
    /* renamed from: bg */
    public boolean mo84922bg(final InterfaceC7288eo.InterfaceC7289bg interfaceC7289bg) {
        this.f15776bX.m89328zx().ldr();
        this.f15775IL.mo84828bg(new InterfaceC7291iR() { // from class: com.bytedance.sdk.component.adexpress.IL.ldr.1
            @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7291iR
            /* renamed from: bg */
            public void mo84917bg(View view, C7297yDt c7297yDt) {
                if (interfaceC7289bg.mo89287bX()) {
                    return;
                }
                InterfaceC7280Lq mo89289IL = interfaceC7289bg.mo89289IL();
                if (mo89289IL != null) {
                    mo89289IL.mo85633bg(C7292ldr.this.f15775IL, c7297yDt);
                }
                interfaceC7289bg.mo89283bg(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7291iR
            /* renamed from: bg */
            public void mo84918bg(int i, String str) {
                InterfaceC7280Lq mo89289IL = interfaceC7289bg.mo89289IL();
                if (mo89289IL != null) {
                    mo89289IL.mo85826a_(i);
                }
            }
        });
        return true;
    }

    /* renamed from: bg */
    public void m89282bg(InterfaceC7286bX interfaceC7286bX) {
        this.f15775IL.mo85804bg(interfaceC7286bX);
    }
}
