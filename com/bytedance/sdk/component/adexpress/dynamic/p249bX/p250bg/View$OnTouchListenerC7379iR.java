package com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import java.lang.ref.SoftReference;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.iR */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7379iR implements View.OnTouchListener {

    /* renamed from: bX */
    private static int f15962bX = 10;

    /* renamed from: IL */
    private float f15963IL;

    /* renamed from: bg */
    private float f15966bg;
    private InterfaceC7360Kg eqN;

    /* renamed from: zx */
    private int f15969zx;
    private RectF ldr = new RectF();

    /* renamed from: iR */
    private long f15968iR = 0;

    /* renamed from: Kg */
    private final int f15964Kg = 200;

    /* renamed from: WR */
    private final int f15965WR = 3;

    /* renamed from: eo */
    private SoftReference<View> f15967eo = new SoftReference<>(null);

    public View$OnTouchListenerC7379iR(InterfaceC7360Kg interfaceC7360Kg, int i, final ViewGroup viewGroup) {
        this.f15969zx = f15962bX;
        this.eqN = interfaceC7360Kg;
        if (i > 0) {
            this.f15969zx = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.iR.1
                @Override // java.lang.Runnable
                public void run() {
                    View findViewById = viewGroup.findViewById(2097610746);
                    View$OnTouchListenerC7379iR.this.f15967eo = new SoftReference(findViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC7360Kg interfaceC7360Kg;
        InterfaceC7360Kg interfaceC7360Kg2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF = this.ldr;
                if (rectF != null && !rectF.contains(this.f15966bg, this.f15963IL)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float abs = Math.abs(rawX - this.f15966bg);
                float abs2 = Math.abs(rawY - this.f15963IL);
                int m88680IL = C7489Kg.m88680IL(C7487eqN.m88683bg(), Math.abs(rawX - this.f15966bg));
                int i = f15962bX;
                if (abs >= i && abs2 >= i) {
                    if (rawX > this.f15966bg && m88680IL > this.f15969zx && (interfaceC7360Kg2 = this.eqN) != null) {
                        interfaceC7360Kg2.mo89085bg();
                    }
                } else if ((System.currentTimeMillis() - this.f15968iR < 200 || (abs < 3.0f && abs2 < 3.0f)) && (interfaceC7360Kg = this.eqN) != null) {
                    interfaceC7360Kg.mo89085bg();
                }
            }
        } else {
            this.ldr = m89077bg(this.f15967eo.get());
            this.f15966bg = motionEvent.getRawX();
            this.f15963IL = motionEvent.getRawY();
            this.f15968iR = System.currentTimeMillis();
        }
        return true;
    }

    /* renamed from: bg */
    private RectF m89077bg(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }
}
