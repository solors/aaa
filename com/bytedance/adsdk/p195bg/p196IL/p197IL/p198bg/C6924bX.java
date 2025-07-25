package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6958IL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.bX */
/* loaded from: classes3.dex */
public class C6924bX extends AbstractC6922VzQ {
    public C6924bX() {
        super(EnumC6953bX.DOUBLE_BAR);
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        boolean z;
        if (!C6958IL.m90443bg(this.f14822bg.mo90468bg(map)) && !C6958IL.m90443bg(this.f14820IL.mo90468bg(map))) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.AbstractC6922VzQ
    public String toString() {
        return mo90470IL();
    }
}
