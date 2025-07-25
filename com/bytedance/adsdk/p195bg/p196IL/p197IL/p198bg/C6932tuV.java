package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.p203bg.C6962Kg;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.tuV */
/* loaded from: classes3.dex */
public class C6932tuV extends AbstractC6922VzQ {
    private static final ThreadLocal<StringBuilder> eqN = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.bg.IL.IL.bg.tuV.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: bg */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public C6932tuV() {
        super(EnumC6953bX.PLUS);
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        Object mo90468bg;
        Object mo90468bg2 = this.f14822bg.mo90468bg(map);
        if (mo90468bg2 == null || (mo90468bg = this.f14820IL.mo90468bg(map)) == null) {
            return null;
        }
        if (!(mo90468bg2 instanceof String) && !(mo90468bg instanceof String)) {
            return C6962Kg.m90428bg((Number) mo90468bg2, (Number) mo90468bg);
        }
        StringBuilder sb2 = eqN.get();
        sb2.append(mo90468bg2);
        sb2.append(mo90468bg);
        String sb3 = sb2.toString();
        sb2.setLength(0);
        return sb3;
    }
}
