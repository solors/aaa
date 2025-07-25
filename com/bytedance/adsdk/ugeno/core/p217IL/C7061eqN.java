package com.bytedance.adsdk.ugeno.core.p217IL;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.C7077eo;
import com.bytedance.adsdk.ugeno.core.InterfaceC7065PX;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;

/* renamed from: com.bytedance.adsdk.ugeno.core.IL.eqN */
/* loaded from: classes3.dex */
public class C7061eqN {

    /* renamed from: Kg */
    private boolean f15154Kg;
    private C7077eo eqN;

    /* renamed from: iR */
    private Context f15157iR;
    private String ldr;

    /* renamed from: zx */
    private C7077eo f15158zx;

    /* renamed from: bg */
    private float f15156bg = Float.MIN_VALUE;

    /* renamed from: IL */
    private float f15153IL = Float.MIN_VALUE;

    /* renamed from: bX */
    private int f15155bX = 0;

    public C7061eqN(Context context, C7077eo c7077eo, boolean z) {
        this.f15157iR = context;
        this.eqN = c7077eo;
        this.f15154Kg = z;
        m90168IL();
    }

    /* renamed from: IL */
    private void m90168IL() {
        C7077eo c7077eo = this.eqN;
        if (c7077eo == null) {
            return;
        }
        this.f15155bX = c7077eo.m90099bX().optInt("slideThreshold");
        this.ldr = this.eqN.m90099bX().optString("slideDirection");
    }

    /* renamed from: bg */
    public void m90167bg() {
        this.f15156bg = Float.MIN_VALUE;
        this.f15153IL = Float.MIN_VALUE;
    }

    /* renamed from: bg */
    public boolean m90166bg(InterfaceC7065PX interfaceC7065PX, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    if (this.f15156bg == Float.MIN_VALUE || this.f15153IL == Float.MIN_VALUE) {
                        return false;
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f15154Kg && Math.abs(x - this.f15156bg) <= 10.0f && Math.abs(y - this.f15153IL) <= 10.0f && interfaceC7065PX != null) {
                m90167bg();
                interfaceC7065PX.mo84830bg(this.f15158zx, abstractView$OnTouchListenerC6981bX, abstractView$OnTouchListenerC6981bX);
                return true;
            } else if (this.f15155bX == 0 && interfaceC7065PX != null) {
                m90167bg();
                interfaceC7065PX.mo84830bg(this.eqN, abstractView$OnTouchListenerC6981bX, abstractView$OnTouchListenerC6981bX);
                return true;
            } else {
                int m90011IL = C7114Kg.m90011IL(this.f15157iR, x - this.f15156bg);
                int m90011IL2 = C7114Kg.m90011IL(this.f15157iR, y - this.f15153IL);
                if (TextUtils.equals(this.ldr, "up")) {
                    m90011IL = -m90011IL2;
                } else if (TextUtils.equals(this.ldr, "down")) {
                    m90011IL = m90011IL2;
                } else if (TextUtils.equals(this.ldr, "left")) {
                    m90011IL = -m90011IL;
                } else if (!TextUtils.equals(this.ldr, "right")) {
                    m90011IL = (int) Math.abs(Math.sqrt(Math.pow(m90011IL, 2.0d) + Math.pow(m90011IL2, 2.0d)));
                }
                if (m90011IL < this.f15155bX) {
                    m90167bg();
                    return false;
                } else if (interfaceC7065PX != null) {
                    m90167bg();
                    interfaceC7065PX.mo84830bg(this.eqN, abstractView$OnTouchListenerC6981bX, abstractView$OnTouchListenerC6981bX);
                    return true;
                } else {
                    m90167bg();
                }
            }
        } else {
            this.f15156bg = motionEvent.getX();
            this.f15153IL = motionEvent.getY();
        }
        return true;
    }

    public C7061eqN(Context context, C7077eo c7077eo, C7077eo c7077eo2, boolean z) {
        this.f15157iR = context;
        this.eqN = c7077eo;
        this.f15158zx = c7077eo2;
        this.f15154Kg = z;
        m90168IL();
    }
}
