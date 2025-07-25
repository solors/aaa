package com.bytedance.sdk.openadsdk.core;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8957bg;
import com.bytedance.sdk.openadsdk.p298bg.eqN.InterfaceC8178IL;
import com.bytedance.sdk.openadsdk.p298bg.p301bX.InterfaceC8168IL;
import com.bytedance.sdk.openadsdk.p298bg.p303zx.InterfaceC8185bg;

/* loaded from: classes3.dex */
public class JAA {

    /* renamed from: bg */
    private static JAA f18774bg;

    /* renamed from: IL */
    private C8957bg f18775IL;

    /* renamed from: bX */
    private AbstractC8967tuV f18776bX;
    private InterfaceC8185bg eqN;
    private InterfaceC8178IL ldr;

    /* renamed from: zx */
    private InterfaceC8168IL f18777zx;

    private JAA() {
    }

    @MainThread
    /* renamed from: bg */
    public static JAA m85851bg() {
        if (f18774bg == null) {
            f18774bg = new JAA();
        }
        return f18774bg;
    }

    /* renamed from: IL */
    public AbstractC8967tuV m85853IL() {
        return this.f18776bX;
    }

    /* renamed from: bX */
    public InterfaceC8185bg m85852bX() {
        return this.eqN;
    }

    public InterfaceC8168IL eqN() {
        return this.f18777zx;
    }

    /* renamed from: iR */
    public C8957bg m85845iR() {
        return this.f18775IL;
    }

    public void ldr() {
        this.f18776bX = null;
        this.f18775IL = null;
        this.eqN = null;
        this.f18777zx = null;
        this.ldr = null;
    }

    /* renamed from: zx */
    public InterfaceC8178IL m85844zx() {
        return this.ldr;
    }

    /* renamed from: bg */
    public void m85846bg(AbstractC8967tuV abstractC8967tuV) {
        this.f18776bX = abstractC8967tuV;
    }

    /* renamed from: bg */
    public void m85850bg(InterfaceC8168IL interfaceC8168IL) {
        this.f18777zx = interfaceC8168IL;
    }

    /* renamed from: bg */
    public void m85848bg(InterfaceC8185bg interfaceC8185bg) {
        this.eqN = interfaceC8185bg;
    }

    /* renamed from: bg */
    public void m85849bg(InterfaceC8178IL interfaceC8178IL) {
        this.ldr = interfaceC8178IL;
    }

    /* renamed from: bg */
    public void m85847bg(C8957bg c8957bg) {
        this.f18775IL = c8957bg;
    }
}
