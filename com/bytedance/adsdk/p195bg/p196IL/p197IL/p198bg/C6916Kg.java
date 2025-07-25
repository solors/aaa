package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg.C6963bX;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.Kg */
/* loaded from: classes3.dex */
public class C6916Kg extends AbstractC6922VzQ {
    public C6916Kg() {
        super(EnumC6953bX.LT_EQ);
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        Object mo90468bg;
        Object mo90468bg2 = this.f14822bg.mo90468bg(map);
        if (mo90468bg2 == null || (mo90468bg = this.f14820IL.mo90468bg(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) C6963bX.m90423bg(mo90468bg2, (Number) mo90468bg)).booleanValue());
    }
}
