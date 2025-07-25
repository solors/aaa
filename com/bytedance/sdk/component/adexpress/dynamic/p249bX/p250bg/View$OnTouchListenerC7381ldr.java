package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.ldr */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7381ldr implements View.OnTouchListener {

    /* renamed from: bX */
    private static int f15972bX = 10;

    /* renamed from: IL */
    private float f15973IL;

    /* renamed from: bg */
    private float f15974bg;
    private boolean eqN;

    /* renamed from: zx */
    private InterfaceC7360Kg f15975zx;

    public View$OnTouchListenerC7381ldr(InterfaceC7360Kg interfaceC7360Kg) {
        this.f15975zx = interfaceC7360Kg;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.eqN = false;
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.f15974bg) >= f15972bX || Math.abs(y - this.f15973IL) >= f15972bX) {
                        this.eqN = true;
                    }
                }
            } else if (this.eqN) {
                this.eqN = false;
                return false;
            } else {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.f15974bg) < f15972bX && Math.abs(y2 - this.f15973IL) < f15972bX) {
                    InterfaceC7360Kg interfaceC7360Kg = this.f15975zx;
                    if (interfaceC7360Kg != null) {
                        interfaceC7360Kg.mo89085bg();
                    }
                } else {
                    this.eqN = false;
                }
            }
        } else {
            this.f15974bg = motionEvent.getX();
            this.f15973IL = motionEvent.getY();
        }
        return true;
    }
}
