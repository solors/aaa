package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg.C6961IL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.yDt */
/* loaded from: classes3.dex */
public class C6935yDt extends AbstractC6922VzQ {
    public C6935yDt() {
        super(EnumC6953bX.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        Object mo90468bg = this.f14822bg.mo90468bg(map);
        Object mo90468bg2 = this.f14820IL.mo90468bg(map);
        if (mo90468bg == null && mo90468bg2 == null) {
            return Boolean.FALSE;
        }
        if (mo90468bg == null && mo90468bg2 != null) {
            return Boolean.TRUE;
        }
        if (mo90468bg != null && mo90468bg2 == null) {
            return Boolean.TRUE;
        }
        if ((mo90468bg instanceof Number) && (mo90468bg2 instanceof Number)) {
            return Boolean.valueOf(!C6961IL.m90433bg((Number) mo90468bg, (Number) mo90468bg2));
        }
        return Boolean.valueOf(!mo90468bg.equals(mo90468bg2));
    }
}
