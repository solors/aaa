package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.zx */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7382zx implements View.OnTouchListener {

    /* renamed from: IL */
    private float f15976IL;

    /* renamed from: bX */
    private boolean f15977bX;

    /* renamed from: bg */
    private float f15978bg;
    private InterfaceC7360Kg eqN;

    /* renamed from: zx */
    private int f15979zx;

    public View$OnTouchListenerC7382zx(InterfaceC7360Kg interfaceC7360Kg, int i) {
        this.eqN = interfaceC7360Kg;
        this.f15979zx = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC7360Kg interfaceC7360Kg;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = motionEvent.getY();
                    this.f15976IL = y;
                    if (Math.abs(y - this.f15978bg) > 10.0f) {
                        this.f15977bX = true;
                    }
                }
            } else if (!this.f15977bX) {
                return false;
            } else {
                int m88680IL = C7489Kg.m88680IL(C7487eqN.m88683bg(), Math.abs(this.f15976IL - this.f15978bg));
                if (this.f15976IL - this.f15978bg < 0.0f && m88680IL > this.f15979zx && (interfaceC7360Kg = this.eqN) != null) {
                    interfaceC7360Kg.mo89085bg();
                    this.f15978bg = 0.0f;
                    this.f15976IL = 0.0f;
                    this.f15977bX = false;
                }
            }
        } else {
            this.f15978bg = motionEvent.getY();
        }
        return true;
    }
}
