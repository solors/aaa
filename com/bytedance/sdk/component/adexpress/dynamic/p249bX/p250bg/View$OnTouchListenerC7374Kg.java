package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.Kg */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7374Kg implements View.OnTouchListener {

    /* renamed from: IL */
    private final boolean f15931IL;

    /* renamed from: bX */
    private final int f15932bX = 10;

    /* renamed from: bg */
    private final InterfaceC7360Kg f15933bg;
    private float eqN;

    /* renamed from: iR */
    private float f15934iR;
    private float ldr;

    /* renamed from: zx */
    private float f15935zx;

    public View$OnTouchListenerC7374Kg(InterfaceC7360Kg interfaceC7360Kg, boolean z) {
        this.f15933bg = interfaceC7360Kg;
        this.f15931IL = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC7360Kg interfaceC7360Kg;
        InterfaceC7360Kg interfaceC7360Kg2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.ldr = motionEvent.getX();
                this.f15934iR = motionEvent.getY();
                new StringBuilder(", mEndY: ").append(this.f15934iR);
                if (!this.f15931IL && (interfaceC7360Kg2 = this.f15933bg) != null) {
                    interfaceC7360Kg2.mo89085bg();
                } else {
                    float f = this.ldr - this.eqN;
                    float f2 = this.f15934iR - this.f15935zx;
                    if (C7489Kg.m88680IL(C7487eqN.m88683bg(), Math.abs((float) Math.sqrt((f * f) + (f2 * f2)))) > 10.0f && (interfaceC7360Kg = this.f15933bg) != null) {
                        interfaceC7360Kg.mo89085bg();
                    }
                }
            }
        } else {
            this.eqN = motionEvent.getX();
            this.f15935zx = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.f15935zx);
        }
        return true;
    }
}
