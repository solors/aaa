package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6955eqN;
import com.bytedance.adsdk.p195bg.p196IL.eqN.InterfaceC6957zx;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.tC */
/* loaded from: classes3.dex */
public class C6931tC implements InterfaceC6913bg {

    /* renamed from: bg */
    private EnumC6955eqN f14828bg;

    public C6931tC(EnumC6955eqN enumC6955eqN) {
        this.f14828bg = enumC6955eqN;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: IL */
    public String mo90470IL() {
        return this.f14828bg.m90448bg();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return mo90470IL();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public InterfaceC6957zx mo90469bg() {
        return this.f14828bg;
    }
}
