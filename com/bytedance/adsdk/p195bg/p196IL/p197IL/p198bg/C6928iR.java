package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6956ldr;
import com.bytedance.adsdk.p195bg.p196IL.eqN.InterfaceC6957zx;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.ironsource.C21114v8;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.iR */
/* loaded from: classes3.dex */
public class C6928iR implements InterfaceC6913bg {

    /* renamed from: bg */
    private final Object f14826bg;

    public C6928iR(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.f14826bg = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.f14826bg = Boolean.FALSE;
        } else if (str.equalsIgnoreCase("null")) {
            this.f14826bg = null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: IL */
    public String mo90470IL() {
        Object obj = this.f14826bg;
        if (obj != null) {
            return obj.toString();
        }
        return "NULL";
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        return this.f14826bg;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.f14826bg + C21114v8.C21123i.f54139e;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public InterfaceC6957zx mo90469bg() {
        return EnumC6956ldr.CONSTANT;
    }
}
