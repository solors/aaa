package com.bytedance.adsdk.p183IL.p189bg.p191bg;

import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6706Fy;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.bg.tC */
/* loaded from: classes3.dex */
public class C6815tC implements AbstractC6781bg.InterfaceC6785bg, InterfaceC6807bX {

    /* renamed from: IL */
    private final boolean f14607IL;

    /* renamed from: bX */
    private final List<AbstractC6781bg.InterfaceC6785bg> f14608bX = new ArrayList();

    /* renamed from: bg */
    private final String f14609bg;
    private final C6706Fy.EnumC6707bg eqN;

    /* renamed from: iR */
    private final AbstractC6781bg<?, Float> f14610iR;
    private final AbstractC6781bg<?, Float> ldr;

    /* renamed from: zx */
    private final AbstractC6781bg<?, Float> f14611zx;

    public C6815tC(AbstractC6742bg abstractC6742bg, C6706Fy c6706Fy) {
        this.f14609bg = c6706Fy.m91072bg();
        this.f14607IL = c6706Fy.ldr();
        this.eqN = c6706Fy.m91074IL();
        AbstractC6781bg<Float, Float> mo90885bg = c6706Fy.eqN().mo90885bg();
        this.f14611zx = mo90885bg;
        AbstractC6781bg<Float, Float> mo90885bg2 = c6706Fy.m91073bX().mo90885bg();
        this.ldr = mo90885bg2;
        AbstractC6781bg<Float, Float> mo90885bg3 = c6706Fy.m91071zx().mo90885bg();
        this.f14610iR = mo90885bg3;
        abstractC6742bg.m90931bg(mo90885bg);
        abstractC6742bg.m90931bg(mo90885bg2);
        abstractC6742bg.m90931bg(mo90885bg3);
        mo90885bg.m90841bg(this);
        mo90885bg2.m90841bg(this);
        mo90885bg3.m90841bg(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public C6706Fy.EnumC6707bg m90784IL() {
        return this.eqN;
    }

    /* renamed from: bX */
    public AbstractC6781bg<?, Float> m90783bX() {
        return this.f14611zx;
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX
    /* renamed from: bg */
    public void mo90775bg(List<InterfaceC6807bX> list, List<InterfaceC6807bX> list2) {
    }

    public AbstractC6781bg<?, Float> eqN() {
        return this.ldr;
    }

    public boolean ldr() {
        return this.f14607IL;
    }

    /* renamed from: zx */
    public AbstractC6781bg<?, Float> m90781zx() {
        return this.f14610iR;
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6785bg
    /* renamed from: bg */
    public void mo90776bg() {
        for (int i = 0; i < this.f14608bX.size(); i++) {
            this.f14608bX.get(i).mo90776bg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m90782bg(AbstractC6781bg.InterfaceC6785bg interfaceC6785bg) {
        this.f14608bX.add(interfaceC6785bg);
    }
}
