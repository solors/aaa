package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6956ldr;
import com.bytedance.adsdk.p195bg.p196IL.eqN.InterfaceC6957zx;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6912IL;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.Fy */
/* loaded from: classes3.dex */
public class C6914Fy implements InterfaceC6912IL {

    /* renamed from: IL */
    private InterfaceC6913bg f14815IL;

    /* renamed from: bX */
    private InterfaceC6913bg f14816bX;

    /* renamed from: bg */
    private InterfaceC6913bg f14817bg;

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6912IL
    /* renamed from: IL */
    public void mo90479IL(InterfaceC6913bg interfaceC6913bg) {
        this.f14815IL = interfaceC6913bg;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6912IL
    /* renamed from: bX */
    public void mo90478bX(InterfaceC6913bg interfaceC6913bg) {
        this.f14816bX = interfaceC6913bg;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        Object mo90468bg = this.f14817bg.mo90468bg(map);
        if (mo90468bg == null) {
            return null;
        }
        if (((Boolean) mo90468bg).booleanValue()) {
            return this.f14815IL.mo90468bg(map);
        }
        return this.f14816bX.mo90468bg(map);
    }

    public String toString() {
        return mo90470IL();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: IL */
    public String mo90470IL() {
        return this.f14817bg.mo90470IL() + "?" + this.f14815IL.mo90470IL() + ":" + this.f14816bX.mo90470IL();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public InterfaceC6957zx mo90469bg() {
        return EnumC6956ldr.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6912IL
    /* renamed from: bg */
    public void mo90477bg(InterfaceC6913bg interfaceC6913bg) {
        this.f14817bg = interfaceC6913bg;
    }
}
