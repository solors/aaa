package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bX */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7375bX implements View.OnTouchListener {

    /* renamed from: IL */
    private float f15936IL;

    /* renamed from: Kg */
    private boolean f15937Kg;

    /* renamed from: WR */
    private boolean f15938WR;

    /* renamed from: bX */
    private float f15939bX;

    /* renamed from: bg */
    private float f15940bg;
    private float eqN;

    /* renamed from: iR */
    private int f15941iR;
    private InterfaceC7360Kg ldr;

    /* renamed from: zx */
    private boolean f15942zx;

    public View$OnTouchListenerC7375bX(InterfaceC7360Kg interfaceC7360Kg) {
        this(interfaceC7360Kg, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC7360Kg interfaceC7360Kg;
        InterfaceC7360Kg interfaceC7360Kg2;
        InterfaceC7360Kg interfaceC7360Kg3;
        if (this.f15938WR) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.eqN = motionEvent.getX();
                    this.f15939bX = motionEvent.getY();
                    if (Math.abs(this.eqN - this.f15940bg) > 10.0f) {
                        this.f15942zx = true;
                    }
                    if (Math.abs(this.eqN - this.f15940bg) > 8.0f || Math.abs(this.f15939bX - this.f15936IL) > 8.0f) {
                        this.f15937Kg = false;
                    }
                    int m88680IL = C7489Kg.m88680IL(C7487eqN.m88683bg(), Math.abs(this.eqN - this.f15940bg));
                    if (this.eqN > this.f15940bg && m88680IL > this.f15941iR && (interfaceC7360Kg3 = this.ldr) != null) {
                        interfaceC7360Kg3.mo89085bg();
                        this.f15938WR = true;
                    }
                }
            } else if (!this.f15942zx && !this.f15937Kg) {
                return false;
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int m88680IL2 = C7489Kg.m88680IL(C7487eqN.m88683bg(), Math.abs(this.eqN - this.f15940bg));
                if (this.eqN > this.f15940bg && m88680IL2 > this.f15941iR && (interfaceC7360Kg2 = this.ldr) != null) {
                    interfaceC7360Kg2.mo89085bg();
                    this.f15938WR = true;
                }
                float abs = Math.abs(x - this.f15940bg);
                float abs2 = Math.abs(y - this.f15936IL);
                if ((abs < 8.0f || abs2 < 8.0f) && (interfaceC7360Kg = this.ldr) != null) {
                    interfaceC7360Kg.mo89090IL();
                    this.f15938WR = true;
                }
            }
        } else {
            this.f15940bg = motionEvent.getX();
            this.f15936IL = motionEvent.getY();
        }
        return true;
    }

    public View$OnTouchListenerC7375bX(InterfaceC7360Kg interfaceC7360Kg, int i) {
        this.f15941iR = 5;
        this.f15937Kg = true;
        this.ldr = interfaceC7360Kg;
        if (i > 0) {
            this.f15941iR = i;
        }
    }
}
