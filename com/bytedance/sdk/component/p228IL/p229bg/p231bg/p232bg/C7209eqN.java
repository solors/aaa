package com.bytedance.sdk.component.p228IL.p229bg.p231bg.p232bg;

import android.text.TextUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;

/* renamed from: com.bytedance.sdk.component.IL.bg.bg.bg.eqN */
/* loaded from: classes3.dex */
public class C7209eqN extends AbstractC7194VB {

    /* renamed from: Kg */
    public C7212zx f15540Kg;

    /* renamed from: WR */
    public C7208bg f15541WR;

    public C7209eqN(AbstractC7194VB.C7195bg c7195bg) {
        super(c7195bg);
        C7212zx c7212zx = new C7212zx();
        this.f15540Kg = c7212zx;
        this.f15541WR = new C7208bg(c7212zx.mo89604IL());
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB
    /* renamed from: bg */
    public AbstractC7215eqN mo89616bg() {
        return this.f15540Kg;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB
    /* renamed from: bg */
    public InterfaceC7177IL mo89615bg(AbstractC7191Ta abstractC7191Ta) {
        abstractC7191Ta.m89660bg(this);
        if (abstractC7191Ta.mo89647IL() == null || abstractC7191Ta.mo89647IL().m89595bg() == null || TextUtils.isEmpty(abstractC7191Ta.mo89647IL().m89595bg().toString())) {
            return null;
        }
        if (C7208bg.f15537bg != null && C7208bg.f15537bg.mo82317IL() && this.f15541WR.m89617zx() && !"setting".equals(abstractC7191Ta.ldr())) {
            C7202IL c7202il = new C7202IL(abstractC7191Ta, this.f15541WR);
            this.f15541WR.mo89603bX().add(c7202il);
            return c7202il;
        }
        C7202IL c7202il2 = new C7202IL(abstractC7191Ta, this.f15540Kg);
        this.f15540Kg.mo89603bX().add(c7202il2);
        return c7202il2;
    }
}
