package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6958IL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.IL */
/* loaded from: classes3.dex */
public class C6915IL extends AbstractC6922VzQ {
    public C6915IL() {
        super(EnumC6953bX.DOUBLE_AMP);
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        boolean z;
        if (C6958IL.m90443bg(this.f14822bg.mo90468bg(map)) && C6958IL.m90443bg(this.f14820IL.mo90468bg(map))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.AbstractC6922VzQ
    public String toString() {
        return mo90470IL();
    }
}
