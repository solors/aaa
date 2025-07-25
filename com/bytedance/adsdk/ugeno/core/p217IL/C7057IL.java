package com.bytedance.adsdk.ugeno.core.p217IL;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.C7077eo;
import com.bytedance.adsdk.ugeno.core.InterfaceC7065PX;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;

/* renamed from: com.bytedance.adsdk.ugeno.core.IL.IL */
/* loaded from: classes3.dex */
public class C7057IL {

    /* renamed from: IL */
    private float f15145IL;

    /* renamed from: bX */
    private C7077eo f15146bX;

    /* renamed from: bg */
    private float f15147bg;
    private Context eqN;

    /* renamed from: zx */
    private boolean f15148zx;

    public C7057IL(Context context, C7077eo c7077eo) {
        this.eqN = context;
        this.f15146bX = c7077eo;
    }

    /* renamed from: bg */
    public boolean m90172bg(InterfaceC7065PX interfaceC7065PX, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f15148zx = false;
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.f15147bg) >= 15.0f || Math.abs(y - this.f15145IL) >= 15.0f) {
                        this.f15148zx = true;
                    }
                }
            } else if (this.f15148zx) {
                this.f15148zx = false;
                return false;
            } else {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.f15147bg) < 15.0f && Math.abs(y2 - this.f15145IL) < 15.0f) {
                    if (interfaceC7065PX != null) {
                        interfaceC7065PX.mo84830bg(this.f15146bX, abstractView$OnTouchListenerC6981bX, abstractView$OnTouchListenerC6981bX);
                        return true;
                    }
                } else {
                    this.f15148zx = false;
                }
            }
        } else {
            this.f15147bg = motionEvent.getX();
            this.f15145IL = motionEvent.getY();
        }
        return true;
    }
}
