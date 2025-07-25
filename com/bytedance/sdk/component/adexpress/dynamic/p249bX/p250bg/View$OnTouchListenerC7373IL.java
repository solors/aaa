package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.C7367WR;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.IL */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7373IL implements View.OnTouchListener {

    /* renamed from: IL */
    private float f15927IL;

    /* renamed from: bX */
    private long f15928bX;

    /* renamed from: bg */
    private float f15929bg;
    private boolean eqN;
    private InterfaceC7360Kg ldr;

    /* renamed from: zx */
    private C7367WR f15930zx;

    public View$OnTouchListenerC7373IL(C7367WR c7367wr, InterfaceC7360Kg interfaceC7360Kg) {
        this.f15930zx = c7367wr;
        this.ldr = interfaceC7360Kg;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.f15929bg) >= C7489Kg.m88675bg(C7487eqN.m88683bg(), 10.0f) || Math.abs(y - this.f15927IL) >= C7489Kg.m88675bg(C7487eqN.m88683bg(), 10.0f)) {
                        this.eqN = true;
                        this.f15930zx.ldr();
                    }
                }
            } else if (this.eqN) {
                return false;
            } else {
                if (System.currentTimeMillis() - this.f15928bX >= 1500) {
                    InterfaceC7360Kg interfaceC7360Kg = this.ldr;
                    if (interfaceC7360Kg != null) {
                        interfaceC7360Kg.mo89085bg();
                    }
                }
                this.f15930zx.ldr();
            }
        } else {
            this.f15928bX = System.currentTimeMillis();
            this.f15929bg = motionEvent.getX();
            this.f15927IL = motionEvent.getY();
            this.f15930zx.m89080zx();
        }
        return true;
    }
}
