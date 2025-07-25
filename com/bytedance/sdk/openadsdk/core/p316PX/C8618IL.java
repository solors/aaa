package com.bytedance.sdk.openadsdk.core.p316PX;

import com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX;
import com.bytedance.sdk.openadsdk.core.p316PX.p318bX.C8637bg;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL */
/* loaded from: classes3.dex */
public class C8618IL extends C8633bX {

    /* renamed from: VB */
    private long f19006VB;

    /* renamed from: eo */
    private long f19007eo;

    public C8618IL(int i, int i2, long j, long j2, C8637bg.EnumC8641bg enumC8641bg, C8637bg.EnumC8640IL enumC8640IL, String str, List<C8622bX> list, List<C8622bX> list2, String str2) {
        super(i, i2, enumC8641bg, enumC8640IL, str, list, list2, str2);
        this.f19007eo = j;
        this.f19006VB = j2;
        this.f19041WR = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.p316PX.C8633bX
    /* renamed from: bg */
    public JSONObject mo85492bg() throws JSONException {
        JSONObject mo85492bg = super.mo85492bg();
        if (mo85492bg != null) {
            mo85492bg.put("offset", this.f19007eo);
            mo85492bg.put("duration", this.f19006VB);
        }
        return mo85492bg;
    }

    /* renamed from: bg */
    public static C8618IL m85529bg(JSONObject jSONObject) {
        C8633bX m85494IL = C8633bX.m85494IL(jSONObject);
        if (m85494IL == null) {
            return null;
        }
        return new C8618IL(m85494IL.f19043bg, m85494IL.f19037IL, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), m85494IL.f19042bX, m85494IL.eqN, m85494IL.f19046zx, m85494IL.ldr, m85494IL.f19045iR, m85494IL.f19038Kg);
    }
}
