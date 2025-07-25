package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC15438b0;
import com.fyber.inneractive.sdk.util.InterfaceC15436a0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.M */
/* loaded from: classes4.dex */
public final class C14320M implements InterfaceC15436a0 {

    /* renamed from: a */
    public Integer f27110a = null;

    /* renamed from: b */
    public UnitDisplayType f27111b;

    /* renamed from: c */
    public Boolean f27112c;

    /* renamed from: d */
    public Integer f27113d;

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15436a0
    /* renamed from: a */
    public final JSONObject mo76509a() {
        JSONObject jSONObject = new JSONObject();
        AbstractC15438b0.m76508a(jSONObject, ToolBar.REFRESH, this.f27110a);
        AbstractC15438b0.m76508a(jSONObject, "unitDisplayType", this.f27111b);
        AbstractC15438b0.m76508a(jSONObject, "close", this.f27112c);
        AbstractC15438b0.m76508a(jSONObject, "hideDelay", this.f27113d);
        return jSONObject;
    }
}
