package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6956ldr;
import com.bytedance.adsdk.p195bg.p196IL.eqN.InterfaceC6957zx;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.VzQ */
/* loaded from: classes3.dex */
public abstract class AbstractC6922VzQ implements InterfaceC6913bg {

    /* renamed from: IL */
    protected InterfaceC6913bg f14820IL;

    /* renamed from: bX */
    protected EnumC6953bX f14821bX;

    /* renamed from: bg */
    protected InterfaceC6913bg f14822bg;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6922VzQ(EnumC6953bX enumC6953bX) {
        this.f14821bX = enumC6953bX;
    }

    /* renamed from: IL */
    public void m90476IL(InterfaceC6913bg interfaceC6913bg) {
        this.f14820IL = interfaceC6913bg;
    }

    /* renamed from: bg */
    public void m90475bg(InterfaceC6913bg interfaceC6913bg) {
        this.f14822bg = interfaceC6913bg;
    }

    public String toString() {
        return mo90470IL();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: IL */
    public String mo90470IL() {
        return this.f14822bg.mo90470IL() + this.f14821bX.m90452bg() + this.f14820IL.mo90470IL();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public InterfaceC6957zx mo90469bg() {
        return EnumC6956ldr.OPERATOR_RESULT;
    }
}
