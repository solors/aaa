package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;
import java.lang.ref.SoftReference;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bg */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7376bg implements View.OnTouchListener {

    /* renamed from: bX */
    private static int f15943bX = 10;

    /* renamed from: IL */
    private float f15944IL;

    /* renamed from: bg */
    private float f15947bg;
    private InterfaceC7360Kg eqN;

    /* renamed from: zx */
    private int f15950zx;
    private RectF ldr = new RectF();

    /* renamed from: iR */
    private long f15949iR = 0;

    /* renamed from: Kg */
    private final int f15945Kg = 200;

    /* renamed from: WR */
    private final int f15946WR = 3;

    /* renamed from: eo */
    private SoftReference<ViewGroup> f15948eo = new SoftReference<>(null);

    public View$OnTouchListenerC7376bg(InterfaceC7360Kg interfaceC7360Kg, int i, final ViewGroup viewGroup) {
        this.f15950zx = f15943bX;
        this.eqN = interfaceC7360Kg;
        if (i > 0) {
            this.f15950zx = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    View$OnTouchListenerC7376bg.this.f15948eo = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC7360Kg interfaceC7360Kg;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF = this.ldr;
                if (rectF != null && !rectF.contains(this.f15947bg, this.f15944IL)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float abs = Math.abs(rawX - this.f15947bg);
                float abs2 = Math.abs(rawY - this.f15944IL);
                int i = this.f15950zx;
                if (abs >= i && abs2 >= i) {
                    InterfaceC7360Kg interfaceC7360Kg2 = this.eqN;
                    if (interfaceC7360Kg2 != null) {
                        interfaceC7360Kg2.mo89085bg();
                    }
                } else if ((System.currentTimeMillis() - this.f15949iR < 200 || (abs < 3.0f && abs2 < 3.0f)) && (interfaceC7360Kg = this.eqN) != null) {
                    interfaceC7360Kg.mo89085bg();
                }
            }
        } else {
            this.ldr = m89079bg(this.f15948eo.get());
            this.f15947bg = motionEvent.getRawX();
            this.f15944IL = motionEvent.getRawY();
            this.f15949iR = System.currentTimeMillis();
        }
        return true;
    }

    /* renamed from: bg */
    private RectF m89079bg(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }
}
