package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6956ldr;
import com.bytedance.adsdk.p195bg.p196IL.eqN.InterfaceC6957zx;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.Lq */
/* loaded from: classes3.dex */
public class C6918Lq implements InterfaceC6913bg {

    /* renamed from: bg */
    private Number f14819bg;

    public C6918Lq(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.f14819bg = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.f14819bg = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.f14819bg = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.f14819bg = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: IL */
    public String mo90470IL() {
        return this.f14819bg.toString();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        return this.f14819bg;
    }

    public String toString() {
        return mo90470IL();
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public InterfaceC6957zx mo90469bg() {
        return EnumC6956ldr.NUMBER;
    }
}
