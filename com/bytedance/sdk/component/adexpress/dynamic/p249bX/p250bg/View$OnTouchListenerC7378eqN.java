package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.eqN */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7378eqN implements View.OnTouchListener {

    /* renamed from: IL */
    private float f15953IL;

    /* renamed from: Kg */
    private boolean f15954Kg;

    /* renamed from: VB */
    private boolean f15955VB;

    /* renamed from: WR */
    private InterfaceC7360Kg f15956WR;

    /* renamed from: bX */
    private float f15957bX;

    /* renamed from: bg */
    private float f15958bg;

    /* renamed from: eo */
    private int f15959eo;
    private float eqN;

    /* renamed from: iR */
    private float f15960iR;
    private float ldr;

    /* renamed from: zx */
    private boolean f15961zx = true;

    public View$OnTouchListenerC7378eqN(InterfaceC7360Kg interfaceC7360Kg, int i, boolean z) {
        this.f15956WR = interfaceC7360Kg;
        this.f15959eo = i;
        this.f15955VB = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC7360Kg interfaceC7360Kg;
        InterfaceC7360Kg interfaceC7360Kg2;
        InterfaceC7360Kg interfaceC7360Kg3;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = motionEvent.getY();
                    this.f15960iR = y;
                    if (Math.abs(y - this.ldr) > 10.0f) {
                        this.f15954Kg = true;
                    }
                    this.eqN = motionEvent.getX();
                    this.f15957bX = motionEvent.getY();
                    if (Math.abs(this.eqN - this.f15958bg) > 8.0f || Math.abs(this.f15957bX - this.f15953IL) > 8.0f) {
                        this.f15961zx = false;
                    }
                }
            } else if (!this.f15954Kg && !this.f15961zx) {
                return false;
            } else {
                if (!this.f15955VB && (interfaceC7360Kg3 = this.f15956WR) != null) {
                    interfaceC7360Kg3.mo89085bg();
                } else {
                    int m88680IL = C7489Kg.m88680IL(C7487eqN.m88683bg(), Math.abs(this.f15960iR - this.ldr));
                    if (this.f15960iR - this.ldr < 0.0f && m88680IL > this.f15959eo && (interfaceC7360Kg2 = this.f15956WR) != null) {
                        interfaceC7360Kg2.mo89085bg();
                    } else if (this.f15961zx && (interfaceC7360Kg = this.f15956WR) != null) {
                        interfaceC7360Kg.mo89085bg();
                    }
                }
            }
        } else {
            this.f15958bg = motionEvent.getX();
            this.f15953IL = motionEvent.getY();
            this.ldr = motionEvent.getY();
            this.f15961zx = true;
        }
        return true;
    }
}
