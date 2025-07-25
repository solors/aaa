package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg;
import com.bytedance.adsdk.p183IL.p193zx.C6894eo;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.bX */
/* loaded from: classes3.dex */
public class C6780bX implements AbstractC6781bg.InterfaceC6785bg {

    /* renamed from: IL */
    private final AbstractC6781bg<Integer, Integer> f14489IL;

    /* renamed from: bX */
    private final AbstractC6781bg<Float, Float> f14490bX;

    /* renamed from: bg */
    private final AbstractC6781bg.InterfaceC6785bg f14491bg;
    private final AbstractC6781bg<Float, Float> eqN;

    /* renamed from: iR */
    private boolean f14492iR = true;
    private final AbstractC6781bg<Float, Float> ldr;

    /* renamed from: zx */
    private final AbstractC6781bg<Float, Float> f14493zx;

    public C6780bX(AbstractC6781bg.InterfaceC6785bg interfaceC6785bg, AbstractC6742bg abstractC6742bg, C6894eo c6894eo) {
        this.f14491bg = interfaceC6785bg;
        AbstractC6781bg<Integer, Integer> mo90885bg = c6894eo.m90525bg().mo90885bg();
        this.f14489IL = mo90885bg;
        mo90885bg.m90841bg(this);
        abstractC6742bg.m90931bg(mo90885bg);
        AbstractC6781bg<Float, Float> mo90885bg2 = c6894eo.m90527IL().mo90885bg();
        this.f14490bX = mo90885bg2;
        mo90885bg2.m90841bg(this);
        abstractC6742bg.m90931bg(mo90885bg2);
        AbstractC6781bg<Float, Float> mo90885bg3 = c6894eo.m90526bX().mo90885bg();
        this.eqN = mo90885bg3;
        mo90885bg3.m90841bg(this);
        abstractC6742bg.m90931bg(mo90885bg3);
        AbstractC6781bg<Float, Float> mo90885bg4 = c6894eo.eqN().mo90885bg();
        this.f14493zx = mo90885bg4;
        mo90885bg4.m90841bg(this);
        abstractC6742bg.m90931bg(mo90885bg4);
        AbstractC6781bg<Float, Float> mo90885bg5 = c6894eo.m90524zx().mo90885bg();
        this.ldr = mo90885bg5;
        mo90885bg5.m90841bg(this);
        abstractC6742bg.m90931bg(mo90885bg5);
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6785bg
    /* renamed from: bg */
    public void mo90776bg() {
        this.f14492iR = true;
        this.f14491bg.mo90776bg();
    }

    /* renamed from: bg */
    public void m90847bg(Paint paint) {
        if (this.f14492iR) {
            this.f14492iR = false;
            double floatValue = this.eqN.mo90813iR().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f14493zx.mo90813iR().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f14489IL.mo90813iR().intValue();
            paint.setShadowLayer(this.ldr.mo90813iR().floatValue(), sin, cos, Color.argb(Math.round(this.f14490bX.mo90813iR().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }
}
